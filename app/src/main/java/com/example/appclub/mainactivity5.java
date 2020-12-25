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
public class mainactivity5  extends AppCompatActivity{
        private TextView Add,Etude;
        private  Button NM,Ex;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        // Find All
        {

            Add= findViewById(R.id.Add);
            Etude = findViewById(R.id.Etude);
            NM = findViewById(R.id.NM);
            Ex = findViewById(R.id.Ex);

        }

        {
            Ex.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(mainactivity5.this , MainActivity4.class);
                            startActivity(intent);
                        }
                    }
            );

            NM.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(mainactivity5.this , MainActivity2.class);
                            startActivity(intent);
                        }
                    }
            );
        }
    }
}
