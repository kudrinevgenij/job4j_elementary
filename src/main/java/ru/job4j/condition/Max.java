package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int mid, int right) {
        int temp = Max.max(left, mid);
        return temp > right ? temp : right;
    }

    public static int max(int first, int second, int third, int fourth) {
        int temp = Max.max(first, second, third);
        return temp > fourth ? temp : fourth;
    }

}