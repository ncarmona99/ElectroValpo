/**
 *
 * @author Nicolás
 */
public class Main {
    public static void main(String[] args) {
        
        ListaProductos lista = new ListaProductos();
        
        Telefono iphone15 = new Telefono(11.5, "Iphone 15 Pro", 1300000);
        Telefono redmi = new Telefono(13, "Xiaomi Redmi note 10 Pro", 250000);
        Computador hp = new Computador("Intel core i5", "HP Victus", 650000);
        Computador mac = new Computador("Intel core i7", "Macbook Pro", 900000);
        Auriculares bose = new Auriculares(2.1, "Audifonos Bose 2.1", 120000);
        Auriculares sony = new Auriculares(7.1, "Audífonos Sony 7.1", 50000);
        
        lista.agregarProducto(iphone15);
        lista.agregarProducto(redmi);
        
        lista.mostrarLista();
        
        lista.agregarVenta(iphone15);
        lista.agregarVenta(redmi);
        
        lista.mostrarVenta();
    }
}
