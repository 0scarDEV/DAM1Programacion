package coleccionesapuntes;
import java.util.Arrays;

public class Util {
    public static <U> U[] add(U e, U[] t) {
        U[] aux = Arrays.copyOf(t, t.length + 1);
        aux[aux.length - 1] = e;
        return aux;
    }
    public static <U> boolean buscar(U e, U[] t) {
        for (U ei : t){
            if (ei.equals(e)){
                return true;
            }
        }
        return false;
    }
    public static <U> U[] concatTablas(U[] t1, U[] t2) {
        U[] tRes = Arrays.copyOf(t1, t1.length + t2.length);
        System.arraycopy(t2, 0, tRes, t1.length, t2.length);
        return tRes;
    }

    public static void main(String[] args) {
        Integer[] tInt1 = {1, 2};
        Integer[] tInt2 = {3, 4};

        System.out.println(Arrays.toString(Util.concatTablas(tInt1, tInt2)));
    }
}
