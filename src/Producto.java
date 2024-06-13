public class Producto {
    private int id;
    private String codigo;
    private String nombre;
    private String marca;
    private double precio;

    public Producto(int id, String nombre, String marca, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.codigo = generarCodigo();
    }

    private String generarCodigo() {
        String nombreParte = nombre.length() >= 3 ? nombre.substring(0, 3) : nombre;
        String marcaParte = marca.length() >= 2 ? marca.substring(0, 2) : marca;
        int randomNum = (int)(Math.random() * 900) + 100;
        return nombreParte + marcaParte + randomNum;
    }

    public int getId() {
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}
