package clases;
import java.util.scanner;

public class LimiteCompraExcedidoException extends Exception {
    public LimiteCompraExcedidoException(String mensaje) {
        super(mensaje);
        
        public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	System.out.print("Introduce el valor de la compra: ");
    		double precio = sc.nextInt();

            try {
                verificarPrecio(precio);
                
            } catch (LimiteCompraExcedidoException e) {
                System.out.println("Error: No se permite realizar compras superiores a 1000 euros";
            }
        }

        public static void verificarPrecio(int precio) throws LimiteCompraExcedidoException {
            if (precio > 1000) {
                throw new LimiteCompraExcedidoException("fallo de compra(límite excedido.");
            }
            System.out.println("Compra realizada con éxito.");
            
        }finally {
			sc.close();
		}
    }
    }
}