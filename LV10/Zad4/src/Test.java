public class Test {

    public static void main(String[] args) {
        TestAutomobila auto1 = new TestAutomobila("Opel", 30, 250);
        TestAutomobila auto2 = new TestAutomobila("Volkswagen", 20, 250);

        UsporedbaPotrosnje.usporedi(auto1, auto2);
    }

}