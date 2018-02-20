package com.example.activityandintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ActivityIntents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents);
        Toast.makeText(this,"im in on create",Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,SecondActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onStart()
    {

        Toast.makeText(this,"im in on start",Toast.LENGTH_LONG).show();
        super.onStart();
    }
    @Override
protected void onResume()
{
    Toast.makeText(this,"im in on resume",Toast.LENGTH_LONG).show();
    super.onResume();
}
    @Override
protected void onPause()
{
    Toast.makeText(this,"im in on pause",Toast.LENGTH_LONG).show();
    super.onPause();
    }
    @Override
protected void onStop(){
    Toast.makeText(this,"im in on stop",Toast.LENGTH_LONG).show();
    super.onStop();
}
    @Override
    protected void onDestroy(){
        Toast.makeText(this,"im in on destroy",Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
    @Override
    protected void onRestart(){
        Toast.makeText(this,"im in on restart",Toast.LENGTH_LONG).show();
        super.onDestroy();
    }
    @Override
    public void onBackPressed() {

        Toast.makeText(this,"back pressed",Toast.LENGTH_LONG).show();
        super.onBackPressed();
    }
}
