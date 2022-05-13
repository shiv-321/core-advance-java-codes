package com.javapracticeshiv;
interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4k.....");
    }
}
interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);

}

class MyCellPhone2{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }

}

class MySmartPhone2 extends MyCellPhone2 implements MyCamera2, MyWifi2 {
    public void takeSnap() {
        System.out.println("Taking snap");
    }

    public void recordVideo() {
        System.out.println("Recording video");
    }

    //    public void record4KVideo(){
//        System.out.println("Recording video in 4k with snap");
//    }
    public String[] getNetworks() {
        System.out.println("Getting list of networks");
        String[] networkList = {"Harry", "Aman", "Ashu", "Shivaraj"};
        return networkList;
    }

    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }

    public void sampleMeth() {
        System.out.println("meth");
    }

}
public class Ch_11_polymorphism_Inheritance {
    public static void main(String[] args) {
        MyCamera2 cam2 = new MySmartPhone2(); // this is a smartphone but use it as a camera
//            cam2.getNetworks(); --> Not allowed
//            cam2.sampleMeth(); --> Not allowed

        cam2.record4KVideo();
        cam2.recordVideo();
        cam2.takeSnap();

        MySmartPhone2 sm2 = new MySmartPhone2();
        sm2.sampleMeth();
        sm2.recordVideo();
        sm2.getNetworks();

    }
}
