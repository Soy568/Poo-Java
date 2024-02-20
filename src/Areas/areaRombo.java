package Areas;
import java.util.Scanner;
public class areaRombo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la Diagonal Vertical en cm :");
        float diagonalV = input.nextFloat();
        System.out.println("Ingrese la Diagonal Horizontal en cm :");
        float diagonalH = input.nextFloat();
        float area = (diagonalV*diagonalH)/2;
        System.out.println("El area del rombo es : "+area+" cm cuadrados.");
    }
}
