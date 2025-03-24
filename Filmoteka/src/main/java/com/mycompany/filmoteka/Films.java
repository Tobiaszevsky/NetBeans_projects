/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.filmoteka;

/**
 *
 * @author rompalskitobiasz
 */
public class Films {
    private String type;
    private String name;
    private String image;
    private String description;
    private int rating;
    public Films(String name, String description, String image, String type){
        this.image=image;
        this.name=name;
        this.type=type;
        this.description=description;
        this.rating=0;
    }
    public String getType(){
        return this.type;
    }
     public String getDescription(){
        return this.description;
    }
    public String getName(){
        return this.name;
    }
    public String getImage(){
        return this.image;
    }
    public int getRating(){
        return this.rating;
    }
    public void setImage(String image){
        this.image=image;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setRating(int rating){
        this.rating=rating;
    }
}
