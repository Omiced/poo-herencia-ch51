import com.generation.coches.coche.CocheElectrico;
import com.generation.coches.coche.CocheGasolina;

public class Main {

    public static void main(String[] args) {
        CocheGasolina hummer = new CocheGasolina(4,4,true,"v8 combustion","hummer", "h3","chaka","manual",4,6,"amarillo",0,30,true,8,120,"roja",3700);
        CocheElectrico tesla = new CocheElectrico(4,4,true,"electrico","tesla", "model s", "fina", "automatico", 4,6, "morado",100,70,"carga rapida",127);
    }
}