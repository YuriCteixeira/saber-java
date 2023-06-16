package org.example;

public class MatematicaUm {


    public double RestoDois(double num) {
        return num % 2;
    }

    public double NumElevado3(double num) {
        return Math.pow(num, 3);
    }

    public double RaizQ(double num) {
        return Math.sqrt(num);
    }

    public double RaizCub(double num) {
        return Math.cbrt(num);
    }

    public double ValAbsoluto(double num) {
        return Math.abs(num);
    }

    public int Fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;

        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}
