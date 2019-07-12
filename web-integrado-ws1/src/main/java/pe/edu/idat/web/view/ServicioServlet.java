package pe.edu.idat.web.view;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.idat.web.persistence.soap.service.ServicioRegistroModelRequest;
import pe.edu.idat.web.persistence.soap.service.ServicioRegistroModelResponse;
import pe.edu.idat.web.persistence.soap.service.ServicioUpdateModelRequest;
import pe.edu.idat.web.persistence.soap.service.ServicioUpdateModelResponse;
import pe.edu.idat.web.persistence.soap.service.SolicitudAsignarTecnicoModelRequest;
import pe.edu.idat.web.persistence.soap.service.SolicitudAsignarTecnicoModelResponse;
import pe.edu.idat.web.transactional.impl.Service;

@WebServlet(urlPatterns = "/Servicio", loadOnStartup = 1)
public class ServicioServlet extends HttpServlet {

	@Inject
	private Service s;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/Servicio/agregarServicio.jsp").forward(req, resp);
		req.getRequestDispatcher("/Servicio/modificarServicio.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String mensaje = req.getParameter("metodo");

		if (mensaje.equalsIgnoreCase("registrarServicio")) {
			// variables
			String tipo = req.getParameter("AStipo");
			String descripcion = req.getParameter("ASdescripcion");
			Double precio = Double.valueOf(req.getParameter("ASprecio"));

			// logica
			ServicioRegistroModelRequest Crequest = new ServicioRegistroModelRequest();

			Crequest.setTipo(tipo);
			Crequest.setDescripcion(descripcion);
			Crequest.setPrecio(precio);

			ServicioRegistroModelResponse Cresponse = s.registrarservicio(Crequest);

			// -- Respuesta
			req.setAttribute("mensajeRespuesta", Cresponse.getRespuesta());
			getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
		}

		if (mensaje.equalsIgnoreCase("modificarServicio")) {

			Integer id = Integer.valueOf(req.getParameter("MSid"));
			String tipo = req.getParameter("MStipo");
			String descripcion = req.getParameter("MSdescripcion");
			double precio = Double.valueOf(req.getParameter("MSprecio"));

			ServicioUpdateModelRequest Srequest = new ServicioUpdateModelRequest();

			Srequest.setId(id);
			Srequest.setTipo(tipo);
			Srequest.setDescripcion(descripcion);
			Srequest.setPrecio(precio);

			ServicioUpdateModelResponse Cresponse = s.actualizarservicio(Srequest);
			req.setAttribute("mensajeRespuesta", Cresponse.getRespuesta());
			getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
		}

		/*
		 * if(mensaje.equalsIgnoreCase("eliminarServicio")) { Integer id =
		 * Integer.valueOf(req.getParameter("ECid"));
		 * 
		 * EliminarModelRequest Crequest = new EliminarModelRequest();
		 * 
		 * Crequest.setId(id); Crequest.setEstado(2);
		 * 
		 * ServicioUpdateModelRequest Cresponse = s.(Crequest);
		 * 
		 * req.setAttribute("mensajeRespuesta", Cresponse.getRespuesta());
		 * getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp); }
		 */
		if (mensaje.equalsIgnoreCase("AsignarTecnico")) {
			// Integer idSolicitud = Integer.valueOf(req.getParameter(""));
			Integer idPersonal = Integer.valueOf(req.getParameter("ATidpersonal"));
			String fechaasignada = req.getParameter("ATfecha");

			SolicitudAsignarTecnicoModelRequest Srequest = new SolicitudAsignarTecnicoModelRequest();

			Srequest.setIdSolicitud(null);
			Srequest.setIdPersonal(idPersonal);
			Srequest.setFechaAsignada(fechaasignada);

			SolicitudAsignarTecnicoModelResponse Cresponse = s.asignarTecnico(Srequest);
			req.setAttribute("mensajeRespuesta", Cresponse.getRespuesta());
			getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
		}
	}
}
