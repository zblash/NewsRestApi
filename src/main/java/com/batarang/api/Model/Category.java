package com.batarang.api.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String description;

    @OneToMany(mappedBy = "category")
    private Set<News> newses = new HashSet<>();

    public void addNews(News news){
        newses.add(news);
    }

    public void removeNews(News news){
        newses.remove(news);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<News> getNewses() {
        return newses;
    }

    public void setNewses(Set<News> newses) {
        this.newses = newses;
    }

    @Override
    public String toString() {
        return "Category [id=" + id + ", name=" + name + ", description=" + description + "]";
    }
}