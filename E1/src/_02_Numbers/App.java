package _02_Numbers;

import _02_Numbers.Classes.Numbers;

public class App {

    public static void main(String[] args) {
        Numbers numbers = new Numbers(1, 75, 98);
        numbers.show();
        System.out.println("Random number: " + numbers.random());
        numbers.showMax();
        numbers.showMin();
        numbers.showAverage();
    }

}
