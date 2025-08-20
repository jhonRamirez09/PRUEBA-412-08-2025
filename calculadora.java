import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("seleciona la operacion");
        System.out.println("1. Suma");
        System.out.println("2. Resta"); 
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        int operacion = scanner.nextInt();
        
        double suma= num1 + num2;
        double resta= num1 - num2;
        double Multiplicacion= num1 * num2;
        double Division= num1 / num2;

        if (operacion ==1){
            System.out.println("el resultado es "+suma);
        }
        else if  (operacion ==2){
            System.out.println("el resultado es "+resta);
        }
        else if (operacion ==3){
            System.out.println("el resultado es "+Multiplicacion);
        }
        else if (operacion ==4){
            System.out.println("el resultado es "+Division);
        }
        else {
            System.out.println("numero no valido ");
        }
    }
}