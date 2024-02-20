package Areas;
import java.util.Scanner;
public class areaTriangulo {
    public static void main(String[] args){
        float area,base,altura;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la base en cm :");
        base = input.nextFloat();
        System.out.println("Ingrese la altura en cm :");
        altura = input.nextFloat();
        area = (base*altura)/2;
        System.out.println("El area del triangulo es : "+area+" cm cuadrados.");
    }
}
