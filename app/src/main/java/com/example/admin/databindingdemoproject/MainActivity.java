package com.example.admin.databindingdemoproject;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.admin.databindingdemoproject.databinding.ActivityMainBinding;
import com.example.admin.databindingdemoproject.omlsdk.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        binding.setUser(new User("Ashutosh",null,"8972376343","Developer"));
        // we can also set data from here which are not set by data binding in xml
        binding.name.setText("User Name");
        binding.textView6.setText("Ashutosh");



    }
}
