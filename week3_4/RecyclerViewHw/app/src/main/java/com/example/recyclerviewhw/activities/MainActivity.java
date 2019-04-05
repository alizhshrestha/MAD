package com.example.recyclerviewhw.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.example.recyclerviewhw.Model.Receipe;
import com.example.recyclerviewhw.R;
import com.example.recyclerviewhw.adapter.ReceipeListAdapter;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private LinkedList<Receipe> mReceipes;
    private RecyclerView mRecyclerView;
    private ReceipeListAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        InitializeData();


        // Get a handle to the RecyclerView.
        mRecyclerView = findViewById(R.id.recyclerview);
// Create an adapter and supply the data to be displayed.
        mAdapter = new ReceipeListAdapter(this, mReceipes);
// Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
// Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void InitializeData(){
        mReceipes = new LinkedList<Receipe>();
        mReceipes.add(new Receipe("299537","Title", "overview", "desc", "/0*gMxBDbMRUVUcwrzo.jpg"));
        mReceipes.add(new Receipe("299537","Title2", "overview2", "desc2", "/0*gMxBDbMRUVUcwrzo.jpg"));
        mReceipes.add(new Receipe("299537","Title3", "overview3", "desc3", "/0*gMxBDbMRUVUcwrzo.jpg"));
        mReceipes.add(new Receipe("299537","Title4", "overview4", "desc4", "/0*gMxBDbMRUVUcwrzo.jpg"));


    }
}
