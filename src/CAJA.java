import java.util.Arrays;

public class CAJA<T> {

    public static final int capacidad= 10;
    private T[] content;

    public CAJA(T[] content) {
        this.content = content;
    }

    public CAJA() {
    }

    @Override
    public String toString() {
        return "CAJA{" +
                "content=" + Arrays.toString(content) +
                '}';
    }

    public void add(int pos, T objeto){
        content[pos] = objeto;
    }

    public T get(int pos){
        return  content[pos];
    }
}
