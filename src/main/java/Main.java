public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Pawel", "Kowalski", StudentCondition.ODRABIAJĄCY, 1999, 1.1, "Pawlo");
        Student student6 = new Student("Pawel", "Kowalski", StudentCondition.ODRABIAJĄCY, 1999, 1.1, "Pawlo");
        Student student2 = new Student("Pawel2", "Nowak", StudentCondition.ODRABIAJĄCY, 1999, 7.1, "Pawlo");
        Student student3 = new Student("Aawel", "Test", StudentCondition.ODRABIAJĄCY, 1999, 3.1, "Pawlo");
        Student student4 = new Student("Bawel", "Litewka", StudentCondition.ODRABIAJĄCY, 1999, 4.1, "Pawlo");
        Student student5 = new Student("Bawel", "Litewka", StudentCondition.ODRABIAJĄCY, 1999, 0, "Pawlo");








        ClassContainer listaKlas = new ClassContainer();

        listaKlas.addClass("Klasa 1", 10);
        listaKlas.addClass("Klasa 2", 20);
        listaKlas.addClass("Klasa 3", 30);
        listaKlas.addClass("Klasa 4", 40);

        listaKlas.getClassByName("Klasa 1").addStudent(student1);
        listaKlas.getClassByName("Klasa 1").addStudent(student2);
        listaKlas.getClassByName("Klasa 1").addStudent(student2);
        listaKlas.getClassByName("Klasa 1").addStudent(student3);
        listaKlas.getClassByName("Klasa 1").addStudent(student5);







        listaKlas.getClassByName("Klasa 1").sortByName();
        System.out.println("Posortowane po imieniu: " + listaKlas.getClassByName("Klasa 1"));
        listaKlas.getClassByName("Klasa 1").sortByPoints();
        System.out.println("Posortowane po punktach: " + listaKlas.getClassByName("Klasa 1"));
        listaKlas.getClassByName("Klasa 2").addStudent(student4);
        System.out.println("Lista pustych: " + listaKlas.findEmpty());

        listaKlas.summary();

        System.out.println(listaKlas.getClassByName("Klasa 1").max());

        System.out.println("Wyszukane 1");
        System.out.println(listaKlas.getClassByName("Klasa 2").searchPartial("wka"));
        System.out.println("Wyszukane 2");
        System.out.println(listaKlas.getClassByName("Klasa 1").searchPartial("ski"));
        listaKlas.getClassByName("Klasa 1").removeStudentIfLowPoints(student5);
        listaKlas.getClassByName("Klasa 1").removeStudentIfLowPoints(student1);





    }
}
