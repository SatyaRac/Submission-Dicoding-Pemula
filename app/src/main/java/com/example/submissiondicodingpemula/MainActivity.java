package com.example.submissiondicodingpemula;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 public RecyclerView rvCategory;
    private ArrayList<Kabupaten> list = new ArrayList<>();
    final String STATE_TITLE = "state_string";
    final String STATE_LIST = "state_list";
    final String STATE_MODE = "state_mode";
    int mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(KabupatenData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListKabupatenAdapter listKabupatenAdapter = new ListKabupatenAdapter(this);
        listKabupatenAdapter.setListKabupaten(list);
        rvCategory.setAdapter(listKabupatenAdapter);

        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener(){
            @Override
            public void onItemClicked(RecyclerView recyclerView, int postion, View view){
                Intent moveDataActivity = new Intent(MainActivity.this, Detail.class);
                moveDataActivity.putExtra("KIRIM",list.get(postion));
                startActivity(moveDataActivity);
            }
        });
    }

    private void showRecyclerCardView() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewKabupatenAdapter cardViewKabupatenAdapter = new CardViewKabupatenAdapter(this);
        cardViewKabupatenAdapter.setListKabupaten(list);
        rvCategory.setAdapter(cardViewKabupatenAdapter);


    }


    private void setActionBarTitle(String title){
        getSupportActionBar().setTitle(title);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString(STATE_TITLE,getSupportActionBar().getTitle().toString());
        outState.putParcelableArrayList(STATE_LIST,list);
        outState.putInt(STATE_MODE, mode);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.action_cardview:
            break;

            case R.id.action_list:
            break;
        }
        return super.onOptionsItemSelected(item);
    }

}
