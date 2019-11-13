package com.junit.data.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.junit.data.api.TodoService;
import com.junit.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

  @Test
  public void test() {
    TodoService todoServiceStub = new TodoServiceStub();
    
    TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceStub);
    
    List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
    
    assertEquals(2, filteredTodos.size());
    
  }

}
