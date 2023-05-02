import javax.print.attribute.standard.JobKOctets;
import java.util.ArrayList;

public class MainCaja {
    public static void main(String[] args) {


        CAJA<String> miCaja = new CAJA<>(new String[10]);

        miCaja.add(0, "Buenos dias");
        miCaja.add(1, "Buenas tardes");
        miCaja.add(2, "Buenas noches");
        miCaja.add(3, "Heeey");
        System.out.println(miCaja);

        System.out.println("-----------");
        CajaSinGenericos cajaSin = new CajaSinGenericos(new Object[10]);
        cajaSin.add(0, "Buenas noches");
        cajaSin.add(1, "Buenas tardes");
        cajaSin.add(2, "Buenos dias");
        System.out.println(cajaSin);

        String temp = miCaja.get(0);
        String temp2 = (String)cajaSin.get(0);
        System.out.println("temp1 y temp 2: " + temp2+temp);

        CAJA<Comida> comida1 = new CAJA<>(new Comida[10]);
        comida1.add(0, new Comida("Manzana", false));
        System.out.println(comida1.get(0));

        System.out.println("Array List ----------");
        ArrayList<Comida> comidas = new ArrayList<>();
        comidas.add(new Comida("Pastel", true));
        comidas.add(new Comida("Trigo", false));
        comidas.add(new Comida("Higo", false));
        comidas.add(new Comida("Papass", false));
        System.out.println(comidas.get(2));

        comidas.set(2, new Comida("Mango", false));
        System.out.println(comidas.get(2));


    }
}
