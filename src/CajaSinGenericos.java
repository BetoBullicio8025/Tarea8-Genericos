import java.util.Arrays;

public class CajaSinGenericos {
    Object[] content;

    public CajaSinGenericos(Object[] content) {
        this.content = content;
    }

    public CajaSinGenericos() {
    }
    public void add(int pos, Object objeto){
        content[pos] = objeto;
    }

    public Object get(int pos){
        return  content[pos];
    }

    @Override
    public String toString() {
        return "CajaSinGenericos{" +
                "content=" + Arrays.toString(content) +
                '}';
    }
}
