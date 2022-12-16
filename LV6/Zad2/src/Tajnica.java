public class Tajnica extends Zaposlenik {

    public Tajnica(String id, String ime, String prezime) {

        super(id, ime, prezime);
    }

    @Override
    public void radi() {
        System.out.println("Dogovaram");
    }
}
