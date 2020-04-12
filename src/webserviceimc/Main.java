/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webserviceimc;

import javax.xml.ws.Endpoint;

/**
 *
 * @author Caio Henrique
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WebserviceIMC ws = new WebserviceIMC();
        String url = "http://localhost:8000/imcws";
        System.out.println("WebserviceIMC rodando em "+url);
        Endpoint.publish(url, ws);
    }
    
}
