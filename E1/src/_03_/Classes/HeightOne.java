package _03_.Classes;

import Utils.Random;

public class HeightOne implements _03_.Interfaces.Randoms {

        private double heightOne, heightTwo, heightThree; 

        public HeightOne() {
            setHeightOne();
            setHeightTwo();
            setHeightThree();
        }

        public void show() {
            System.out.println("Height-One 1: " + heightOne);
            System.out.println("Height-One 2: " + heightTwo);
            System.out.println("Height-One 3: " + heightThree);
        }

        public double setRandom(double min, double max) {
            return Random.getRandom(min,  max);
        }

        // setters

        public void setHeightOne() {
            double height = setRandom(1.65, 1.7);
            this.heightOne = height;
        }

        public void setHeightTwo() {
            double height = setRandom(1.65, 1.7);
            this.heightTwo = height;
        }

        public void setHeightThree() {
            double height = setRandom(1.65, 1.7);
            this.heightThree = height;
        }


}