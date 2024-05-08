package coleccionesejercicios.EP1231;
import java.util.ArrayList;
import java.util.List;
/* Óscar Fernández Pastoriza */
public class Cola<T> extends ArrayList {
    /* EP1231. Implementa las clases Cola y Pila genéricas heredando de ArrayList. */
    List<T> lista = new ArrayList<>();
    public boolean encolar(T t) {
        if (!lista.isEmpty()) {
            lista.addLast(t);
            return true;
        }
        return false;
    }
    public T desencolar() {
        if (!lista.isEmpty()) {
            T first = lista.getFirst();
            lista.removeFirst();
            return first;
        }
        return null;
    }
}