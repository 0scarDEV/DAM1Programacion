package coleccionesejercicios.EP1215;
import java.util.LinkedHashSet;
import java.util.List;
/* �scar Fern�ndez Pastoriza */
public class EliminarRepetidos<T> {
    public List<T> eliminarRepetidos(List<T> lista) {
        return (List<T>) new LinkedHashSet<T>(lista);
    }
}
