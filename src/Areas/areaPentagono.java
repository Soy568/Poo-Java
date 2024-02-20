package Areas;
import java.util.Scanner;
public class areaPentagono {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el lado en cm :");
        float lado = input.nextFloat();
        System.out.println("Ingrese el apotema en cm :");
        float apotema = input.nextFloat();
        float perimetro = 5 * lado;
        float area = (perimetro*apotema)/2;
        System.out.println("El area del pentagono es : "+area+" cm cuadrados.");
    }
}
