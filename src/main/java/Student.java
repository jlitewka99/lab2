public class Student implements Comparable<Student>{
    private String imie;
    private String nazwisko;
    private StudentCondition stanStudenta;
    private int rokUrodzenia;
    private double iloscPunktow;
    private String pseudonim;

    public Student(String imie, String nazwisko, StudentCondition stanStudenta, int rokUrodzenia, double iloscPunktow, String pseudonim) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanStudenta = stanStudenta;
        this.rokUrodzenia = rokUrodzenia;
        this.iloscPunktow = iloscPunktow;
        this.pseudonim = pseudonim;
    }

    public Student(String imie) {
        this.imie = imie;
    }

    public void print(){
        System.out.println(this);
    }

    public void addPoints(double points){
        iloscPunktow += points;
    }

    public boolean shouldBeReMoved(){
        return iloscPunktow <= 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", stanStudenta=" + stanStudenta +
                ", rokUrodzenia=" + rokUrodzenia +
                ", iloscPunktow=" + iloscPunktow +
                ", pseudonim='" + pseudonim + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.nazwisko.compareTo(o.nazwisko);
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setStanStudenta(StudentCondition stanStudenta) {
        this.stanStudenta = stanStudenta;
    }

    public void setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }

    public void setIloscPunktow(double iloscPunktow) {
        this.iloscPunktow = iloscPunktow;
    }

    public void setPseudonim(String pseudonim) {
        this.pseudonim = pseudonim;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public StudentCondition getStanStudenta() {
        return stanStudenta;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public double getIloscPunktow() {
        return iloscPunktow;
    }

    public String getPseudonim() {
        return pseudonim;
    }
}
