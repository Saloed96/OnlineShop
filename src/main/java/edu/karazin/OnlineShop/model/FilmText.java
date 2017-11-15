package edu.karazin.OnlineShop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "film_text")
public class FilmText {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long film_id;
    private String title;
    private String description;

    public FilmText(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public FilmText() {
    }

    public long getFilm_id() {
        return film_id;
    }

    public void setFilm_id(long film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
