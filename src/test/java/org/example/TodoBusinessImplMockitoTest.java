package org.example;
import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import org.example.TodoService;
import org.example.TodoServiceStub;

public class TodoBusinessImplMockitoTest {

    @Test
    public void usingAStub() {
        TodoService todoService = new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
        List<String> todos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Ranga");
        assertEquals(2, todos.size());
    }
}