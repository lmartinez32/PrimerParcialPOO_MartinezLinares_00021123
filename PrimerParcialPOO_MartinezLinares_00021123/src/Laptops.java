public class Laptops extends ArticulosElectronicos implements  ObtenerPrecioYDescripcion{

    private float RAM;
    private String tarjetaGrafica;


    public Laptops(){}

    public Laptops(String nombre, String modelo, float precioBase, float RAM, String tarjetaGrafica) {
        super(nombre, modelo, precioBase);
        this.RAM = RAM;
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public float obtenerPrecio() {
        return getPrecioBase();
    }

    @Override
    public void descripcion() {
        System.out.println("Nombre: " + getNombre() + "\nModelo: " + getModelo() + "\nPrecio: " + obtenerPrecio() + "\nRAM: " + RAM+ "\nTarjeta grafica: " + tarjetaGrafica);
    }

    public float getRAM() {
        return RAM;
    }

    public void setRAM(float RAM) {
        this.RAM = RAM;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }
}
