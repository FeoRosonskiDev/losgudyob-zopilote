<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.Date"%>
<!DOCTYPE html>
<html>
	<head>
		<title>INDEX</title>
		<link href="css/Title.css" rel="stylesheet" type="text/css"/>
        <link href="css/container.css" rel="stylesheet" type="text/css"/>
	</head>
	<body>
		<div id="Header">
            <p>
                <span>
                    Bantel S.A.C
                </span>
            </p>
        </div>
        
        <div id="Body">
            <h1>Opciones</h1>
            <div class="row">
                <div class="example-2 card">
                    <div class="wrapper">
                        <div class="header">
                            <div class="date">
                                <span class="day"><%=new Date()%></span>
                            </div>
                        </div>
                        <div class="data">
                            <div class="content">
                                <span class="author">Servidor</span>
                                <h1 class="title"><a href="${pageContext.servletContext.contextPath}/Servicio/agregarServicio.jsp">Agregar Servicio</a></h1>
                                <h1 class="title"><a href="${pageContext.servletContext.contextPath}/Servicio/modificarServicio.jsp">Modificar Servicio</a></h1>
                             <!--   <h1 class="title"><a href="${pageContext.servletContext.contextPath}/Servicio/eliminarServicio.jsp">Eliminar Servicio</a></h1> -->
                                <h1 class="title"><a href="${pageContext.servletContext.contextPath}/Servicio/asignarTecnico.jsp">Asignar Técnico</a></h1>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="example-2 card">
                    <div class="wrapper">
                        <div class="header">
                            <div class="date">
                                <span class="day"><%=new Date()%></span>
                            </div>
                        </div>
                        <div class="data">
                            <div class="content">
                                <span class="author">Cliente</span>
                                <h1 class="title"><a href="${pageContext.servletContext.contextPath}/Cliente/agregarCliente.jsp"">WS Agregar Cliente</a></h1>
                                <h1 class="title"><a href="${pageContext.servletContext.contextPath}/Cliente/modificarCliente.jsp">WS Modificar Cliente</a></h1>
                            <!--    <h1 class="title"><a href="${pageContext.servletContext.contextPath}/Cliente/eliminarCliente.jsp">WS Eliminar Cliente</a></h1> -->
                                <h1 class="title"><a href="${pageContext.servletContext.contextPath}/Cliente/solicitarMiServicio.jsp">WS Solicitar Servicio</a></h1>
                            <!--<h1 class="title"><a href="${pageContext.servletContext.contextPath}/Cliente/modificarMiServicio">WS Modificar Mi Servicio</a></h1>   
                                <h1 class="title"><a href="${pageContext.servletContext.contextPath}/Cliente/EliminarMiServicio">WS Eliminar Mi Servicio</a></h1>-->
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div id="Footer">
            <h2>DevZopi</h2>
            <h2>EXPORTAR LISTA  DE CLIENTES </h2>
        </div>
	</body>
</html>