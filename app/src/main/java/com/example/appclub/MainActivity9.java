package com.example.appclub;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity9 extends AppCompatActivity {

    private TextView ListView,Cat,Produit1,Produit2,Produit3,RF1,RF2,RF3;
    private CheckBox CB ,CB2,CB3;

    private Button BuNext;





    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        // Find All
        {
            ListView =  findViewById(R.id.ListeView);
            Cat = findViewById(R.id.Cat);
            Produit1= findViewById(R.id.Produit);
            Produit2= findViewById(R.id.Produit);
            Produit3= findViewById(R.id.PR2);

            RF1= findViewById(R.id.RF);
            RF2= findViewById(R.id.R1);
            RF3= findViewById(R.id.R2_);

            BuNext = findViewById(R.id.BuNext);


        }

        {
            BuNext.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(MainActivity9.this , MainActivity10.class);
                            startActivity(intent);
                        }
                    }
            );
        }
    }
}
