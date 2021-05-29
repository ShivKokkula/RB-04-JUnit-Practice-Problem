package com.uservalidation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {

    private static final String[] SAMPLE_EMAILS = new String[]{"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com","abc111@yahoo.com","abc111@abc.com"};
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
        for (String email: SAMPLE_EMAILS) {
            boolean result = uservalidator.validateEmailAddress(email);
            Assertions.assertEquals(true, result);
        }
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
        boolean result = uservalidator.validatePassWord("Assa@aq1");
        Assertions.assertEquals(true, result);
    }
}
