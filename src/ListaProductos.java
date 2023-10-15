
import java.util.ArrayList;

/**
 *
 * @author Nicolás
 */
public class ListaProductos implements Iva{
    ArrayList<Producto> lista = new ArrayList<>();
    ArrayList<Producto> venta = new ArrayList<>();

    public ListaProductos() {
    }
    
    public void agregarProducto(Producto producto){
        lista.add(producto);
        System.out.println("Se ha agregado con exito el producto");
    }
    
    public void mostrarLista(){
        for (Producto producto : lista) {
            System.out.println(producto.getNombre());
        }
    }
    
    public void agregarVenta(Producto producto){
        
        venta.add(producto);
        System.out.println("Producto agregado al carro de compras");
    }
    
    public void mostrarVenta(){
        int total = 0;
        for (Producto producto : venta) {
            System.out.println(producto.toString());
            total += producto.getPrecio()+(producto.getPrecio()*iva);
        }
        System.out.println("El precio total de los productos agregados es de $" + total);
    }
}
