package Areas;
import java.util.Scanner;
public class areaCuadrado {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float area,lado;
        System.out.println("Ingrese el valor de un lado :");
        lado = input.nextFloat();
        area = lado*lado;
        System.out.println("El area del cuadrado es : "+area+" Cm");
    }
}
