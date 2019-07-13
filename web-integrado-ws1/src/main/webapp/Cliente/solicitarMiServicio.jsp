<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADD</title>
        <link href="../css/Title.css" rel="stylesheet" type="text/css"/>
        <link href="../css/container.css" rel="stylesheet" type="text/css"/>
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
            <h1>Agregar Cliente</h1>
            <form 
                id="frmRegistroSolicitud"
                action="<%=request.getContextPath()%>/Cliente"
                method="post"
                onkeypress="if (event.keycode == 13) {
                                    return false;
                                }"
                >
                <input type="hidden" value="solicitudRegistro" name="metodo">
                <label>ID cliente: </label>
                <input type="text" id="SRidcliente" name="SRidcliente" required=""><br>
                <label>ID Servicio: </label>
                <input type="text" id="SRidservicio" name="SRidservicio" required=""><br>
                <label>ID Distrito: </label>
                <input type="text" id="SRiddistrito" name="SRiddistrito" required=""><br>
                 <label>Dirección: </label>
                <input type="text" id="SRdireccion" name="SRdireccion" required=""><br>
               
                <input type="submit" value="Grabar" >
                <input type="reset" value="Limpiar" >
            </form>
        </div>
        <a href="${pageContext.servletContext.contextPath}/index.jsp"> VOLVER </a>	
        <div id="Footer">
            <h2>DevZopi</h2>
        </div>
        <script type="text/javascript">
			
			window.onload = function(){
				
				var mensaje = "${mensajeRespuesta}";
				if(mensaje!="") {
					alert(mensaje);
				}
				
			}
		
		</script>
    </body>
</html>