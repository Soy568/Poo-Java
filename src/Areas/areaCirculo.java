package Areas;
import java.util.Scanner;
public class areaCirculo {
    public static void main(String[] args){
        float radio;
        double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el radio en Cm :");
        radio = input.nextFloat();
        area = 3.14*Math.pow(radio,2);
        System.out.println("El area del Circulo es : "+area+" Cm cuadrados.");
    }
}
