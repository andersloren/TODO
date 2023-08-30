package lexicon.model;

import lexicon.data.sequencers.TodoItemTaskIdSequencer;

public class TodoItemTask {

    // Fields
    private final int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    // Constructor(s)
    public TodoItemTask() {
        id = TodoItemTaskIdSequencer.nextId();
    }

    public TodoItemTask(boolean assigned, TodoItem todoItem, Person assignee) {
        this();
        this.assigned = assigned;
        this.todoItem = todoItem;
        this.assignee = assignee;
    }

    // Methods

    // Overridden methods from Object

    // Getters & Setters

    public int getId() {
        return id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        if (todoItem == null) throw new NullPointerException("Object is null");
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }
}
