/**
 *
 * @author Nicolás
 */
public class Telefono extends Producto{
    private double tamanoPantalla;

    public Telefono() {
    }

    public Telefono(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public Telefono(double tamanoPantalla, String nombre, int precio) {
        super(nombre, precio);
        this.tamanoPantalla = tamanoPantalla;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    @Override
    public String toString() {
        return "Telefono{" + "tamanoPantalla=" + tamanoPantalla + '}' + " " + super.toString();
    }
    
    
    
}
