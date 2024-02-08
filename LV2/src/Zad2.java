public class Zad2 {

    public static void main(String[] args) {
        Zaposlenik zaposlenik = new Zaposlenik(20, 50, 2500.0f);
        System.out.println(zaposlenik);
        System.out.println("Placa: " + zaposlenik.izracunajPlacu());

        zaposlenik = new Zaposlenik(210, 30, 6500.0f);
        System.out.println(zaposlenik);
        System.out.println("Placa: " + Zaposlenik.izracunajPlacu(zaposlenik));
    }

}