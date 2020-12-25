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

public class MainActivity12 extends AppCompatActivity{

    private TextView ListView,Cat,Produit,PR2,P1,R1,RF,R2_;
    private CheckBox CB ,CB2,CB3;

    private Button BuNext;




    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        // Find All
        {
            ListView = findViewById(R.id.ListeView);
            Cat= findViewById(R.id.Cat);//

            Produit = findViewById(R.id.Produit);
            PR2 = findViewById(R.id.PR2);
            P1 = findViewById(R.id.P1);
            R1 = findViewById(R.id.R1);
            RF = findViewById(R.id.RF);
            R2_ = findViewById(R.id.R2_);

            CB = findViewById(R.id.CB);
            CB2 = findViewById(R.id.CB2);
            CB3 =findViewById(R.id.CB3);


            BuNext = findViewById(R.id.BuNext);


        }

        {
            BuNext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                        Intent intent = new Intent(MainActivity12.this , MainActivity13.class);
                         startActivity(intent);
                }
            });

        }



    }
}
