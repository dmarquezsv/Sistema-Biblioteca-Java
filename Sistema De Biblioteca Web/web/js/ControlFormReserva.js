 window.onload=function(){
    $("table tbody tr").click(function(){
        // Tomar la captura la información  de la tabla 
        var IDlibro= $(this).find("td:eq(0)").text(); 
        document.getElementById('LibroReservar').value=IDlibro;
         var Titulo = $(this).find("td:eq(1)").text(); 
         document.getElementById('NombreLibro').value= Titulo;
         
         var cantidadBook = $(this).find("td:eq(3)").text(); 
         document.getElementById('Cantidades').value= cantidadBook;
         
       // var cantidad = $(this).find("td:eq(3)").text();
       // document.getElementById('disponibilidad').value= cantidad;
        
         
    });    
}

$(document).ready(function(){
    $("#EnviarDatos").click(function(){
       
        var numero=$("#CantidadReservar").val(); //variables que traemos del input de reserva
        var cargo =$("#cargo").val();
        var cantidades =$("#Cantidades").val();// Vaariables para vericar cuantos libros hay
        
       
      
        //alert(cantidades);

        // Vericar si el campos si se ha sobre pasado de limete cantidad disponible
        if(numero =="")
        {
         alert("Ingrese la cantidad a reservar. Gracias");  // alerta que no ha ingrasado bien el dato   
        return false;
        }
        else if(cantidades == 0)
        {
            alert("No hay Libros Disponible por el momento. Gracias");  // alerta que no ha ingrasado bien el dato   
             return false;
        }
        else if (cargo == 3 && numero != 1 ) // Cargo Estudiante solo puede reservar un libro
        {
             alert("Los estudiantes solo puede reservar un libro. Gracias");  // alerta que no ha ingrasado bien el dato 
             return false;
        }
     
       // else if(cargo == 2 &&    numero   > cantidades )// Evaluamos que no sebre pase la cantidad
       // {
       //  alert("Verifique que no sobre pase de la cantidad disponible de libro. Gracias");  // alerta que no ha ingrasado bien el dato   
       //  return false; // Retorna false para no dejar pasar al otro punto de progreso
        
       // }
        
      
       
        
    });// Fin de Enviar Datos
    
    
    
});//Fin Document

function validaNumericos(event) {
    if(event.charCode >= 48 && event.charCode <= 57){
      return true;
     }
     return false;        
}




