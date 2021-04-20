package com.example.packers_and_movers_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class customerinfo extends AppCompatActivity {

    EditText editText1,editText2,editText3,editText4,editText5;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customerinfo);
        editText1=(EditText)findViewById(R.id.editTextTextPersonName3);
        editText2=(EditText)findViewById(R.id.editTextTextPassword3);
        editText3=(EditText)findViewById(R.id.editTextPhone);
        editText4=(EditText)findViewById(R.id.editTextTextPostalAddress);
       // editText5=(EditText)findViewById(R.id.editTextTextPostalAddress2);
        btn=(Button)findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=editText1.getText().toString();
                String Cemail=editText2.getText().toString();
                String subject=editText3.getText().toString();
//                String pickupaddress=editText4.getText().toString();
//                String destinationaddress=editText5.getText().toString();
                String text=editText4.getText().toString();

                Intent mail=new Intent(Intent.ACTION_SEND);
                mail.putExtra(Intent.EXTRA_EMAIL,new String[]{Cemail});
              //mail.putExtra(Intent.EXTRA_SUBJECT,phone);
//                mail.putExtra(Intent.EXTRA_TEXT,pickupaddress);
//                mail.putExtra(Intent.EXTRA_TEXT,destinationaddress);
                mail.putExtra(Intent.EXTRA_TEXT,text);
                mail.putExtra(Intent.EXTRA_SUBJECT,name);
                mail.putExtra(Intent.EXTRA_SUBJECT,subject);

                mail.setType("message/rfc822");
                startActivity(Intent.createChooser(mail,"Choose an Email :"));
            }
        });
    }
}