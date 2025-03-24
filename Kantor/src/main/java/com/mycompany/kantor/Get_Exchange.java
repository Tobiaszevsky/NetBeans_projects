/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kantor;

import java.util.List;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author tobia
 */
public  class Get_Exchange {
    public float getExchange(float userInput,String url,Boolean operation) throws IOException, InterruptedException{
     //sprawdzanie połączenia z internetem
        File_operations fileOperations=new File_operations();
        try {
            URL link = new URL(url);
            URLConnection connection = link.openConnection();
            connection.connect();

            System.out.println("Connection Successful");
        }
        catch (Exception e) {
            System.out.println("Internet Not Connected");
        }
        HttpClient client = HttpClient.newHttpClient();//client http
        HttpRequest request = HttpRequest.newBuilder()//budowanie zapytania
                .uri(URI.create(url))
                .build();
        HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());
        JSONObject json=new JSONObject(response.body().toString());
        JSONArray ratesArray=json.getJSONArray("rates");
        JSONObject ratesObject=ratesArray.getJSONObject(0);
        float bid=ratesObject.getFloat("bid");
        float ask=ratesObject.getFloat("ask");
        LocalDateTime currentTime=LocalDateTime.now();
        if(operation==true){
            fileOperations.SaveToFile(currentTime,ratesObject.getString("effectiveDate"),operation,bid,userInput,(userInput*bid),json.getString("currency"));
            return userInput*bid;
        }
        else{
            fileOperations.SaveToFile(currentTime,ratesObject.getString("effectiveDate"),operation,ask,userInput,(userInput*ask),json.getString("currency"));
            return userInput*ask;
        }
    }
}
