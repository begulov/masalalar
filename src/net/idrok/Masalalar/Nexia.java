package net.idrok.Masalalar;

public class Nexia extends Mashina{
    public Nexia(String color, String pozitsiya, String mator, int vazn) {
        super(color, pozitsiya, mator, vazn);
    }

    @Override
    public void gaz() {
        System.out.println("Nexia Gaz....");
    }

    @Override
    public void tormoz() {
        System.out.println("Nexia Tormoz....");
    }

    @Override
    public void otOlish() {
        System.out.println("Nexia G'ing g'ing.....");
    }
}
