import java.util.HashMap;
import java.util.Map;

public class hasmap {
    static String dügümler(int dügüm){
       // düğümlerimizin isimleri string değer olduğu için ilem yapamıyoruz bizde
        // düğümlerimize sayısal değerler atıyoruz
        Map<Integer, String> map = new HashMap<>();

        map.put(0, "A");
        map.put(1, "B");
        map.put(2, "C");
        map.put(3, "D");
        map.put(4, "E");
        map.put(5, "F");
        map.put(6, "G");
        map.put(7, "H");
        map.put(8, "I");
        
        return map.get(dügüm);
    }
}
