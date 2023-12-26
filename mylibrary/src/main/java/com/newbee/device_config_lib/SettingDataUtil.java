package com.newbee.device_config_lib;

import android.content.Context;
import android.provider.Settings;

public class SettingDataUtil {


    public static boolean putStr(Context context,String v){
        try {
            Settings.Secure.putString (context.getContentResolver(), DeviceBsConfig.nb_bs_key,v);
            return true;
        }catch (Exception e){
            return false;
        }

    }


    public static String getNbBS(Context context){
        try {
            return  Settings.Secure.getString(context.getContentResolver(), DeviceBsConfig.nb_bs_key);
        }catch (Exception e){
            return "";
        }
    }
}
