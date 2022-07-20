package net.idrok.universitet.malumot;

import net.idrok.Masalalar.Damas;

public class Talaba {
    private String ism;
    private String familiya;
    private int yosh;
    public static String guruh;

    public void setYosh(int yosh) {
        Damas d = new Damas(null, null, null, 120);
        if (yosh > 12)
            this.yosh = yosh;
        else System.out.println("Yosh xato kiritildi");
    }

    public int getYosh() {
        return this.yosh;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public void setFamiliya(String familiya) {
        this.familiya = familiya;
    }

    public String getIsm() {
        return ism;
    }

    public String getFamiliya() {
        return familiya;
    }

    public Talaba() {
        this.ism = "ism kiritilmagan";
        this.familiya = "familiya kiritilmagan";
    }

    public Talaba(String ism) {
        this.ism = ism;
        this.familiya = "familiya kiritilmagan";
    }

    public Talaba(String ism, String familiya) {
        this.ism = ism;
        this.familiya = familiya;
    }


    void darsQilish() {
        System.out.println(this.ism + " Dars qilmoqda");
    }

    public void darsgaQatnashish(String kurs) {
        System.out.println(this.ism + " " + kurs + " kursiga qatnashmoqda!");
    }
}




