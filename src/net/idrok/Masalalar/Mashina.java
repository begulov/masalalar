package net.idrok.Masalalar;

public abstract class  Mashina {
    public String color;
    String pozitsiya;
    String mator;
    double vazn;


    public Mashina(String color, String pozitsiya, String mator, int vazn) {
        this.color = color;
        this.pozitsiya = pozitsiya;
        this.mator = mator;
        this.vazn = vazn;
    }

    public abstract void gaz();
    public abstract void tormoz();
   public abstract void otOlish();
}
