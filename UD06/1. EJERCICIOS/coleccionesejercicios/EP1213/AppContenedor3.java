package coleccionesejercicios.EP1213;
import java.util.Random;
/* Óscar Fernández Pastoriza */
public class AppContenedor3 {
    /* EP1211. Utilizando la clase Contenedor definida en la actividad E1202, implementa una aplicación donde se guardan 30 enteros aleatorios entre 1 y 10 y luego ordenan de menor a mayor. La aplicación debe mostrar el contenedor antes y después de ordenar. */
    public static void main(String[] args) {
        Contenedor3<Integer> contenedor = new Contenedor3<>();
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            contenedor.insertarAlPrincipio(random.nextInt(1, 11));
        }

        System.out.println("ANTES DE ORDENAR");
        System.out.println(contenedor);
        System.out.println();
        System.out.println("ORDENADO");
        contenedor.ordenar(new ComparadorMayorMenor());
        System.out.println(contenedor);
    }
}