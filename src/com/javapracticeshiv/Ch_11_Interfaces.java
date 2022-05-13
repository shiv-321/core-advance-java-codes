package com.javapracticeshiv;

interface Bicycle {
    int a = 45;

    void applyBrake(int decrement);

    void speedUp(int increment);

interface HornBicycle {


        void blowHornK3g();

        void blowHornmhn();
    }

class AvonCycle implements Bicycle, HornBicycle {
        void blowHorn() {
            System.out.println("Pee Pee Poo Poo");
        }

        public void applyBrake(int decrement) {
            System.out.println("Applying Brake");
        }

        public void speedUp(int increment) {
            System.out.println("Applying Speedup");
        }

        public void blowHornK3g() {
            System.out.println("pee pee pee peee");
        }

        public void blowHornmhn() {
            System.out.println("poo poo poo pooo");
        }
    }

    public class Ch_11_Interfaces {
        public static void main(String[] args) {
            AvonCycle cycleShivaraj = new AvonCycle();
            cycleShivaraj.applyBrake(1);

            // You can create properties in Interfaces
            System.out.println(cycleShivaraj.a);

            //You cannot modify the properties in Interfaces as they are final
//        cycleShivaraj.a = 454;
//        System.out.println(cycleShivaraj.a);

            cycleShivaraj.blowHornmhn();
            cycleShivaraj.blowHornK3g();


        }
    }
}
