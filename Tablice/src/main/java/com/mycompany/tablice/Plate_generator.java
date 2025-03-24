/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablice;

import java.util.Random;

/**
 *
 * @author tobia
 */
public class Plate_generator {
    public String Generate_plate(String chosenProvinceLetter){
        StringBuilder registrationPlate = new StringBuilder();
        File_Reader fileReader=new File_Reader();
        File_writer fileWriter=new File_writer();
        registrationPlate.append(chosenProvinceLetter);
            while(true){
            // Dodajemy 2 litery
            for (int i = 0; i < 2; i++) {
                char randomLetter = (char) ('A' + new Random().nextInt(26)); // Losujemy literę od A do Z
                registrationPlate.append(randomLetter);
            }

            // Dodajemy 5 cyfr
            for (int i = 0; i < 5; i++) {
                int randomNumber = new Random().nextInt(10); // Losujemy cyfrę od 0 do 9
                registrationPlate.append(randomNumber);
            }
            if(fileReader.Read(registrationPlate.toString())){
                fileWriter.Write(registrationPlate.toString());
                break;
            }
        }
        return registrationPlate.toString();
    }
}
