package clases;

public class Main {
    public static void main(String[] args) {
        int edad = 16;

        try {
            verificarEdad(edad);
        } catch (EdadNoPermitidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void verificarEdad(int edad) throws EdadNoPermitidaException {
        if (edad < 18) {
            throw new EdadNoPermitidaException("No se permite el acceso a menores de 18 años.");
        }
        System.out.println("Acceso permitido.");
    }
}