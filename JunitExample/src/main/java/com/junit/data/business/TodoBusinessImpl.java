package com.junit.data.business;

import java.util.ArrayList;
import java.util.List;

import com.junit.data.api.TodoService;

//TodoBusinessImpl is SUT(System Under Test)
//TodoService is the Dependency
public class TodoBusinessImpl {
  
  private TodoService todoService;

  TodoBusinessImpl(TodoService todoService) {
    this.todoService = todoService;
  }

  public List<String> retrieveTodosRelatedToSpring(String user) {
    
    List<String> filteredTodos = new ArrayList<String>();
    List<String> allTodos = todoService.retrieveTodos(user);
    for (String todo : allTodos) {
      if (todo.contains("Spring")) {
        filteredTodos.add(todo);
      }
    }
    return filteredTodos;
  }
}
