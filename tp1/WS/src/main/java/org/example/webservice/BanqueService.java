package org.example.webservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.List;

//POJO "PLAIN OLD JAVA OBJECT" IS A SIMPLE JAVA CLASS

@WebService(serviceName= "BanqueWS")
public class BanqueService {

    @WebMethod(operationName = "Convert")
    public double conversion(@WebParam(name = "MTT") double montant) {
        return montant * 11;
    }

    @WebMethod(operationName = "ConversionDhToEuro")
    public double conversionDhToEuro(double montant) {
        return montant / 11;
    }

    @WebMethod(operationName = "ConversionEuroToDh")
    public double conversionEuroToDh( @WebParam(name = "MTT")  double montant) {
        return montant * 11;
    }


    @WebMethod(operationName = "getCompte")
    public Compte getCompte(int code) {
        return new Compte(code, Math.random() * 9000, new java.util.Date());
    }

    @WebMethod(operationName = "getComptesList")
    public List<Compte> comptesList(){
        return List.of(
                  new Compte(1, 1000 , new java.util.Date())
                , new Compte(2, 2000, new java.util.Date())
                , new Compte(3, 3000,   new java.util.Date())
                , new Compte(4, 4000, new java.util.Date())
                , new Compte(5, 5000, new java.util.Date()));

    }


}
