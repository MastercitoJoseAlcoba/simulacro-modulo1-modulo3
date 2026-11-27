'use strict';

const modulos = [
  "Fundamentos de programación",
  "Programación orientada a objetos",
  "Lógica de programación avanzada",
  "Funcionalidades generales de programación",
  "Evaluación y repaso"
];

const recursos = [
  {"nombre":"Arrays invertidos","descripcion":"Recorrido inverso, índices, pares y temperaturas.","archivo":"Recordatorio_visual_interactivo_Array_Invertido_en_Java/Recordatorio_Array_Invertido.html","modulo":3,"tipo":"Recordatorio","temas":["Arrays"]},
  {"nombre":"Matrices","descripcion":"Filas, columnas, diagonales y bordes.","archivo":"Recordatorio_visual_interactivo_Matrices_en_Java/Recordatorio_Matrices_Java.html","modulo":3,"tipo":"Recordatorio","temas":["Matrices"]},
  {"nombre":"Punto silla","descripcion":"Mínimo de una fila y máximo de una columna.","archivo":"Recordatorio_visual_interactivo_Punto_Silla_en_Java/Recordatorio_Punto_Silla_Java.html","modulo":3,"tipo":"Recordatorio","temas":["Matrices"]},
  {"nombre":"Clases en Java","descripcion":"Atributos, constructores, getters y setters.","archivo":"Recordatorio_visual_interactivo_Clases_en_Java/Recordatorio_Clases_Java.html","modulo":2,"tipo":"Recordatorio","temas":["POO"]},
  {"nombre":"Pilas y colas","descripcion":"Stack, Queue, LIFO y FIFO.","archivo":"Recordatorio_visual_interactivo_Pilas_y_Colas_en_Java/Recordatorio_Pilas_y_Colas_Java.html","modulo":3,"tipo":"Recordatorio","temas":["Pilas","Colas"]},
  {"nombre":"Listas","descripcion":"LinkedList, ArrayList, Iterator y contains.","archivo":"Recordatorio_visual_interactivo_Listas_en_Java/Recordatorio_Listas_Java.html","modulo":3,"tipo":"Recordatorio","temas":["Listas"]},
  {"nombre":"Map y HashMap","descripcion":"Claves, valores, put, get y entrySet.","archivo":"Recordatorio_visual_interactivo_Map_HashMap_en_Java/Recordatorio_Map_HashMap_Java.html","modulo":3,"tipo":"Recordatorio","temas":["Mapas"]},
  {"nombre":"instanceof","descripcion":"Tipos y casting seguro.","archivo":"Recordatorio_visual_interactivo_Instanceof_en_Java/Recordatorio_Instanceof_Java.html","modulo":2,"tipo":"Recordatorio","temas":["POO"]},
  {"nombre":"Herencia y polimorfismo","descripcion":"extends, super y Override.","archivo":"Recordatorio_visual_interactivo_Herencia_Polimorfismo_en_Java/Recordatorio_Herencia_Polimorfismo_Java.html","modulo":2,"tipo":"Recordatorio","temas":["POO"]},
  {"nombre":"Clases abstractas e interfaces","descripcion":"abstract, interface e implements.","archivo":"Recordatorio_visual_interactivo_Clases_Abstractas_Interfaces_en_Java/Recordatorio_Clases_Abstractas_Interfaces_Java.html","modulo":4,"tipo":"Recordatorio","temas":["POO"]},
  {"nombre":"Filtrar palabras","descripcion":"ArrayList, for-each, contains y operador &&.","archivo":"ExamenSeptiembre2026_CodeRunners/Recordatorio_Filtrar_Palabras_Java.html","modulo":3,"tipo":"CodeRunner","temas":["Listas","Cadenas"]},
  {"nombre":"Lluvia acumulada","descripcion":"Matrices, suma de columnas y acumuladores.","archivo":"ExamenSeptiembre2026_CodeRunners/Recordatorio_Lluvia_Acumulada_Java.html","modulo":3,"tipo":"CodeRunner","temas":["Matrices"]},
  {"nombre":"Temperaturas — índice inverso","descripcion":"Fahrenheit y length - 1 - i.","archivo":"ExamenSeptiembre2026_CodeRunners/Recordatorio_Procesar_Temperaturas_Indice_Inverso_Java (1).html","modulo":3,"tipo":"CodeRunner","temas":["Arrays"]},
  {"nombre":"Excepciones","descripcion":"try-catch, vector[vector[1]] y null.","archivo":"ExamenSeptiembre2026_CodeRunners/Recordatorio_Excepciones_Java.html","modulo":4,"tipo":"CodeRunner","temas":["Excepciones"]},
  {"nombre":"Clase Producto","descripcion":"Constructores, encapsulamiento y validaciones.","archivo":"ExamenSeptiembre2026_CodeRunners/Recordatorio_Producto_Java.html","modulo":2,"tipo":"CodeRunner","temas":["POO"]},
  {"nombre":"Temperaturas — recorrido descendente","descripcion":"Conversión con i-- y posicion++ .","archivo":"VC2P6_Array_ProcesarTemperaturas/Recordatorio_Procesar_Temperaturas_Java.html","modulo":3,"tipo":"CodeRunner","temas":["Arrays"]},
  {"nombre":"CodeRunner FEIP","descripcion":"9 ejercicios prácticos de programación.","archivo":"Feip_CodeRunner/FEIP_CodeRunner_Interactivo.html","modulo":5,"tipo":"CodeRunner","temas":["Arrays","Matrices","POO"]},
  {"nombre":"Teórico FEIP","descripcion":"30 preguntas teóricas de Java.","archivo":"Feip_Teorico/FEIP_Teoricos_Interactivo.html","modulo":5,"tipo":"Simulador","temas":[]},
  {"nombre":"Devolución teórica — Parte 1","descripcion":"Preguntas 1 a 10.","archivo":"Recordatorio_Simulador_FEIP_visual_interactivo_en_Java/Devolucion_Teorica_FEIP_Parte_1.html","modulo":5,"tipo":"Simulador","temas":[]},
  {"nombre":"Devolución teórica — Parte 2","descripcion":"Preguntas 11 a 20.","archivo":"Recordatorio_Simulador_FEIP_visual_interactivo_en_Java/Devolucion_Teorica_FEIP_Parte_2.html","modulo":5,"tipo":"Simulador","temas":[]},
  {"nombre":"Parcial unificado — Parte 1","descripcion":"Preguntas 1 a 20.","archivo":"Recordatorio_Simulador_FEIP_visual_interactivo_en_Java/Parcial_Unificado_FEIP_Parte_1.html","modulo":5,"tipo":"Simulador","temas":[]},
  {"nombre":"Parcial unificado — Parte 2","descripcion":"Preguntas 21 a 40.","archivo":"Recordatorio_Simulador_FEIP_visual_interactivo_en_Java/Parcial_Unificado_FEIP_Parte_2.html","modulo":5,"tipo":"Simulador","temas":[]},
  {"nombre":"Simulador teórico completo","descripcion":"Examen interactivo de 20 preguntas.","archivo":"Recordatorio_Simulador_Teorico_FEIP_visual_interactivo_en_Java/Simulador_Teorico_FEIP_Java_Corregido.html","modulo":5,"tipo":"Simulador","temas":[]},
  {"nombre":"Fibonacci cuadrado","descripcion":"Practicá la sucesión de Fibonacci con bucles y un recorrido visual.","archivo":"Apoyo_Diciembre2026/VC3_ArraysYBucles/fibonacci_cuadrado.html","modulo":3,"tipo":"CodeRunner","temas":["Arrays","Bucles"]},
  {"nombre":"Histograma","descripcion":"Representá cada valor del array con una fila de numerales.","archivo":"Apoyo_Diciembre2026/VC3_ArraysYBucles/histograma.html","modulo":3,"tipo":"CodeRunner","temas":["Arrays","Bucles"]},
  {"nombre":"Triángulo","descripcion":"Construí el patrón con bucles anidados.","archivo":"Apoyo_Diciembre2026/VC3_ArraysYBucles/triangulo.html","modulo":1,"tipo":"CodeRunner","temas":["Bucles"]},
  {"nombre":"Último impar","descripcion":"Buscá el último número impar de un array.","archivo":"Apoyo_Diciembre2026/VC3_ArraysYBucles/ultimo_impar.html","modulo":3,"tipo":"CodeRunner","temas":["Arrays","Bucles"]},
  {"nombre":"Ocho ejercicios de arrays invertidos","descripcion":"Inversión, duplicación, números pares y capicúas.","archivo":"Arrays_ArreglosOVectores/Recordatorio_8_Arrays_Invertidos_FEIP.html","modulo":3,"tipo":"Recordatorio","temas":["Arrays"]},
  {"nombre":"Manejo de excepciones con try-catch","descripcion":"Identificá, capturá y manejá excepciones en Java.","archivo":"Recordatorio_visual_interactivo_Try_Catch_en_Java/Recordatorio_Try_Catch_Java.html","modulo":4,"tipo":"Recordatorio","temas":["Excepciones"]},
  {"nombre":"Validar vocales","descripcion":"Recorré cadenas y comprobá sus caracteres.","archivo":"Recordatorio_visual_interactivo_Validar_Vocales_en_Java/Recordatorio_Validar_Vocales_Java.html","modulo":1,"tipo":"Recordatorio","temas":["Cadenas"]},
  {"nombre":"Carga de patente","descripcion":"Seguí el flujo de carga y validación de una patente.","archivo":"VC4_ExepcionesYCadenas/CargaPatente.png","modulo":4,"tipo":"Diagrama de flujo","temas":["Cadenas","Excepciones"]},
  {"nombre":"Control de acceso","descripcion":"Revisá las decisiones del algoritmo de acceso.","archivo":"VC4_ExepcionesYCadenas/ControlAcceso.png","modulo":4,"tipo":"Diagrama de flujo","temas":["Cadenas","Excepciones"]},
  {"nombre":"Pedidos de bizcochos","descripcion":"Seguí las decisiones del algoritmo de pedidos.","archivo":"VC4_ExepcionesYCadenas/PedidosBizcochosFlujo.png","modulo":4,"tipo":"Diagrama de flujo","temas":["Cadenas","Excepciones"]}
];
