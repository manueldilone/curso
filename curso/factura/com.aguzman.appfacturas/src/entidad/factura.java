package entidad;


import java.util.Date;

public class factura {


    private cliente cliente;
    private itemFactura[] items;
    private int folio;
    private String descripcion;
    private Date fecha;
    private static final int max_item=12;
    private static int ultimocodigo;
    private static int posicionfactura;
    public factura(String descripcion, cliente cliente){
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items = new itemFactura[max_item];
        this.folio = ++ultimocodigo;
        this.fecha = new Date();

    }


    public itemFactura[] getItems() {
        return items;
    }

    public void setItems(itemFactura[] items) {
        this.items = items;
    }


    public void setaddItemFactura(itemFactura item){
        if(posicionfactura <max_item){
            this.items[posicionfactura++]=item;
        }


    }




    public entidad.cliente getCliente() {
        return cliente;
    }

    public void setCliente(entidad.cliente cliente) {
        this.cliente = cliente;
    }





    public int getFolio() {
        return folio;
    }

    public void setFolio(int folio) {
        this.folio = folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }


   public float calcularTotal()
   {
        float resultado = 0.0f;
        for(itemFactura items : this.items ){
        if(items ==null){
            break;
        }
        resultado += items.calcularImporte();

    }



    return resultado;

   }


   public String verDetalles()
   {
        StringBuilder sb = new StringBuilder();
        sb.append("Factura no.:").append(this.folio).append("\n");
        sb.append("Cliente : ").append(cliente.getNombre()).append("\n");
        sb.append("NIF :").append(this.cliente.getNif()).append("\n");







       return sb.toString();
   }





}




