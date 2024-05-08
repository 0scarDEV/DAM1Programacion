package coleccionesejercicios.EP1213;
import java.util.Arrays;
import java.util.Comparator;

/* Óscar Fernández Pastoriza*/
public class Contenedor3<T> {
    private T[] objetos;
    public Contenedor3() {
        objetos = (T[]) new Object[1];
    }
    @Override public String toString() {
        return Arrays.toString(objetos);
    }
    public T extraerDelPrincipio() {
        T res = objetos[0];
        objetos[0] = null;
        return res;
    }
    public T extraerDelFinal() {
        T res = objetos[objetos.length - 1];
        objetos[objetos.length - 1] = null;
        return res;
    }
    public void insertarAlPrincipio(T nuevo) {
        if (objetos[0] != null) {
            objetos = Arrays.copyOf(objetos, objetos.length + 1);
            for (int i = objetos.length - 1; i > 0; i--) {
                objetos[i] = objetos[i - 1];
            }
        }
        objetos[0] = nuevo;
    }
    public void insertarAlFinal(T nuevo) {
        if (objetos[objetos.length - 1] != null) {
            objetos = Arrays.copyOf(objetos, objetos.length + 1);
        }
        objetos[objetos.length - 1] = nuevo;
    }
    public void ordenar() {
        Arrays.sort(objetos);
    }
    public void ordenar(Comparator<T> comparator) {
        Arrays.sort(objetos, comparator);
    }
}