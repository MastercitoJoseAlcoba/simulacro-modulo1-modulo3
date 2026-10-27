### Pregunta 1 

Crea una jerarquía de clases para representar figuras geométricas. Debe haber una clase base llamada FiguraGeometrica y 
al menos dos clases derivadas llamadas Círculo y Rectángulo.
La clase base FiguraGeometrica debe contener los siguientes atributos y métodos.

### Clase FiguraGeometrica:
* Atributos: 
*            nombre (String) el nombre de la figura geometrica. 
* Métodos:
*            color (String) el color de la figura geometrica. 
*            calcularArea() un método sin implementación que será sobreescrito por las clases derivadas para calcular el área de cada figura.
Las clases derivadas Circulo y Rectangulo deben heredar de la clase FiguraGeometrica. y cada una debe tener atributos y métodos. Por ejemplo:

### Clase Circulo (derivada de FiguraGeometrica):
* Atributos adicionales:
*            radio (double) el radio del círculo.
* Métodos adicionales:
*            getRadio(): devuelve el radio del círculo.
*            calcularArea(): implementa el calculo del área especifico para un círculo.

### Clase Rectangulo (derivada de FiguraGeometrica):
* Atributos adicionales:
*            base (double) la base del rectángulo.
*            altura (double) la altura del rectángulo.
* Métodos adicionales:
*            getBase(): devuelve la base del rectángulo.
*            getAltura(): devuelve la altura del rectángulo.
*            calcularArea(): implementa el calculo del área especifico para un rectángulo.

### Conceptos importantes:
Código fuente y su significado:                  

* extends FiguraGeometrica  - Herencia     
* super(nombre, color)      - Herencia de atributos y métodos de la clase base
* this.base = base          - Inicializa un atributo del objeto actual
* @Override                 - Indica que se está sobrescribiendo un método de la clase base
* return base * altura      - Calcula y retorna el área del rectángulo
* super.toString()          - Reutiliza el método de la clase padre