public abstract class ArticulosElectronicos {
    private String nombre;
    private String modelo;
    private float precioBase;


    public ArticulosElectronicos(){}

    public ArticulosElectronicos(String nombre, String modelo, float precioBase) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public abstract float obtenerPrecio();

    public abstract void descripcion();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(float precioBase) {
        this.precioBase = precioBase;
    }
}
