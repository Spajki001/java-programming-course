public class UsporedbaPotrosnje {

    public static void usporedi(TestAutomobila auto1, TestAutomobila auto2) {
        float potrosnjaPrvi = (auto1.getPotrosnjaGoriva() / auto1.getPredjenPut()) * 100.0f;
        float potrosnjaDrugi = (auto2.getPotrosnjaGoriva() / auto2.getPredjenPut()) * 100.0f;

        System.out.println("Potrosnja " + auto1.getNaziv() + ": " + potrosnjaPrvi + "l");
        System.out.println("Potrosnja " + auto2.getNaziv() + ": " + potrosnjaDrugi + "l");

        System.out.println((potrosnjaPrvi < potrosnjaDrugi ? auto1.getNaziv() : auto2.getNaziv()) + " je stedljiviji");
    }

}