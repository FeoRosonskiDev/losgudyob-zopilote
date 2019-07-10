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
            <h1>Eliminar Cliente</h1>
            <form 
                id="frmEliminarCliente"
                action="<%=request.getContextPath()%>/Cliente"
                method="post"
                onkeypress="if (event.keycode == 13) {
                                    return false;
                                }"
                >
                <input type="hidden" value="eliminarCliente" name="metodo">
                <label>ID: </label>
                <input type="text" id="ECid" name="ECid" required="" maxlength="5" minlength="1">
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