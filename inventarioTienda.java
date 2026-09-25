import java.util.Scanner;

public class inventarioTienda {

     // Constantes 
    static final int MAX_PRODUCTOS = 20; // cantidad maxima de productos que se pueden guardar
    static final double IVA = 0.19; // porcentaje de IVA
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   

    // Arreglos para guardar los datos de los productos
    String[] nombre = new String[MAX_PRODUCTOS];
    int[] cantidad = new int[MAX_PRODUCTOS];
    double[] precio = new double[MAX_PRODUCTOS];
    int[] categoria = new int[MAX_PRODUCTOS];

    // Nombres de las categorias
    String[] categorias = {"Granos", "Lacteos", "Snacks", "Bebidas", "Otros" };

    // Suma total por la categoria con una matriz bidimensional
    double[][] matrizInventario = new double[categorias.length][2];

    // contador de los productos ingresados
    int total = 0;

    // Se le pide al usuario los productos 
      System.out.println("Ingrese como minimo 5 productos:");
      for (int i = 0; i < 5; i++) {
        System.out.println("Producto" + " " + (i + 1));
        System.out.println("Nombre:");
        nombre[i] = sc.next();
        System.out.println("cantidad:");
        cantidad[i] = sc.nextInt();
        System.out.println("Precio:");
        precio[i] = sc.nextDouble();
        System.out.println("categorias: 0.Granos 1.Lacteos 2.Snacks 3.Bebidas 4.Otros");
        System.out.println("Escriba el número de la categoria que pertenece:");
        int cat = sc.nextInt();

        //Si el usuario ingresa un numero diferente de los que se les muestra se le manda a la categoria Otros
        if (cat < 0 || cat > 4 ) {
             cat = 4;
}
        categoria[i] = cat;
        total = total + 1;;
      }
      //Se le pregunta al usuario si quiere agregar mas productos
      String seguir = "si";
      while (seguir.equals("si") && total < MAX_PRODUCTOS) { 
        System.out.println("¿Desea agregar otro producto? (si / no):");
        seguir = sc.next();
        if (seguir.equals("si")) {
            System.out.println("Producto:" + " " + (total + 1));
            System.out.println("Nombre:");
            nombre[total] = sc.next();
             System.out.println("cantidad:");
            cantidad[total] = sc.nextInt();
             System.out.println("Precio:");
            precio[total] = sc.nextDouble();
            int cat = sc.nextInt();
        if (cat < 0 || cat > 4 ) {
             cat = 4;
}
        //Si el usuario ingresa un numero diferente de los que se les muestra se le manda a la categoria Otros
        categoria[total] = cat;
        total = total + 1;
        }
      }
    } 
}