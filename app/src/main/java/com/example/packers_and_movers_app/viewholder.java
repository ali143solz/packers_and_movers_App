package com.example.packers_and_movers_app;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class viewholder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView textView1,textView2;
    public viewholder(@NonNull View itemView) {
        super(itemView);
        imageView=(ImageView)itemView.findViewById(R.id.img);
        textView1=(TextView)itemView.findViewById(R.id.btext);
        textView2=(TextView)itemView.findViewById(R.id.stext);
    }
}
