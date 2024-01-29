
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Compte_QNAME = new QName("http://webservice.example.org/", "Compte");
    private final static QName _ConversionDhToEuro_QNAME = new QName("http://webservice.example.org/", "ConversionDhToEuro");
    private final static QName _ConversionDhToEuroResponse_QNAME = new QName("http://webservice.example.org/", "ConversionDhToEuroResponse");
    private final static QName _ConversionEuroToDh_QNAME = new QName("http://webservice.example.org/", "ConversionEuroToDh");
    private final static QName _ConversionEuroToDhResponse_QNAME = new QName("http://webservice.example.org/", "ConversionEuroToDhResponse");
    private final static QName _Convert_QNAME = new QName("http://webservice.example.org/", "Convert");
    private final static QName _ConvertResponse_QNAME = new QName("http://webservice.example.org/", "ConvertResponse");
    private final static QName _GetCompte_QNAME = new QName("http://webservice.example.org/", "getCompte");
    private final static QName _GetCompteResponse_QNAME = new QName("http://webservice.example.org/", "getCompteResponse");
    private final static QName _GetComptesList_QNAME = new QName("http://webservice.example.org/", "getComptesList");
    private final static QName _GetComptesListResponse_QNAME = new QName("http://webservice.example.org/", "getComptesListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link ConversionDhToEuro }
     * 
     * @return
     *     the new instance of {@link ConversionDhToEuro }
     */
    public ConversionDhToEuro createConversionDhToEuro() {
        return new ConversionDhToEuro();
    }

    /**
     * Create an instance of {@link ConversionDhToEuroResponse }
     * 
     * @return
     *     the new instance of {@link ConversionDhToEuroResponse }
     */
    public ConversionDhToEuroResponse createConversionDhToEuroResponse() {
        return new ConversionDhToEuroResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroToDh }
     * 
     * @return
     *     the new instance of {@link ConversionEuroToDh }
     */
    public ConversionEuroToDh createConversionEuroToDh() {
        return new ConversionEuroToDh();
    }

    /**
     * Create an instance of {@link ConversionEuroToDhResponse }
     * 
     * @return
     *     the new instance of {@link ConversionEuroToDhResponse }
     */
    public ConversionEuroToDhResponse createConversionEuroToDhResponse() {
        return new ConversionEuroToDhResponse();
    }

    /**
     * Create an instance of {@link Convert }
     * 
     * @return
     *     the new instance of {@link Convert }
     */
    public Convert createConvert() {
        return new Convert();
    }

    /**
     * Create an instance of {@link ConvertResponse }
     * 
     * @return
     *     the new instance of {@link ConvertResponse }
     */
    public ConvertResponse createConvertResponse() {
        return new ConvertResponse();
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     * @return
     *     the new instance of {@link GetCompte }
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     * @return
     *     the new instance of {@link GetCompteResponse }
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link GetComptesList }
     * 
     * @return
     *     the new instance of {@link GetComptesList }
     */
    public GetComptesList createGetComptesList() {
        return new GetComptesList();
    }

    /**
     * Create an instance of {@link GetComptesListResponse }
     * 
     * @return
     *     the new instance of {@link GetComptesListResponse }
     */
    public GetComptesListResponse createGetComptesListResponse() {
        return new GetComptesListResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "Compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionDhToEuro }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionDhToEuro }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "ConversionDhToEuro")
    public JAXBElement<ConversionDhToEuro> createConversionDhToEuro(ConversionDhToEuro value) {
        return new JAXBElement<>(_ConversionDhToEuro_QNAME, ConversionDhToEuro.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionDhToEuroResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionDhToEuroResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "ConversionDhToEuroResponse")
    public JAXBElement<ConversionDhToEuroResponse> createConversionDhToEuroResponse(ConversionDhToEuroResponse value) {
        return new JAXBElement<>(_ConversionDhToEuroResponse_QNAME, ConversionDhToEuroResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDh }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDh }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "ConversionEuroToDh")
    public JAXBElement<ConversionEuroToDh> createConversionEuroToDh(ConversionEuroToDh value) {
        return new JAXBElement<>(_ConversionEuroToDh_QNAME, ConversionEuroToDh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDhResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDhResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "ConversionEuroToDhResponse")
    public JAXBElement<ConversionEuroToDhResponse> createConversionEuroToDhResponse(ConversionEuroToDhResponse value) {
        return new JAXBElement<>(_ConversionEuroToDhResponse_QNAME, ConversionEuroToDhResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Convert }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Convert }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "Convert")
    public JAXBElement<Convert> createConvert(Convert value) {
        return new JAXBElement<>(_Convert_QNAME, Convert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "ConvertResponse")
    public JAXBElement<ConvertResponse> createConvertResponse(ConvertResponse value) {
        return new JAXBElement<>(_ConvertResponse_QNAME, ConvertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptesList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetComptesList }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "getComptesList")
    public JAXBElement<GetComptesList> createGetComptesList(GetComptesList value) {
        return new JAXBElement<>(_GetComptesList_QNAME, GetComptesList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetComptesListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetComptesListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice.example.org/", name = "getComptesListResponse")
    public JAXBElement<GetComptesListResponse> createGetComptesListResponse(GetComptesListResponse value) {
        return new JAXBElement<>(_GetComptesListResponse_QNAME, GetComptesListResponse.class, null, value);
    }

}
