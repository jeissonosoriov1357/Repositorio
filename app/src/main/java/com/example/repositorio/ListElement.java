package com.example.repositorio;

public class ListElement {
    public String title;
    public String start;



    public ListElement(String title, String start) {

        this.title = title;
        this.start = start;

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }
}
