public class Nogometas extends Osoba {
    private String klub;
    private String bojaKopacki;

    public Nogometas(String ime, String prezime, String OIB, String klub, String bojaKopacki){
        super(ime, prezime, OIB);
        this.klub = klub;
        this.bojaKopacki = bojaKopacki;
    }
    @Override
    public void ispis(){
        super.ispis();

        System.out.println("Klub: "+ klub);
        System.out.println("Boja kopacki: "+ bojaKopacki);
    }

    public String getKlub() {
        return klub;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public String getBojaKopacki() {
        return bojaKopacki;
    }

    public void setBojaKopacki(String bojaKopacki) {
        this.bojaKopacki = bojaKopacki;
    }
}
