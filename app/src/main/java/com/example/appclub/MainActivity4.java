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

public class MainActivity4 extends AppCompatActivity {

    private EditText edNomID2,edPrenomID2,edEmail2ID2,edPass2ID2;
    private CheckBox admin,agent;
    private Button buSaveID2;
    private TextView txtRetour;

    void dd(){

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        // Find All
        {
            edNomID2 = findViewById(R.id.edNomID2);
            edPrenomID2 = findViewById(R.id.edPrenomID2);
            edEmail2ID2 = findViewById(R.id.edEmail2ID2);
            edPass2ID2 = findViewById(R.id.edPass2ID2);

            buSaveID2 = findViewById(R.id.buSaveID2);
            txtRetour = findViewById(R.id.txtRetourID);
        }
    }

    }
