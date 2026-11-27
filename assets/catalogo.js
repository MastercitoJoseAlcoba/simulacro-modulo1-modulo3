'use strict';

const modulos = [
  "Fundamentos de programación",
  "Programación orientada a objetos",
  "Lógica de programación avanzada",
  "Funcionalidades generales de programación",
  "Evaluación y repaso"
];

const recursos = [
  {
    "nombre": "Arrays invertidos",
    "descripcion": "Recorrido inverso, índices, pares y temperaturas.",
    "archivo": "Recordatorio_visual_interactivo_Array_Invertido_en_Java/Recordatorio_Array_Invertido.html",
    "modulo": 3,
    "tipo": "Recordatorio",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Matrices",
    "descripcion": "Filas, columnas, diagonales y bordes.",
    "archivo": "Recordatorio_visual_interactivo_Matrices_en_Java/Recordatorio_Matrices_Java.html",
    "modulo": 3,
    "tipo": "Recordatorio",
    "temas": [
      "Matrices"
    ]
  },
  {
    "nombre": "Punto silla",
    "descripcion": "Mínimo de una fila y máximo de una columna.",
    "archivo": "Recordatorio_visual_interactivo_Punto_Silla_en_Java/Recordatorio_Punto_Silla_Java.html",
    "modulo": 3,
    "tipo": "Recordatorio",
    "temas": [
      "Matrices"
    ]
  },
  {
    "nombre": "Clases en Java",
    "descripcion": "Atributos, constructores, getters y setters.",
    "archivo": "Recordatorio_visual_interactivo_Clases_en_Java/Recordatorio_Clases_Java.html",
    "modulo": 2,
    "tipo": "Recordatorio",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Pilas y colas",
    "descripcion": "Stack, Queue, LIFO y FIFO.",
    "archivo": "Recordatorio_visual_interactivo_Pilas_y_Colas_en_Java/Recordatorio_Pilas_y_Colas_Java.html",
    "modulo": 3,
    "tipo": "Recordatorio",
    "temas": [
      "Pilas",
      "Colas"
    ]
  },
  {
    "nombre": "Listas",
    "descripcion": "LinkedList, ArrayList, Iterator y contains.",
    "archivo": "Recordatorio_visual_interactivo_Listas_en_Java/Recordatorio_Listas_Java.html",
    "modulo": 3,
    "tipo": "Recordatorio",
    "temas": [
      "Listas"
    ]
  },
  {
    "nombre": "Map y HashMap",
    "descripcion": "Claves, valores, put, get y entrySet.",
    "archivo": "Recordatorio_visual_interactivo_Map_HashMap_en_Java/Recordatorio_Map_HashMap_Java.html",
    "modulo": 3,
    "tipo": "Recordatorio",
    "temas": [
      "Mapas"
    ]
  },
  {
    "nombre": "instanceof",
    "descripcion": "Tipos y casting seguro.",
    "archivo": "Recordatorio_visual_interactivo_Instanceof_en_Java/Recordatorio_Instanceof_Java.html",
    "modulo": 2,
    "tipo": "Recordatorio",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Herencia y polimorfismo",
    "descripcion": "extends, super y Override.",
    "archivo": "Recordatorio_visual_interactivo_Herencia_Polimorfismo_en_Java/Recordatorio_Herencia_Polimorfismo_Java.html",
    "modulo": 2,
    "tipo": "Recordatorio",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Clases abstractas e interfaces",
    "descripcion": "abstract, interface e implements.",
    "archivo": "Recordatorio_visual_interactivo_Clases_Abstractas_Interfaces_en_Java/Recordatorio_Clases_Abstractas_Interfaces_Java.html",
    "modulo": 4,
    "tipo": "Recordatorio",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Filtrar palabras",
    "descripcion": "ArrayList, for-each, contains y operador &&.",
    "archivo": "ExamenSeptiembre2026_CodeRunners/Recordatorio_Filtrar_Palabras_Java.html",
    "modulo": 3,
    "tipo": "CodeRunner",
    "temas": [
      "Listas",
      "Cadenas"
    ]
  },
  {
    "nombre": "Lluvia acumulada",
    "descripcion": "Matrices, suma de columnas y acumuladores.",
    "archivo": "ExamenSeptiembre2026_CodeRunners/Recordatorio_Lluvia_Acumulada_Java.html",
    "modulo": 3,
    "tipo": "CodeRunner",
    "temas": [
      "Matrices"
    ]
  },
  {
    "nombre": "Temperaturas — índice inverso",
    "descripcion": "Fahrenheit y length - 1 - i.",
    "archivo": "ExamenSeptiembre2026_CodeRunners/Recordatorio_Procesar_Temperaturas_Indice_Inverso_Java (1).html",
    "modulo": 3,
    "tipo": "CodeRunner",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Excepciones",
    "descripcion": "try-catch, vector[vector[1]] y null.",
    "archivo": "ExamenSeptiembre2026_CodeRunners/Recordatorio_Excepciones_Java.html",
    "modulo": 4,
    "tipo": "CodeRunner",
    "temas": [
      "Excepciones"
    ]
  },
  {
    "nombre": "Clase Producto",
    "descripcion": "Constructores, encapsulamiento y validaciones.",
    "archivo": "ExamenSeptiembre2026_CodeRunners/Recordatorio_Producto_Java.html",
    "modulo": 2,
    "tipo": "CodeRunner",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Temperaturas — recorrido descendente",
    "descripcion": "Conversión con i-- y posicion++ .",
    "archivo": "VC2P6_Array_ProcesarTemperaturas/Recordatorio_Procesar_Temperaturas_Java.html",
    "modulo": 3,
    "tipo": "CodeRunner",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "CodeRunner FEIP",
    "descripcion": "9 ejercicios prácticos de programación.",
    "archivo": "Feip_CodeRunner/FEIP_CodeRunner_Interactivo.html",
    "modulo": 5,
    "tipo": "CodeRunner",
    "temas": [
      "Arrays",
      "Matrices",
      "POO"
    ]
  },
  {
    "nombre": "Teórico FEIP",
    "descripcion": "30 preguntas teóricas de Java.",
    "archivo": "Feip_Teorico/FEIP_Teoricos_Interactivo.html",
    "modulo": 5,
    "tipo": "Simulador",
    "temas": []
  },
  {
    "nombre": "Devolución teórica — Parte 1",
    "descripcion": "Preguntas 1 a 10.",
    "archivo": "Recordatorio_Simulador_FEIP_visual_interactivo_en_Java/Devolucion_Teorica_FEIP_Parte_1.html",
    "modulo": 5,
    "tipo": "Simulador",
    "temas": []
  },
  {
    "nombre": "Devolución teórica — Parte 2",
    "descripcion": "Preguntas 11 a 20.",
    "archivo": "Recordatorio_Simulador_FEIP_visual_interactivo_en_Java/Devolucion_Teorica_FEIP_Parte_2.html",
    "modulo": 5,
    "tipo": "Simulador",
    "temas": []
  },
  {
    "nombre": "Parcial unificado — Parte 1",
    "descripcion": "Preguntas 1 a 20.",
    "archivo": "Recordatorio_Simulador_FEIP_visual_interactivo_en_Java/Parcial_Unificado_FEIP_Parte_1.html",
    "modulo": 5,
    "tipo": "Simulador",
    "temas": []
  },
  {
    "nombre": "Parcial unificado — Parte 2",
    "descripcion": "Preguntas 21 a 40.",
    "archivo": "Recordatorio_Simulador_FEIP_visual_interactivo_en_Java/Parcial_Unificado_FEIP_Parte_2.html",
    "modulo": 5,
    "tipo": "Simulador",
    "temas": []
  },
  {
    "nombre": "Simulador teórico completo",
    "descripcion": "Examen interactivo de 20 preguntas.",
    "archivo": "Recordatorio_Simulador_Teorico_FEIP_visual_interactivo_en_Java/Simulador_Teorico_FEIP_Java_Corregido.html",
    "modulo": 5,
    "tipo": "Simulador",
    "temas": []
  },
  {
    "nombre": "Fibonacci cuadrado",
    "descripcion": "Practicá la sucesión de Fibonacci con bucles y un recorrido visual.",
    "archivo": "Apoyo_Diciembre2026/VC3_ArraysYBucles/fibonacci_cuadrado.html",
    "modulo": 3,
    "tipo": "CodeRunner",
    "temas": [
      "Arrays",
      "Bucles"
    ]
  },
  {
    "nombre": "Histograma",
    "descripcion": "Representá cada valor del array con una fila de numerales.",
    "archivo": "Apoyo_Diciembre2026/VC3_ArraysYBucles/histograma.html",
    "modulo": 3,
    "tipo": "CodeRunner",
    "temas": [
      "Arrays",
      "Bucles"
    ]
  },
  {
    "nombre": "Triángulo",
    "descripcion": "Construí el patrón con bucles anidados.",
    "archivo": "Apoyo_Diciembre2026/VC3_ArraysYBucles/triangulo.html",
    "modulo": 1,
    "tipo": "CodeRunner",
    "temas": [
      "Bucles"
    ]
  },
  {
    "nombre": "Último impar",
    "descripcion": "Buscá el último número impar de un array.",
    "archivo": "Apoyo_Diciembre2026/VC3_ArraysYBucles/ultimo_impar.html",
    "modulo": 3,
    "tipo": "CodeRunner",
    "temas": [
      "Arrays",
      "Bucles"
    ]
  },
  {
    "nombre": "Ocho ejercicios de arrays invertidos",
    "descripcion": "Inversión, duplicación, números pares y capicúas.",
    "archivo": "Arrays_ArreglosOVectores/Recordatorio_8_Arrays_Invertidos_FEIP.html",
    "modulo": 3,
    "tipo": "Recordatorio",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Manejo de excepciones con try-catch",
    "descripcion": "Identificá, capturá y manejá excepciones en Java.",
    "archivo": "Recordatorio_visual_interactivo_Try_Catch_en_Java/Recordatorio_Try_Catch_Java.html",
    "modulo": 4,
    "tipo": "Recordatorio",
    "temas": [
      "Excepciones"
    ]
  },
  {
    "nombre": "Validar vocales",
    "descripcion": "Recorré cadenas y comprobá sus caracteres.",
    "archivo": "Recordatorio_visual_interactivo_Validar_Vocales_en_Java/Recordatorio_Validar_Vocales_Java.html",
    "modulo": 1,
    "tipo": "Recordatorio",
    "temas": [
      "Cadenas"
    ]
  },
  {
    "nombre": "Carga de patente",
    "descripcion": "Seguí el flujo de carga y validación de una patente.",
    "archivo": "VC4P1_Manejo_de_cadenas_y_Excepciones/CargaPatente.png",
    "modulo": 4,
    "tipo": "Diagrama de flujo",
    "temas": [
      "Cadenas",
      "Excepciones"
    ],
    "claveProgreso": "VC4_ExepcionesYCadenas/CargaPatente.png"
  },
  {
    "nombre": "Control de acceso",
    "descripcion": "Revisá las decisiones del algoritmo de acceso.",
    "archivo": "VC4P1_Manejo_de_cadenas_y_Excepciones/ControlAcceso.png",
    "modulo": 4,
    "tipo": "Diagrama de flujo",
    "temas": [
      "Cadenas",
      "Excepciones"
    ],
    "claveProgreso": "VC4_ExepcionesYCadenas/ControlAcceso.png"
  },
  {
    "nombre": "Pedidos de bizcochos",
    "descripcion": "Seguí las decisiones del algoritmo de pedidos.",
    "archivo": "VC4P1_Manejo_de_cadenas_y_Excepciones/PedidosBizcochosFlujo.png",
    "modulo": 4,
    "tipo": "Diagrama de flujo",
    "temas": [
      "Cadenas",
      "Excepciones"
    ],
    "claveProgreso": "VC4_ExepcionesYCadenas/PedidosBizcochosFlujo.png"
  },
  {
    "nombre": "Ej01 invertir Array",
    "descripcion": "Código Java · Arrays Arreglos OVectores",
    "archivo": "Arrays_ArreglosOVectores/Ej01_invertirArray.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Ej02 duplicar Invertido",
    "descripcion": "Código Java · Arrays Arreglos OVectores",
    "archivo": "Arrays_ArreglosOVectores/Ej02_duplicarInvertido.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Ej03 ultimo Par",
    "descripcion": "Código Java · Arrays Arreglos OVectores",
    "archivo": "Arrays_ArreglosOVectores/Ej03_ultimoPar.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Ej04 invertir Duplicar Pares",
    "descripcion": "Código Java · Arrays Arreglos OVectores",
    "archivo": "Arrays_ArreglosOVectores/Ej04_invertirDuplicarPares.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Ej05 Procesar Temperaturas",
    "descripcion": "Código Java · Arrays Arreglos OVectores",
    "archivo": "Arrays_ArreglosOVectores/Ej05_ProcesarTemperaturas.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Ej06 buscar Ultimo Divisible",
    "descripcion": "Código Java · Arrays Arreglos OVectores",
    "archivo": "Arrays_ArreglosOVectores/Ej06_buscarUltimoDivisible.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Ej07 obtener Pares Invertidos",
    "descripcion": "Código Java · Arrays Arreglos OVectores",
    "archivo": "Arrays_ArreglosOVectores/Ej07_obtenerParesInvertidos.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Ej08 verificar Si Un Array Es Capicua",
    "descripcion": "Código Java · Arrays Arreglos OVectores",
    "archivo": "Arrays_ArreglosOVectores/Ej08_verificarSiUnArrayEsCapicua.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Soluciones arrays invertidos",
    "descripcion": "Enunciado / apuntes · Arrays Arreglos OVectores",
    "archivo": "Arrays_ArreglosOVectores/Soluciones_arrays_invertidos.md",
    "modulo": 3,
    "tipo": "Enunciado / apuntes",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Calcular Promedio",
    "descripcion": "Código Java · Feip Code Runner",
    "archivo": "Feip_CodeRunner/CalcularPromedio.java",
    "modulo": 5,
    "tipo": "Código Java",
    "temas": []
  },
  {
    "nombre": "Empleado",
    "descripcion": "Código Java · Feip Code Runner",
    "archivo": "Feip_CodeRunner/Empleado.java",
    "modulo": 5,
    "tipo": "Código Java",
    "temas": []
  },
  {
    "nombre": "FEIP Code Runner",
    "descripcion": "Enunciado / apuntes · Feip Code Runner",
    "archivo": "Feip_CodeRunner/FEIP_CodeRunner.md",
    "modulo": 5,
    "tipo": "Enunciado / apuntes",
    "temas": []
  },
  {
    "nombre": "Libro",
    "descripcion": "Código Java · Feip Code Runner",
    "archivo": "Feip_CodeRunner/Libro.java",
    "modulo": 5,
    "tipo": "Código Java",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Matriz Mostrar",
    "descripcion": "Código Java · Feip Code Runner",
    "archivo": "Feip_CodeRunner/MatrizMostrar.java",
    "modulo": 5,
    "tipo": "Código Java",
    "temas": [
      "Matrices"
    ]
  },
  {
    "nombre": "Mostrar",
    "descripcion": "Código Java · Mostrar Code Runner Evaluacion Feip",
    "archivo": "Feip_CodeRunner/MostrarCodeRunnerEvaluacionFeip/Mostrar.java",
    "modulo": 5,
    "tipo": "Código Java",
    "temas": []
  },
  {
    "nombre": "Operaciones Con Array",
    "descripcion": "Código Java · Feip Code Runner",
    "archivo": "Feip_CodeRunner/OperacionesConArray.java",
    "modulo": 5,
    "tipo": "Código Java",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Operaciones Con Matrices",
    "descripcion": "Código Java · Feip Code Runner",
    "archivo": "Feip_CodeRunner/OperacionesConMatrices.java",
    "modulo": 5,
    "tipo": "Código Java",
    "temas": [
      "Matrices"
    ]
  },
  {
    "nombre": "Producto",
    "descripcion": "Código Java · Feip Code Runner",
    "archivo": "Feip_CodeRunner/Producto.java",
    "modulo": 5,
    "tipo": "Código Java",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Rectangulo",
    "descripcion": "Código Java · Feip Code Runner",
    "archivo": "Feip_CodeRunner/Rectangulo.java",
    "modulo": 5,
    "tipo": "Código Java",
    "temas": []
  },
  {
    "nombre": "FEIP Teoricos",
    "descripcion": "Enunciado / apuntes · Feip Teorico",
    "archivo": "Feip_Teorico/FEIP_Teoricos.md",
    "modulo": 5,
    "tipo": "Enunciado / apuntes",
    "temas": []
  },
  {
    "nombre": "Ejercicio Clase Pelicula",
    "descripcion": "Enunciado / apuntes · VC1P10 POO",
    "archivo": "VC1P10_POO/Ejercicio_Clase_Pelicula.md",
    "modulo": 2,
    "tipo": "Enunciado / apuntes",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Main — VC1P10 POO",
    "descripcion": "Código Java · VC1P10 POO",
    "archivo": "VC1P10_POO/Main.java",
    "modulo": 2,
    "tipo": "Código Java",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Pelicula",
    "descripcion": "Código Java · VC1P10 POO",
    "archivo": "VC1P10_POO/Pelicula.java",
    "modulo": 2,
    "tipo": "Código Java",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Main — VC1P1 POO",
    "descripcion": "Código Java · VC1P1 POO",
    "archivo": "VC1P1_POO/Main.java",
    "modulo": 2,
    "tipo": "Código Java",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Persona",
    "descripcion": "Código Java · VC1P1 POO",
    "archivo": "VC1P1_POO/Persona.java",
    "modulo": 2,
    "tipo": "Código Java",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Persona",
    "descripcion": "Enunciado / apuntes · VC1P1 POO",
    "archivo": "VC1P1_POO/Persona.md",
    "modulo": 2,
    "tipo": "Enunciado / apuntes",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Cuenta Bancaria",
    "descripcion": "Código Java · VC1P2 POO",
    "archivo": "VC1P2_POO/CuentaBancaria.java",
    "modulo": 2,
    "tipo": "Código Java",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Cuenta Bancaria",
    "descripcion": "Enunciado / apuntes · VC1P2 POO",
    "archivo": "VC1P2_POO/CuentaBancaria.md",
    "modulo": 2,
    "tipo": "Enunciado / apuntes",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Main — VC1P2 POO",
    "descripcion": "Código Java · VC1P2 POO",
    "archivo": "VC1P2_POO/Main.java",
    "modulo": 2,
    "tipo": "Código Java",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Estudiante",
    "descripcion": "Código Java · VC1P3 POO",
    "archivo": "VC1P3_POO/Estudiante.java",
    "modulo": 2,
    "tipo": "Código Java",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Estudiante",
    "descripcion": "Enunciado / apuntes · VC1P3 POO",
    "archivo": "VC1P3_POO/Estudiante.md",
    "modulo": 2,
    "tipo": "Enunciado / apuntes",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Main — VC1P3 POO",
    "descripcion": "Código Java · VC1P3 POO",
    "archivo": "VC1P3_POO/Main.java",
    "modulo": 2,
    "tipo": "Código Java",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Calculadora Aerea",
    "descripcion": "Código Java · VC1P4 POO",
    "archivo": "VC1P4_POO/CalculadoraAerea.java",
    "modulo": 2,
    "tipo": "Código Java",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Vehiculo",
    "descripcion": "Código Java · VC1P5 POO",
    "archivo": "VC1P5_POO/Vehiculo.java",
    "modulo": 2,
    "tipo": "Código Java",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Animal",
    "descripcion": "Código Java · VC1P6 POO Herencia",
    "archivo": "VC1P6_POO_Herencia/Animal.java",
    "modulo": 2,
    "tipo": "Código Java",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Dibujable",
    "descripcion": "Código Java · VC1P7 POO Interfaz",
    "archivo": "VC1P7_POO_Interfaz/Dibujable.java",
    "modulo": 2,
    "tipo": "Código Java",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Main — VC1P7 POO Interfaz",
    "descripcion": "Código Java · VC1P7 POO Interfaz",
    "archivo": "VC1P7_POO_Interfaz/Main.java",
    "modulo": 2,
    "tipo": "Código Java",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Ejercicio Clase Producto",
    "descripcion": "Enunciado / apuntes · VC1P8 POO",
    "archivo": "VC1P8_POO/Ejercicio_Clase_Producto.md",
    "modulo": 2,
    "tipo": "Enunciado / apuntes",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Main — VC1P8 POO",
    "descripcion": "Código Java · VC1P8 POO",
    "archivo": "VC1P8_POO/Main.java",
    "modulo": 2,
    "tipo": "Código Java",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Producto",
    "descripcion": "Código Java · VC1P8 POO",
    "archivo": "VC1P8_POO/Producto.java",
    "modulo": 2,
    "tipo": "Código Java",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Ejercicio Clase Libro",
    "descripcion": "Enunciado / apuntes · VC1P9 POO",
    "archivo": "VC1P9_POO/Ejercicio_Clase_Libro.md",
    "modulo": 2,
    "tipo": "Enunciado / apuntes",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Libro",
    "descripcion": "Código Java · VC1P9 POO",
    "archivo": "VC1P9_POO/Libro.java",
    "modulo": 2,
    "tipo": "Código Java",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Main — VC1P9 POO",
    "descripcion": "Código Java · VC1P9 POO",
    "archivo": "VC1P9_POO/Main.java",
    "modulo": 2,
    "tipo": "Código Java",
    "temas": [
      "POO"
    ]
  },
  {
    "nombre": "Ej10 Sumar Filas Columnas Matriz",
    "descripcion": "Código Java · VC2P10 Sumar Filas Columnas Matriz",
    "archivo": "VC2P10_SumarFilasColumnasMatriz/Ej10_SumarFilasColumnasMatriz.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Matrices"
    ]
  },
  {
    "nombre": "Ej11 Calcular Promedio Pares",
    "descripcion": "Código Java · VC2P11 Calcular Promedio Pares",
    "archivo": "VC2P11_CalcularPromedioPares/Ej11_CalcularPromedioPares.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": []
  },
  {
    "nombre": "Array01",
    "descripcion": "Enunciado / apuntes · VC2P1 Array01 El Promedio",
    "archivo": "VC2P1_Array01_ElPromedio/Array01.md",
    "modulo": 3,
    "tipo": "Enunciado / apuntes",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Array01 Con Caster",
    "descripcion": "Código Java · VC2P1 Array01 El Promedio",
    "archivo": "VC2P1_Array01_ElPromedio/Array01_ConCaster.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Array01 Sin Caster",
    "descripcion": "Código Java · VC2P1 Array01 El Promedio",
    "archivo": "VC2P1_Array01_ElPromedio/Array01_SinCaster.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Array02",
    "descripcion": "Código Java · VC2P2 Array02 Mayor YMenor",
    "archivo": "VC2P2_Array02_MayorYMenor/Array02.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Array02",
    "descripcion": "Enunciado / apuntes · VC2P2 Array02 Mayor YMenor",
    "archivo": "VC2P2_Array02_MayorYMenor/Array02.md",
    "modulo": 3,
    "tipo": "Enunciado / apuntes",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Array Simple",
    "descripcion": "Enunciado / apuntes · VC2P3 Array Simple",
    "archivo": "VC2P3_ArraySimple/ArraySimple.md",
    "modulo": 3,
    "tipo": "Enunciado / apuntes",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Main — VC2P3 Array Simple",
    "descripcion": "Código Java · VC2P3 Array Simple",
    "archivo": "VC2P3_ArraySimple/Main.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Array Invertido",
    "descripcion": "Código Java · VC2P4 Array Invertido Ultimo Elemento",
    "archivo": "VC2P4_Array_Invertido_UltimoElemento/ArrayInvertido.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Array Invertido",
    "descripcion": "Enunciado / apuntes · VC2P4 Array Invertido Ultimo Elemento",
    "archivo": "VC2P4_Array_Invertido_UltimoElemento/ArrayInvertido.md",
    "modulo": 3,
    "tipo": "Enunciado / apuntes",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Array Invertido",
    "descripcion": "Código Java · VC2P5 Array Invertido",
    "archivo": "VC2P5_Array_Invertido/ArrayInvertido.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Array Invertido",
    "descripcion": "Enunciado / apuntes · VC2P5 Array Invertido",
    "archivo": "VC2P5_Array_Invertido/ArrayInvertido.md",
    "modulo": 3,
    "tipo": "Enunciado / apuntes",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Procesar Temp",
    "descripcion": "Código Java · VC2P6 Array Procesar Temperaturas",
    "archivo": "VC2P6_Array_ProcesarTemperaturas/ProcesarTemp.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Procesar Temperaturas",
    "descripcion": "Enunciado / apuntes · VC2P6 Array Procesar Temperaturas",
    "archivo": "VC2P6_Array_ProcesarTemperaturas/ProcesarTemperaturas.md",
    "modulo": 3,
    "tipo": "Enunciado / apuntes",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Array Invertido Pares",
    "descripcion": "Código Java · VC2P7 Array Invertido Duplicando Pares",
    "archivo": "VC2P7_Array_Invertido_DuplicandoPares/ArrayInvertidoPares.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Invertir un array y duplicar los numeros pares",
    "descripcion": "Enunciado / apuntes · VC2P7 Array Invertido Duplicando Pares",
    "archivo": "VC2P7_Array_Invertido_DuplicandoPares/Invertir un array y duplicar los numeros pares.md",
    "modulo": 3,
    "tipo": "Enunciado / apuntes",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Ej08 Sumar Elementos Array",
    "descripcion": "Código Java · VC2P8 Sumar Elementos Array",
    "archivo": "VC2P8_SumarElementosArray/Ej08_SumarElementosArray.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "Ej09 Encontrar Mayor Menor Array",
    "descripcion": "Código Java · VC2P9 Encontrar Mayor Menor Array",
    "archivo": "VC2P9_EncontrarMayorMenorArray/Ej09_EncontrarMayorMenorArray.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Arrays"
    ]
  },
  {
    "nombre": "00 punto silla tres casos",
    "descripcion": "Imagen · Material Complementario Ejemplos Donde Se Cumple Punto De Silla YDonde No Se Cumple",
    "archivo": "VC3P1_PuntoSillaEnUnaMatriz/Material_Complementario_EjemplosDondeSeCumplePuntoDeSilla_YDondeNoSeCumple/00_punto_silla_tres_casos.jpg",
    "modulo": 3,
    "tipo": "Imagen",
    "temas": [
      "Matrices"
    ]
  },
  {
    "nombre": "01 punto silla valido",
    "descripcion": "Imagen · Material Complementario Ejemplos Donde Se Cumple Punto De Silla YDonde No Se Cumple",
    "archivo": "VC3P1_PuntoSillaEnUnaMatriz/Material_Complementario_EjemplosDondeSeCumplePuntoDeSilla_YDondeNoSeCumple/01_punto_silla_valido.jpg",
    "modulo": 3,
    "tipo": "Imagen",
    "temas": [
      "Matrices"
    ]
  },
  {
    "nombre": "02 minimo repetido",
    "descripcion": "Imagen · Material Complementario Ejemplos Donde Se Cumple Punto De Silla YDonde No Se Cumple",
    "archivo": "VC3P1_PuntoSillaEnUnaMatriz/Material_Complementario_EjemplosDondeSeCumplePuntoDeSilla_YDondeNoSeCumple/02_minimo_repetido.jpg",
    "modulo": 3,
    "tipo": "Imagen",
    "temas": [
      "Matrices"
    ]
  },
  {
    "nombre": "03 maximo repetido",
    "descripcion": "Imagen · Material Complementario Ejemplos Donde Se Cumple Punto De Silla YDonde No Se Cumple",
    "archivo": "VC3P1_PuntoSillaEnUnaMatriz/Material_Complementario_EjemplosDondeSeCumplePuntoDeSilla_YDondeNoSeCumple/03_maximo_repetido.jpg",
    "modulo": 3,
    "tipo": "Imagen",
    "temas": [
      "Matrices"
    ]
  },
  {
    "nombre": "Pruebas Punto Silla",
    "descripcion": "Enunciado / apuntes · Material Complementario Ejemplos Donde Se Cumple Punto De Silla YDonde No Se Cumple",
    "archivo": "VC3P1_PuntoSillaEnUnaMatriz/Material_Complementario_EjemplosDondeSeCumplePuntoDeSilla_YDondeNoSeCumple/Pruebas_Punto_Silla.md",
    "modulo": 3,
    "tipo": "Enunciado / apuntes",
    "temas": [
      "Matrices"
    ]
  },
  {
    "nombre": "Ejercicio 1 Punto Silla",
    "descripcion": "Enunciado / apuntes · Punto Silla Estricto",
    "archivo": "VC3P1_PuntoSillaEnUnaMatriz/PuntoSillaEstricto/Ejercicio_1_Punto_Silla.md",
    "modulo": 3,
    "tipo": "Enunciado / apuntes",
    "temas": [
      "Matrices"
    ]
  },
  {
    "nombre": "Ejercicio 1 Punto Silla",
    "descripcion": "PDF · Punto Silla Estricto",
    "archivo": "VC3P1_PuntoSillaEnUnaMatriz/PuntoSillaEstricto/Ejercicio_1_Punto_Silla.pdf",
    "modulo": 3,
    "tipo": "PDF",
    "temas": [
      "Matrices"
    ]
  },
  {
    "nombre": "Punto Silla Matriz",
    "descripcion": "Código Java · Punto Silla Estricto",
    "archivo": "VC3P1_PuntoSillaEnUnaMatriz/PuntoSillaEstricto/PuntoSillaMatriz.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Matrices"
    ]
  },
  {
    "nombre": "img",
    "descripcion": "Imagen · Punto Silla Estricto",
    "archivo": "VC3P1_PuntoSillaEnUnaMatriz/PuntoSillaEstricto/img.png",
    "modulo": 3,
    "tipo": "Imagen",
    "temas": [
      "Matrices"
    ]
  },
  {
    "nombre": "Ejercicio2 Buscar Punto Silla",
    "descripcion": "Código Java · Punto Silla Matriz Nuevo",
    "archivo": "VC3P1_PuntoSillaEnUnaMatriz/PuntoSillaMatrizNuevo/Ejercicio2_BuscarPuntoSilla.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Matrices"
    ]
  },
  {
    "nombre": "Ej02 Rotacion Matriz",
    "descripcion": "Código Java · VC3P2 Rotacion Matriz",
    "archivo": "VC3P2_RotacionMatriz/Ej02_RotacionMatriz.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Matrices"
    ]
  },
  {
    "nombre": "Ej03 Suma Submatriz Maxima",
    "descripcion": "Código Java · VC3P3 Suma Submatriz Maxima",
    "archivo": "VC3P3_SumaSubmatrizMaxima/Ej03_SumaSubmatrizMaxima.java",
    "modulo": 3,
    "tipo": "Código Java",
    "temas": [
      "Matrices"
    ]
  },
  {
    "nombre": "Control Acceso",
    "descripcion": "Código Java · VC4P1 Manejo de cadenas y Excepciones",
    "archivo": "VC4P1_Manejo_de_cadenas_y_Excepciones/ControlAcceso.java",
    "modulo": 4,
    "tipo": "Código Java",
    "temas": [
      "Excepciones",
      "Cadenas"
    ]
  },
  {
    "nombre": "Main — VC4P1 Manejo de cadenas y Excepciones",
    "descripcion": "Código Java · VC4P1 Manejo de cadenas y Excepciones",
    "archivo": "VC4P1_Manejo_de_cadenas_y_Excepciones/Main.java",
    "modulo": 4,
    "tipo": "Código Java",
    "temas": [
      "Excepciones",
      "Cadenas"
    ]
  },
  {
    "nombre": "Manejo De Excepciones",
    "descripcion": "Enunciado / apuntes · VC4P1 Manejo de cadenas y Excepciones",
    "archivo": "VC4P1_Manejo_de_cadenas_y_Excepciones/ManejoDeExcepciones.md",
    "modulo": 4,
    "tipo": "Enunciado / apuntes",
    "temas": [
      "Excepciones",
      "Cadenas"
    ]
  },
  {
    "nombre": "Pedidos Bizcochos",
    "descripcion": "Código Java · VC4P1 Manejo de cadenas y Excepciones",
    "archivo": "VC4P1_Manejo_de_cadenas_y_Excepciones/PedidosBizcochos.java",
    "modulo": 4,
    "tipo": "Código Java",
    "temas": [
      "Excepciones",
      "Cadenas"
    ]
  }
];
