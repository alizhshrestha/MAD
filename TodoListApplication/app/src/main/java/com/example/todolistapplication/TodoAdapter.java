package com.example.todolistapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.TodoHolder>{

    private List<Todo> mTodos;
    Context context;

    public TodoAdapter(List<Todo> todos, Context context){
        mTodos = todos;
        this.context = context;
    }

    @NonNull
    @Override
    public TodoAdapter.TodoHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull TodoAdapter.TodoHolder todoHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


}
