public class Producto {
    private  String nombre;
    private double precio;
    private int cantidadEnStock;


    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio>0) {
            this.precio = precio;
        }else {
            System.out.println("Su numero es invalido, intente de nuevo");
        }
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        if(cantidadEnStock>0) {
            this.cantidadEnStock=cantidadEnStock;
        }else {

            System.out.println("Su numero es invalido, intente de nuevo");

        }
    }

    public void mostrarProducto() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio);
        System.out.println("Cantidad en el stock: "+cantidadEnStock);
    }
}