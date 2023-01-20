import java.util.concurrent.ThreadLocalRandom;

public class Test {

    public static void main(String[] args) {
        final Zivotinja[] poljeZivotinja = new Zivotinja[]{
                new Lastavica(),
                new Ptica(),
                new Ptica(),
                new Lastavica(),
                new Lastavica()
        };

        for (Zivotinja zivotinja : poljeZivotinja) {
            zivotinja.setIme("Tica");
            System.out.println(zivotinja.getIme());
            zivotinja.glasajSe();
        }
    }

}