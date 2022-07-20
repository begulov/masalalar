package net.idrok.universitet;

import net.idrok.universitet.malumot.Talaba;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Talaba turidagi o'zgaruvchi yaratidi, hali obyekt yaratilmadi
        Talaba talaba1;
        talaba1 = new Talaba("", "Begulov");// Endi obyekt yaratildi, yani new kalit so'zi orqali obyekt yaratiladi. new dan keyin turgan Talaba() esa konstruktor
        talaba1.setIsm(sc.nextLine());
       // talaba1.setFamiliya(sc.nextLine());
        talaba1.setYosh(sc.nextInt());
        System.out.println(talaba1.getYosh());
        System.out.println(talaba1.getFamiliya() + " " + talaba1.getIsm());
        talaba1.darsgaQatnashish("Dasturlash");
        Talaba talaba=new Talaba();
        talaba.guruh="TMI-2001";
        System.out.println(talaba1.guruh);
    }
}
