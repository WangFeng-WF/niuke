package com.wangfeng.niuke.中等;

import java.util.Scanner;

/**
 * 牛顿迭代思想 x = (2*x + y/x/x)/3
 */
public class 求解立方根 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double num = scanner.nextDouble();
        System.out.println(String.format("%.1f", getLfg(num)));
    }

    private static Double getLfg(double y) {

        if (y == 0) {
            return 0.0;
        }
        Double x = y;
        Double lfg;
        lfg = (2*x + y/x/x)/3;
        while (Math.abs(lfg - x) > 0.000001) {
            x = lfg;
            lfg = (2*x + y/x/x)/3;
        }
        return lfg;
    }

}
