package com.example.activityandintents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Shree on 2/7/2018.
 */

public class SecondActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents);
        Intent intent=new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
}
