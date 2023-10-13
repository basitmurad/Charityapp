package com.basit.charityapp.adpters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.basit.charityapp.R;
import com.basit.charityapp.model.DonationsClass;

import java.util.ArrayList;

public class DonationsAdapter extends RecyclerView.Adapter<DonationsAdapter.MyHolder> {
    private Context context;
    private ArrayList<DonationsClass> arrayList;

    public DonationsAdapter(Context context, ArrayList<DonationsClass> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public DonationsAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view =LayoutInflater.from(context).inflate(R.layout.donation_layout,parent,false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DonationsAdapter.MyHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        private TextView textItemName, textTime,textQuantity,textDate;
        public MyHolder(@NonNull View itemView) {
            super(itemView);

            textDate = itemView.findViewById(R.id.textDate);
            textItemName = itemView.findViewById(R.id.itemName);
            textTime = itemView.findViewById(R.id.textTime);
            textQuantity = itemView.findViewById(R.id.textQuantity);
        }
    }
}
