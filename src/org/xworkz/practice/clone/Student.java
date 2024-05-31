package org.xworkz.practice.clone;

public class Student  implements Cloneable{
    String name;
    int age;
    Address address=new Address();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
