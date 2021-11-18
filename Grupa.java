package Test;
import java.util.ArrayList;
import java.util.List;

public class Grupa implements Element,Visitee{
    private String nume;
    List<Element> lista = new ArrayList();

    public Grupa(String nume) {
        super();
        this.nume = nume;
        this.lista = lista;
    }

    @Override
    public void add(Element element) {
        // TODO Auto-generated method stub
        lista.add(element);
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
        visitor.visitGrupa(this);
    }


}


