package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {

        Person [] people={new Person(1,"Bob"),
                new Person(2,"Mike"),new Person(3,"Tome")};
        try (ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("people.bin"))) {

            oos.writeObject(people);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
