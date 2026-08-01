package com.todo.model;

import org.framework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="todos")
public class Todo{
    @id
    private String id;
    private String text;
    private String category;
    private boolean completed;
    private String created;

    public Todo(){

    }

    public Todo(String text, String category, boolean completed, String created){
        this.text = text;
        this.category = category;
        this.completed = completed;
        this.created = created;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public boolean isCompleted(){
        return completed;
    }

    public void setCompleted(boolean completed){
        this.completed = completed;
    }

    public String getCreated(){
        return created;
    }

    public void setCreated(String created){
        this.created = created;
    }
}