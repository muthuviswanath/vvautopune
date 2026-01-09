public class Circus {
    public static void main(String[] args) {
        Animal zebra = new Zebra();
        zebra.display();
        Lion l = (Lion) zebra;
        l.run();
    }
}
