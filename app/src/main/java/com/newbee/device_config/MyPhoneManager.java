package com.newbee.device_config;

import android.content.Context;

import com.newbee.device_config_lib.BasePhoneManager;

public class MyPhoneManager extends BasePhoneManager {
    private static MyPhoneManager myPhoneManager;
    private MyPhoneManager(){}

    public static MyPhoneManager getInstance(){
        if(null==myPhoneManager){
            synchronized (MyPhoneManager.class){
                if(null==myPhoneManager){
                    myPhoneManager=new MyPhoneManager();
                }
            }
        }
        return myPhoneManager;
    }



    @Override
    public Context getContext() {
        return MyApp.context;
    }

    @Override
    public String getDefShareBsValue() {
        return null;
    }

    @Override
    public void nowNeedShareStr() {

    }
}
