package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("cân nặng của bạn? (kg):");
        weight = scanner.nextDouble();

        System.out.print("chiều cao của bạn ? (m):");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "gầy (ăn nhiều vào nhé! )");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Bình thường(rất chuẩn !) ");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "béo(hơi mập nhé!) ");
        else
            System.out.printf("%-20.2f%s", bmi, "Béo phì rồi (giảm cân đi !!!)");
    }
}
