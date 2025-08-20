import java.util.Scanner;

public class consonantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe una palabra: ");
        String palabra = sc.nextLine().toLowerCase();

        int vocales = 0;
        int consonantes = 0;

        // Convertimos la palabra en arreglo de caracteres
        for (char letra : palabra.toCharArray()) {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            } else if (letra >= 'a' && letra <= 'z') {
                consonantes++;
            }
        }

        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
    }
}
