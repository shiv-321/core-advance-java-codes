package com.javapracticeshiv.advanceJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling_video_111 {
    public static void main(String[] args) {
        // Code to create file
//        File myFile = new File("New_File.txt");
//        try{
//            myFile.createNewFile();
//        }catch (Exception e){
//            System.out.println("Unable to create file");
//            e.printStackTrace();
//        }

        // code to write file
//        try {
//            FileWriter fileWriter = new FileWriter("New_File.txt");
//            fileWriter.write("This is the first try to write using file handling process in java");
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //code to read file
        File myFile = new File("new_File.txt");
        try{
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine())
                System.out.println(sc.nextLine());
            sc.close();
        }catch(Exception e){
            System.out.println("Unable to read file");
        }

        // code to delete file
        myFile.delete();

    }
}
