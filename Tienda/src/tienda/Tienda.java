/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.servicios.ProductoService;

/**
 *
 * @author saras
 */
public class Tienda {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
 
        ProductoService productoService = new ProductoService();
        Producto producto = new Producto();
        
        Scanner read = new Scanner(System.in);
        boolean salida = true;
        do {
            System.out.println("Elija una opcion.");
            System.out.println("1) Lista el nombre de todos los productos que hay en la tabla producto");
            System.out.println("2) Lista los nombres y los precios de todos los productos de la tabla producto.");
            System.out.println("3) Listar aquellos productos que su precio esté entre 120 y 202.");
            System.out.println("4) Buscar y listar todos los Portátiles de la tabla producto.");
            System.out.println("5) Listar el nombre y el precio del producto más barato.");
            System.out.println("6) Ingresar un producto a la base de datos.");
            System.out.println("7) Ingresar un fabricante a la base de datos.");
            System.out.println("8) Editar un producto con datos a elección.");
            System.out.println("9) Salir.");
            int num = read.nextInt();

            switch (num) {
                case 1:
                productoService.listarProducto();
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 6:
                    System.out.println("6");
                    break;
                case 7:
                    System.out.println("7");
                    break;
                case 8:
                    System.out.println("8");
                    break;
                case 9:
                    System.out.println("Desea SALIR del menu? S/N");
                    String res = read.next();
                    if (res.equalsIgnoreCase("S")) {
                        salida = false;
                    }
                    break;

                default:
                    System.out.println("Intentelo de nuevo.");
            }

        } while (salida);

    }

}
