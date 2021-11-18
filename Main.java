package Test;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub



        Element info3 = new An("Informatica 3");
        info3.add(new Grupa("Grupa 1"));
        Semigrupa s = new Semigrupa("Semigrupa 1.1");

        s.add(new Student("Popescu I", "popescu@acme.edu"));
        s.add(new Student("Ionescu E", "inonescu`@acme.edu"));
        info3.add(s);
        Semigrupa s2 = new Semigrupa("Semigrupa 1.2");

        s2.add(new Student("Vasilescu I", "vasilescu@acme.edu"));
        s2.add(new Student("Georgescu E", "georgescu`@acme.edu"));
        info3.add(new Grupa("Grupa 2"));
        System.out.println(info3);
        Visitor printVisitor = new PrintVisitor();
        info3.accept(printVisitor);
    }




}


