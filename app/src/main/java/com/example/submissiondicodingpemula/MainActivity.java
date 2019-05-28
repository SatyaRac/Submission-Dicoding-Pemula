package com.example.submissiondicodingpemula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 public RecyclerView rvCategory;
    private ArrayList<Kabupaten> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(KabupatenData.getListData());
        showRecyclerCardView();

    }

    private void showRecyclerCardView() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewKabupatenAdapter cardViewKabupatenAdapter = new CardViewKabupatenAdapter(this);
        cardViewKabupatenAdapter.setListKabupaten(list);
        rvCategory.setAdapter(cardViewKabupatenAdapter);


    }


}
