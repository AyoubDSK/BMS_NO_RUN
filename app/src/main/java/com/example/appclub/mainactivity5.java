package com.example.appclub;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity5 extends AppCompatActivity{
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
                            Intent intent = new Intent(MainActivity5.this , MainActivity4.class);
                            startActivity(intent);
                        }
                    }
            );

            NM.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(MainActivity5.this , MainActivity2.class);
                            startActivity(intent);
                        }
                    }
            );
        }
    }
}
