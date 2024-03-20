import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        int option, n1, n2;
        Calculadora process;
        Scanner entry = new Scanner(System.in);
        do{
            System.out.println("Ingrese 2 numeros: ");
            n1 = entry.nextInt();
            n2 = entry.nextInt();
            System.out.println("Que accion desea realizar?");
            System.out.println(" \n 1. Suma \n 2. Resta \n 3. Multiplicacion \n 4. Division");
            option = entry.nextInt();
            switch (option){
                case 1:
                    System.out.println("El resultado es: " + Suma(n1, n2));
                    break;
                case 2:
                    System.out.println("El resultado es: " + Resta(n1,n2));
                    break;
                case 3:
                    System.out.println("El resultado es: " + Multiplicacion(n1,n2));
                    break;
                case 4:
                    System.out.println("El resultado es: " + Division(n1,n2));
                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
                    break;
            }
            System.out.println("Desea salir del programa? \n 1.NO \n 2.SI");
            option = entry.nextInt();
        }while(option == 1);
    }

    public static int Suma(int a, int b){
        return a+b;
    }

    public static int Resta(int a, int b){
        return a-b;
    }

    public static int Multiplicacion(int a, int b){
        return a*b;
    }

    public static float Division(int a, int b){
        return a/b;
    }
}
