// Definir un objeto que contenga los códigos y sus respectivos valores y descripciones
var codigos = {
  "A10": {
    valor: 117040,
    descripcion: "Conducir por la vía férrea o por zonas de protección y seguridad."
  },
  "A12": {
    valor: 117040,
    descripcion: "Prestar Servicio Público con este tipo de vehículos. Además, el vehículo será inmovilizado por primera vez."
  },
  "A5": {
    valor: 117040,
    descripcion: "No respetar las señales de tránsito."
  },
  "B11": {
    valor: 234080,
    descripcion: "Conducir un vehículo con propaganda, publicidad o adhesivos en sus vidrios que obstaculicen la visibilidad."
  },
  "B2": {
    valor: 234080,
    descripcion: "Conducir un vehículo con la licencia de conducción vencida."
  },
  "B22": {
    valor: 234080,
    descripcion: "Llevar niños menores de diez (10) años en el asiento delantero."
  },
  "B21": {
    valor: 234080,
    descripcion: "Lavar vehículos en vía pública, en ríos, en canales, en quebradas, etc."
  },
  "B3": {
    valor: 234080,
    descripcion: "Conducir un vehículo sin placas, no portarlas en el extremo delantero o trasero, portarlas con obstáculos o en condiciones que dificulten su plena identificación."
  },
  "B7": {
    valor: 234080,
    descripcion: "No informar a la autoridad de tránsito competente el cambio de motor o color de un vehículo."
  },
  "C1": {
    valor: 438900,
    descripcion: "Presentar licencia de conducción adulterada o ajena."
  },
  "C14": {
    valor: 438900,
    descripcion: "Transitar por sitios restringidos o en horas prohibidas por la autoridad competente. Además, el vehículo será inmovilizado."
  },
  "C19": {
    valor: 438900,
    descripcion: "Dejar o recoger pasajeros en sitios distintos de los demarcados por las autoridades."
  },
  "C2": {
    valor: 438900,
    descripcion: "Estacionar un vehículo en sitios prohibidos."
  },
  "C28": {
    valor: 438900,
    descripcion: "Hacer uso de sirenas, luces intermitentes, o de alta intensidad y aparatos similares los cuales están reservados a los vehículos de bomberos, ambulancias, recolectores de basura, socorro, emergencia, fuerzas militares, policía y autoridades de tránsito y transporte."
  },
  "C29": {
    valor: 438900,
    descripcion: "Conducir un vehículo a velocidad superior a la máxima permitida."
  },
  "C30": {
    valor: 438900,
    descripcion: "No atender una señal de ceda el paso."
  },
  "C32": {
    valor: 438900,
    descripcion: "No respetar el paso de peatones que cruzan una vía en sitio permitido para ellos o no darles la prelación en las franjas para ello establecidas."
  },
  "C37": {
    valor: 438900,
    descripcion: "Transportar pasajeros en el platón de una camioneta picó o en la plataforma de un vehículo de carga, trátese de furgón o plataforma de estacas."
  },
  "C5": {
    valor: 438900,
    descripcion: "No reducir la velocidad según lo indicado por este código, cuando transite por un cruce escolar en los horarios y días de funcionamiento de la institución educativa."
  },
  "C6": {
    valor: 438900,
    descripcion: "No utilizar el Cinturón de seguridad por parte de los ocupantes del vehículo y los cinturones de seguridad en los asientos traseros."
  },
  "C7": {
    valor: 438900,
    descripcion: "Dejar de señalizar con las luces direccionales o mediante señales de mano y con la debida anticipación, la maniobra de giro o de cambio de carril."
  },
  "D10": {
    valor: 877800,
    descripcion: "Conducir un vehículo para transporte escolar con exceso de velocidad en las vías urbanas no será mayor de (60) kilómetros por hora siempre y cuando se encuentra debidamente señalizada. En carreteras departamentales y nacionales no podrá ser superior a (80) kilómetros por hora."
  },
  "D15": {
    valor: 877800,
    descripcion: "Cambio del recorrido o trazado de la ruta para vehículo de servicio de transporte público de pasajeros, autorizado por el organismo de tránsito correspondiente."
  },
  "D16": {
    valor: 877800,
    descripcion: "Arrojar Residuos Sólidos al espacio público desde un vehículo automotor o de tracción animal o humana, estacionado o en movimiento."
  },
  "D3": {
    valor: 877800,
    descripcion: "Transitar en sentido contrario al estipulado para la vía, calzada o carril."
  },
  "D4": {
    valor: 877800,
    descripcion: "No detenerse ante una luz roja o amarilla de semáforo, una señal de 'PARE' o un semáforo intermitente en rojo."
  },
  "D5": {
    valor: 877800,
    descripcion: "Conducir un vehículo sobre aceras, plazas, vías peatonales, separadores, bermas, demarcaciones de canalización, zonas verdes o vías especiales para vehículos no motorizados."
  },
  "D8": {
    valor: 877800,
    descripcion: "Conducir un vehículo sin luces o sin los dispositivos luminosos de posición, direccionales o de freno, o con alguna de ellas dañada, en las horas o circunstancias en que lo exige este código."
  },
  "E4": {
    valor: 1316700,
    descripcion: "Transportar en el mismo vehículo y al mismo tiempo personas y sustancias peligrosas como explosivos, tóxicos, radiactivos, combustibles no autorizados, etc."
  },
  "F": {
    valor: 3950100,
    descripcion: "Conducir en estado de embriaguez, con grado 0 y segunda reincidencia."
  }
};

// Obtener los elementos del formulario
var codigoInput = document.getElementById("codigo");
var valorInput = document.getElementById("valor");
var descripcionInput = document.getElementById("descripcion");

// Función para actualizar el valor y la descripción según el código seleccionado
function actualizarValorDescripcion() {
  var codigo = codigoInput.value;
  if (codigo in codigos) {
    valorInput.value = codigos[codigo].valor;
    descripcionInput.value = codigos[codigo].descripcion;
  } else {
    valorInput.value = "";
    descripcionInput.value = "";
  }
}
// Obtener los elementos del formulario
var codigoInput = document.getElementById("codigo");
var valorInput = document.getElementById("valor");
var descripcionInput = document.getElementById("descripcion");

// Función para actualizar el valor y la descripción según el código seleccionado
function actualizarValorDescripcion() {
  var codigo = codigoInput.value;
  if (codigo in codigos) {
    valorInput.value = codigos[codigo].valor;
    descripcionInput.value = codigos[codigo].descripcion;
  } else {
    valorInput.value = "";
    descripcionInput.value = "";
  }
}

// Escuchar el evento de cambio en el input del código
codigoInput.addEventListener("change", actualizarValorDescripcion);
