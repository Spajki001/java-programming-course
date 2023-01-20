public class Test {
    public static void main(String[] args) {
        Ptica ptica = new Ptica();
        ptica.setIme("Ptica");

        Lastavica lastavica = new Lastavica();
        lastavica.setIme("Lasta");

        System.out.println(ptica.getIme());
        ptica.glasajSe();

        System.out.println(lastavica.getIme());
        lastavica.glasajSe();
    }
}
