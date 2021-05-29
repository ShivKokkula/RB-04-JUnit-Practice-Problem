package com.uservalidation;

import java.util.regex.Pattern;
public class Uservalidator {
    private static final String First_Name_PATTERN = "^[A-Z]{1}[a-z]{2,}$";

    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(First_Name_PATTERN);
        return pattern.matcher(fname).matches();
    }
}
