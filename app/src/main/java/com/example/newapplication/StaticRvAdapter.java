package com.example.newapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import static android.app.PendingIntent.getActivity;

public class StaticRvAdapter extends RecyclerView.Adapter<StaticRvAdapter.StaticRVViewHolder> {
    private final ArrayList<StaticRvModel> item;
    int row_index = -1;






    public StaticRvAdapter(ArrayList<StaticRvModel> item) {
        this.item = item;

    }

    @NonNull
    @NotNull
    @Override
    public StaticRVViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.static_rv_item, parent, false);

        return new StaticRVViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull StaticRVViewHolder holder, int position) {
        StaticRvModel currentItem = item.get(position);
        holder.imageView.setImageResource(currentItem.getImage());
        holder.textView.setText(currentItem.getText());

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                row_index = position;
                notifyDataSetChanged();


            }

        });
        if (row_index == position) {
            holder.linearLayout.setBackgroundResource(R.drawable.static_rv_selected_bg);
        } else {
            holder.linearLayout.setBackgroundResource(R.drawable.static_rv_bg);
        }


    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    public static class StaticRVViewHolder extends RecyclerView.ViewHolder implements com.example.newapplication.StaticRVViewHolder{
        TextView textView, textView2;
        ImageView imageView, imageView2;
        LinearLayout linearLayout, linearLayout2;


        public StaticRVViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.tictac);
            textView = itemView.findViewById(R.id.tictacText);
            linearLayout = itemView.findViewById(R.id.linear);
            imageView2 = itemView.findViewById(R.id.sudoku);
            textView2 = itemView.findViewById(R.id.sudokutext);
            linearLayout2 = itemView.findViewById(R.id.linear2);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos=getAdapterPosition();
                    if(pos==0){
                    Intent intent=new Intent(v.getContext(),Tictac.class) ;
                    v.getContext().startActivity(intent);}
                    else if(pos==1){
                        Intent intent=new Intent(v.getContext(),Sudoku.class) ;
                        v.getContext().startActivity(intent);}
                    }

                });


        }



    }
}



