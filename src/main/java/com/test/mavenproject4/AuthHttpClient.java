/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.mavenproject4;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/**
 *
 * @author jezzvega
 */
public class AuthHttpClient {
    
    private final OkHttpClient client = new OkHttpClient();
    public static final MediaType JSON = MediaType.get("application/json; charset=utf-8");
    
    public Response sendPost(String mail, String pass) throws Exception {
        
        String json = "{\"correo\": \""+ mail +"\",\"pass\": \"" + pass + "\"}";

        RequestBody body = RequestBody.create(JSON, json);
        
        Request request = new Request.Builder()
            .url("https://t-express-rest.herokuapp.com/auth/login")
            .post(body)
            .build();
        
        try (Response response = client.newCall(request).execute()) {
            
            return response;
            
        }

    }
    
}
