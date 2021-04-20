package com.example.packers_and_movers_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    Button btn1;
    EditText editText1,editText2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editText1=(EditText) findViewById(R.id.editTextTextPersonName3);
        editText2=(EditText)findViewById(R.id.editTextTextPassword3);
        btn1=(Button)findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Email = editText1.getText().toString();
                String Password  = editText2.getText().toString();

//                FirebaseAuth.getInstance().signInWithEmailAndPassword(email,password).
//                        addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                            @Override
//                            public void onComplete(@NonNull Task<AuthResult> task) {
//                                if(task.isSuccessful()){
//                                    //display some message here
//
//                                    Toast.makeText(login.this,"Successfully Login",Toast.LENGTH_LONG).show();
                                    Intent intent=new Intent(login.this,MainActivity.class);
                                    startActivity(intent);
//                                }else{
//                                    //display some message here
//                                    Toast.makeText(login.this,"Login Error",Toast.LENGTH_LONG).show();
//                                }
//                            }
//                        });
            }
        });

    }
}