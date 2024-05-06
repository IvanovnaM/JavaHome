package org.example;

import java.io.*;

public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 6136326911128759713L;

    private int id;
    private  String name;
    public Person(int id, String name){
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String toString (){
        return id+" : "+name;
    }


}
