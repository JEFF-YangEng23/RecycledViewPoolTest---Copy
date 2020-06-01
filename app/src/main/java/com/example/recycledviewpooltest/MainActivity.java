package com.example.recycledviewpooltest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button addExerciseButton;
    private Button addSetButton;
    int numOfItem = 0;
    int numOfSubItem = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView rvItem = findViewById(R.id.rv_item);
        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        /*
        ItemAdapter itemAdapter = new ItemAdapter(buildItemList());
        rvItem.setAdapter(itemAdapter);
        */
        rvItem.setLayoutManager(layoutManager);
        /*
        addExerciseButton = findViewById(R.id.addExerciseButton);
        addExerciseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addExercise();
                ItemAdapter itemAdapter = new ItemAdapter(buildItemList());
                rvItem.setAdapter(itemAdapter);
            }
        });
        */
        addSetButton = findViewById(R.id.addSetButton);
        addSetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addSet();
                ItemAdapter itemAdapter = new ItemAdapter(buildItemList());
                rvItem.setAdapter(itemAdapter);
            }
        });
    }

    private List<Item> buildItemList() {
        List<Item> itemList = new ArrayList<>();
        for (int i=0; i<numOfItem; i++) {
            Item item = new Item("","",buildSubItemList());
            itemList.add(item);
        }
        return itemList;
    }


    private List<SubItem> buildSubItemList() {
        List<SubItem> subItemList = new ArrayList<>();
        for (int i=0; i<numOfSubItem; i++) {
            SubItem subItem = new SubItem("","","");
            subItemList.add(subItem);
        }
        return subItemList;
    }

    /*
    private void addExercise() {
        numOfSubItem++;
    }
     */
    private void addSet() {
        numOfSubItem = 1;
        numOfItem++;
    }

}
