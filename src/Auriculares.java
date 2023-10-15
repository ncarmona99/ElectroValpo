/**
 *
 * @author Nicolás
 */
public class Auriculares extends Producto{
    private double canales;

    public Auriculares() {
    }

    public Auriculares(double canales) {
        this.canales = canales;
    }

    public Auriculares(double canales, String nombre, int precio) {
        super(nombre, precio);
        this.canales = canales;
    }

    public double getCanales() {
        return canales;
    }

    public void setCanales(double canales) {
        this.canales = canales;
    }

    @Override
    public String toString() {
        return "Auriculares{" + "canales=" + canales + '}' + " " + super.toString();
    }
    
    
}
