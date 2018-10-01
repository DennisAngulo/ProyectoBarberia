
package proyectobarberia;

public class Servicio {
    private float precio;
    private String nombre;

    public Servicio(float precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "Precio :" + precio + "/nNombre :" + nombre;
    }
    
    
}
