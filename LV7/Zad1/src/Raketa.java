class Raketa extends Thread {
    private final String ime;
    private final LansirnaRampa lansirnaRampa;

    public Raketa(String ime, LansirnaRampa lansirnaRampa) {
        this.ime = ime;
        this.lansirnaRampa = lansirnaRampa;
    }

    public void run() {
        System.out.println("Raketa " + ime + " je spremna za lansiranje.");
        lansirnaRampa.lansiraj();
        System.out.println("Raketa " + ime + " je poletjela!");
    }
}
