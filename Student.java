package Test;

import java.util.ArrayList;
import java.util.List;

public class Student implements Element,Visitee{
    private String nume;
    private String mail;

    public Student(String nume, String mail) {
        super();
        this.nume = nume;
        this.mail = mail;
    }


    public void print() {
        // TODO Auto-generated method stub
        System.out.println(nume + ", " + mail);
    }


    @Override
    public void add(Element element) {
        // TODO Auto-generated method stub
        throw new java.lang.UnsupportedOperationException();
    }


    @Override
    public void accept(Visitor visitor) {
        // TODO Auto-generated method stub
        visitor.visitStudent(this);
    }
}
