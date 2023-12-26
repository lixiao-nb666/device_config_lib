package com.newbee.device_config;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String bs=MyPhoneManager.getInstance().getCanUseBS();
        Log.i("kankanshenmegui","kankanwenjian:"+bs);
    }
}
