package com.army.brchandler;

public class BrcDto
{

   public String firstName;
   public String lastName;
   public String gender;
   public String dateOfBith;
   public String streetAddress;
   public String streetAddress2;
   public String city;
   public String state;
   public String zipCode;
   public String phoneNumber;
   public String emailAddress;
   public String interests;

   public String getFirstName()
   {
      return firstName;
   }

   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }

   public String getLastName()
   {
      return lastName;
   }

   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }

   public String getGender()
   {
      return gender;
   }

   public void setGender(String gender)
   {
      this.gender = gender;
   }

   public String getDateOfBith()
   {
      return dateOfBith;
   }

   public void setDateOfBith(String dateOfBith)
   {
      this.dateOfBith = dateOfBith;
   }

   public String getStreetAddress()
   {
      return streetAddress;
   }

   public void setStreetAddress(String streetAddress)
   {
      this.streetAddress = streetAddress;
   }

   public String getStreetAddress2()
   {
      return streetAddress2;
   }

   public void setStreetAddress2(String streetAddress2)
   {
      this.streetAddress2 = streetAddress2;
   }

   public String getCity()
   {
      return city;
   }

   public void setCity(String city)
   {
      this.city = city;
   }

   public String getState()
   {
      return state;
   }

   public void setState(String state)
   {
      this.state = state;
   }

   public String getZipCode()
   {
      return zipCode;
   }

   public void setZipCode(String zipCode)
   {
      this.zipCode = zipCode;
   }

   public String getPhoneNumber()
   {
      return phoneNumber;
   }

   public void setPhoneNumber(String phoneNumber)
   {
      this.phoneNumber = phoneNumber;
   }

   public String getEmailAddress()
   {
      return emailAddress;
   }

   public void setEmailAddress(String emailAddress)
   {
      this.emailAddress = emailAddress;
   }

   public String getInterests()
   {
      return interests;
   }

   public void setInterests(String interests)
   {
      this.interests = interests;
   }

   @Override
   public String toString()
   {
      return "BrcDto{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", gender='" + gender + '\'' +
            ", dateOfBith='" + dateOfBith + '\'' +
            ", streetAddress='" + streetAddress + '\'' +
            ", streetAddress2='" + streetAddress2 + '\'' +
            ", city='" + city + '\'' +
            ", state='" + state + '\'' +
            ", zipCode='" + zipCode + '\'' +
            ", phoneNumber='" + phoneNumber + '\'' +
            ", emailAddress='" + emailAddress + '\'' +
            '}';
   }
}

