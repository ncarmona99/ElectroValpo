/**
 *
 * @author Nicolás
 */
public class Computador extends Producto{
    private String procesador;

    public Computador() {
    }

    public Computador(String procesador) {
        this.procesador = procesador;
    }

    public Computador(String procesador, String nombre, int precio) {
        super(nombre, precio);
        this.procesador = procesador;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Computador{" + "procesador=" + procesador + '}' + " " + super.toString();
    }

}
