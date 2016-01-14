package ru.spb.herzen.ivt3;


public class A {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int fact(int N) throws Exception {
        if (N < 0)
            throw new Exception("Факториал от отрицательного числа не существует!");
        if (N == 0)
            return 1;
        if (N >= 2)
            return fact(N - 1) * N;
        return N;
    }

    public static float func(float n){
               return 10/(2-n);
    }
}

