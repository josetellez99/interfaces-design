package _03_.Classes;

import Utils.Random;

public class HeightThree implements _03_.Interfaces.Randoms {

        private double heightOne, heightTwo, heightThree; 

        public HeightThree() {
            setHeightOne();
            setHeightTwo();
            setHeightThree();
        }

        public void show() {
            System.out.println("Height-Three 1: " + heightOne);
            System.out.println("Height-Three 2: " + heightTwo);
            System.out.println("Height-Three 3: " + heightThree);
        }

        public double setRandom(double min, double max) {
            return Random.getRandom(min,  max);
        }

        // setters

        public void setHeightOne() {
            double height = setRandom(1.8, 1.81);
            this.heightOne = height;
        }

        public void setHeightTwo() {
            double height = setRandom(1.8, 1.81);
            this.heightTwo = height;
        }

        public void setHeightThree() {
            double height = setRandom(1.8, 1.81);
            this.heightThree = height;
        }


}