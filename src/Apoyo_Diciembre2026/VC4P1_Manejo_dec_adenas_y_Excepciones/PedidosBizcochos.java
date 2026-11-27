package Apoyo_Diciembre2026.VC4P1_Manejo_dec_adenas_y_Excepciones;

public class PedidosBizcochos {
   public String procesarPedido (String texto) {
       try {
           // Intentar convertir el texto a número entero usando try
           int cantidad = Integer.parseInt(texto);

           // Si el número es menor o igual a cero, lanzar una excepción y devolver "Cantidad incorrecta".
           if (cantidad <= 0) {
               throw new IllegalArgumentException("Cantidad incorrecta");
           }

           // Si el número es mayor a 24, lanzar una excepción y devolver "Pedido demasiado grande".
           if (cantidad > 24) {
               throw new IllegalArgumentException("Pedido demasiado grande");
           }

           // Si todo es correcto, devolver "Pedido registrado: X bizcochos".
           return "Pedido registrado" + cantidad + " bizcochos";

           // Si el texto no representa un número válido, capturar la excepción y devolver "Dato invalido".
       } catch (NumberFormatException e) {
           return "Dato invalido";

       } catch (IllegalArgumentException e) {
           return e.getMessage();
       }
   }
}