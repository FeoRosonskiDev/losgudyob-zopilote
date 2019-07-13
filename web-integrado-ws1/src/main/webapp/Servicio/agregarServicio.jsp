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
            <h1>Agregar Servicio</h1>
            <form 
                id="frmRegistroServicio"
                action="<%=request.getContextPath()%>/Servicio"
                method="post"
                onkeypress="if (event.keycode == 13) {
                                    return false;
                                }"
                >
                <input type="hidden" value="registrarServicio" name="metodo">
                <label>Tipo de Servicio: </label>
                <input type="text" id="AStipo" name="AStipo" required="" maxlength="50" minlength="2"><br>
                <label>Descripción : </label>
                <input type="text" id="ASdescripcion" name="ASdescripcion" required=""><br>
                <label>Precio: </label>
                <input type="text" id="ASprecio" name="ASprecio" required="" ><br>
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