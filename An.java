package Test;

import java.util.ArrayList;
import java.util.List;

public class An implements Element,Visitee{
    private String nume;
    List<Element> lista = new ArrayList<>();

    public An(String nume) {
        super();
        this.nume = nume;
    }

    @Override
    public void add(Element element) {
        // TODO Auto-generated method stub
        lista.add(element);
    }

    public List<Element> getLista() {
        return lista;
    }

    public void setLista(List<Element> lista) {
        this.lista = lista;
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        System.out.println(nume);
        for(Element e:lista) {
            e.print();
        }
    }
    @Override
    public void accept(Visitor visitor) {
        // TODO Auto-generated method stub
        visitor.visitAn(this);
    }



}
