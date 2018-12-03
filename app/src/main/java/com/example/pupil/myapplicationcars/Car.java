package com.example.pupil.myapplicationcars;

public class Car implements CarInterface {
    private String mark;
    private String type;
    private String countofpeople;

    public Car(String mark, String type, String countofpeople) {
        this.mark =mark;
        this.type = type;
        this.countofpeople =countofpeople;
    }


    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountofpeople() {
        return countofpeople;
    }

    public void setCountofpeople(String countofpeople) {
        this.countofpeople = countofpeople;
    }



    @Override
    public void work() {

    }

    @Override
    public void ride() {

    }
}
