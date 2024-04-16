package org.example;


import org.jetbrains.annotations.NotNull;

public class Student {
    private String name, group, specialty;

    public Student( String name, String group, String specialty){
        this.name=name;
        this.group=group;
        this.specialty=specialty;
    }

    public String getName() {
        return name;
    }
    @NotNull
    @Size(max=20)
    public void setName(String name) {
        this.name = name;
    }
    public String getGroup() {
        return group;
    }
    @NotNull
    @Size(max=30)
    public void setGroup(String group) {
        this.group = group;
    }
    public String getSpecialty() {
        return specialty;
    }
    @NotNull
    @Size(max=64)
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public static void main(String[] args) {

        Student student = new Student("Boris","Group1","java");
        System.out.println(student.getClass().getClassLoader());
        System.out.println(student);
    }
}
