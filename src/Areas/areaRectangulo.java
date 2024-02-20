package Areas;
import java.util.Scanner;
public class areaRectangulo {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese la base en cm :");
    float base = input.nextFloat();
    System.out.println("Ingrese la altura en cm :");
    float altura = input.nextFloat();
    float area = base*altura;
    System.out.println("El area del rectangulo es : "+area+" cm cuadrados.");

    }
}

