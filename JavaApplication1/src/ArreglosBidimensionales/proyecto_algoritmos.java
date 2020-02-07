package ArreglosBidimensionales;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class proyecto_algoritmos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String ingreso[][] = new String[100][21];
        int empelado = 0;
        Double costos[][] = new Double[100][21];
        double masa_sal = 0;
        double ant = 74.50;
        double total_ing = 0;
        double ant2 = 0;
        double apor_iees = 0;
        double ing_net = 0;
        double tot_des = 0;
        Double deposito[] = new Double[10];
        double aux = 0;
        double comp = 0;
        int lim = 0;
        System.out.println("ingrese cantidad de empleados");
        lim = entrada.nextInt();
        int opcion;
        boolean bandera = true;
        while (bandera == true) {
            System.out.println("_____________ MENU PRINCIPAL ____________");
            System.out.println("|                                        |");
            System.out.println("|   1. Ingresar el codigo                |");
            System.out.println("|   2. Buscar empleado (codigo)          |");
            System.out.println("|   3. Mensualidades de menor a mayor    |");
            System.out.println("|   4. SALIR                             |");
            System.out.println("|________________________________________|");
            System.out.println("");
            System.out.println("Selecione una opcion: ");
            opcion = entrada.nextInt();
            System.out.println("");

            switch (opcion) {
                case 1:
                    for (int i = 0; i < lim; i++) {

                        System.out.println("UNIVERSIDAD TECNICA PARTICULAR DE LOJA");
                        System.out.println("");
                        System.out.println("      DEPARTAMENTO FINANCIERO         ");
                        System.out.println("Ingrese codigo:");
                        ingreso[empelado][0] = entrada.next();
                        entrada.nextLine();
                        System.out.println("Ingrese Unidad:");
                        ingreso[empelado][1] = entrada.next();
                        entrada.nextLine();
                        System.out.println("Ingrese Localidad:");
                        ingreso[empelado][2] = entrada.next();
                        entrada.nextLine();
                        System.out.println("Ingrese Dependencia:");
                        ingreso[empelado][3] = entrada.next();
                        entrada.nextLine();
                        System.out.println("Ingrese Nombre:");
                        ingreso[empelado][4] = entrada.next();
                        entrada.nextLine();
                        System.out.println("Ingrese Función:");
                        ingreso[empelado][5] = entrada.next();
                        entrada.nextLine();
                        System.out.println("Ingrese Antiguedad en Números");
                        costos[i][6] = entrada.nextDouble();
                        System.out.println("INGRESOS");
                        System.out.println("Ingrese Sueldo Basico:");
                        costos[i][7] = entrada.nextDouble();
                        System.out.println("Ingrese Componentes Citties");
                        costos[i][8] = entrada.nextDouble();
                        System.out.println("Ingrese docencia");
                        costos[i][9] = entrada.nextDouble();
                        System.out.println("Ingrese componente docencia");
                        costos[i][10] = entrada.nextDouble();
                        System.out.println("Ingrese otras bonificaciones");
                        costos[i][11] = entrada.nextDouble();
                        System.out.println("Ingrese fondo reserva pago mensual");
                        costos[i][12] = entrada.nextDouble();
                        System.out.println("Ingrese bono de responsabilidad");
                        costos[i][13] = entrada.nextDouble();
                        System.out.println("Ingrese el impuesto a la Renta");
                        costos[i][14] = entrada.nextDouble();
                        System.out.println("DESCUENTOS");
                        System.out.println("Bar Cafeteria K");
                        costos[i][15] = entrada.nextDouble();
                        System.out.println("Asociacion Docentes");
                        costos[i][16] = entrada.nextDouble();
                        System.out.println("Caja de ahorro Docentes");
                        costos[i][17] = entrada.nextDouble();
                        System.out.println("Seguro Padres");
                        costos[i][18] = entrada.nextDouble();
                        System.out.println("Seguro Hermanos");
                        costos[i][19] = entrada.nextDouble();
                        System.out.println("Seguro Salud S.A.");
                        costos[i][20] = entrada.nextDouble();
                        System.out.println("");
                        System.out.println("---------------------------------------------------------");

                        empelado = empelado + 1;
                    }
                    break;
                case 2:
                    System.out.println("____BUSCAR  EMPLEADO___");
                    System.out.println("Ingrese el codigo:");
                    String codigo = entrada.next();
                    boolean encontrado = false;

                    for (int i = 0; i < empelado; i++) {
                        if (codigo.equals(ingreso[i][0])) {
                            System.out.println("CODIGO EXISTENTE");
                            System.out.println("___UNIVERSIDAD TECNICA PARTICULAR DE LOJA___");
                            System.out.println("");
                            System.out.println("                 DEPARTAMENTO FINANCIERO                  ");
                            System.out.println("CODIGO: " + ingreso[i][0]);
                            System.out.println("UNIDAD: " + ingreso[i][1]);
                            System.out.println("LOCALIDAD: " + ingreso[i][2]);
                            System.out.println("DEPENDENCIA: " + ingreso[i][3]);
                            System.out.println("NOMBRE: " + ingreso[i][4]);
                            System.out.println("FUNCION: " + ingreso[i][5]);
                            System.out.println("ANTIGUEDAD: " + costos[i][6]);
                            System.out.println("");
                            System.out.println("          INGRESOS                                        ");
                            System.out.println("            Sueldo basico                       : " + costos[i][7]);
                            System.out.println("            Componente citties                  : " + costos[i][8]);
                            System.out.println("            Componente docencia                 : " + costos[i][9]);
                            masa_sal = costos[i][7] + costos[i][8] + costos[i][9];
                            System.out.println("            MASA SALARIAL                       : " + masa_sal);
                            System.out.println("");
                            System.out.println("            Otras bonificaciones                : " + costos[i][10]);
                            ant2 = costos[i][6] * ant;
                            System.out.println("            Bonificacion antiguedad             : " + ant2);
                            System.out.println("            Fondo reserva pago mensual          : " + costos[i][11]);
                            System.out.println("            Bono responsibilidad                : " + costos[i][12]);
                            total_ing = costos[i][10] + ant2 + costos[i][11] + costos[i][12];
                            System.out.println("            TOTAL INGRESOS                      : " + total_ing + masa_sal);
                            System.out.println("");
                            apor_iees = total_ing * 0.0935;
                            System.out.println("            - Aporte al IESS                    : " + apor_iees);
                            System.out.println("            - Impuesto a la renta mensual       : " + costos[i][14]);
                            ing_net = +total_ing - apor_iees - costos[i][14];
                            System.out.println("             TOTAL INGRESOS NETOS               : " + ing_net);
                            System.out.println("");
                            System.out.println("             DESCUENTOS");
                            System.out.println("             Bar cafeteria K                    : " + costos[i][15]);
                            System.out.println("             Asociacion docentes                : " + costos[i][16]);
                            System.out.println("             Caja de ahorros docentes           : " + costos[i][17]);
                            System.out.println("             Seguro padres                      : " + costos[i][18]);
                            System.out.println("             Seguro-Hermanos                    : " + costos[i][19]);
                            System.out.println("             Seguro salud S.A                   : " + costos[i][20]);
                            tot_des = costos[i][15] + costos[i][16] + costos[i][17] + costos[i][18] + costos[i][19] + costos[i][20];
                            System.out.println("");

                            System.out.println("            TOTAL DESCUENTOS                    : " + tot_des);
                            System.out.println("");
                            deposito[i] = ing_net - tot_des;
                            System.out.println("            DEPOSITO BANCO                      : " + deposito[i]);
                            encontrado = true;
                            System.out.println("");
                        }
                    }

                    if (encontrado == false) {
                        System.out.println("No existe");
                    }
                    break;
                case 3:
                    if (true) {
                        
                            if (deposito[0] < deposito [1]){
                            System.out.println("El sueldo menor es: " + deposito [0]);
                        }else{
                                System.out.println("El sueldo menor es: " + deposito [1]);
                            }
                        
                    
                    }
                    break;
                case 4:
                    bandera = false;
                    break;
            }
        }
    }
}
