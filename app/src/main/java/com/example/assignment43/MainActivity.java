package com.example.assignment43;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeActivity(View view) {
        int id = view.getId();
        Intent intent;
        switch(id){
            case R.id.infoImage:
                intent = new Intent(this, InfoActivity.class);
                break;
            case R.id.alarmImage:
                intent = new Intent(this, AlarmActivity.class);
                break;
            case R.id.deleteImage:
                intent = new Intent(this, DeleteActivity.class);
                break;
            case R.id.playImage:
                intent = new Intent(this, PlayActivity.class);
                break;
            default:
                intent = new Intent(this, MainActivity.class);
                break;
        }
        startActivity(intent);
    }
}