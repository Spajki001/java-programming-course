class Test {
    public static void main(String[] args) {
        LansirnaRampa lansirnaRampa = new LansirnaRampa();
        Raketa raketa1 = new Raketa("Raketa 1", lansirnaRampa);
        Raketa raketa2 = new Raketa("Raketa 2", lansirnaRampa);
        Raketa raketa3 = new Raketa("Raketa 3", lansirnaRampa);
        raketa1.start();
        raketa2.start();
        raketa3.start();
    }
}
