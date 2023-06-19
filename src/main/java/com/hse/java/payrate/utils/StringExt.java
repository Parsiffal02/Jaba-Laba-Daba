package com.hse.java.payrate.utils;

public class StringExt {
    public static String removeMailSymbol(String str){
        return str.replace("@", "").replace(".", "").replace("_","");
    }
}
