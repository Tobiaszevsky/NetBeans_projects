/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kantor;

import java.io.BufferedReader;
import java.util.List;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tobia
 */
public class File_operations {
    public void SaveToFile(LocalDateTime currentTime,String date,boolean operation,float exchange,float userInput,float result,String currency){ 
     Scanner sc=new Scanner(System.in);
     String operationName="";
     if(operation==true){
         operationName="sell";
     }
     else{
         operationName="buy";
     }
        File file;
        //tworzenie pliku jeżeli nie istnieje
        try {
            file = new File("D:\\netbeans\\Kantor\\src\\main\\java\\com\\mycompany\\kantor\\dane.csv");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //zapisywanie żartu do pliku w zależności od ilości żartów
        try {
            FileWriter writer = new FileWriter("D:\\netbeans\\Kantor\\src\\main\\java\\com\\mycompany\\kantor\\dane.csv",true);
            writer.write(operationName+";"+currency+";"+userInput+";"+exchange+";"+result+";"+date+"\n");
            System.out.println("zapisano do pliku " + file.getName());
            writer.close();
        }catch(IOException e){
            System.out.println("Nie udało się zapisać do pliku");
        }
    }
//        public List<Float> ReadFile(String usersChosenCurrency) throws IOException {
//            List<Float> exchangeList=new ArrayList<Float>();
//            File file;
//            try {
//                file = new File("D:\\netbeans\\Kantor\\src\\main\\java\\com\\mycompany\\kantor\\dane.csv");
//                if (file.createNewFile()) {
//                    System.out.println("File created: " + file.getName());
//                } else {
//                    System.out.println("File already exists.");
//                }
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            try(BufferedReader FileReader=new BufferedReader(new FileReader(file))){
//                String line;
//                while((line=FileReader.readLine()) != null){
//                    String[] values=line.split(";");
//                    String currency=values[1].trim();
//                    float userInput=Float.parseFloat(values[2]);
//                    float currentExchange=Float.parseFloat(values[3]);
//                    if(usersChosenCurrency.equals(currency)==true){
//                           exchangeList.add(currentExchange);
//                    }
//                  
//                }
//            }
//
//
//            return exchangeList;
//    }
}
