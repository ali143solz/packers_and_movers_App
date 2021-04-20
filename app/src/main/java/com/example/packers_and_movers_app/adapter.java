package com.example.packers_and_movers_app;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<viewholder> {

    ArrayList<model>data;
    Context context;

    public adapter(ArrayList<model> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.single_card,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        final model temp=data.get(position);

        holder.textView1.setText(data.get(position).getHeader());
        holder.textView2.setText(data.get(position).getDesc());

        holder.imageView.setImageResource(data.get(position).getImgname(R.drawable.ic_launcher_background));
//        holder.imageView.setImageResource(data.get(position).getImgname(R.drawable.ic_launcher_background));
//        holder.imageView.setImageResource(data.get(position).getImgname(R.drawable.ufone));
//        holder.imageView.setImageResource(data.get(position).getImgname(R.drawable.zong));


        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,customerinfo.class);
                intent.putExtra("imagename",temp.getImgname('a'));
                intent.putExtra("header",temp.getDesc());
                intent.putExtra("desc",temp.getHeader());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
                //camera();
            }
        });
        holder.textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,customerinfo.class);
                intent.putExtra("imagename",temp.getImgname('a'));
                intent.putExtra("header",temp.getDesc());
                intent.putExtra("desc",temp.getHeader());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
        holder.textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,customerinfo.class);
                intent.putExtra("imagename",temp.getImgname('a'));
                intent.putExtra("header",temp.getDesc());
                intent.putExtra("desc",temp.getHeader());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
