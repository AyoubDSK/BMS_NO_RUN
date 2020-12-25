package com.example.appclub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edEmail , edPass ;
    private Button buLogin ;
    private TextView txtNew ;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find All
        {
            edEmail = findViewById(R.id.edEmail1ID);
            edPass = findViewById(R.id.edPass1ID);
            buLogin = findViewById(R.id.buLoginID);
            txtNew = findViewById(R.id.txtNewID);
        }

        // Listen de Text New Account
        {
            txtNew.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this , MainActivity4.class);
                    startActivity(intent);
                }
            }  );
        }



        // Listen de Button Login
        {
            buLogin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    // test
                    if(test_user() == 0){
                        //admin
                       // Intent intent = new Intent(MainActivity.this, MainActivity3.class);
                     //   startActivity(intent);
                    }else{
                        if(test_user() == 1){
                            //agent
                            Intent intent = new Intent(MainActivity.this, mainactivity5.class);
                            startActivity(intent);
                        }
                    }
                    // fin test

                }
            });
        }
    }
    private int test_user(){
        Editable s = edEmail.getText();
        Editable pass = edPass.getText();
        String d = s.toString();
        String passS = pass.toString();

    if( d == "ayoub@gmail.com" && passS == "ayoub"){
        return 0;
    }else{
        if(d == "tayeb@gmail.com" && passS == "tayeb"){
            return 1;
        }
    }

    return 3;
    }
}