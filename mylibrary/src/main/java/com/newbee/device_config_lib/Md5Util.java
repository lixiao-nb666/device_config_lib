package com.newbee.device_config_lib;

import android.text.TextUtils;

import java.security.MessageDigest;

 class Md5Util {

    public static String MD5(String key) {
        char hexDigits[] = {
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
        };
        try {
            byte[] btInput = key.getBytes();
            // 获得MD5摘要算法的 MessageDigest 对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            // 使用指定的字节更新摘要
            mdInst.update(btInput);
            // 获得密文
            byte[] md = mdInst.digest();
            // 把密文转换成十六进制的字符串形式
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (Exception e) {
            return null;
        }
    }


    public static String MD5_SS(String...ss){
        String md5Str="";
        for(String s:ss){
            if(!TextUtils.isEmpty(s)){
                md5Str=MD5(md5Str+s);
            }
        }
        return md5Str;
    }

     public static String MD5_SS(int needSize,String...ss){
         String md5Str="";
         int nowSize=0;
         for(String s:ss){
             if(!TextUtils.isEmpty(s)){
                 md5Str=MD5(md5Str+s);
                 nowSize++;
                 if(nowSize==needSize){
                     return md5Str;
                 }
             }
         }
         return md5Str;
     }

}
