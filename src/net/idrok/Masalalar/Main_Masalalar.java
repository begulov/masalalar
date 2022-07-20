package net.idrok.Masalalar;

import java.util.*;

/**
 * bu bizning asosiy klasa
 */
public class Main_Masalalar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Yig'indi: "+yigindi.getA()+(yigindi.getB()>0? "+":"")+yigindi.getB()+"i");
//        System.out.println("Ayirma: "+ayirma.getA()+(ayirma.getB()>0? "+":"")+ayirma.getB()+"i");
//        System.out.println("Ko'paytma: "+kopaytma.getA()+(kopaytma.getB()>0? "+":"")+kopaytma.getB()+"i");*/
/*

        Complex complex1 = new Complex(2, 5);
        Complex complex2 = new Complex(5, 6);
        System.out.println("Complex 1: " + complex1);
        System.out.println("Complex 2: " + complex2);

        Complex sum = Complex.sum(complex1, complex2);
        System.out.println("Sum = " + sum.toString());

        complex1.add(complex2);
        System.out.println("Complex 1: " + complex1);
        System.out.println("Complex 2: " + complex2);
*/
/*        double[][] doubles = new double[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        Matrix matrix = new Matrix(3, doubles);
        System.out.println("Matrix:");
        matrix.print();
        System.out.println("\nMax: " + matrix.getMax());
        System.out.println("Min: " + matrix.getMin());
        System.out.println("Is sym: " + matrix.isSymmetric());

        System.out.println("\nTransposed:");
//        matrix.getTransposed().print();
        Matrix trMatrix = matrix.getTransposed();
        trMatrix.print();*/
//        Spark shoxSpark=new Spark("Blue","Chevrolet Spark","Motor 1.6",1200);
//        System.out.println(shoxSpark.vazn);
//       shoxSpark.gaz();

        System.out.println("Masala ishlayapman");
        // Array-91
        int k=0,m=3,l=0;
        int []A={1,70,3,-20,45,45,1,13,3,3,3,-20,45};

            int maks= A[0];
        for (int i = 1; i <A.length; i++) {
            if (maks<A[i]) {
                maks=A[i];
            }
        }
            for (int i = A.length-1; i >=0; i--) {
                for (int j = 0; j < i; j++) {
                    if (A[j]==A[i]&&A[j]!=(maks+1)) {
                        A[j]=maks+1;
                        k++;
                    }
                }
            }
        int B[]=new int[A.length-k];
            for (int i = 0,n=A.length ;i <n; i++) {
                if (A[i]!=maks+1) {
                    B[l] = A[i];
                    l++;
                }

            }
            A=B;

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }


}
}
