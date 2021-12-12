
package com.Aviolinx.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.aviolinx.stub package. 
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

    private final static QName _PickupStart_QNAME = new QName("http://raido.aviolinx.com/api/", "Start");
    private final static QName _DocumentExpiry_QNAME = new QName("http://raido.aviolinx.com/api/", "Expiry");
    private final static QName _DocumentDateOfBirth_QNAME = new QName("http://raido.aviolinx.com/api/", "DateOfBirth");
    private final static QName _DocumentIssue_QNAME = new QName("http://raido.aviolinx.com/api/", "Issue");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.aviolinx.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetMaintenance }
     * 
     */
    public SetMaintenance createSetMaintenance() {
        return new SetMaintenance();
    }

    /**
     * Create an instance of {@link ArrayOfNote }
     * 
     */
    public ArrayOfNote createArrayOfNote() {
        return new ArrayOfNote();
    }

    /**
     * Create an instance of {@link ArrayOfTime }
     * 
     */
    public ArrayOfTime createArrayOfTime() {
        return new ArrayOfTime();
    }

    /**
     * Create an instance of {@link GetSchedules }
     * 
     */
    public GetSchedules createGetSchedules() {
        return new GetSchedules();
    }

    /**
     * Create an instance of {@link ScheduleRequestFilter }
     * 
     */
    public ScheduleRequestFilter createScheduleRequestFilter() {
        return new ScheduleRequestFilter();
    }

    /**
     * Create an instance of {@link ScheduleRequestData }
     * 
     */
    public ScheduleRequestData createScheduleRequestData() {
        return new ScheduleRequestData();
    }

    /**
     * Create an instance of {@link SetFlightData }
     * 
     */
    public SetFlightData createSetFlightData() {
        return new SetFlightData();
    }

    /**
     * Create an instance of {@link Delays }
     * 
     */
    public Delays createDelays() {
        return new Delays();
    }

    /**
     * Create an instance of {@link Loads }
     * 
     */
    public Loads createLoads() {
        return new Loads();
    }

    /**
     * Create an instance of {@link ArrayOfFuel }
     * 
     */
    public ArrayOfFuel createArrayOfFuel() {
        return new ArrayOfFuel();
    }

    /**
     * Create an instance of {@link ArrayOfProjectCode }
     * 
     */
    public ArrayOfProjectCode createArrayOfProjectCode() {
        return new ArrayOfProjectCode();
    }

    /**
     * Create an instance of {@link VoyageReport }
     * 
     */
    public VoyageReport createVoyageReport() {
        return new VoyageReport();
    }

    /**
     * Create an instance of {@link Flightplan }
     * 
     */
    public Flightplan createFlightplan() {
        return new Flightplan();
    }

    /**
     * Create an instance of {@link Airports }
     * 
     */
    public Airports createAirports() {
        return new Airports();
    }

    /**
     * Create an instance of {@link SetExternalCrew }
     * 
     */
    public SetExternalCrew createSetExternalCrew() {
        return new SetExternalCrew();
    }

    /**
     * Create an instance of {@link ArrayOfExternalCrew }
     * 
     */
    public ArrayOfExternalCrew createArrayOfExternalCrew() {
        return new ArrayOfExternalCrew();
    }

    /**
     * Create an instance of {@link GetHotelBookingsResponse }
     * 
     */
    public GetHotelBookingsResponse createGetHotelBookingsResponse() {
        return new GetHotelBookingsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfHotelBooking }
     * 
     */
    public ArrayOfHotelBooking createArrayOfHotelBooking() {
        return new ArrayOfHotelBooking();
    }

    /**
     * Create an instance of {@link PingResponse }
     * 
     */
    public PingResponse createPingResponse() {
        return new PingResponse();
    }

    /**
     * Create an instance of {@link SetCrewRevisionResponse }
     * 
     */
    public SetCrewRevisionResponse createSetCrewRevisionResponse() {
        return new SetCrewRevisionResponse();
    }

    /**
     * Create an instance of {@link GetRostersResponse }
     * 
     */
    public GetRostersResponse createGetRostersResponse() {
        return new GetRostersResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCrew }
     * 
     */
    public ArrayOfCrew createArrayOfCrew() {
        return new ArrayOfCrew();
    }

    /**
     * Create an instance of {@link SetRosterResponse }
     * 
     */
    public SetRosterResponse createSetRosterResponse() {
        return new SetRosterResponse();
    }

    /**
     * Create an instance of {@link GetFlightsResponse }
     * 
     */
    public GetFlightsResponse createGetFlightsResponse() {
        return new GetFlightsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfFlight }
     * 
     */
    public ArrayOfFlight createArrayOfFlight() {
        return new ArrayOfFlight();
    }

    /**
     * Create an instance of {@link SetCrewResponse }
     * 
     */
    public SetCrewResponse createSetCrewResponse() {
        return new SetCrewResponse();
    }

    /**
     * Create an instance of {@link SetAircraftDataResponse }
     * 
     */
    public SetAircraftDataResponse createSetAircraftDataResponse() {
        return new SetAircraftDataResponse();
    }

    /**
     * Create an instance of {@link DeleteRosters }
     * 
     */
    public DeleteRosters createDeleteRosters() {
        return new DeleteRosters();
    }

    /**
     * Create an instance of {@link GetConfigurationDataResponse }
     * 
     */
    public GetConfigurationDataResponse createGetConfigurationDataResponse() {
        return new GetConfigurationDataResponse();
    }

    /**
     * Create an instance of {@link ConfigurationData }
     * 
     */
    public ConfigurationData createConfigurationData() {
        return new ConfigurationData();
    }

    /**
     * Create an instance of {@link SetFlightDataResponse }
     * 
     */
    public SetFlightDataResponse createSetFlightDataResponse() {
        return new SetFlightDataResponse();
    }

    /**
     * Create an instance of {@link SetUser }
     * 
     */
    public SetUser createSetUser() {
        return new SetUser();
    }

    /**
     * Create an instance of {@link DeleteRostersResponse }
     * 
     */
    public DeleteRostersResponse createDeleteRostersResponse() {
        return new DeleteRostersResponse();
    }

    /**
     * Create an instance of {@link SetCrewDocument }
     * 
     */
    public SetCrewDocument createSetCrewDocument() {
        return new SetCrewDocument();
    }

    /**
     * Create an instance of {@link ArrayOfDocument }
     * 
     */
    public ArrayOfDocument createArrayOfDocument() {
        return new ArrayOfDocument();
    }

    /**
     * Create an instance of {@link GetRosters }
     * 
     */
    public GetRosters createGetRosters() {
        return new GetRosters();
    }

    /**
     * Create an instance of {@link RosterRequestFilter }
     * 
     */
    public RosterRequestFilter createRosterRequestFilter() {
        return new RosterRequestFilter();
    }

    /**
     * Create an instance of {@link RosterRequestData }
     * 
     */
    public RosterRequestData createRosterRequestData() {
        return new RosterRequestData();
    }

    /**
     * Create an instance of {@link SetRosterData }
     * 
     */
    public SetRosterData createSetRosterData() {
        return new SetRosterData();
    }

    /**
     * Create an instance of {@link ArrayOfRosterDesignator }
     * 
     */
    public ArrayOfRosterDesignator createArrayOfRosterDesignator() {
        return new ArrayOfRosterDesignator();
    }

    /**
     * Create an instance of {@link RosterTime }
     * 
     */
    public RosterTime createRosterTime() {
        return new RosterTime();
    }

    /**
     * Create an instance of {@link GetPairings }
     * 
     */
    public GetPairings createGetPairings() {
        return new GetPairings();
    }

    /**
     * Create an instance of {@link PairingRequestFilter }
     * 
     */
    public PairingRequestFilter createPairingRequestFilter() {
        return new PairingRequestFilter();
    }

    /**
     * Create an instance of {@link PairingRequestData }
     * 
     */
    public PairingRequestData createPairingRequestData() {
        return new PairingRequestData();
    }

    /**
     * Create an instance of {@link GetPairingsResponse }
     * 
     */
    public GetPairingsResponse createGetPairingsResponse() {
        return new GetPairingsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPairing }
     * 
     */
    public ArrayOfPairing createArrayOfPairing() {
        return new ArrayOfPairing();
    }

    /**
     * Create an instance of {@link SetRosters }
     * 
     */
    public SetRosters createSetRosters() {
        return new SetRosters();
    }

    /**
     * Create an instance of {@link SetRostersFilter }
     * 
     */
    public SetRostersFilter createSetRostersFilter() {
        return new SetRostersFilter();
    }

    /**
     * Create an instance of {@link GetVersionResponse }
     * 
     */
    public GetVersionResponse createGetVersionResponse() {
        return new GetVersionResponse();
    }

    /**
     * Create an instance of {@link SetCrewDocumentResponse }
     * 
     */
    public SetCrewDocumentResponse createSetCrewDocumentResponse() {
        return new SetCrewDocumentResponse();
    }

    /**
     * Create an instance of {@link SetUserResponse }
     * 
     */
    public SetUserResponse createSetUserResponse() {
        return new SetUserResponse();
    }

    /**
     * Create an instance of {@link GetAccumulatedValuesResponse }
     * 
     */
    public GetAccumulatedValuesResponse createGetAccumulatedValuesResponse() {
        return new GetAccumulatedValuesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAccumulatedValue }
     * 
     */
    public ArrayOfAccumulatedValue createArrayOfAccumulatedValue() {
        return new ArrayOfAccumulatedValue();
    }

    /**
     * Create an instance of {@link GetAirports }
     * 
     */
    public GetAirports createGetAirports() {
        return new GetAirports();
    }

    /**
     * Create an instance of {@link AirportRequestFilter }
     * 
     */
    public AirportRequestFilter createAirportRequestFilter() {
        return new AirportRequestFilter();
    }

    /**
     * Create an instance of {@link AirportRequestData }
     * 
     */
    public AirportRequestData createAirportRequestData() {
        return new AirportRequestData();
    }

    /**
     * Create an instance of {@link Ping }
     * 
     */
    public Ping createPing() {
        return new Ping();
    }

    /**
     * Create an instance of {@link GetCrews }
     * 
     */
    public GetCrews createGetCrews() {
        return new GetCrews();
    }

    /**
     * Create an instance of {@link CrewRequestFilter }
     * 
     */
    public CrewRequestFilter createCrewRequestFilter() {
        return new CrewRequestFilter();
    }

    /**
     * Create an instance of {@link CrewRequestData }
     * 
     */
    public CrewRequestData createCrewRequestData() {
        return new CrewRequestData();
    }

    /**
     * Create an instance of {@link GetAccumulatedValues }
     * 
     */
    public GetAccumulatedValues createGetAccumulatedValues() {
        return new GetAccumulatedValues();
    }

    /**
     * Create an instance of {@link AccumulatedValuesRequestFilter }
     * 
     */
    public AccumulatedValuesRequestFilter createAccumulatedValuesRequestFilter() {
        return new AccumulatedValuesRequestFilter();
    }

    /**
     * Create an instance of {@link AccumulatedValuesRequestData }
     * 
     */
    public AccumulatedValuesRequestData createAccumulatedValuesRequestData() {
        return new AccumulatedValuesRequestData();
    }

    /**
     * Create an instance of {@link SetCrew }
     * 
     */
    public SetCrew createSetCrew() {
        return new SetCrew();
    }

    /**
     * Create an instance of {@link ArrayOfBase }
     * 
     */
    public ArrayOfBase createArrayOfBase() {
        return new ArrayOfBase();
    }

    /**
     * Create an instance of {@link ArrayOfQualRank }
     * 
     */
    public ArrayOfQualRank createArrayOfQualRank() {
        return new ArrayOfQualRank();
    }

    /**
     * Create an instance of {@link ArrayOfPhone }
     * 
     */
    public ArrayOfPhone createArrayOfPhone() {
        return new ArrayOfPhone();
    }

    /**
     * Create an instance of {@link ArrayOfAddress }
     * 
     */
    public ArrayOfAddress createArrayOfAddress() {
        return new ArrayOfAddress();
    }

    /**
     * Create an instance of {@link ArrayOfEmail }
     * 
     */
    public ArrayOfEmail createArrayOfEmail() {
        return new ArrayOfEmail();
    }

    /**
     * Create an instance of {@link ContractsData }
     * 
     */
    public ContractsData createContractsData() {
        return new ContractsData();
    }

    /**
     * Create an instance of {@link ArrayOfSpecialRole }
     * 
     */
    public ArrayOfSpecialRole createArrayOfSpecialRole() {
        return new ArrayOfSpecialRole();
    }

    /**
     * Create an instance of {@link DeleteMaintenance }
     * 
     */
    public DeleteMaintenance createDeleteMaintenance() {
        return new DeleteMaintenance();
    }

    /**
     * Create an instance of {@link SetRosterDesignator }
     * 
     */
    public SetRosterDesignator createSetRosterDesignator() {
        return new SetRosterDesignator();
    }

    /**
     * Create an instance of {@link DeleteMaintenanceResponse }
     * 
     */
    public DeleteMaintenanceResponse createDeleteMaintenanceResponse() {
        return new DeleteMaintenanceResponse();
    }

    /**
     * Create an instance of {@link GetHotelBookings }
     * 
     */
    public GetHotelBookings createGetHotelBookings() {
        return new GetHotelBookings();
    }

    /**
     * Create an instance of {@link SetCrewRevision }
     * 
     */
    public SetCrewRevision createSetCrewRevision() {
        return new SetCrewRevision();
    }

    /**
     * Create an instance of {@link GetConfigurationData }
     * 
     */
    public GetConfigurationData createGetConfigurationData() {
        return new GetConfigurationData();
    }

    /**
     * Create an instance of {@link ConfigurationRequestData }
     * 
     */
    public ConfigurationRequestData createConfigurationRequestData() {
        return new ConfigurationRequestData();
    }

    /**
     * Create an instance of {@link ConfigurationDataFilter }
     * 
     */
    public ConfigurationDataFilter createConfigurationDataFilter() {
        return new ConfigurationDataFilter();
    }

    /**
     * Create an instance of {@link GetVersion }
     * 
     */
    public GetVersion createGetVersion() {
        return new GetVersion();
    }

    /**
     * Create an instance of {@link AuthenticateUser }
     * 
     */
    public AuthenticateUser createAuthenticateUser() {
        return new AuthenticateUser();
    }

    /**
     * Create an instance of {@link GetCrewRevisions }
     * 
     */
    public GetCrewRevisions createGetCrewRevisions() {
        return new GetCrewRevisions();
    }

    /**
     * Create an instance of {@link RevisionsRequestFilter }
     * 
     */
    public RevisionsRequestFilter createRevisionsRequestFilter() {
        return new RevisionsRequestFilter();
    }

    /**
     * Create an instance of {@link RevisionsRequestData }
     * 
     */
    public RevisionsRequestData createRevisionsRequestData() {
        return new RevisionsRequestData();
    }

    /**
     * Create an instance of {@link AuthenticateUserResponse }
     * 
     */
    public AuthenticateUserResponse createAuthenticateUserResponse() {
        return new AuthenticateUserResponse();
    }

    /**
     * Create an instance of {@link GetMaintenances }
     * 
     */
    public GetMaintenances createGetMaintenances() {
        return new GetMaintenances();
    }

    /**
     * Create an instance of {@link MaintenanceRequestFilter }
     * 
     */
    public MaintenanceRequestFilter createMaintenanceRequestFilter() {
        return new MaintenanceRequestFilter();
    }

    /**
     * Create an instance of {@link MaintenanceRequestData }
     * 
     */
    public MaintenanceRequestData createMaintenanceRequestData() {
        return new MaintenanceRequestData();
    }

    /**
     * Create an instance of {@link GetAirportsResponse }
     * 
     */
    public GetAirportsResponse createGetAirportsResponse() {
        return new GetAirportsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAirport }
     * 
     */
    public ArrayOfAirport createArrayOfAirport() {
        return new ArrayOfAirport();
    }

    /**
     * Create an instance of {@link GetCrewsResponse }
     * 
     */
    public GetCrewsResponse createGetCrewsResponse() {
        return new GetCrewsResponse();
    }

    /**
     * Create an instance of {@link SetAircraftData }
     * 
     */
    public SetAircraftData createSetAircraftData() {
        return new SetAircraftData();
    }

    /**
     * Create an instance of {@link ArrayOfMinimumEquipment }
     * 
     */
    public ArrayOfMinimumEquipment createArrayOfMinimumEquipment() {
        return new ArrayOfMinimumEquipment();
    }

    /**
     * Create an instance of {@link GetCrewRevisionsResponse }
     * 
     */
    public GetCrewRevisionsResponse createGetCrewRevisionsResponse() {
        return new GetCrewRevisionsResponse();
    }

    /**
     * Create an instance of {@link SetRosterDesignatorResponse }
     * 
     */
    public SetRosterDesignatorResponse createSetRosterDesignatorResponse() {
        return new SetRosterDesignatorResponse();
    }

    /**
     * Create an instance of {@link SetRosterDataResponse }
     * 
     */
    public SetRosterDataResponse createSetRosterDataResponse() {
        return new SetRosterDataResponse();
    }

    /**
     * Create an instance of {@link GetAircrafts }
     * 
     */
    public GetAircrafts createGetAircrafts() {
        return new GetAircrafts();
    }

    /**
     * Create an instance of {@link AircraftRequestFilter }
     * 
     */
    public AircraftRequestFilter createAircraftRequestFilter() {
        return new AircraftRequestFilter();
    }

    /**
     * Create an instance of {@link AircraftRequestData }
     * 
     */
    public AircraftRequestData createAircraftRequestData() {
        return new AircraftRequestData();
    }

    /**
     * Create an instance of {@link GetAircraftsResponse }
     * 
     */
    public GetAircraftsResponse createGetAircraftsResponse() {
        return new GetAircraftsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAircraft }
     * 
     */
    public ArrayOfAircraft createArrayOfAircraft() {
        return new ArrayOfAircraft();
    }

    /**
     * Create an instance of {@link SetExternalCrewResponse }
     * 
     */
    public SetExternalCrewResponse createSetExternalCrewResponse() {
        return new SetExternalCrewResponse();
    }

    /**
     * Create an instance of {@link GetFlights }
     * 
     */
    public GetFlights createGetFlights() {
        return new GetFlights();
    }

    /**
     * Create an instance of {@link FlightRequestFilter }
     * 
     */
    public FlightRequestFilter createFlightRequestFilter() {
        return new FlightRequestFilter();
    }

    /**
     * Create an instance of {@link FlightRequestData }
     * 
     */
    public FlightRequestData createFlightRequestData() {
        return new FlightRequestData();
    }

    /**
     * Create an instance of {@link SetRostersResponse }
     * 
     */
    public SetRostersResponse createSetRostersResponse() {
        return new SetRostersResponse();
    }

    /**
     * Create an instance of {@link SetRoster }
     * 
     */
    public SetRoster createSetRoster() {
        return new SetRoster();
    }

    /**
     * Create an instance of {@link ArrayOfRosterActivity }
     * 
     */
    public ArrayOfRosterActivity createArrayOfRosterActivity() {
        return new ArrayOfRosterActivity();
    }

    /**
     * Create an instance of {@link GetMaintenancesResponse }
     * 
     */
    public GetMaintenancesResponse createGetMaintenancesResponse() {
        return new GetMaintenancesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfMaintenance }
     * 
     */
    public ArrayOfMaintenance createArrayOfMaintenance() {
        return new ArrayOfMaintenance();
    }

    /**
     * Create an instance of {@link SetMaintenanceResponse }
     * 
     */
    public SetMaintenanceResponse createSetMaintenanceResponse() {
        return new SetMaintenanceResponse();
    }

    /**
     * Create an instance of {@link GetSchedulesResponse }
     * 
     */
    public GetSchedulesResponse createGetSchedulesResponse() {
        return new GetSchedulesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSchedule }
     * 
     */
    public ArrayOfSchedule createArrayOfSchedule() {
        return new ArrayOfSchedule();
    }

    /**
     * Create an instance of {@link Timezone }
     * 
     */
    public Timezone createTimezone() {
        return new Timezone();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link BookingData }
     * 
     */
    public BookingData createBookingData() {
        return new BookingData();
    }

    /**
     * Create an instance of {@link Flight }
     * 
     */
    public Flight createFlight() {
        return new Flight();
    }

    /**
     * Create an instance of {@link AssignedCrew }
     * 
     */
    public AssignedCrew createAssignedCrew() {
        return new AssignedCrew();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link ReasonRequestFilter }
     * 
     */
    public ReasonRequestFilter createReasonRequestFilter() {
        return new ReasonRequestFilter();
    }

    /**
     * Create an instance of {@link TrainingSession }
     * 
     */
    public TrainingSession createTrainingSession() {
        return new TrainingSession();
    }

    /**
     * Create an instance of {@link ArrayOfReason }
     * 
     */
    public ArrayOfReason createArrayOfReason() {
        return new ArrayOfReason();
    }

    /**
     * Create an instance of {@link ArrayOfContract }
     * 
     */
    public ArrayOfContract createArrayOfContract() {
        return new ArrayOfContract();
    }

    /**
     * Create an instance of {@link CrewComplementFilter }
     * 
     */
    public CrewComplementFilter createCrewComplementFilter() {
        return new CrewComplementFilter();
    }

    /**
     * Create an instance of {@link AccumulatedValueLabel }
     * 
     */
    public AccumulatedValueLabel createAccumulatedValueLabel() {
        return new AccumulatedValueLabel();
    }

    /**
     * Create an instance of {@link QualRank }
     * 
     */
    public QualRank createQualRank() {
        return new QualRank();
    }

    /**
     * Create an instance of {@link ArrayOfAircraftType }
     * 
     */
    public ArrayOfAircraftType createArrayOfAircraftType() {
        return new ArrayOfAircraftType();
    }

    /**
     * Create an instance of {@link ArrayOfCrewOnBoard }
     * 
     */
    public ArrayOfCrewOnBoard createArrayOfCrewOnBoard() {
        return new ArrayOfCrewOnBoard();
    }

    /**
     * Create an instance of {@link Qualification }
     * 
     */
    public Qualification createQualification() {
        return new Qualification();
    }

    /**
     * Create an instance of {@link Note }
     * 
     */
    public Note createNote() {
        return new Note();
    }

    /**
     * Create an instance of {@link RosterActivity }
     * 
     */
    public RosterActivity createRosterActivity() {
        return new RosterActivity();
    }

    /**
     * Create an instance of {@link ArrayOfString1 }
     * 
     */
    public ArrayOfString1 createArrayOfString1() {
        return new ArrayOfString1();
    }

    /**
     * Create an instance of {@link ArrayOfString2 }
     * 
     */
    public ArrayOfString2 createArrayOfString2() {
        return new ArrayOfString2();
    }

    /**
     * Create an instance of {@link ArrayOfReferenceActivity }
     * 
     */
    public ArrayOfReferenceActivity createArrayOfReferenceActivity() {
        return new ArrayOfReferenceActivity();
    }

    /**
     * Create an instance of {@link DaylightSavingTime }
     * 
     */
    public DaylightSavingTime createDaylightSavingTime() {
        return new DaylightSavingTime();
    }

    /**
     * Create an instance of {@link ArrayOfTimeChange }
     * 
     */
    public ArrayOfTimeChange createArrayOfTimeChange() {
        return new ArrayOfTimeChange();
    }

    /**
     * Create an instance of {@link Contract }
     * 
     */
    public Contract createContract() {
        return new Contract();
    }

    /**
     * Create an instance of {@link ArrayOfPairingActivity }
     * 
     */
    public ArrayOfPairingActivity createArrayOfPairingActivity() {
        return new ArrayOfPairingActivity();
    }

    /**
     * Create an instance of {@link ArrayOfTimezone }
     * 
     */
    public ArrayOfTimezone createArrayOfTimezone() {
        return new ArrayOfTimezone();
    }

    /**
     * Create an instance of {@link ArrayOfComplementDescription }
     * 
     */
    public ArrayOfComplementDescription createArrayOfComplementDescription() {
        return new ArrayOfComplementDescription();
    }

    /**
     * Create an instance of {@link ArrayOfDeadload }
     * 
     */
    public ArrayOfDeadload createArrayOfDeadload() {
        return new ArrayOfDeadload();
    }

    /**
     * Create an instance of {@link CrewOnBoard }
     * 
     */
    public CrewOnBoard createCrewOnBoard() {
        return new CrewOnBoard();
    }

    /**
     * Create an instance of {@link SlotLevel }
     * 
     */
    public SlotLevel createSlotLevel() {
        return new SlotLevel();
    }

    /**
     * Create an instance of {@link Jumpseater }
     * 
     */
    public Jumpseater createJumpseater() {
        return new Jumpseater();
    }

    /**
     * Create an instance of {@link ArrayOfStationFacility }
     * 
     */
    public ArrayOfStationFacility createArrayOfStationFacility() {
        return new ArrayOfStationFacility();
    }

    /**
     * Create an instance of {@link StationFacility }
     * 
     */
    public StationFacility createStationFacility() {
        return new StationFacility();
    }

    /**
     * Create an instance of {@link HotelBooking }
     * 
     */
    public HotelBooking createHotelBooking() {
        return new HotelBooking();
    }

    /**
     * Create an instance of {@link PassengerPerClass }
     * 
     */
    public PassengerPerClass createPassengerPerClass() {
        return new PassengerPerClass();
    }

    /**
     * Create an instance of {@link ArrayOfSlotLevel }
     * 
     */
    public ArrayOfSlotLevel createArrayOfSlotLevel() {
        return new ArrayOfSlotLevel();
    }

    /**
     * Create an instance of {@link AccumulatedValue }
     * 
     */
    public AccumulatedValue createAccumulatedValue() {
        return new AccumulatedValue();
    }

    /**
     * Create an instance of {@link ReasonCategory }
     * 
     */
    public ReasonCategory createReasonCategory() {
        return new ReasonCategory();
    }

    /**
     * Create an instance of {@link ArrayOfCrewComplement }
     * 
     */
    public ArrayOfCrewComplement createArrayOfCrewComplement() {
        return new ArrayOfCrewComplement();
    }

    /**
     * Create an instance of {@link Rank }
     * 
     */
    public Rank createRank() {
        return new Rank();
    }

    /**
     * Create an instance of {@link DateRangeBasicRequestFilter }
     * 
     */
    public DateRangeBasicRequestFilter createDateRangeBasicRequestFilter() {
        return new DateRangeBasicRequestFilter();
    }

    /**
     * Create an instance of {@link ReferenceActivityRequestFilter }
     * 
     */
    public ReferenceActivityRequestFilter createReferenceActivityRequestFilter() {
        return new ReferenceActivityRequestFilter();
    }

    /**
     * Create an instance of {@link ReferenceActivity }
     * 
     */
    public ReferenceActivity createReferenceActivity() {
        return new ReferenceActivity();
    }

    /**
     * Create an instance of {@link ArrayOfDataElementIdentifier }
     * 
     */
    public ArrayOfDataElementIdentifier createArrayOfDataElementIdentifier() {
        return new ArrayOfDataElementIdentifier();
    }

    /**
     * Create an instance of {@link Company }
     * 
     */
    public Company createCompany() {
        return new Company();
    }

    /**
     * Create an instance of {@link Email }
     * 
     */
    public Email createEmail() {
        return new Email();
    }

    /**
     * Create an instance of {@link Delay }
     * 
     */
    public Delay createDelay() {
        return new Delay();
    }

    /**
     * Create an instance of {@link HotelInfoRequestFilter }
     * 
     */
    public HotelInfoRequestFilter createHotelInfoRequestFilter() {
        return new HotelInfoRequestFilter();
    }

    /**
     * Create an instance of {@link ArrayOfQualification }
     * 
     */
    public ArrayOfQualification createArrayOfQualification() {
        return new ArrayOfQualification();
    }

    /**
     * Create an instance of {@link FuelData }
     * 
     */
    public FuelData createFuelData() {
        return new FuelData();
    }

    /**
     * Create an instance of {@link ArrayOfPickup }
     * 
     */
    public ArrayOfPickup createArrayOfPickup() {
        return new ArrayOfPickup();
    }

    /**
     * Create an instance of {@link CrewComplementDetail }
     * 
     */
    public CrewComplementDetail createCrewComplementDetail() {
        return new CrewComplementDetail();
    }

    /**
     * Create an instance of {@link StationFacilityAttribute }
     * 
     */
    public StationFacilityAttribute createStationFacilityAttribute() {
        return new StationFacilityAttribute();
    }

    /**
     * Create an instance of {@link Crew }
     * 
     */
    public Crew createCrew() {
        return new Crew();
    }

    /**
     * Create an instance of {@link StandardContactField }
     * 
     */
    public StandardContactField createStandardContactField() {
        return new StandardContactField();
    }

    /**
     * Create an instance of {@link AircraftTypeFilter }
     * 
     */
    public AircraftTypeFilter createAircraftTypeFilter() {
        return new AircraftTypeFilter();
    }

    /**
     * Create an instance of {@link Period }
     * 
     */
    public Period createPeriod() {
        return new Period();
    }

    /**
     * Create an instance of {@link PairingActivity }
     * 
     */
    public PairingActivity createPairingActivity() {
        return new PairingActivity();
    }

    /**
     * Create an instance of {@link Maintenance }
     * 
     */
    public Maintenance createMaintenance() {
        return new Maintenance();
    }

    /**
     * Create an instance of {@link PassengerPerWeight }
     * 
     */
    public PassengerPerWeight createPassengerPerWeight() {
        return new PassengerPerWeight();
    }

    /**
     * Create an instance of {@link HotelPickup }
     * 
     */
    public HotelPickup createHotelPickup() {
        return new HotelPickup();
    }

    /**
     * Create an instance of {@link ArrayOfAccumulatedValueLabel }
     * 
     */
    public ArrayOfAccumulatedValueLabel createArrayOfAccumulatedValueLabel() {
        return new ArrayOfAccumulatedValueLabel();
    }

    /**
     * Create an instance of {@link MinimumEquipment }
     * 
     */
    public MinimumEquipment createMinimumEquipment() {
        return new MinimumEquipment();
    }

    /**
     * Create an instance of {@link Revision }
     * 
     */
    public Revision createRevision() {
        return new Revision();
    }

    /**
     * Create an instance of {@link Deadload }
     * 
     */
    public Deadload createDeadload() {
        return new Deadload();
    }

    /**
     * Create an instance of {@link Airport }
     * 
     */
    public Airport createAirport() {
        return new Airport();
    }

    /**
     * Create an instance of {@link ArrayOfAssignedCrew }
     * 
     */
    public ArrayOfAssignedCrew createArrayOfAssignedCrew() {
        return new ArrayOfAssignedCrew();
    }

    /**
     * Create an instance of {@link AircraftType }
     * 
     */
    public AircraftType createAircraftType() {
        return new AircraftType();
    }

    /**
     * Create an instance of {@link HotelInfo }
     * 
     */
    public HotelInfo createHotelInfo() {
        return new HotelInfo();
    }

    /**
     * Create an instance of {@link BasicRequestFilter }
     * 
     */
    public BasicRequestFilter createBasicRequestFilter() {
        return new BasicRequestFilter();
    }

    /**
     * Create an instance of {@link ExternalCrew }
     * 
     */
    public ExternalCrew createExternalCrew() {
        return new ExternalCrew();
    }

    /**
     * Create an instance of {@link SpecialRole }
     * 
     */
    public SpecialRole createSpecialRole() {
        return new SpecialRole();
    }

    /**
     * Create an instance of {@link ArrayOfRank }
     * 
     */
    public ArrayOfRank createArrayOfRank() {
        return new ArrayOfRank();
    }

    /**
     * Create an instance of {@link Time }
     * 
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link ArrayOfBookingData }
     * 
     */
    public ArrayOfBookingData createArrayOfBookingData() {
        return new ArrayOfBookingData();
    }

    /**
     * Create an instance of {@link Reason }
     * 
     */
    public Reason createReason() {
        return new Reason();
    }

    /**
     * Create an instance of {@link CrewComplement }
     * 
     */
    public CrewComplement createCrewComplement() {
        return new CrewComplement();
    }

    /**
     * Create an instance of {@link Phone }
     * 
     */
    public Phone createPhone() {
        return new Phone();
    }

    /**
     * Create an instance of {@link CrewType }
     * 
     */
    public CrewType createCrewType() {
        return new CrewType();
    }

    /**
     * Create an instance of {@link DataElementIdentifier }
     * 
     */
    public DataElementIdentifier createDataElementIdentifier() {
        return new DataElementIdentifier();
    }

    /**
     * Create an instance of {@link ProjectCode }
     * 
     */
    public ProjectCode createProjectCode() {
        return new ProjectCode();
    }

    /**
     * Create an instance of {@link ArrayOfPassengerPerClass }
     * 
     */
    public ArrayOfPassengerPerClass createArrayOfPassengerPerClass() {
        return new ArrayOfPassengerPerClass();
    }

    /**
     * Create an instance of {@link Pairing }
     * 
     */
    public Pairing createPairing() {
        return new Pairing();
    }

    /**
     * Create an instance of {@link ArrayOfReasonCategory }
     * 
     */
    public ArrayOfReasonCategory createArrayOfReasonCategory() {
        return new ArrayOfReasonCategory();
    }

    /**
     * Create an instance of {@link ArrayOfDaylightSavingTime }
     * 
     */
    public ArrayOfDaylightSavingTime createArrayOfDaylightSavingTime() {
        return new ArrayOfDaylightSavingTime();
    }

    /**
     * Create an instance of {@link TimeChange }
     * 
     */
    public TimeChange createTimeChange() {
        return new TimeChange();
    }

    /**
     * Create an instance of {@link ReasonCategoryRequestFilter }
     * 
     */
    public ReasonCategoryRequestFilter createReasonCategoryRequestFilter() {
        return new ReasonCategoryRequestFilter();
    }

    /**
     * Create an instance of {@link Pickup }
     * 
     */
    public Pickup createPickup() {
        return new Pickup();
    }

    /**
     * Create an instance of {@link ArrayOfHotelInfo }
     * 
     */
    public ArrayOfHotelInfo createArrayOfHotelInfo() {
        return new ArrayOfHotelInfo();
    }

    /**
     * Create an instance of {@link ArrayOfCrewComplementDetail }
     * 
     */
    public ArrayOfCrewComplementDetail createArrayOfCrewComplementDetail() {
        return new ArrayOfCrewComplementDetail();
    }

    /**
     * Create an instance of {@link Base }
     * 
     */
    public Base createBase() {
        return new Base();
    }

    /**
     * Create an instance of {@link ComplementDescription }
     * 
     */
    public ComplementDescription createComplementDescription() {
        return new ComplementDescription();
    }

    /**
     * Create an instance of {@link HotelDetail }
     * 
     */
    public HotelDetail createHotelDetail() {
        return new HotelDetail();
    }

    /**
     * Create an instance of {@link Schedule }
     * 
     */
    public Schedule createSchedule() {
        return new Schedule();
    }

    /**
     * Create an instance of {@link Fuel }
     * 
     */
    public Fuel createFuel() {
        return new Fuel();
    }

    /**
     * Create an instance of {@link ArrayOfString }
     * 
     */
    public ArrayOfString createArrayOfString() {
        return new ArrayOfString();
    }

    /**
     * Create an instance of {@link ArrayOfJumpseater }
     * 
     */
    public ArrayOfJumpseater createArrayOfJumpseater() {
        return new ArrayOfJumpseater();
    }

    /**
     * Create an instance of {@link Aircraft }
     * 
     */
    public Aircraft createAircraft() {
        return new Aircraft();
    }

    /**
     * Create an instance of {@link ArrayOfStationFacilityAttribute }
     * 
     */
    public ArrayOfStationFacilityAttribute createArrayOfStationFacilityAttribute() {
        return new ArrayOfStationFacilityAttribute();
    }

    /**
     * Create an instance of {@link RosterDesignator }
     * 
     */
    public RosterDesignator createRosterDesignator() {
        return new RosterDesignator();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://raido.aviolinx.com/api/", name = "Start", scope = Pickup.class)
    public JAXBElement<XMLGregorianCalendar> createPickupStart(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PickupStart_QNAME, XMLGregorianCalendar.class, Pickup.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://raido.aviolinx.com/api/", name = "Expiry", scope = Document.class)
    public JAXBElement<XMLGregorianCalendar> createDocumentExpiry(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DocumentExpiry_QNAME, XMLGregorianCalendar.class, Document.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://raido.aviolinx.com/api/", name = "DateOfBirth", scope = Document.class)
    public JAXBElement<XMLGregorianCalendar> createDocumentDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DocumentDateOfBirth_QNAME, XMLGregorianCalendar.class, Document.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://raido.aviolinx.com/api/", name = "Issue", scope = Document.class)
    public JAXBElement<XMLGregorianCalendar> createDocumentIssue(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DocumentIssue_QNAME, XMLGregorianCalendar.class, Document.class, value);
    }

}
