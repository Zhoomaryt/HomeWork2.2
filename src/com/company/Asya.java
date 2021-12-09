package com.company;

public class Asya extends Gods {
    private String male;

    public Asya(String name, String male) {
        super(name);
        this.male = male;
    }

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    @Override
    public void print() {
        System.out.println(getName() + ": pol-" + getMale());
    }
}