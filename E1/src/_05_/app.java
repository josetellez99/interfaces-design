package _05_;

import java.util.Scanner;

import _05_.Classes.*;

public class app {

    public static void main(String[] args) {

        Van van = new Van();
        van.assign("1234ABC", "Transit", (short) 2018);
        van.show();

        Scanner sc = new Scanner(System.in);
        System.out.print("Car plate: ");
        String plate = sc.nextLine();
        System.out.print("Car name: ");
        String name = sc.nextLine();
        System.out.print("Car year: ");
        short year = sc.nextShort();
        sc.close();

        Car car = new Car();
        car.assign(plate, name, year);
        car.show();
    }

}
