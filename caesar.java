import java.util.Scanner;

public class DescifrarCifradoCesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa el mensaje cifrado:");
        String mensajeCifrado = scanner.nextLine();
        
        System.out.println("Cuántas veces se movió la letra para cifrar:");
        int veces = scanner.nextInt();
        
        String mensajeOriginal = "";

        for (int i = 0; i < mensajeCifrado.length(); i++) {
            char letra = mensajeCifrado.charAt(i);
            boolean min = (letra >= 'a' && letra <= 'z');
            boolean mayus = (letra >= 'A' && letra <= 'Z');

            if (!(min || mayus)) {
                mensajeOriginal += letra;  // Mantener caracteres que no son letras.
            } else {
                int ascii = (int) letra;
                int B_Ascii = (int) 'a';
                if (mayus) {
                    B_Ascii = (int) 'A';
                }

                // Decodificar: Restar la cantidad de veces y ajustar para no ser negativo.
                int nuevoAscii = (ascii - B_Ascii - veces + 26) % 26 + B_Ascii;
                char nuevaLetra = (char) nuevoAscii;
                mensajeOriginal += nuevaLetra;
            }
        }

        System.out.println("Mensaje original: " + mensajeOriginal);
    }
}
