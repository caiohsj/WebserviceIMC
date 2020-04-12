/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webserviceimc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Caio Henrique
 */
@WebService
public class WebserviceIMC {
    
    @WebMethod
    public double getIMC(@WebParam(name="altura") double altura, @WebParam(name="peso") double peso, @WebParam(name="sexo") String sexo){
        double imc;
        imc = peso/(altura*altura);
        return imc;
    }
}
