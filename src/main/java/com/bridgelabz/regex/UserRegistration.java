package com.bridgelabz.regex;

import java.util.regex.Pattern;

/**
 * Program on User Registration Using Regex
 *
 * @author : Aniket
 * @since : 01/04/2022
 * */

public class UserRegistration {
    // (?=.*[a-z]) # a lower case letter must occur at least once
    // (?=.*[A-Z]) # an upper case letter must occur at least once
    // (?=.*[0-9]) # a digit must occur at least once
    // (?=.*[@#$%^&+=]) # a special character must occur at least once
    // (?=\S+$) # no whitespace allowed in the entire string
    // .{8,} # anything, at least eight places though


    /*
     Added  first name method to check first name
    */
    public boolean firstName(String firstName) {
        boolean result  = Pattern.matches("^[A-Z]{1}[a-z]{2,}",firstName) ;

        if (result) {
            System.out.println("The first name " + firstName + " is valid.");
        } else {
            System.out.println("The first name " + firstName + " is invalid.");
        }
        return result;
    }
    /*
     Added  last name method to check last name
    */
    public boolean lastName(String lastLame) {
        boolean result = Pattern.matches("^[A-Z]{1}[A-Za-z]{2,}$",lastLame);

        if (result) {
            System.out.println("The last name " + lastLame + " is valid.");
        } else {
            System.out.println("The last name " + lastLame + " is invalid.");
        }
        return result;
    }
    /*
    Added eMail method to check EmailID is valid or not
   */
    public boolean eMail(String email) {
        boolean result = Pattern.matches("^[A-Za-z0-9]+([._+-][A-Za-z0-9]+)*@[A-Za-z0-9]+.[A-Za-z]{2,4}([.][A-Za-z]{2})*$",email);

        if (result) {
            System.out.println("The eMail " + email + " is valid.");
        } else {
            System.out.println("The eMail " + email + " is invalid.");
        }
        return result;
    }

    /*
  Added phoneNo method to check phone number is valid or not
 */
    public boolean phoneNo(String phonenumber) {
        boolean result = Pattern.matches("[6-9]{1}[0-9]{9}",phonenumber);
        if (result) {
            System.out.println("Correct");
        }
        else {
            System.out.println("Please enter correct phone number");
        }
        return result;
    }

}
