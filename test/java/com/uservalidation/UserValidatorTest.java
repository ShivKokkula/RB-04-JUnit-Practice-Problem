package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {

    @Test
    void givenFirstName_WhenProper_ShouldReturnTrue() {
        Uservalidator uservalidator = new Uservalidator();
        boolean result = uservalidator.validateFirstName("Shivasagar");
        Assertions.assertEquals(true, result);
    }
    @Test
    void givenLastName_WhenProper_ShouldReturnTrue() {
        Uservalidator uservalidator = new Uservalidator();
        boolean result = uservalidator.validateLastName("Kokkula");
        Assertions.assertEquals(true,result);
    }
    @Test
    void givenEmail_WhenProper_ShouldReturnTrue() {
        Uservalidator uservalidator = new Uservalidator();
        boolean result = uservalidator.validateEmailAddress("abc.xyz@bl.co.in");
        Assertions.assertEquals(true, result);
    }
    @Test
    void givenMobileNumber_WhenProper_ShouldReturnTrue() {
        Uservalidator uservalidator = new Uservalidator();
        boolean result = uservalidator.validateMobileNumber("91 9919819801");
        Assertions.assertEquals(true, result);
    }
    @Test
    void givenPassWord_WhenProper_ShouldReturnTrue() {
        Uservalidator uservalidator = new Uservalidator();
        boolean result = uservalidator.validatePassWord("assasa13");
        Assertions.assertEquals(true, result);
    }
}
