import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ClassContainer {
    private Map<String, Class> listaGrup = new HashMap<>();


    @Override
    public String toString() {
        return "ClassContainer{" +
                "listaGrup=" + listaGrup +
                '}';
    }

    public Class getClassByName(String name){
        return listaGrup.get(name);
    }

    public void addClass(String nazwa, int pojemnosc){
        listaGrup.put(nazwa, new Class(nazwa, pojemnosc));
    }
    public void removeClass(String nazwa){
        if (listaGrup.containsKey(nazwa)){
            listaGrup.remove(nazwa);
            System.out.println("Usunieto klase");
        }else {
            System.out.println("Taka klasa nie istnieje!");
        }
    }
    public ArrayList<Class> findEmpty(){
        ArrayList<Class> listaPustychKlas = new ArrayList<Class>();
        for (Map.Entry<String, Class> klasa: listaGrup.entrySet()) {
            if (klasa.getValue().getListaStudentow().size() == 0){
                listaPustychKlas.add(klasa.getValue());
            }
        }
        return listaPustychKlas;
    }
    public void summary(){
        int zapelnienie = 0;
        for (Map.Entry<String, Class> klasa: listaGrup.entrySet()) {
            zapelnienie = (int)((double)klasa.getValue().getListaStudentow().size() / (double)klasa.getValue().getMaksymalnaIloscStudentow() * 100);
            System.out.println(klasa.getKey() + " zapelnienie = " + zapelnienie + "%");
        }
    }
}
