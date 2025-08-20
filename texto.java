import java.util.Scanner;

public class texto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Escribe un texto: ");
        String texto = sc.nextLine();

        String invertido = "";

        
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido = invertido + texto.charAt(i);
        }

        
        System.out.println("Texto invertido: " + invertido);
    }
}
