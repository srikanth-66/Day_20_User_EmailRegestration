package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationException {
    Scanner sc = new Scanner(System.in);
    public boolean firstName(String fName){
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}", fName);
        try {
            if (check){
                System.out.println("Perfect! First #Name");
                return true;
            }else {
                throw new CoustomException("Please Enter a Valid First name with Only \"One Starting Capital\" latter");
            }
        }catch (CoustomException ce){
            System.out.printf(ce.getMessage());
        }
        return false;
    }

    public boolean lastName(String lName){
        boolean check = Pattern.matches("^[A-Z]{1}+[a-z]{3,}", lName);
        try {
            if (check){
                System.out.println("Perfect! Last #Name");
                return true;
            }else {
                throw new CoustomException("Please Enter a Valid Last name with Only \"One Starting Capital\" latter");
            }
        }catch (CoustomException ce){
            System.out.printf(ce.getMessage());
        }
        return false;
    }


    public boolean eMail(String eMail){
        boolean check = Pattern.matches("^[a-z]*([.]?[a-z]+)*@bl[.]co([.]?in)*", eMail);
        try {
            if (check){
                System.out.println("Perfect! #Email");
                return true;
            }else {
                throw new CoustomException("Please Enter a Valid Email with Only \"example.abc@bl.co.in\" latter");
            }
        }catch (CoustomException ce){
            System.out.printf(ce.getMessage());
        }
        return false;
    }

    public boolean mobileNum(String mNum){
        boolean check = Pattern.matches("^91\\s[6789][0-9]{9}", mNum);
        try {
            if (check){
                System.out.println("Perfect! #Mobile Num");
                return true;
            }else {
                throw new CoustomException("Please Enter a Valid Mobile Num ex:- 90 9533182605");
            }
        }catch (CoustomException ce){
            System.out.printf(ce.getMessage());
        }
        return false;
    }

    // rule1  minimum 8 characters
    public boolean pass1(String pass){
        boolean check = Pattern.matches("[a-zA-Z]{8,}", pass);
        try {
            if (check){
                System.out.println("Perfect! #password");
                return true;
            }else {
                throw new CoustomException("Please Enter a Valid password, it should have minimum 8 characters");
            }
        }catch (CoustomException ce){
            System.out.printf(ce.getMessage());
        }
        return false;
    }

    // rule2  minimum 8 characters with 1 upper case
    public boolean pass2(String pass){
        boolean check = Pattern.matches("[A-Z]{1}[a-z]{7,}", pass);
        try {
            if (check){
                System.out.println("Perfect! #password");
                return true;
            }else {
                throw new CoustomException("Please Enter a Valid password, it should have minimum 8 characters with 1 upper case");
            }
        }catch (CoustomException ce){
            System.out.printf(ce.getMessage());
        }
        return false;
    }

    // rule3  minimum 8 characters with, 1 upper case and 1 Numeric
    public boolean pass3(String pass){
        boolean check = Pattern.matches("[A-Z]{1}[a-z]{6,}[0-9]{1}", pass);
        try {
            if (check){
                System.out.println("Perfect! #password");
                return true;
            }else {
                throw new CoustomException("Please Enter a Valid password, it should have minimum 8 characters with, 1 upper case and 1 Numeric");
            }
        }catch (CoustomException ce){
            System.out.printf(ce.getMessage());
        }
        return false;
    }
    // rule4  minimum 8 characters with, 1 upper case, 1 Numeric and 1 Special Char
    public boolean pass4(String pass){
        boolean check = Pattern.matches("[A-Z]{1}[a-z]{5,}[0-9]{1}[!@#$%^&*~]{1}", pass);
        try {
            if (check){
                System.out.println("Perfect! #password");
                return true;
            }else {
                throw new CoustomException("Please Enter a Valid password, it should have minimum 8 characters with, 1 upper case, 1 Numeric and 1 Special Char");
            }
        }catch (CoustomException ce){
            System.out.printf(ce.getMessage());
        }
        return false;
    }

    // this is code for which satisfies for all emails given to check
    public boolean emailUniversal(String eMail){
        boolean check = Pattern.matches("[a-zA-Z0-9_.]*[-]*[+]*[0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+", eMail);
        try {
            if (check){
                System.out.println("Perfect! #Email");
                return true;
            }else {
                throw new CoustomException("Please Enter a Valid Email with Only \"example.abc@bl.co.in\" latter");
            }
        }catch (CoustomException ce){
            System.out.printf(ce.getMessage());
        }
        return false;
    }

    public static void main(String[] args) {
        // refer above methods in Junit Testing.

    }
}
