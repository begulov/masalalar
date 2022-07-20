package net.idrok.Masalalar;

import java.util.Arrays;

public class Matrix {
    // masala-130
    private int n;
    private double[][] A;

    public Matrix(int n, double[][] A) {
        this.n = n;
        this.A = A;
    }

    public double getMax() {
        double max;
        max = A[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (max < A[i][j]) max = A[i][j];
            }
        }
        return max;
    }

    public double getMin() {
        double min;
        min = A[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (min > A[i][j]) min = A[i][j];
            }
        }
        return min;
    }

    public Matrix getTransposed() {
        double[][] trMatrix = new double[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                trMatrix[i][j] = A[j][i];
            }
        }
        return new Matrix(n, trMatrix);
    }

    public boolean isSymmetric() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (A[i][j] != A[j][i]) {
                    return false;
                }
            }
        }
        return false;
    }

    public void print() {
        for (double[] row : A) {
            for (double e : row) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }
}
