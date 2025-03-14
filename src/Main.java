import com.generation.coches.coche.Coche;
import com.generation.coches.coche.CocheElectrico;
import com.generation.coches.coche.CocheGasolina;
import com.generation.coches.coche2.KFC;
import com.generation.coches.coche2.Restaurante;
import com.generation.coches.coche2.SubWay;

public class Main {

    public static void main(String[] args) {
        CocheGasolina hummer = new CocheGasolina(4,4,true,"v8 combustion","hummer", "h3","chaka","manual",4,6,"amarillo",0,30,true,8,120,"roja",3700);
        CocheElectrico tesla = new CocheElectrico(4,4,true,"electrico","tesla", "model s", "fina", "automatico", 4,6, "morado",100,70,"carga rapida",127,30);
        KFC tecamacKFC =  new KFC();
        SubWay ecatepecSubWay =  new SubWay();
        System.out.println(hummer.caracteristicas());
        System.out.println(tesla.caracteristicas());
        System.out.println(hummer.getVelocidadActual());
        System.out.println(tesla.getVelocidadActual());
        hummer.arrancanr(hummer.getVelocidadActual());
        tesla.arrancanr(tesla.getVelocidadActual());
        System.out.println(hummer.getVelocidadActual());
        System.out.println(tesla.getVelocidadActual());
        System.out.println(hummer.getLitrosGasolina());
        hummer.llenarTanque();
        System.out.println(hummer.getLitrosGasolina());
        System.out.println(tesla.getPorcentajeCarga());
        tesla.cargar();
        System.out.println(tesla.getPorcentajeCarga());

        System.out.println(tecamacKFC.hornear());
        System.out.println(ecatepecSubWay.hornear());


    }
}