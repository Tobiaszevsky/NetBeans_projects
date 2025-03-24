/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.api_tr;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import org.json.JSONObject;
import org.json.JSONArray;

/**
 *
 * @author rompalskitobiasz
 */
public class API_reader {
    ArrayList<Person> list=new ArrayList();
    public int API_reader_method(String name) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.agify.io?name=" + name))
                .build();
        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body().toString());
        JSONObject json=new JSONObject(response.body().toString());
        Person person1=new Person(json.getString("name"),json.getInt("age"),json.getInt("count"));
        list.add(person1);
        
        return person1.getAge();
            
        //Person p=new Person(response.body().toString());
    }
}
