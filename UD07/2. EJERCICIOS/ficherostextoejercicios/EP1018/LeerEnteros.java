package ficherostextoejercicios.EP1018;

import java.util.Arrays;
/** @author Óscar Fernández Pastoriza
 * @description EP1018. Escribe la función Integer[] leerEnteros(String texto), a la que se le pasa una cadena y devuelve una tabla con todos los enteros que aparecen en ella.
 * */
public class LeerEnteros {
    public static Integer[] leerEnteros(String texto) {
        Integer[] t = new Integer[0];

        for (int i = 0; i < texto.length(); i++) {
            if (Character.isDigit(texto.charAt(i))) {
                t = Arrays.copyOf(t, t.length + 1);
                t[t.length - 1] = Integer.parseInt(String.valueOf(texto.charAt(i)));
            }
        }

        return t;
    }

    public static void main(String[] args) {
        String str = "dasld1jh31j42j";
        Integer[] t = leerEnteros(str);
        System.out.println(Arrays.toString(t));
    }
}
