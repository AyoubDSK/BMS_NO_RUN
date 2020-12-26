package com.example.appclub;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity13  extends AppCompatActivity {

            private Button finish;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);

        {
            finish = findViewById(R.id.Finish);
        }

        {
            finish.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Intent intent = new Intent(MainActivity13.this , MainActivity5.class);
                            startActivity(intent);
                        }
                    }
            );
        }


    }


    }
