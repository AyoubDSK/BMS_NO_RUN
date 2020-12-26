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


public class MainActivity8 extends AppCompatActivity {

    private Button BuNext = findViewById(R.id.BuNext);

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        // Find All

            BuNext = findViewById(R.id.BuNext);


            BuNext.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(MainActivity8.this , MainActivity9.class);
                            startActivity(intent);
                        }
                    }
            );

    }



    }
