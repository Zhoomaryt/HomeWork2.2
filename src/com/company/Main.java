package com.company;

public class Main {

    public static void main(String[] args) {

        Printable[] Gods = {createObject("Amira"),createObject("Asya"),createObject("Albert")};
        for (int i = 0; i < Gods.length; i++) {
            Gods[i].print();
        }






    }
    public static Printable createObject(String Gods){
        Printable printable = null;
        switch (Gods){
            case "Amira":
                printable = new Amira("Amira","GODofWAR");
                break;
            case "Asya":
                printable = new Asya("Asya","маленькая девочка ");
                break;
            case "Albert":
                printable = new Albert("Albert","Вера в чудо");
                break;
        }
        return printable;
    }
}
