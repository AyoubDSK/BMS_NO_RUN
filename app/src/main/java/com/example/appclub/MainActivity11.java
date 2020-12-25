package com.example.appclub;


import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.CheckBox;

public class MainActivity11 extends AppCompatActivity{


    private TextView ListView,Cat,P1,PR2,R1,R2_;
    private CheckBox CB2,CB3;

    private Button BuNext;




    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        // Find All
        {
            ListView =  findViewById(R.id.ListeView);
            Cat = findViewById(R.id.Cat);
            P1= findViewById(R.id.P1);
            PR2= findViewById(R.id.PR2);


            R1= findViewById(R.id.R1);
            R2_= findViewById(R.id.R2_);

            CB2 = findViewById(R.id.CB2);
            CB3 = findViewById(R.id.CB3);

            BuNext = findViewById(R.id.BuNext);


        }

        {
            BuNext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                         Intent intent = new Intent(MainActivity11.this , MainActivity12.class);
                         startActivity(intent);
                }
            });

        }



    }
}
