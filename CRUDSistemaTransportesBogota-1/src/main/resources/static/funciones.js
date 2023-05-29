   
function eliminar(id) {
	console.log(id);
	swal({
		  title: "Esta seguro de que fue pagado?",
		  text: "Una vez dado click no se prodra restablecer!",
		  icon: "warning",
		  buttons: true,
		  dangerMode: true,
		})
		.then((OK) => {
		  if (OK) {
			  $.ajax({
				 url:"/delete/"+id,
				 success: function(res) {
					console.log(res);
				},			
			  });
		    swal(" Parte eliminado!", {
		      icon: "success",
		    }).then((ok)=>{
		    	if(ok){
		    		location.href="/listar";
		    	}
		    });
		  } 
		});
}




