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
                id="frmRegistroCliente"
                action="<%=request.getContextPath()%>/Cliente"
                method="post"
                onkeypress="if (event.keycode == 13) {
                                    return false;
                                }"
                >
                <input type="hidden" value="registrarCliente" name="metodo">
                <label>Nombres: </label>
                <input type="text" id="ACnombre" name="ACnombre" required="" maxlength="50" minlength="2"><br>
                <label>Apellido Paterno: </label>
                <input type="text" id="ACpaterno" name="ACpaterno" required="" maxlength="50" minlength="2"><br>
                <label>Apellido Materno: </label>
                <input type="text" id="ACmaterno" name="ACmaterno" required="" maxlength="50" minlength="2"><br>
                <label>DNI: </label>
                <input type="text" id="ACdni" name="ACdni" required="" maxlength="8" minlength="8"><br><br>
                <label>Celular: </label>
                <input type="phone" id="ACcelular" name="ACcelular" required="" maxlength="9" minlength="7"><br>
                <label>Correo Electronico: </label>
                <input type="email" id="ACcorreo" name="ACcorreo" required=""><br>
                <label>Fecha de Nacimiento: </label>
                <input type="date" id="ACfechaNacimiento" name="ACfechaNacimiento" required=""><br>
                <label>Nueva Contraseña: </label>
                <input type="password" id="ACpass" name="ACpass" required=""><br>
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