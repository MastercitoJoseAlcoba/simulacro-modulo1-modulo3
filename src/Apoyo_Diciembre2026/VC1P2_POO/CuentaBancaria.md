### Apoyo Diciembre 2026 VC1P2 POO

Diseñar una clase llamada "CuentaBancaria" que aplique el principio de encapsulamiento.

### Atributos privados
* saldo (double)

### Constructores públicos
* Un constructor sin parámetros que inicialice el saldo en 0.
* Un constructor que reciba un double "saldoInicial" y lo asigne al saldo (asume que el valor ingresado es mayor o igual a 0).

### Métodos públicos
* getSaldo(): devuelve el valor actual del saldo (double).
* depositar(double monto): si el monto es mayor que 0.0, lo suma al saldo actual. Si es menor o igual a 0, el saldo no se modifica).
* retirar(double monto): si el monto es mayor que 0.0 y menor o igual al saldo actual, lo resta del saldo. De lo contrario, no realiza ningun cambio).