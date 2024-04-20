public class Telefonos extends ArticulosElectronicos implements ObtenerPrecioYDescripcion{

    private int cantidadTarjetaSIM;
    private  String companiaTelefonica;


    public Telefonos(){}

    public Telefonos(String nombre, String modelo, float precioBase,int cantidadTarjetaSIM, String companiaTelefonica) {
        super(nombre, modelo, precioBase);
        this.cantidadTarjetaSIM = cantidadTarjetaSIM;
        this.companiaTelefonica = companiaTelefonica;
    }

    @Override
    public float obtenerPrecio() {
        return getPrecioBase();
    }

    @Override
    public void descripcion() {
        System.out.println("Nombre: " + getNombre() + "\nModelo: " + getModelo() + "\nPrecio: " + obtenerPrecio() + "\nCantidad de tarjeta SIM: " + cantidadTarjetaSIM+ "\nCompañia telefonica: " + companiaTelefonica);
    }

    public int getCantidadTarjetaSIM() {
        return cantidadTarjetaSIM;
    }

    public void setCantidadTarjetaSIM(int cantidadTarjetaSIM) {
        this.cantidadTarjetaSIM = cantidadTarjetaSIM;
    }

    public String getCompaniaTelefonica() {
        return companiaTelefonica;
    }

    public void setCompaniaTelefonica(String companiaTelefonica) {
        this.companiaTelefonica = companiaTelefonica;
    }
}
