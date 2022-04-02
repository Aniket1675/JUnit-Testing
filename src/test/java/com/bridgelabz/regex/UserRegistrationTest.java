package com.bridgelabz.regex;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * Program on User Registration Using Regex
 * purpose : performing the test cases of all method
 * @author : Aniket
 * @since : 01/04/2022
 * */
    public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenfirstName_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.firstName("Aniket");
        Assert.assertTrue(result);
    }
    @Test
    public void givenfirstName_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.firstName("aniket");
        Assert.assertFalse(result);
    }
    @Test
    public void giveLastName_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.lastName("Kumbhar");
        Assert.assertTrue(result);
    }
    @Test
    public void giveLastName_WhenNotProper_ShouldReturnFalse(){
        boolean result = userRegistration.lastName("kumbhar");
        Assert.assertFalse(result);
    }
    @Test
    public void whenEmailId_ShouldProper_ShouldReturnTrue() {
        boolean result = userRegistration.eMail("aniketkumbhar111@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void whenEmailId_ShouldProper_ShouldReturnFalse() {
        boolean result = userRegistration.eMail("aniketkumbhar111gmail.com");
        Assert.assertFalse(result);
    }
    @Test
    public void whenphoneNO_ShouldProper_ShouldReturnTrue() {
        boolean result = userRegistration.phoneNo("8956038877");
        Assert.assertTrue(result);
    }

    @Test
    public void whenphoneNO_ShouldNotProper_ShouldReturnFalse() {
        boolean result = userRegistration.phoneNo("895603887");
        Assert.assertFalse(result);
    }

}
