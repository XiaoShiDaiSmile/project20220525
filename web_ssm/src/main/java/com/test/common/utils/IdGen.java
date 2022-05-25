package com.test.common.utils;

import java.io.Serializable;
import java.util.UUID;

public class IdGen implements Serializable {
    private static final long serialVersionUID = 2649791434996417817L;
    public static String uuid(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
