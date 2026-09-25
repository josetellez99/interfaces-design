package _02_Numbers.Classes;

import Utils.Random;

public class Numbers implements _02_Numbers.Interfaces.Operations {

    private int a;
    private int b;
    private int c;

    public Numbers(int a, int b, int c) {
        setA(a);
        setB(b);
        setC(c);
    }

    // setters

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    // Methods

    public void show() {
        System.out.println("Números: " + a + ", " + b + ", " + c);
    }

    public int random() {
        return (int) Random.getRandom(1, 10);
    }

    public void showMax() {
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Máximo: " + max);
    }

    public void showMin() {
        int min = Math.min(a, Math.min(b, c));
        System.out.println("Mínimo: " + min);
    }

    public void showAverage() {
        double average = (a + b + c) / 3.0;
        System.out.println("Media: " + average);
    }

}
