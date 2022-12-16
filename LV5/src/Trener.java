public class Trener extends Osoba{
    private String klub;
    private float placa;

    public Trener(String ime, String prezime, String OIB, String klub, float placa){
        super(ime, prezime, OIB);
        this.klub = klub;
        this.placa = placa;
    }

    @Override
    public void ispis() {
        super.ispis();

        System.out.println("Klub: "+ klub);
        System.out.println("Placa: "+ placa);
    }

    public String getKlub() {
        return klub;
    }

    public void setKlub(String klub) {
        this.klub = klub;
    }

    public float getPlaca() {
        return placa;
    }

    public void setPlaca(float placa) {
        this.placa = placa;
    }
}
