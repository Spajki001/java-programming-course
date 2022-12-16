public class Osoba{
    private String ime;
    private String prezime;
    private String OIB;

    public Osoba(String ime, String prezime, String OIB){
        this.ime = ime;
        this.prezime = prezime;
        this.OIB = OIB;
    }

    public void ispis(){
        System.out.println("Ime: "+ ime);
        System.out.println("Prezime: "+ prezime);
        System.out.println("OIB: "+ OIB);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getOIB() {
        return OIB;
    }

    public void setOIB(String OIB) {
        this.OIB = OIB;
    }
}