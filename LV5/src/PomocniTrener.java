public class PomocniTrener extends Trener{
    private String sef;

    public PomocniTrener(String ime, String prezime, String OIB, String klub, float placa, String sef){
        super(ime, prezime, OIB, klub, placa);

        this.sef = sef;
    }

    @Override
    public void ispis() {
        super.ispis();

        System.out.println("Sef: "+ sef);
    }

    public String getSef() {
        return sef;
    }

    public void setSef(String sef) {
        this.sef = sef;
    }
}
