/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import tienda.entidades.Producto;
import tienda.persistencia.productoDAO;
import tienda.persistencia.DAO;

/**
 *
 * @author saras
 */
public class ProductoService {

    private productoDAO dao;

    public ProductoService() {
    }

    public ProductoService(productoDAO dao) {
        this.dao = new productoDAO();
    }

    public void listarProducto() throws Exception {

        try {

            ArrayList<Producto> productos = dao.listarProductos();
            System.out.println("hola");
            for (Producto producto : productos) {
                System.out.println(producto.getNombre());
            }

        } catch (Exception e) {
            throw e;
        }
    }

//    public void imprimirProducto() throws Exception {
//
//        try {
//
//            //Listamos los mascotas
//            ArrayList<Producto> productos = listarProducto();
//
//            //Imprimimos los mascotas
//            if (productos.isEmpty()) {
//                throw new Exception("No existen productos para imprimir");
//            } else {
//                for (Producto u : productos) {
//                    System.out.println(u.toString());
//                }
//            }
//        } catch (Exception e) {
//            throw e;
//        }
//    }

//    public void muestraProducto() throws Exception {
//        try {
//            List<Producto> productos = (List<Producto>) dao.obtenerProducto();
//
//            if (productos.isEmpty()) {
//                throw new Exception("NO EXISTEN PRODUCTOS");
//            } else {
//                System.out.println("\n*** LISTA DE PRODUCTOS ***");
//                System.out.printf("NOMBRE"); // FORMATO DE IMPRESIÓN
//                productos.forEach(aux
//                        -> {
//                    System.out.println(aux);
//                });
//                System.out.println();
//            }
//        } catch (Exception e) {
//            // e.printStackTrace();
//            throw e;
//        } 
//    }

}
