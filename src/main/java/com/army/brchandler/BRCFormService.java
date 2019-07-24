package com.army.brchandler;

import com.microsoft.signalr.HubConnection;
import com.microsoft.signalr.HubConnectionBuilder;
import io.reactivex.Single;

import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;


 class BRCFormService
{

   private HubConnection hubConnection;


   private RestClient restClient;
   private static final String URI = "/workflows/2d708852604e434e9513b10ee13849ea/triggers/manual/paths/invoke/1/email?api-version=2016-10-01&sp=%2Ftriggers%2Fmanual%2Frun&sv=1.0&sig=6D0BbKXR-LSVsjNRoGy6TwhMQmjzoSovGuaCqY_ycEU";
   private static final String hubURL = "https://army-poc.service.signalr.net/client/?hub=ArmyHub";
   private static final String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJuYW1laWQiOiJNaWtlQSIsIm5iZiI6MTU2Mzk4MzM4MCwiZXhwIjoxNTY0MDE5MzgwLCJpYXQiOjE1NjM5ODMzODAsImF1ZCI6Imh0dHBzOi8vYXJteS1wb2Muc2VydmljZS5zaWduYWxyLm5ldC9jbGllbnQvP2h1Yj1Bcm15SHViIn0.WXplml8XxixiIGs1jclh1SC-nAfgcJ1P7cCpHi5vOIM";


    BRCFormService() {

       hubConnection = HubConnectionBuilder.create(hubURL)
            .withAccessTokenProvider(Single.defer(() -> {
               // Your logic here.
               return Single.just(token);
            })).build();

       restClient = new RestClient();

   }

    void startClient() {

      hubConnection.on("BrcFormSubmit", (message, brcForm) -> {
        readResponse(brcForm);
      }, String.class, BrcDto.class);


      //This is a blocking call
      hubConnection.start().blockingAwait();

   }

    private void readResponse(BrcDto brcDto) {
      brcDto.setInterests("Medicine");

      URI url = UriComponentsBuilder.newInstance().scheme("https")
            .host("prod-80.westus.logic.azure.com")
            .pathSegment("workflows")
            .pathSegment("2d708852604e434e9513b10ee13849ea")
            .pathSegment("triggers")
            .pathSegment("manual")
            .pathSegment("paths")
            .pathSegment("invoke")
            .pathSegment("1")
            .pathSegment("email")
            .queryParam("api-version", "2016-10-01")
            .queryParam("sp", "%2Ftriggers%2Fmanual%2Frun")
            .queryParam("sv", "1.0")
            .queryParam("sig", "6D0BbKXR-LSVsjNRoGy6TwhMQmjzoSovGuaCqY_ycEU")
            .build(true).toUri();

      restClient.post(url, brcDto);
   }

}
