package metodos;

import java.util.List;

public class Questao5 {
    public boolean contains(List<String> array, String comparador) {
        boolean result = false;

        for (String string : array) {
            if(string.equals(comparador)) result = true;
        }

        return result;
    }
}
