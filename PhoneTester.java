public class PhoneTester {
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("S9", 100, "AT&T", "If I can't, do it, homie it can't be done");
        IPhone x = new IPhone("8 PLUS", 50, "Verizon", "WOOOOP, that's the sound of the POOOOLIICCEEEE.");

        s9.displayInfo();
        System.out.println(s9.ring());
        System.out.println(s9.unlock());

        x.displayInfo();
        System.out.println(x.ring());
        System.out.println(x.unlock());
    }
}