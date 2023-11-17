
package wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the wsdl package. 
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

    private final static QName _Division_QNAME = new QName("http://ws/", "Division");
    private final static QName _DivisionResponse_QNAME = new QName("http://ws/", "DivisionResponse");
    private final static QName _FAreaCirculo_QNAME = new QName("http://ws/", "FAreaCirculo");
    private final static QName _FAreaCirculoResponse_QNAME = new QName("http://ws/", "FAreaCirculoResponse");
    private final static QName _FHipotenusa_QNAME = new QName("http://ws/", "FHipotenusa");
    private final static QName _FHipotenusaResponse_QNAME = new QName("http://ws/", "FHipotenusaResponse");
    private final static QName _FSenos_QNAME = new QName("http://ws/", "FSenos");
    private final static QName _FSenosResponse_QNAME = new QName("http://ws/", "FSenosResponse");
    private final static QName _Login_QNAME = new QName("http://ws/", "Login");
    private final static QName _LoginResponse_QNAME = new QName("http://ws/", "LoginResponse");
    private final static QName _Multiplicacion_QNAME = new QName("http://ws/", "Multiplicacion");
    private final static QName _MultiplicacionResponse_QNAME = new QName("http://ws/", "MultiplicacionResponse");
    private final static QName _Resta_QNAME = new QName("http://ws/", "Resta");
    private final static QName _RestaResponse_QNAME = new QName("http://ws/", "RestaResponse");
    private final static QName _Suma_QNAME = new QName("http://ws/", "Suma");
    private final static QName _SumaResponse_QNAME = new QName("http://ws/", "SumaResponse");
    private final static QName _Hello_QNAME = new QName("http://ws/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://ws/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Division }
     * 
     */
    public Division createDivision() {
        return new Division();
    }

    /**
     * Create an instance of {@link DivisionResponse }
     * 
     */
    public DivisionResponse createDivisionResponse() {
        return new DivisionResponse();
    }

    /**
     * Create an instance of {@link FAreaCirculo }
     * 
     */
    public FAreaCirculo createFAreaCirculo() {
        return new FAreaCirculo();
    }

    /**
     * Create an instance of {@link FAreaCirculoResponse }
     * 
     */
    public FAreaCirculoResponse createFAreaCirculoResponse() {
        return new FAreaCirculoResponse();
    }

    /**
     * Create an instance of {@link FHipotenusa }
     * 
     */
    public FHipotenusa createFHipotenusa() {
        return new FHipotenusa();
    }

    /**
     * Create an instance of {@link FHipotenusaResponse }
     * 
     */
    public FHipotenusaResponse createFHipotenusaResponse() {
        return new FHipotenusaResponse();
    }

    /**
     * Create an instance of {@link FSenos }
     * 
     */
    public FSenos createFSenos() {
        return new FSenos();
    }

    /**
     * Create an instance of {@link FSenosResponse }
     * 
     */
    public FSenosResponse createFSenosResponse() {
        return new FSenosResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse createLoginResponse() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link Multiplicacion }
     * 
     */
    public Multiplicacion createMultiplicacion() {
        return new Multiplicacion();
    }

    /**
     * Create an instance of {@link MultiplicacionResponse }
     * 
     */
    public MultiplicacionResponse createMultiplicacionResponse() {
        return new MultiplicacionResponse();
    }

    /**
     * Create an instance of {@link Resta }
     * 
     */
    public Resta createResta() {
        return new Resta();
    }

    /**
     * Create an instance of {@link RestaResponse }
     * 
     */
    public RestaResponse createRestaResponse() {
        return new RestaResponse();
    }

    /**
     * Create an instance of {@link Suma }
     * 
     */
    public Suma createSuma() {
        return new Suma();
    }

    /**
     * Create an instance of {@link SumaResponse }
     * 
     */
    public SumaResponse createSumaResponse() {
        return new SumaResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Division }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Division }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Division")
    public JAXBElement<Division> createDivision(Division value) {
        return new JAXBElement<Division>(_Division_QNAME, Division.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DivisionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "DivisionResponse")
    public JAXBElement<DivisionResponse> createDivisionResponse(DivisionResponse value) {
        return new JAXBElement<DivisionResponse>(_DivisionResponse_QNAME, DivisionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FAreaCirculo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FAreaCirculo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "FAreaCirculo")
    public JAXBElement<FAreaCirculo> createFAreaCirculo(FAreaCirculo value) {
        return new JAXBElement<FAreaCirculo>(_FAreaCirculo_QNAME, FAreaCirculo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FAreaCirculoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FAreaCirculoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "FAreaCirculoResponse")
    public JAXBElement<FAreaCirculoResponse> createFAreaCirculoResponse(FAreaCirculoResponse value) {
        return new JAXBElement<FAreaCirculoResponse>(_FAreaCirculoResponse_QNAME, FAreaCirculoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FHipotenusa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FHipotenusa }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "FHipotenusa")
    public JAXBElement<FHipotenusa> createFHipotenusa(FHipotenusa value) {
        return new JAXBElement<FHipotenusa>(_FHipotenusa_QNAME, FHipotenusa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FHipotenusaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FHipotenusaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "FHipotenusaResponse")
    public JAXBElement<FHipotenusaResponse> createFHipotenusaResponse(FHipotenusaResponse value) {
        return new JAXBElement<FHipotenusaResponse>(_FHipotenusaResponse_QNAME, FHipotenusaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FSenos }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FSenos }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "FSenos")
    public JAXBElement<FSenos> createFSenos(FSenos value) {
        return new JAXBElement<FSenos>(_FSenos_QNAME, FSenos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FSenosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FSenosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "FSenosResponse")
    public JAXBElement<FSenosResponse> createFSenosResponse(FSenosResponse value) {
        return new JAXBElement<FSenosResponse>(_FSenosResponse_QNAME, FSenosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Login")
    public JAXBElement<Login> createLogin(Login value) {
        return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Multiplicacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Multiplicacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Multiplicacion")
    public JAXBElement<Multiplicacion> createMultiplicacion(Multiplicacion value) {
        return new JAXBElement<Multiplicacion>(_Multiplicacion_QNAME, Multiplicacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultiplicacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MultiplicacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "MultiplicacionResponse")
    public JAXBElement<MultiplicacionResponse> createMultiplicacionResponse(MultiplicacionResponse value) {
        return new JAXBElement<MultiplicacionResponse>(_MultiplicacionResponse_QNAME, MultiplicacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Resta }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Resta }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Resta")
    public JAXBElement<Resta> createResta(Resta value) {
        return new JAXBElement<Resta>(_Resta_QNAME, Resta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RestaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RestaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "RestaResponse")
    public JAXBElement<RestaResponse> createRestaResponse(RestaResponse value) {
        return new JAXBElement<RestaResponse>(_RestaResponse_QNAME, RestaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Suma }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Suma }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "Suma")
    public JAXBElement<Suma> createSuma(Suma value) {
        return new JAXBElement<Suma>(_Suma_QNAME, Suma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SumaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SumaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "SumaResponse")
    public JAXBElement<SumaResponse> createSumaResponse(SumaResponse value) {
        return new JAXBElement<SumaResponse>(_SumaResponse_QNAME, SumaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
