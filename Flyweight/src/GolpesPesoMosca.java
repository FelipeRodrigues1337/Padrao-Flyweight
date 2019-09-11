import java.util.HashMap;
import java.util.Map;

public class GolpesPesoMosca {
    private static Map<String, Golpe> golpes = new HashMap<>();

    static {
        golpes.put("soco", new Soco());
        golpes.put("soquinho", new Soquinho());
        golpes.put("chute", new Chute());
    }

    public static Golpe get(String nome) {
        return golpes.get(nome);
    }
}
