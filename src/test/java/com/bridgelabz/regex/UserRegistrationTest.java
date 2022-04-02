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


}
