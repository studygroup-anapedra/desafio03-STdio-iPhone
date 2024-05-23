package com.anapedra.iphone.model.enums;

public enum PhoneType {

/*
    Attention:
    When inserting another enumerator, sequence the integers
    in the proposed order to avoid a possible collapse of subsequent codes.

 */


WORK(1),
HOME(2),
WHATSAPP(3);


private int code;
private PhoneType(int code){
    this.code=code;
}
public int getCode(){
    return code;
}

public static PhoneType valueOf(int code){
    for(PhoneType value : PhoneType.values()){
        if (value.getCode()==code){
            return value;
        }
    }
    throw new IllegalArgumentException("Invalid code!");
}
}

