package com.frostdev.todolist_11.listener;

import com.frostdev.todolist_11.entities.Todo;

public interface TodoListener {
    void onTodoClicked(Todo todo, int position);
}