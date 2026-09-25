package _04_.Classes;

import Utils.Random;

public class Contour implements _04_.Interfaces.Randoms {

        private double pi, radius;

        public Contour() {
            setPi();
            setRadius();
        }

        public void show() {
            System.out.println("Contour radius: " + radius);
            System.out.println("Contour: " + (2 * pi * radius));
        }

        public double setRandom(double min, double max) {
            return Random.getRandom(min,  max);
        }

        // setters

        public void setPi() {
            this.pi = Math.PI;
        }

        public void setRadius() {
            double radius = setRandom(0.5, 5.0);
            this.radius = radius;
        }


}
