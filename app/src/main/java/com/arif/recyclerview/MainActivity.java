package com.arif.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.concurrent.locks.ReadWriteLock;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    int[] images = {R.drawable.armenia, R.drawable.azerbaijan, R.drawable.bahrain, R.drawable.bangladesh, R.drawable.bhutan, R.drawable.china, R.drawable.india, R.drawable.japan, R.drawable.nepal, R.drawable.pakistan, R.drawable.srilanka};
    String[] title, desc;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewId);
        title = getResources().getStringArray(R.array.country_names);
        desc = getResources().getStringArray(R.array.country_des);
        myAdapter = new MyAdapter(this,title,desc,images);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}