package com.javapracticeshiv;
interface MyCamera{
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
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);

}

class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }

}

class MySmartPhone extends MyCellPhone implements MyCamera, MyWifi{
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording video");
    }
//    public void record4KVideo(){
//        System.out.println("Recording video in 4k with snap");
//    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList = {"Harry", "Aman", "Ashu", "Shivaraj"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    }

}

public class Ch_11_Default_Method {
    public static void main(String[] args) {

        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        String[] ar = ms.getNetworks();
        for (String item:ar){
            System.out.println(item);
        }

    }
}
