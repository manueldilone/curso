package entidad;

public class itemFactura {


    private producto producto;
    private int cantidad;

public itemFactura(int cantidad, producto producto)
{
    this.cantidad=cantidad;
    this.producto=producto;
}


    public entidad.producto getProducto() {
        return producto;
    }

    public void setProducto(entidad.producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }






    public float calcularImporte()
    {

        float resultado = (float) (this.cantidad * this.producto.getPrecio());
        return resultado;
    }


}
