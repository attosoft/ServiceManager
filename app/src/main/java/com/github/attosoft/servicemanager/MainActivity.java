package com.github.attosoft.servicemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.attosoft.service.ServiceManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ServiceManager.getInstance().getService("");
    }
}
