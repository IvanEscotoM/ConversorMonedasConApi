package API;

import GraficaASCII.Ascii;
import Principal.AplicacionCambioDeMoneda;
import Transaccion.TransaccionGson;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ElFel
 */
public class GetDataAPI {
    public String findData(String base,String target,ArrayList<TransaccionGson> transacciones,double amount) throws IOException, InterruptedException{
        try{
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String busquedaCompleta="https://v6.exchangerate-api.com/v6/b4b0ffcba0491d5cee4766ae/pair/"+base+"/"+target+"/"+amount;
            System.out.println(busquedaCompleta);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(busquedaCompleta)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            TransaccionGson transaccion= gson.fromJson(response.body(), TransaccionGson.class);
            if(transaccion.base_code().equals(null) || transaccion.target_code().equals(null)){
                System.out.println("No se ha encontrado esa moneda.");
                
            } else{
                transacciones.add(transaccion);
                return ""+amount+" "+base+" son "+transaccion.conversion_result()+" "+target;
            }
            
            
            //titulos.add(peliToTitulo);
        }
        catch (Exception e){
            System.out.println("Busqueda finalizada.");
            return "Fallida";
        }
        return "Fallida";
    }
    public String findData(String base,ArrayList<TransaccionGson> transacciones) throws IOException, InterruptedException{
        try{
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String busquedaCompleta="https://v6.exchangerate-api.com/v6/b4b0ffcba0491d5cee4766ae/pair/USD/"+base+"/1";
            System.out.println(busquedaCompleta);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(busquedaCompleta)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            TransaccionGson transaccion= gson.fromJson(response.body(), TransaccionGson.class);
            if(transaccion.base_code().equals(null) || transaccion.target_code().equals(null)){
                System.out.println("No se ha encontrado esa moneda.");
                
            } else{
                transacciones.add(transaccion);
                return "1 USD son "+transaccion.conversion_result()+" "+base;
            }
            
            
            //titulos.add(peliToTitulo);
        }
        catch (Exception e){
            System.out.println("Busqueda finalizada.");
            return "Fallida";
        }
        return "Fallida";
    }
}
