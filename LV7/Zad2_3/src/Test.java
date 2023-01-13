public class Test {
    public static void main(String[] args) {
        final LansirnaRampa lansirnaRampa = new LansirnaRampa();
        Thread[] threads = new Thread[]{
                new Thread(new Raketa("Raketa 1", lansirnaRampa)),
                new Thread(new Raketa("Raketa 2", lansirnaRampa)),
                new Thread(new Raketa("Raketa 3", lansirnaRampa))
            };
        for (Thread thread : threads){
            thread.start();
        }
    }
}
