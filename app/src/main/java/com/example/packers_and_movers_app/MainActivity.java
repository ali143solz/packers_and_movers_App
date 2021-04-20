package com.example.packers_and_movers_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter=new adapter(dqueue(),getApplicationContext());
        recyclerView.setAdapter(adapter);


    }

    public ArrayList<model> dqueue()
    {
        ArrayList<model> holder=new ArrayList<>();

        model mod=new model();
        mod.setHeader("Ultimate Movers");
        mod.setDesc("Company");
        mod.setImgname(R.drawable.ic_launcher_background);
        holder.add(mod);

        model mod1=new model();
        mod1.setHeader("Jalal Sons Movers Ltd");
        mod1.setDesc("Company");
        mod1.setImgname(R.drawable.ic_launcher_background);
        holder.add(mod1);

        model mod2=new model();
        mod2.setHeader("Knowledgeable Movers");
        mod2.setDesc("Company");
        mod2.setImgname(R.drawable.ic_launcher_background);
        holder.add(mod2);

        model mod3=new model();
        mod3.setHeader("24/7 Moving");
        mod3.setDesc("Company");
        mod3.setImgname(R.drawable.ic_launcher_background);
        holder.add(mod3);

        model mod4=new model();
        mod4.setHeader("Momma's Moving Company");
        mod4.setDesc("Company");
        mod4.setImgname(R.drawable.ic_launcher_background);
        holder.add(mod4);

        model mod5=new model();
        mod5.setHeader("Pro Movers");
        mod5.setDesc("Company");
        mod5.setImgname(R.drawable.ic_launcher_background);
        holder.add(mod5);

        return holder;
    }
}