package com.cos.appbarex01;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.cos.appbarex01.helper.CustomAppBarActivity;

public class MainActivity extends CustomAppBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnMove = findViewById(R.id.btnMove);
        btnMove.setOnClickListener(v->{
            Intent intent = new Intent(
                    MainActivity.this,
                    SubActivity.class
            );
            startActivity(intent);
        });

        onAppBarSetting(true);

    }
}