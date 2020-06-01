package com.example.recycledviewpooltest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SubItemAdapter extends RecyclerView.Adapter<SubItemAdapter.SubItemViewHolder> {

    private List<SubItem> subItemList;

    SubItemAdapter(List<SubItem> subItemList) {
        this.subItemList = subItemList;
    }

    @NonNull
    @Override
    public SubItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_sub_item, viewGroup, false);
        return new SubItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SubItemViewHolder holder, int i) {
        SubItem currentItem = subItemList.get(i);
        holder.workoutName.setText(currentItem.getmWorkoutName());
        holder.workoutNum.setText(currentItem.getWorkoutNum());

        currentItem.setSpinner(holder.workoutUnit);

        // store the spinner in the DetailItem object
        currentItem.setSpinner(holder.workoutUnit);

        // store DetailItem object in the array
    }

    @Override
    public int getItemCount() {
        return subItemList.size();
    }

    class SubItemViewHolder extends RecyclerView.ViewHolder {
        EditText workoutName;
        EditText workoutNum;
        Spinner workoutUnit;

        SubItemViewHolder(View itemView) {
            super(itemView);
            workoutName = itemView.findViewById(R.id.workoutname);
            workoutNum = itemView.findViewById(R.id.number);
            workoutUnit = itemView.findViewById(R.id.unitspinner);

            workoutUnit.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapter, View v,
                                           int position, long id) {
                    // On selecting a spinner item
                    String sStep = adapter.getItemAtPosition(position).toString();

                    workoutUnit.setSelection(position);
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                }
            });
        }
        }
    }


