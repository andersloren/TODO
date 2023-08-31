package lexicon.data.dao;

import lexicon.model.Person;
import lexicon.model.TodoItemTask;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;
@Component
public class TodoItemTaskDaoCollection implements TodoItemTaskDao{

    private Collection<TodoItemTask> todoItemTasks;
    private static TodoItemTaskDaoCollection instance;

    private TodoItemTaskDaoCollection() {
        this.todoItemTasks = new ArrayList<>();
    }

    public static TodoItemTaskDaoCollection getInstance() {
        if (instance == null) {
            instance = new TodoItemTaskDaoCollection();
        }
        return instance;
    }
    @Override
    public TodoItemTask persist(TodoItemTask todoItemTask) {
        return null;
    }

    @Override
    public TodoItemTask findById(int id) {
        return null;
    }

    @Override
    public Collection<TodoItemTask> findAll() {
        return null;
    }

    @Override
    public Collection<TodoItemTask> findByAssignedStatus(boolean status) {
        return null;
    }

    @Override
    public Collection<TodoItemTask> findByPersonId(Person personId) {
        return null;
    }

    @Override
    public void remove(int id) {

    }
}
