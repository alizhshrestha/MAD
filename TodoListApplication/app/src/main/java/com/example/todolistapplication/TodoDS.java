package com.example.todolistapplication;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

public class TodoDS {

    private static TodoDS todoInstance;

    private ArrayList<Todo> mTodoList;

    private TodoDS(Context context){
        mTodoList = new ArrayList<>();

        for (int i = 0 ; i < 3; i++){
            Todo todo
                     = new Todo();
            todo.setTitle("Todo title " + i);
            todo.setDetail("Detail for task" + todo.getId().toString());
            todo.setComplete(false);
            mTodoList.add(todo);
        }
    }

    public static TodoDS getInstance(Context context){
        if (todoInstance == null){
            todoInstance = new TodoDS(context);
        }
        return todoInstance;
    }

    public ArrayList<Todo> getTodos(){
        return mTodoList;
    }

    public void addTodo(Todo todo){
        mTodoList.add(todo);
    }

    public Todo getTodo(UUID todoId){
        for (Todo todo: mTodoList){
            if (todo.getId().equals(todoId)){
                return todo;
            }
        }

        return null;
    }
}
