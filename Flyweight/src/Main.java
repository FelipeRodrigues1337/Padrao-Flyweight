import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int resp;
        GolpesPesoMosca golpes = new GolpesPesoMosca();
        List<Golpe> combo = Arrays.asList(
                golpes.get("soquinho"),
                golpes.get("soquinho"),
                golpes.get("soco"),
                golpes.get("chute"));

        resp = teclado.nextInt();
        switch (resp){
            case 1:
                System.out.println(combo);
                break;
            case 2:
                for (Golpe golpe : combo) {
                    System.out.println(golpe.executa());
                }
                break;
        }
    }
}
