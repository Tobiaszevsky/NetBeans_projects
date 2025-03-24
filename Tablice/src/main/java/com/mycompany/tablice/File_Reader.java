/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author tobia
 */
public class File_Reader {
    public boolean Read(String newPlate){
        String csvFile = "C:\\Users\\tobia\\OneDrive\\Dokumenty\\NetBeansProjects\\Tablice\\src\\main\\java\\files\\tablice.csv";
        String line = "";
        String cvsSplitBy = ";";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] data = line.split(cvsSplitBy);
                if(newPlate.equals(data)){
                    return false;
                }
                else{
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Błąd podczas czytania pliku: " + e.getMessage());
        }
        return false;
    }
}
