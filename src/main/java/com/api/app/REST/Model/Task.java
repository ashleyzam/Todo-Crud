package com.api.app.REST.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.springframework.lang.NonNull;

@Entity
@Table(schema = "todo", name ="task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    @NotBlank
    private String title;
    @Column
    @NotBlank
    private String description;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
}
