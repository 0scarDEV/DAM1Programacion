package coleccionesejercicios.EP1213;
import java.util.Comparator;
/* �scar Fern�ndez Pastoriza */
public class ComparadorMayorMenor implements Comparator<Integer> {
    @Override public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
