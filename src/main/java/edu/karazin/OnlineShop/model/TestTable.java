package edu.karazin.OnlineShop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class TestTable {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String content;


    public TestTable() {
    }

    public TestTable(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
