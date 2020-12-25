package com.example.appclub;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity10  extends AppCompatActivity {


    private TextView ListView,Cat,Produit1,P2,P3,P4,P5,P6,P7,RF1,R2,R3,R4,R5,R6,R7;
    private CheckBox CB ,C2,C3,C4,C5,C6,C7;

    private Button BuNext;





    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        // Find All
        {
            ListView =  findViewById(R.id.ListeView);
            Cat = findViewById(R.id.Cat);
            Produit1= findViewById(R.id.Produit);

            CB = findViewById(R.id.CB);
            C2 = findViewById(R.id.C2);
            C3 = findViewById(R.id.C3);
            C4 = findViewById(R.id.C4);
            C5 = findViewById(R.id.C5);
            C6 = findViewById(R.id.C6);
            C7 = findViewById(R.id.C7);


            P2= findViewById(R.id.P2);
            P3= findViewById(R.id.P3);
            P4= findViewById(R.id.P4);
            P5= findViewById(R.id.P5);
            P6= findViewById(R.id.P6);
            P7= findViewById(R.id.P7);


            RF1= findViewById(R.id.RF1);
            R2= findViewById(R.id.R2);
            R3= findViewById(R.id.R3);
            R4= findViewById(R.id.R4);
            R5= findViewById(R.id.R5);
            R6= findViewById(R.id.R6);
            R7= findViewById(R.id.R7);

            BuNext = findViewById(R.id.BuNext);


        }

        {
            BuNext.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(MainActivity10.this , MainActivity11.class);
                            startActivity(intent);
                        }
                    }
            );

        }
    }
}
