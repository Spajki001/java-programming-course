public class TestAutomobila {

    private String naziv;

    private float potrosnjaGoriva;

    private float predjenPut;

    public TestAutomobila(String naziv, float potrosnjaGoriva, float predjenPut) {
        this.naziv = naziv;
        this.potrosnjaGoriva = potrosnjaGoriva;
        this.predjenPut = predjenPut;
    }

    public String getNaziv() {
        return naziv;
    }

    public float getPotrosnjaGoriva() {
        return potrosnjaGoriva;
    }

    public float getPredjenPut() {
        return predjenPut;
    }
}