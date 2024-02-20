package Areas;
import java.util.Scanner;
public class areaTrapecio {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la base Inferior en cm :");
        float baseInf = input.nextFloat();
        System.out.println("Ingrese la base Superior en cm :");
        float baseSup = input.nextFloat();
        System.out.println("Ingrese la altura en cm :");
        float altura = input.nextFloat();
        float area = ((baseSup+baseInf)/2)*altura;
        System.out.println("El area del trapecio es : "+area+" cm cuadrados.");
    }
}
