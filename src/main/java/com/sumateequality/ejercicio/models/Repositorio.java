
package com.sumateequality.ejercicio.models;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Paula
 */

@Document(collection= "data_repository")
public class Repositorio {

    @Id
    private String id;
    
    private String repo_name;
    private String full_name;
    private Date created; //@Temporal?
    private String language;
    private String username;
    private Integer stars;
    private Integer forks;
    private Integer subscribers;
    private Integer open_issues;
    private Integer days_alive;

    public Repositorio() {
    }

    public Repositorio(String id, String repo_name, String full_name, Date created, String language, String username, Integer stars, Integer forks, Integer subscribers, Integer open_issues, Integer days_alive) {
        this.id = id;
        this.repo_name = repo_name;
        this.full_name = full_name;
        this.created = created;
        this.language = language;
        this.username = username;
        this.stars = stars;
        this.forks = forks;
        this.subscribers = subscribers;
        this.open_issues = open_issues;
        this.days_alive = days_alive;
    }

    //comento? 
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRepo_name() {
        return repo_name;
    }

    public void setRepo_name(String repo_name) {
        this.repo_name = repo_name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public Integer getForks() {
        return forks;
    }

    public void setForks(Integer forks) {
        this.forks = forks;
    }

    public Integer getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(Integer subscribers) {
        this.subscribers = subscribers;
    }

    public Integer getOpen_issues() {
        return open_issues;
    }

    public void setOpen_issues(Integer open_issues) {
        this.open_issues = open_issues;
    }

    public Integer getDays_alive() {
        return days_alive;
    }

    public void setDays_alive(Integer days_alive) {
        this.days_alive = days_alive;
    }

    @Override
    public String toString() {
        return "Repositorio{" + "id=" + id + ", repo_name=" + repo_name + ", full_name=" + full_name + ", created=" + created + ", language=" + language + ", username=" + username + ", stars=" + stars + ", forks=" + forks + ", subscribers=" + subscribers + ", open_issues=" + open_issues + ", days_alive=" + days_alive + '}';
    }
    
}
