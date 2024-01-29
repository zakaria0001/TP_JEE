
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BanqueService", targetNamespace = "http://webservice.example.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BanqueService {


    /**
     * 
     * @param mtt
     * @return
     *     returns double
     */
    @WebMethod(operationName = "Convert")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "Convert", targetNamespace = "http://webservice.example.org/", className = "proxy.Convert")
    @ResponseWrapper(localName = "ConvertResponse", targetNamespace = "http://webservice.example.org/", className = "proxy.ConvertResponse")
    @Action(input = "http://webservice.example.org/BanqueService/ConvertRequest", output = "http://webservice.example.org/BanqueService/ConvertResponse")
    public double convert(
        @WebParam(name = "MTT", targetNamespace = "")
        double mtt);

    /**
     * 
     * @param arg0
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getCompte", targetNamespace = "http://webservice.example.org/", className = "proxy.GetCompte")
    @ResponseWrapper(localName = "getCompteResponse", targetNamespace = "http://webservice.example.org/", className = "proxy.GetCompteResponse")
    @Action(input = "http://webservice.example.org/BanqueService/getCompteRequest", output = "http://webservice.example.org/BanqueService/getCompteResponse")
    public Compte getCompte(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getComptesList", targetNamespace = "http://webservice.example.org/", className = "proxy.GetComptesList")
    @ResponseWrapper(localName = "getComptesListResponse", targetNamespace = "http://webservice.example.org/", className = "proxy.GetComptesListResponse")
    @Action(input = "http://webservice.example.org/BanqueService/getComptesListRequest", output = "http://webservice.example.org/BanqueService/getComptesListResponse")
    public List<Compte> getComptesList();

    /**
     * 
     * @param mtt
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ConversionEuroToDh")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ConversionEuroToDh", targetNamespace = "http://webservice.example.org/", className = "proxy.ConversionEuroToDh")
    @ResponseWrapper(localName = "ConversionEuroToDhResponse", targetNamespace = "http://webservice.example.org/", className = "proxy.ConversionEuroToDhResponse")
    @Action(input = "http://webservice.example.org/BanqueService/ConversionEuroToDhRequest", output = "http://webservice.example.org/BanqueService/ConversionEuroToDhResponse")
    public double conversionEuroToDh(
        @WebParam(name = "MTT", targetNamespace = "")
        double mtt);

    /**
     * 
     * @param arg0
     * @return
     *     returns double
     */
    @WebMethod(operationName = "ConversionDhToEuro")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ConversionDhToEuro", targetNamespace = "http://webservice.example.org/", className = "proxy.ConversionDhToEuro")
    @ResponseWrapper(localName = "ConversionDhToEuroResponse", targetNamespace = "http://webservice.example.org/", className = "proxy.ConversionDhToEuroResponse")
    @Action(input = "http://webservice.example.org/BanqueService/ConversionDhToEuroRequest", output = "http://webservice.example.org/BanqueService/ConversionDhToEuroResponse")
    public double conversionDhToEuro(
        @WebParam(name = "arg0", targetNamespace = "")
        double arg0);

}
