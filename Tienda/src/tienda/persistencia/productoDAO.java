/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.ArrayList;
import tienda.entidades.Producto;

/**
 *
 * @author saras
 */
public class productoDAO extends DAO {

    public ArrayList<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto";
            System.out.println("try");
            consultarBase(sql);

            ArrayList<Producto> productos = new ArrayList();

            while (resultado.next()) {

                Producto prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigoFabricante(resultado.getInt(4));
                productos.add(prod);
            }

            return productos;
        } catch (Exception e) {
            System.out.println("catch");
            System.out.println(e.getMessage());
            throw new Exception("Error de sistema");
        } finally {
            desconectarBase();
        }
    }

}
