package _03_.Classes;

import Utils.Random;

public class HeightTwo implements _03_.Interfaces.Randoms {

        private double heightOne, heightTwo, heightThree; 

        public HeightTwo() {
            setHeightOne();
            setHeightTwo();
            setHeightThree();
        }

        public void show() {
            System.out.println("Height-Two 1: " + heightOne);
            System.out.println("Height-Two 1: " + heightTwo);
            System.out.println("Height-Two 1: " + heightThree);
        }

        public double setRandom(double min, double max) {
            return Random.getRandom(min,  max);
        }

        // setters

        public void setHeightOne() {
            double height = setRandom(1.71, 1.8);
            this.heightOne = height;
        }

        public void setHeightTwo() {
            double height = setRandom(1.71, 1.8);
            this.heightTwo = height;
        }

        public void setHeightThree() {
            double height = setRandom(1.71, 1.8);
            this.heightThree = height;
        }


}
