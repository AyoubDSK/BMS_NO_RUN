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


public class MainActivity7  extends AppCompatActivity{

   //     private TextView ListView,Cat,Produit1,Produit2,Produit3,Produit4,RF1,RF2,RF3,RF4;
        private CheckBox CB ,CB2,CB3,CB4;

        private Button BuNext;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        // Find All





            BuNext = findViewById(R.id.BuNext);





            BuNext.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                 Intent intent = new Intent(MainActivity7.this , MainActivity8.class);
              startActivity(intent);
                }
            });





    }

}
