package com.jymanager.model;

public class TableColumns {

    private String field;


    private String title;



    private Integer width;


    public String getField() {
        return field;
    }


    public void setField(String field) {
        this.field = field == null ? null : field.trim();
    }

    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }    
    
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }
}