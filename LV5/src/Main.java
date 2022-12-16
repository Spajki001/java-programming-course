public class Main {
    public static void main(String[] args) {
        Osoba osoba =  new Osoba("Mateo", "Spajic", "56510429434");
        osoba.ispis();
        System.out.println("\n");

        Nogometas nogometas = new Nogometas("Dominik", "Livaja", "54166268745", "Dinamo", "zelena");
        nogometas.ispis();
        System.out.println("\n");

        Trener trener = new Trener("Zlatko", "Dalic", "66023458794", "Hajduk", 15000);
        trener.ispis();
        System.out.println("\n");

        PomocniTrener pomocniTrener = new PomocniTrener("Lovro", "Perlic", "27846532412", "Hajduk", 10023, "Zlatko Dalic");
        pomocniTrener.ispis();
    }
}