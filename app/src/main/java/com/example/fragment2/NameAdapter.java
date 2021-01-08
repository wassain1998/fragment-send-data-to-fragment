package com.example.fragment2;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class NameAdapter extends RecyclerView.Adapter<NameAdapter.NameHolder> {
    ArrayList<Name> names;//نعمل المصفوفة ونعمل لها constrictar
    OnItemClickListener listener;//inflate
    public NameAdapter(ArrayList<Name> names, OnItemClickListener listener) {
        this.listener = listener;
        this.names = names;
    }

    //عملنا implemantition لدالة NameAdapter
    @NonNull
    @Override
    public NameHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_name_layout, parent, false);
        return new NameHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NameHolder holder, int position) {
        Name name = names.get(position);
        holder.bind(name);

    }

    @Override
    public int getItemCount() {
        return names.size();
    }
    //implemantitionنهاية ال


    class NameHolder extends RecyclerView.ViewHolder{//نعمل كلاس الهولدر
        TextView tv_name;
        Name name;
        //عملنا constractr
        public NameHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = itemView.findViewById(R.id.custom_tv_name);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.OnItemClick(name);

                }
            });
        }
        //نهايةال constrictar

        void bind (Name name){
            this.name=name;
            tv_name.setText(name.getName());

        }
    }
}