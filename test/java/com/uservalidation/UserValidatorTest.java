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
}
