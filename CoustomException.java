package org.example;

public class CoustomException extends Throwable {
    public CoustomException(String sms){
        super(sms);
    }

}