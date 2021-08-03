package com.cos.appbarex01;

import android.os.Bundle;

import com.cos.appbarex01.helper.CustomAppBarActivity;

public class SubActivity extends CustomAppBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        onAppBarSetting(true);

    }

}