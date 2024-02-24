import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un diccionario espanol-ingles
        Map<String, String> diccionario = new HashMap<>();
        diccionario.put("Musica", "Music");
        diccionario.put("Cancion", "Song");
        diccionario.put("Cantante", "Singer");
        diccionario.put("Consierto", "Concert");
        diccionario.put("Instrumentos", "Instruments");
        diccionario.put("Espectadores", "Viewers");
        diccionario.put("Desrrollo", "Development");
        diccionario.put("Programa", "Program");
        diccionario.put("Pagina", "Page");
        diccionario.put("Aplicacion", "Application");
        diccionario.put("Teclado", "Keyboard");
        diccionario.put("Pelicula", "Movie");
        diccionario.put("Videojuego", "VideoGame");
        diccionario.put("Libro", "Book");
        diccionario.put("Revista", "Magazine");
        diccionario.put("Pais", "Country");
        diccionario.put("interesante", "interesting");
        diccionario.put("Esfuerzo", "Effort");
        diccionario.put("Felicidad", "Happiness");
        diccionario.put("Retador", "Challenger");
        diccionario.put("Amistad", "Friendship");

        // Obtener las 5 palabras aleatorias
        String[] palabrasAleatorias = obtenerPalabrasAleatorias(diccionario, 5);

        // Pedirle al usuario que ingese las traducciones
        Scanner scanner = new Scanner(System.in);
        int respuestasCorrectas = 0;
        int respuestasIncorrectas = 0;

        for (String palabra : palabrasAleatorias) {
            System.out.println("Ingresa la palabra \"" + palabra + "\" al inglés:");
            String respuestaUsuario = scanner.nextLine().trim().toLowerCase();
            if (diccionario.containsKey(palabra) && diccionario.get(palabra).equalsIgnoreCase(respuestaUsuario)) {
                System.out.println("Respuesta correcta!");
                respuestasCorrectas++;
            } else {
                System.out.println("Respuesta incorrecta. La traducción correcta es: " + diccionario.get(palabra));
                respuestasIncorrectas++;
            }
        }

        // Mostrar el puntaje final
        System.out.println("Puntaje final:");
        System.out.println("Respuestas correctas: " + respuestasCorrectas);
        System.out.println("Respuestas incorrectas: " + respuestasIncorrectas);

        scanner.close();
    }

    // Método para obtener palabras aleatorias del diccionario
    public static String[] obtenerPalabrasAleatorias(Map<String, String> diccionario, int cantidad) {
        String[] palabras = diccionario.keySet().toArray(new String[0]);
        String[] palabrasAleatorias = new String[cantidad];

        for (int i = 0; i < cantidad; i++) {
            int indice = (int) (Math.random() * palabras.length);
            palabrasAleatorias[i] = palabras[indice];
        }
        return palabrasAleatorias;
    }
}