package com.romanpulov.onedrivetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.romanpulov.library.onedrive.OneDriveHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OneDriveHelper oneDriveHelper = OneDriveHelper.getInstance();

        oneDriveHelper.checkClientId(this);

        String clientId = OneDriveHelper.CLIENT_ID;
        setTitle("Client ID:" + clientId);
    }
}
