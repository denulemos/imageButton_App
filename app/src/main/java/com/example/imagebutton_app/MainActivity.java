package com.example.imagebutton_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void event1 (View view){
        Toast.makeText(this, "You clicked on the smile :)" , Toast.LENGTH_SHORT).show();
    }
    public void event2 (View view){
        Toast.makeText(this, "You clicked on the man" , Toast.LENGTH_SHORT).show();
    }
}