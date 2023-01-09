
package ejercicios_tema_3_coche;

/**
 *
 * @author Uriel
 */
public class Ejercicios_tema_3_coche {

    
    public static void main(String[] args) {
        Coche coche= new Coche();
        coche.SumPuertas();
        System.out.println(coche.puertas);
    }
}
class Coche{
    public int puertas=2;
    public void SumPuertas() {
        this.puertas++;
    }
}
