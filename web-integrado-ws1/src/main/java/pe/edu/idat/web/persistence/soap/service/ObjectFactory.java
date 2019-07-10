
package pe.edu.idat.web.persistence.soap.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the pe.edu.idat.web.persistence.soap.service
 * package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _ClienteEliminarModelRequest_QNAME = new QName(
			"http://endpoint.view.losgudyob.proyecto.pe/", "ClienteEliminarModelRequest");
	private final static QName _ClienteRegistroModelRequest_QNAME = new QName(
			"http://endpoint.view.losgudyob.proyecto.pe/", "ClienteRegistroModelRequest");
	private final static QName _ClienteRegistroModelResponse_QNAME = new QName(
			"http://endpoint.view.losgudyob.proyecto.pe/", "ClienteRegistroModelResponse");
	private final static QName _ClienteUpdateModelRequest_QNAME = new QName(
			"http://endpoint.view.losgudyob.proyecto.pe/", "ClienteUpdateModelRequest");
	private final static QName _ClienteUpdateModelResponse_QNAME = new QName(
			"http://endpoint.view.losgudyob.proyecto.pe/", "ClienteUpdateModelResponse");
	private final static QName _ServicioRegistroModelRequest_QNAME = new QName(
			"http://endpoint.view.losgudyob.proyecto.pe/", "ServicioRegistroModelRequest");
	private final static QName _ServicioRegistroModelResponse_QNAME = new QName(
			"http://endpoint.view.losgudyob.proyecto.pe/", "ServicioRegistroModelResponse");
	private final static QName _ServicioUpdateModelRequest_QNAME = new QName(
			"http://endpoint.view.losgudyob.proyecto.pe/", "ServicioUpdateModelRequest");
	private final static QName _ServicioUpdateModelResponse_QNAME = new QName(
			"http://endpoint.view.losgudyob.proyecto.pe/", "ServicioUpdateModelResponse");
	private final static QName _SolicitudAsignarTecnicoModelRequest_QNAME = new QName(
			"http://endpoint.view.losgudyob.proyecto.pe/", "SolicitudAsignarTecnicoModelRequest");
	private final static QName _SolicitudAsignarTecnicoModelResponse_QNAME = new QName(
			"http://endpoint.view.losgudyob.proyecto.pe/", "SolicitudAsignarTecnicoModelResponse");
	private final static QName _SolicitudRegistroModelRequest_QNAME = new QName(
			"http://endpoint.view.losgudyob.proyecto.pe/", "SolicitudRegistroModelRequest");
	private final static QName _SolicitudRegistroModelResponse_QNAME = new QName(
			"http://endpoint.view.losgudyob.proyecto.pe/", "SolicitudRegistroModelResponse");
	private final static QName _AsignarTecnico_QNAME = new QName("http://endpoint.view.losgudyob.proyecto.pe/",
			"asignarTecnico");
	private final static QName _AsignarTecnicoResponse_QNAME = new QName("http://endpoint.view.losgudyob.proyecto.pe/",
			"asignarTecnicoResponse");
	private final static QName _EliminarClient_QNAME = new QName("http://endpoint.view.losgudyob.proyecto.pe/",
			"eliminarClient");
	private final static QName _EliminarClientResponse_QNAME = new QName("http://endpoint.view.losgudyob.proyecto.pe/",
			"eliminarClientResponse");
	private final static QName _EliminarSolicitud_QNAME = new QName("http://endpoint.view.losgudyob.proyecto.pe/",
			"eliminarSolicitud");
	private final static QName _EliminarSolicitudResponse_QNAME = new QName(
			"http://endpoint.view.losgudyob.proyecto.pe/", "eliminarSolicitudResponse");
	private final static QName _InsertClient_QNAME = new QName("http://endpoint.view.losgudyob.proyecto.pe/",
			"insertClient");
	private final static QName _InsertClientResponse_QNAME = new QName("http://endpoint.view.losgudyob.proyecto.pe/",
			"insertClientResponse");
	private final static QName _InsertService_QNAME = new QName("http://endpoint.view.losgudyob.proyecto.pe/",
			"insertService");
	private final static QName _InsertServiceResponse_QNAME = new QName("http://endpoint.view.losgudyob.proyecto.pe/",
			"insertServiceResponse");
	private final static QName _InsertSolicitud_QNAME = new QName("http://endpoint.view.losgudyob.proyecto.pe/",
			"insertSolicitud");
	private final static QName _InsertSolicitudResponse_QNAME = new QName("http://endpoint.view.losgudyob.proyecto.pe/",
			"insertSolicitudResponse");
	private final static QName _UpdateClient_QNAME = new QName("http://endpoint.view.losgudyob.proyecto.pe/",
			"updateClient");
	private final static QName _UpdateClientResponse_QNAME = new QName("http://endpoint.view.losgudyob.proyecto.pe/",
			"updateClientResponse");
	private final static QName _UpdateService_QNAME = new QName("http://endpoint.view.losgudyob.proyecto.pe/",
			"updateService");
	private final static QName _UpdateServiceResponse_QNAME = new QName("http://endpoint.view.losgudyob.proyecto.pe/",
			"updateServiceResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of schema
	 * derived classes for package: pe.edu.idat.web.persistence.soap.service
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link EliminarModelRequest }
	 * 
	 */
	public EliminarModelRequest createEliminarModelRequest() {
		return new EliminarModelRequest();
	}

	/**
	 * Create an instance of {@link ClienteRegistroModelRequest }
	 * 
	 */
	public ClienteRegistroModelRequest createClienteRegistroModelRequest() {
		return new ClienteRegistroModelRequest();
	}

	/**
	 * Create an instance of {@link ClienteRegistroModelResponse }
	 * 
	 */
	public ClienteRegistroModelResponse createClienteRegistroModelResponse() {
		return new ClienteRegistroModelResponse();
	}

	/**
	 * Create an instance of {@link ClienteUpdateModelRequest }
	 * 
	 */
	public ClienteUpdateModelRequest createClienteUpdateModelRequest() {
		return new ClienteUpdateModelRequest();
	}

	/**
	 * Create an instance of {@link ClienteUpdateModelResponse }
	 * 
	 */
	public ClienteUpdateModelResponse createClienteUpdateModelResponse() {
		return new ClienteUpdateModelResponse();
	}

	/**
	 * Create an instance of {@link ServicioRegistroModelRequest }
	 * 
	 */
	public ServicioRegistroModelRequest createServicioRegistroModelRequest() {
		return new ServicioRegistroModelRequest();
	}

	/**
	 * Create an instance of {@link ServicioRegistroModelResponse }
	 * 
	 */
	public ServicioRegistroModelResponse createServicioRegistroModelResponse() {
		return new ServicioRegistroModelResponse();
	}

	/**
	 * Create an instance of {@link ServicioUpdateModelRequest }
	 * 
	 */
	public ServicioUpdateModelRequest createServicioUpdateModelRequest() {
		return new ServicioUpdateModelRequest();
	}

	/**
	 * Create an instance of {@link ServicioUpdateModelResponse }
	 * 
	 */
	public ServicioUpdateModelResponse createServicioUpdateModelResponse() {
		return new ServicioUpdateModelResponse();
	}

	/**
	 * Create an instance of {@link SolicitudAsignarTecnicoModelRequest }
	 * 
	 */
	public SolicitudAsignarTecnicoModelRequest createSolicitudAsignarTecnicoModelRequest() {
		return new SolicitudAsignarTecnicoModelRequest();
	}

	/**
	 * Create an instance of {@link SolicitudAsignarTecnicoModelResponse }
	 * 
	 */
	public SolicitudAsignarTecnicoModelResponse createSolicitudAsignarTecnicoModelResponse() {
		return new SolicitudAsignarTecnicoModelResponse();
	}

	/**
	 * Create an instance of {@link SolicitudRegistroModelRequest }
	 * 
	 */
	public SolicitudRegistroModelRequest createSolicitudRegistroModelRequest() {
		return new SolicitudRegistroModelRequest();
	}

	/**
	 * Create an instance of {@link SolicitudRegistroModelResponse }
	 * 
	 */
	public SolicitudRegistroModelResponse createSolicitudRegistroModelResponse() {
		return new SolicitudRegistroModelResponse();
	}

	/**
	 * Create an instance of {@link AsignarTecnico }
	 * 
	 */
	public AsignarTecnico createAsignarTecnico() {
		return new AsignarTecnico();
	}

	/**
	 * Create an instance of {@link AsignarTecnicoResponse }
	 * 
	 */
	public AsignarTecnicoResponse createAsignarTecnicoResponse() {
		return new AsignarTecnicoResponse();
	}

	/**
	 * Create an instance of {@link EliminarClient }
	 * 
	 */
	public EliminarClient createEliminarClient() {
		return new EliminarClient();
	}

	/**
	 * Create an instance of {@link EliminarClientResponse }
	 * 
	 */
	public EliminarClientResponse createEliminarClientResponse() {
		return new EliminarClientResponse();
	}

	/**
	 * Create an instance of {@link EliminarSolicitud }
	 * 
	 */
	public EliminarSolicitud createEliminarSolicitud() {
		return new EliminarSolicitud();
	}

	/**
	 * Create an instance of {@link EliminarSolicitudResponse }
	 * 
	 */
	public EliminarSolicitudResponse createEliminarSolicitudResponse() {
		return new EliminarSolicitudResponse();
	}

	/**
	 * Create an instance of {@link InsertClient }
	 * 
	 */
	public InsertClient createInsertClient() {
		return new InsertClient();
	}

	/**
	 * Create an instance of {@link InsertClientResponse }
	 * 
	 */
	public InsertClientResponse createInsertClientResponse() {
		return new InsertClientResponse();
	}

	/**
	 * Create an instance of {@link InsertService }
	 * 
	 */
	public InsertService createInsertService() {
		return new InsertService();
	}

	/**
	 * Create an instance of {@link InsertServiceResponse }
	 * 
	 */
	public InsertServiceResponse createInsertServiceResponse() {
		return new InsertServiceResponse();
	}

	/**
	 * Create an instance of {@link InsertSolicitud }
	 * 
	 */
	public InsertSolicitud createInsertSolicitud() {
		return new InsertSolicitud();
	}

	/**
	 * Create an instance of {@link InsertSolicitudResponse }
	 * 
	 */
	public InsertSolicitudResponse createInsertSolicitudResponse() {
		return new InsertSolicitudResponse();
	}

	/**
	 * Create an instance of {@link UpdateClient }
	 * 
	 */
	public UpdateClient createUpdateClient() {
		return new UpdateClient();
	}

	/**
	 * Create an instance of {@link UpdateClientResponse }
	 * 
	 */
	public UpdateClientResponse createUpdateClientResponse() {
		return new UpdateClientResponse();
	}

	/**
	 * Create an instance of {@link UpdateService }
	 * 
	 */
	public UpdateService createUpdateService() {
		return new UpdateService();
	}

	/**
	 * Create an instance of {@link UpdateServiceResponse }
	 * 
	 */
	public UpdateServiceResponse createUpdateServiceResponse() {
		return new UpdateServiceResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link EliminarModelRequest }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "ClienteEliminarModelRequest")
	public JAXBElement<EliminarModelRequest> createClienteEliminarModelRequest(EliminarModelRequest value) {
		return new JAXBElement<EliminarModelRequest>(_ClienteEliminarModelRequest_QNAME, EliminarModelRequest.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ClienteRegistroModelRequest }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "ClienteRegistroModelRequest")
	public JAXBElement<ClienteRegistroModelRequest> createClienteRegistroModelRequest(
			ClienteRegistroModelRequest value) {
		return new JAXBElement<ClienteRegistroModelRequest>(_ClienteRegistroModelRequest_QNAME,
				ClienteRegistroModelRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ClienteRegistroModelResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "ClienteRegistroModelResponse")
	public JAXBElement<ClienteRegistroModelResponse> createClienteRegistroModelResponse(
			ClienteRegistroModelResponse value) {
		return new JAXBElement<ClienteRegistroModelResponse>(_ClienteRegistroModelResponse_QNAME,
				ClienteRegistroModelResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ClienteUpdateModelRequest }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "ClienteUpdateModelRequest")
	public JAXBElement<ClienteUpdateModelRequest> createClienteUpdateModelRequest(ClienteUpdateModelRequest value) {
		return new JAXBElement<ClienteUpdateModelRequest>(_ClienteUpdateModelRequest_QNAME,
				ClienteUpdateModelRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ClienteUpdateModelResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "ClienteUpdateModelResponse")
	public JAXBElement<ClienteUpdateModelResponse> createClienteUpdateModelResponse(ClienteUpdateModelResponse value) {
		return new JAXBElement<ClienteUpdateModelResponse>(_ClienteUpdateModelResponse_QNAME,
				ClienteUpdateModelResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ServicioRegistroModelRequest }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "ServicioRegistroModelRequest")
	public JAXBElement<ServicioRegistroModelRequest> createServicioRegistroModelRequest(
			ServicioRegistroModelRequest value) {
		return new JAXBElement<ServicioRegistroModelRequest>(_ServicioRegistroModelRequest_QNAME,
				ServicioRegistroModelRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ServicioRegistroModelResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "ServicioRegistroModelResponse")
	public JAXBElement<ServicioRegistroModelResponse> createServicioRegistroModelResponse(
			ServicioRegistroModelResponse value) {
		return new JAXBElement<ServicioRegistroModelResponse>(_ServicioRegistroModelResponse_QNAME,
				ServicioRegistroModelResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ServicioUpdateModelRequest }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "ServicioUpdateModelRequest")
	public JAXBElement<ServicioUpdateModelRequest> createServicioUpdateModelRequest(ServicioUpdateModelRequest value) {
		return new JAXBElement<ServicioUpdateModelRequest>(_ServicioUpdateModelRequest_QNAME,
				ServicioUpdateModelRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link ServicioUpdateModelResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "ServicioUpdateModelResponse")
	public JAXBElement<ServicioUpdateModelResponse> createServicioUpdateModelResponse(
			ServicioUpdateModelResponse value) {
		return new JAXBElement<ServicioUpdateModelResponse>(_ServicioUpdateModelResponse_QNAME,
				ServicioUpdateModelResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link SolicitudAsignarTecnicoModelRequest }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "SolicitudAsignarTecnicoModelRequest")
	public JAXBElement<SolicitudAsignarTecnicoModelRequest> createSolicitudAsignarTecnicoModelRequest(
			SolicitudAsignarTecnicoModelRequest value) {
		return new JAXBElement<SolicitudAsignarTecnicoModelRequest>(_SolicitudAsignarTecnicoModelRequest_QNAME,
				SolicitudAsignarTecnicoModelRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link SolicitudAsignarTecnicoModelResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "SolicitudAsignarTecnicoModelResponse")
	public JAXBElement<SolicitudAsignarTecnicoModelResponse> createSolicitudAsignarTecnicoModelResponse(
			SolicitudAsignarTecnicoModelResponse value) {
		return new JAXBElement<SolicitudAsignarTecnicoModelResponse>(_SolicitudAsignarTecnicoModelResponse_QNAME,
				SolicitudAsignarTecnicoModelResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link SolicitudRegistroModelRequest }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "SolicitudRegistroModelRequest")
	public JAXBElement<SolicitudRegistroModelRequest> createSolicitudRegistroModelRequest(
			SolicitudRegistroModelRequest value) {
		return new JAXBElement<SolicitudRegistroModelRequest>(_SolicitudRegistroModelRequest_QNAME,
				SolicitudRegistroModelRequest.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link SolicitudRegistroModelResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "SolicitudRegistroModelResponse")
	public JAXBElement<SolicitudRegistroModelResponse> createSolicitudRegistroModelResponse(
			SolicitudRegistroModelResponse value) {
		return new JAXBElement<SolicitudRegistroModelResponse>(_SolicitudRegistroModelResponse_QNAME,
				SolicitudRegistroModelResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AsignarTecnico
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "asignarTecnico")
	public JAXBElement<AsignarTecnico> createAsignarTecnico(AsignarTecnico value) {
		return new JAXBElement<AsignarTecnico>(_AsignarTecnico_QNAME, AsignarTecnico.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link AsignarTecnicoResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "asignarTecnicoResponse")
	public JAXBElement<AsignarTecnicoResponse> createAsignarTecnicoResponse(AsignarTecnicoResponse value) {
		return new JAXBElement<AsignarTecnicoResponse>(_AsignarTecnicoResponse_QNAME, AsignarTecnicoResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EliminarClient
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "eliminarClient")
	public JAXBElement<EliminarClient> createEliminarClient(EliminarClient value) {
		return new JAXBElement<EliminarClient>(_EliminarClient_QNAME, EliminarClient.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link EliminarClientResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "eliminarClientResponse")
	public JAXBElement<EliminarClientResponse> createEliminarClientResponse(EliminarClientResponse value) {
		return new JAXBElement<EliminarClientResponse>(_EliminarClientResponse_QNAME, EliminarClientResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EliminarSolicitud
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "eliminarSolicitud")
	public JAXBElement<EliminarSolicitud> createEliminarSolicitud(EliminarSolicitud value) {
		return new JAXBElement<EliminarSolicitud>(_EliminarSolicitud_QNAME, EliminarSolicitud.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link EliminarSolicitudResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "eliminarSolicitudResponse")
	public JAXBElement<EliminarSolicitudResponse> createEliminarSolicitudResponse(EliminarSolicitudResponse value) {
		return new JAXBElement<EliminarSolicitudResponse>(_EliminarSolicitudResponse_QNAME,
				EliminarSolicitudResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link InsertClient
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "insertClient")
	public JAXBElement<InsertClient> createInsertClient(InsertClient value) {
		return new JAXBElement<InsertClient>(_InsertClient_QNAME, InsertClient.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link InsertClientResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "insertClientResponse")
	public JAXBElement<InsertClientResponse> createInsertClientResponse(InsertClientResponse value) {
		return new JAXBElement<InsertClientResponse>(_InsertClientResponse_QNAME, InsertClientResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link InsertService
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "insertService")
	public JAXBElement<InsertService> createInsertService(InsertService value) {
		return new JAXBElement<InsertService>(_InsertService_QNAME, InsertService.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link InsertServiceResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "insertServiceResponse")
	public JAXBElement<InsertServiceResponse> createInsertServiceResponse(InsertServiceResponse value) {
		return new JAXBElement<InsertServiceResponse>(_InsertServiceResponse_QNAME, InsertServiceResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link InsertSolicitud
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "insertSolicitud")
	public JAXBElement<InsertSolicitud> createInsertSolicitud(InsertSolicitud value) {
		return new JAXBElement<InsertSolicitud>(_InsertSolicitud_QNAME, InsertSolicitud.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link InsertSolicitudResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "insertSolicitudResponse")
	public JAXBElement<InsertSolicitudResponse> createInsertSolicitudResponse(InsertSolicitudResponse value) {
		return new JAXBElement<InsertSolicitudResponse>(_InsertSolicitudResponse_QNAME, InsertSolicitudResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UpdateClient
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "updateClient")
	public JAXBElement<UpdateClient> createUpdateClient(UpdateClient value) {
		return new JAXBElement<UpdateClient>(_UpdateClient_QNAME, UpdateClient.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link UpdateClientResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "updateClientResponse")
	public JAXBElement<UpdateClientResponse> createUpdateClientResponse(UpdateClientResponse value) {
		return new JAXBElement<UpdateClientResponse>(_UpdateClientResponse_QNAME, UpdateClientResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link UpdateService
	 * }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "updateService")
	public JAXBElement<UpdateService> createUpdateService(UpdateService value) {
		return new JAXBElement<UpdateService>(_UpdateService_QNAME, UpdateService.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement
	 * }{@code <}{@link UpdateServiceResponse }{@code >}}
	 * 
	 */
	@XmlElementDecl(namespace = "http://endpoint.view.losgudyob.proyecto.pe/", name = "updateServiceResponse")
	public JAXBElement<UpdateServiceResponse> createUpdateServiceResponse(UpdateServiceResponse value) {
		return new JAXBElement<UpdateServiceResponse>(_UpdateServiceResponse_QNAME, UpdateServiceResponse.class, null,
				value);
	}

}
