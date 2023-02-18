
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoFernandezCivantosSonia2223 miVehiculoFernandezCivantosSonia2223;
        int stockActual;
        
        miVehiculoFernandezCivantosSonia2223 = new VehiculoFernandezCivantosSonia2223("Seat",18000,100);
        operativaVehiculosFernandezCivantosSonia2223(miVehiculoFernandezCivantosSonia2223, 50); 
    }

    private static void operativaVehiculosFernandezCivantosSonia2223(VehiculoFernandezCivantosSonia2223 miVehiculoFernandezCivantosSonia2223, int cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoFernandezCivantosSonia2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoFernandezCivantosSonia2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoFernandezCivantosSonia2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

}
    
