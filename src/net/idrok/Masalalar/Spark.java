package net.idrok.Masalalar;

public class Spark extends Mashina{
    public Spark(String color, String pozitsiya, String mator, int vazn) {
        super(color,pozitsiya,mator,vazn);
//        this.color=color;
//        this.vazn=vazn;
//        this.pozitsiya=pozitsiya;
//        this.mator=mator;
    }

    @Override
    public void gaz() {
        System.out.println("Spark Gaz....");
    }

    @Override
    public void tormoz() {
        System.out.println("Spark Tormoz....");
    }

    @Override
    public void otOlish() {
        System.out.println("Spark G'ing g'ing.....");
    }
    void razgom(){
        System.out.println("Spark razgom...");
    }

}
