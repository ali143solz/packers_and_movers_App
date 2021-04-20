package com.example.packers_and_movers_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class signupactivity extends AppCompatActivity {

    Button btn;
    EditText editText1,editText2,editText3,editText4;
    RadioGroup radioGroup;
    RadioButton radioButton1,radioButton2;
   // private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupactivity);
        btn=(Button)findViewById(R.id.button6);
        editText1=(EditText)findViewById(R.id.editTextTextPersonName6);
        editText2=(EditText)findViewById(R.id.editTextTextPersonName9);
        editText3=(EditText)findViewById(R.id.editTextTextEmailAddress3);
        editText4=(EditText)findViewById(R.id.editTextTextPassword6);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        radioButton1=(RadioButton)findViewById(R.id.radioButton3);
        radioButton2=(RadioButton)findViewById(R.id.radioButton4);
        //mAuth = FirebaseAuth.getInstance();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Firstname=editText1.getText().toString();
                String Lastname=editText2.getText().toString();
                String Email=editText3.getText().toString();
                String Pass=editText4.getText().toString();
                String customer=radioButton1.getText().toString();
                String movers=radioButton2.getText().toString();

                if(Firstname.isEmpty()){
                    editText1.setError("Name is required");
                    editText1.requestFocus();
                    return;
                }
                if(Lastname.isEmpty()){
                    editText2.setError("Age is required");
                    editText2.requestFocus();
                    return;
                }
                if(Email.isEmpty()){
                    editText3.setError("Email is required");
                    editText3.requestFocus();
                    return;
                }
                if(Pass.isEmpty()){
                    editText4.setError("Password is required");
                    editText4.requestFocus();
                    return;
                }
                if(!Patterns.EMAIL_ADDRESS.matcher(Email).matches())
                {
                    editText3.setError("Email is required");
                    editText3.requestFocus();
                    return;
                }
                if(Pass.length()<6){
                    editText4.setError("Password Lenght is short");
                    editText4.requestFocus();
                    return;
                }

//                mAuth.createUserWithEmailAndPassword(Email,Pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if(task.isSuccessful())
//                        {
//                            User user=new User(Firstname,Lastname);
//                            FirebaseDatabase.getInstance().getReference("Users").child(FirebaseAuth.getInstance().getCurrentUser().getUid())
//                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
//                                @Override
//                                public void onComplete(@NonNull Task<Void> task) {
//                                    if(task.isSuccessful())
//                                    {
//                                        Toast.makeText(getApplicationContext(),"Registration successful",Toast.LENGTH_LONG).show();
                                        Intent intent=new Intent(signupactivity.this,login.class);
                                        startActivity(intent);
//                                    }
//                                    else {
//                                        Toast.makeText(getApplicationContext(),"Registration Error",Toast.LENGTH_LONG).show();
//                                    }
//                                }
//                            });
//                        }
//                        else {
//                            Toast.makeText(getApplicationContext(),"Registration Error ",Toast.LENGTH_LONG).show();
//
//                        }
//                    }
              //  });

            }
        });
    }
}