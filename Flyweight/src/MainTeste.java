import java.util.Arrays;
import java.util.List;

public class MainTeste {
    public static void main(String[] args) {
        List<Golpe> combo = Arrays.asList(new Soco(), new Chute(), new Soco(), new Soco(), new Soco(), new Chute());
        List<Golpe> combo2 = Arrays.asList(new Soco(), new Chute(), new Soco(), new Soco(), new Soco(), new Chute());

        for (Golpe golpe : combo) {
            System.out.println(golpe.executa());
        }

        System.out.println(combo);
        System.out.println(combo2);
    }
}
