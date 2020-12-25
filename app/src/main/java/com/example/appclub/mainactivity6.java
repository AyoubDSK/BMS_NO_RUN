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

import com.example.appclub.R;
public class mainactivity6  extends AppCompatActivity{

    private Button buLoginID4;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        // Find All
        {
            buLoginID4= findViewById(R.id.buLoginID4);
        }

        {
            buLoginID4.setOnClickListener( new View.OnClickListener() {
                                               @Override
                                               public void onClick(View view) {
                                                   Intent intent = new Intent(mainactivity6.this , MainActivity7.class);
                                                   startActivity(intent);
                                               }
                                           }

            );
        }
    }
}
