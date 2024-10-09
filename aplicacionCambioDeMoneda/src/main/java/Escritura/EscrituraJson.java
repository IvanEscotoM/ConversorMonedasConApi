package Escritura;


import Transaccion.TransaccionGson;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Closeable;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ElFel
 */
public class EscrituraJson {
    public String guardarConsultas(ArrayList<TransaccionGson> transacciones){
        LocalDateTime tiempoCreacion = LocalDateTime.now();
        
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("MM-dd-yy_hh-mm a");
        
        String fechaFormateada = tiempoCreacion.format(formateador);
        Gson gson=new GsonBuilder().setPrettyPrinting().create();
        System.out.println(fechaFormateada);
        System.out.println(transacciones);
        try {
            FileWriter writer = new FileWriter(fechaFormateada+".json");
            writer.write(gson.toJson(transacciones));
            writer.close();
            return "Exitosa ";
        } catch (Exception e) {
            System.out.println("No se pudieron guardar estas consultas.");
            return "Fallida";
        }
        
    }
}
