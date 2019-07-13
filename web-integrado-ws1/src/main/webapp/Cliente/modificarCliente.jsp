<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UPDATE</title>
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
            <h1>Modificar Cliente</h1>
            <form 
                id="frmmodificarCliente"
                action="<%=request.getContextPath()%>/Cliente"
                method="post"
                onkeypress="if (event.keycode == 13) {
                                    return false;
                                }"
                >
                <input type="hidden" value="modificarCliente" name="metodo">
                <label>ID: </label>
                <input type="text" id="MCid" name="MCid" required=""><br>
                <label>Celular: </label>
                <input type="phone" id="MCcelular" name="MCcelular" required="" maxlength="9" minlength="7"><br>
                <label>Correo Electronico: </label>
                <input type="email" id="MCcorreo" name="MCcorreo" required=""><br>
                <label>Nueva Contraseña: </label>
                <input type="password" id="MCclave" name="MCclave" required=""><br>
                <label>Confirmar Nueva Contraseña: </label>
                <input type="password" required=""><br>
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