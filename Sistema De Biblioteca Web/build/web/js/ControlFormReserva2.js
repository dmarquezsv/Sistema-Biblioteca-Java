var EstadoSolicitud
window.onload=function(){
    $("table tbody tr").click(function(){
        // Tomar la captura la información  de la tabla 
        var Titulolibro= $(this).find("td:eq(2)").text(); 
        document.getElementById('LibroEnReserva').value=Titulolibro;
         var IDlibro = $(this).find("td:eq(0)").text(); 
         document.getElementById('IDRegistro').value=IDlibro;
          EstadoSolicitud = $(this).find("td:eq(3)").text(); // Verificar el estado solicitud 
        
         
    });    
}


$(document).ready(function(){
    $("#EnviarDatos").click(function(){
       
     if(EstadoSolicitud == "Reservado") // Modificar
     {
        alert("Lo siento no puedes eliminar registro ya reservado. Espera 24 horas si no lo desea. Gracias");  // alerta que no ha ingrasado bien el dato   
        return false;
     }
      
       
        
    });// Fin de Enviar Datos


});//Fin Document