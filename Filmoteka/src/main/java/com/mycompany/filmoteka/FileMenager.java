/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filmoteka;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author rompalskitobiasz
 */
public class FileMenager {
    private int showsCount=0;
    private int moviesCount=0;
    public ArrayList<Films> readFile() throws FileNotFoundException, IOException{
        File file=new File(getClass().getClassLoader().getResource("data/data").getFile());
         ArrayList<Films> listOfFilms=new ArrayList<Films>();
         BufferedReader FileReader=new BufferedReader(new FileReader(file));
         String line;
            while((line=FileReader.readLine()) != null){
                String[] values=line.split(";");
                if(values[3].equals("serial")){
                    showsCount++;
                }
                else{
                    moviesCount++;
                }
                listOfFilms.add(new Films(values[0],values[1],values[2],values[3]));
            }
        return listOfFilms;
    }
    public int getShowsCount(){
        return showsCount;
    }
    public int getMoviesCount(){
        return moviesCount;
    }
}
