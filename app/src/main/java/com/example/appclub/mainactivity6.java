package com.example.appclub;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appclub.MainActivity7;
import com.example.appclub.R;
public class MainActivity6  extends AppCompatActivity{

    private Button buLoginID4;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        // Find All

            buLoginID4= findViewById(R.id.buLoginID4);



            buLoginID4.setOnClickListener( new View.OnClickListener() {
                                               @Override
                                               public void onClick(View view) {
                                                   Intent intent = new Intent(MainActivity6.this , MainActivity7.class);
                                                   startActivity(intent);
                                               }
                                           }

            );

    }
}
