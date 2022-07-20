package net.idrok.Masalalar;

public class Damas extends Mashina {

    protected String var1;
    String var2;
    public Damas(String color, String pozitsiya, String mator, int vazn) {
        super(color, pozitsiya, mator, vazn);
    }

    @Override
    public void gaz() {
        System.out.println("Damas Gaz....");
    }

    @Override
    public void tormoz() {
        System.out.println("Damas Tormoz....");
    }

    @Override
    public void otOlish() {
        System.out.println("Damas G'ing g'ing.....");
    }
}
