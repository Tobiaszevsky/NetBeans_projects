/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablice;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author tobia
 */
public class File_writer {
    public void Write(String registrationPlate){
        String csvFile = "../files/tablice.csv";
        try (FileWriter writer = new FileWriter(csvFile, true)) {
            writer.append(registrationPlate+";");
            writer.append("\n");
            System.out.println("Tablica rejestracyjna została zapisana do pliku.");

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Błąd podczas zapisu do pliku: " + e.getMessage());
        }
    }
}
