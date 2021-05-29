package com.uservalidation;

import java.util.regex.Pattern;
public class Uservalidator {
    private static final String First_Name_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private static final String Last_Name_PATTERN = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL_ADDRESS_PATTERN ="^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    private static final String Mobile_Number_Pattern = "^\\d{2}[ ]\\d{10}$";

    public boolean validateFirstName(String fname) {
        Pattern pattern = Pattern.compile(First_Name_PATTERN);
        return pattern.matcher(fname).matches();
    }
    public boolean validateLastName(String lname) {
        Pattern pattern = Pattern.compile(Last_Name_PATTERN);
        return pattern.matcher(lname).matches();
    }
    public boolean validateEmailAddress(String email){
        Pattern pattern = Pattern.compile(EMAIL_ADDRESS_PATTERN);
        return pattern.matcher(email).matches();
    }
    public boolean validateMobileNumber(String mobileNum){
        Pattern pattern = Pattern.compile(Mobile_Number_Pattern);
        return pattern.matcher(mobileNum).matches();
    }
}
