import entidad.cliente;
import entidad.factura;
import entidad.producto;
import entidad.itemFactura;

import java.util.Scanner;

public class EjemploFactura {

    public static void main(String[] args) {

        producto _producto ;
        cliente _cliente = new cliente();



        _cliente.setNif("01800595512");
        _cliente.setNombre("Tulio Mercedes");



        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese una Descripcion de la Factura :");
        String desc = scan.nextLine();

        factura _factura = new factura(desc,_cliente);

        String nombre;
        Double precio;
        int cantidad;
        for(int i=0; i<2; i++){

            _producto = new producto();
            System.out.println("Ingrese producto numero: "+ _producto.getCodigo());
            nombre = scan.nextLine();
            _producto.setNombre(nombre);

            System.out.println("Ingrese Precio del producto numero: "+ _producto.getCodigo());
            precio = scan.nextDouble();
            _producto.setPrecio(precio);

            System.out.println("Ingrese Cantidad");
            cantidad=scan.nextInt();




            itemFactura _itemFactura=new itemFactura(cantidad,_producto);
            _factura.setaddItemFactura(_itemFactura);


            System.out.println();
            scan.nextLine();

        }

        System.out.println(_factura.verDetalles());




    }
}
