
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
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

    private final static QName _RideAlreadyExistException_QNAME = new QName("http://businessLogic/", "RideAlreadyExistException");
    private final static QName _RideMustBeLaterThanTodayException_QNAME = new QName("http://businessLogic/", "RideMustBeLaterThanTodayException");
    private final static QName _CreateRide_QNAME = new QName("http://businessLogic/", "createRide");
    private final static QName _CreateRideResponse_QNAME = new QName("http://businessLogic/", "createRideResponse");
    private final static QName _GetDepartCities_QNAME = new QName("http://businessLogic/", "getDepartCities");
    private final static QName _GetDepartCitiesResponse_QNAME = new QName("http://businessLogic/", "getDepartCitiesResponse");
    private final static QName _GetDestinationCities_QNAME = new QName("http://businessLogic/", "getDestinationCities");
    private final static QName _GetDestinationCitiesResponse_QNAME = new QName("http://businessLogic/", "getDestinationCitiesResponse");
    private final static QName _GetRides_QNAME = new QName("http://businessLogic/", "getRides");
    private final static QName _GetRidesResponse_QNAME = new QName("http://businessLogic/", "getRidesResponse");
    private final static QName _GetThisMonthDatesWithRides_QNAME = new QName("http://businessLogic/", "getThisMonthDatesWithRides");
    private final static QName _GetThisMonthDatesWithRidesResponse_QNAME = new QName("http://businessLogic/", "getThisMonthDatesWithRidesResponse");
    private final static QName _InitializeBD_QNAME = new QName("http://businessLogic/", "initializeBD");
    private final static QName _InitializeBDResponse_QNAME = new QName("http://businessLogic/", "initializeBDResponse");
    private final static QName _DriverRides_QNAME = new QName("", "rides");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RideAlreadyExistException }
     * 
     */
    public RideAlreadyExistException createRideAlreadyExistException() {
        return new RideAlreadyExistException();
    }

    /**
     * Create an instance of {@link RideMustBeLaterThanTodayException }
     * 
     */
    public RideMustBeLaterThanTodayException createRideMustBeLaterThanTodayException() {
        return new RideMustBeLaterThanTodayException();
    }

    /**
     * Create an instance of {@link CreateRide }
     * 
     */
    public CreateRide createCreateRide() {
        return new CreateRide();
    }

    /**
     * Create an instance of {@link CreateRideResponse }
     * 
     */
    public CreateRideResponse createCreateRideResponse() {
        return new CreateRideResponse();
    }

    /**
     * Create an instance of {@link GetDepartCities }
     * 
     */
    public GetDepartCities createGetDepartCities() {
        return new GetDepartCities();
    }

    /**
     * Create an instance of {@link GetDepartCitiesResponse }
     * 
     */
    public GetDepartCitiesResponse createGetDepartCitiesResponse() {
        return new GetDepartCitiesResponse();
    }

    /**
     * Create an instance of {@link GetDestinationCities }
     * 
     */
    public GetDestinationCities createGetDestinationCities() {
        return new GetDestinationCities();
    }

    /**
     * Create an instance of {@link GetDestinationCitiesResponse }
     * 
     */
    public GetDestinationCitiesResponse createGetDestinationCitiesResponse() {
        return new GetDestinationCitiesResponse();
    }

    /**
     * Create an instance of {@link GetRides }
     * 
     */
    public GetRides createGetRides() {
        return new GetRides();
    }

    /**
     * Create an instance of {@link GetRidesResponse }
     * 
     */
    public GetRidesResponse createGetRidesResponse() {
        return new GetRidesResponse();
    }

    /**
     * Create an instance of {@link GetThisMonthDatesWithRides }
     * 
     */
    public GetThisMonthDatesWithRides createGetThisMonthDatesWithRides() {
        return new GetThisMonthDatesWithRides();
    }

    /**
     * Create an instance of {@link GetThisMonthDatesWithRidesResponse }
     * 
     */
    public GetThisMonthDatesWithRidesResponse createGetThisMonthDatesWithRidesResponse() {
        return new GetThisMonthDatesWithRidesResponse();
    }

    /**
     * Create an instance of {@link InitializeBD }
     * 
     */
    public InitializeBD createInitializeBD() {
        return new InitializeBD();
    }

    /**
     * Create an instance of {@link InitializeBDResponse }
     * 
     */
    public InitializeBDResponse createInitializeBDResponse() {
        return new InitializeBDResponse();
    }

    /**
     * Create an instance of {@link Ride }
     * 
     */
    public Ride createRide() {
        return new Ride();
    }

    /**
     * Create an instance of {@link Driver }
     * 
     */
    public Driver createDriver() {
        return new Driver(null,null);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RideAlreadyExistException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RideAlreadyExistException }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "RideAlreadyExistException")
    public JAXBElement<RideAlreadyExistException> createRideAlreadyExistException(RideAlreadyExistException value) {
        return new JAXBElement<RideAlreadyExistException>(_RideAlreadyExistException_QNAME, RideAlreadyExistException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RideMustBeLaterThanTodayException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RideMustBeLaterThanTodayException }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "RideMustBeLaterThanTodayException")
    public JAXBElement<RideMustBeLaterThanTodayException> createRideMustBeLaterThanTodayException(RideMustBeLaterThanTodayException value) {
        return new JAXBElement<RideMustBeLaterThanTodayException>(_RideMustBeLaterThanTodayException_QNAME, RideMustBeLaterThanTodayException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRide }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateRide }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "createRide")
    public JAXBElement<CreateRide> createCreateRide(CreateRide value) {
        return new JAXBElement<CreateRide>(_CreateRide_QNAME, CreateRide.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateRideResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CreateRideResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "createRideResponse")
    public JAXBElement<CreateRideResponse> createCreateRideResponse(CreateRideResponse value) {
        return new JAXBElement<CreateRideResponse>(_CreateRideResponse_QNAME, CreateRideResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDepartCities }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDepartCities }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getDepartCities")
    public JAXBElement<GetDepartCities> createGetDepartCities(GetDepartCities value) {
        return new JAXBElement<GetDepartCities>(_GetDepartCities_QNAME, GetDepartCities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDepartCitiesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDepartCitiesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getDepartCitiesResponse")
    public JAXBElement<GetDepartCitiesResponse> createGetDepartCitiesResponse(GetDepartCitiesResponse value) {
        return new JAXBElement<GetDepartCitiesResponse>(_GetDepartCitiesResponse_QNAME, GetDepartCitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDestinationCities }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDestinationCities }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getDestinationCities")
    public JAXBElement<GetDestinationCities> createGetDestinationCities(GetDestinationCities value) {
        return new JAXBElement<GetDestinationCities>(_GetDestinationCities_QNAME, GetDestinationCities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDestinationCitiesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetDestinationCitiesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getDestinationCitiesResponse")
    public JAXBElement<GetDestinationCitiesResponse> createGetDestinationCitiesResponse(GetDestinationCitiesResponse value) {
        return new JAXBElement<GetDestinationCitiesResponse>(_GetDestinationCitiesResponse_QNAME, GetDestinationCitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRides }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRides }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getRides")
    public JAXBElement<GetRides> createGetRides(GetRides value) {
        return new JAXBElement<GetRides>(_GetRides_QNAME, GetRides.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRidesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetRidesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getRidesResponse")
    public JAXBElement<GetRidesResponse> createGetRidesResponse(GetRidesResponse value) {
        return new JAXBElement<GetRidesResponse>(_GetRidesResponse_QNAME, GetRidesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThisMonthDatesWithRides }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetThisMonthDatesWithRides }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getThisMonthDatesWithRides")
    public JAXBElement<GetThisMonthDatesWithRides> createGetThisMonthDatesWithRides(GetThisMonthDatesWithRides value) {
        return new JAXBElement<GetThisMonthDatesWithRides>(_GetThisMonthDatesWithRides_QNAME, GetThisMonthDatesWithRides.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetThisMonthDatesWithRidesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetThisMonthDatesWithRidesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "getThisMonthDatesWithRidesResponse")
    public JAXBElement<GetThisMonthDatesWithRidesResponse> createGetThisMonthDatesWithRidesResponse(GetThisMonthDatesWithRidesResponse value) {
        return new JAXBElement<GetThisMonthDatesWithRidesResponse>(_GetThisMonthDatesWithRidesResponse_QNAME, GetThisMonthDatesWithRidesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitializeBD }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InitializeBD }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "initializeBD")
    public JAXBElement<InitializeBD> createInitializeBD(InitializeBD value) {
        return new JAXBElement<InitializeBD>(_InitializeBD_QNAME, InitializeBD.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitializeBDResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InitializeBDResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://businessLogic/", name = "initializeBDResponse")
    public JAXBElement<InitializeBDResponse> createInitializeBDResponse(InitializeBDResponse value) {
        return new JAXBElement<InitializeBDResponse>(_InitializeBDResponse_QNAME, InitializeBDResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "rides", scope = Driver.class)
    @XmlIDREF
    public JAXBElement<Object> createDriverRides(Object value) {
        return new JAXBElement<Object>(_DriverRides_QNAME, Object.class, Driver.class, value);
    }

}
