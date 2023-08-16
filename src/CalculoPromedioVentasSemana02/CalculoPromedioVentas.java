package CalculoPromedioVentasSemana02;

import java.util.Scanner;

public class CalculoPromedioVentas {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese la cantidad de vendedores: ");
            int cantidadVendedores = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea pendiente
            
            String[] nombres = new String[cantidadVendedores];
            double[][] ventasTrimestrales = new double[cantidadVendedores][4];
            
            for (int i = 0; i < cantidadVendedores; i++) {
                System.out.println("\nDatos del vendedor # " + (i + 1));
                System.out.print("Ingresa el nombre del vendedor: ");
                nombres[i] = scanner.nextLine();
                
                for (int trimestre = 0; trimestre < 4; trimestre++) {
                    System.out.print("Ingrese las ventas en el trimestre " + (trimestre + 1) + ": ");
                    ventasTrimestrales[i][trimestre] = scanner.nextDouble();
                }
                scanner.nextLine(); // Consumir la nueva línea pendiente
            }
            
            System.out.println("\nInformes por vendedor:");
            
            double promedioTotal = 0;
            
            for (int i = 0; i < cantidadVendedores; i++) {
                double totalVentas = 0;
                for (int trimestre = 0; trimestre < 4; trimestre++) {
                    totalVentas += ventasTrimestrales[i][trimestre];
                }
                
                double promedioVendedor = totalVentas / 4;
                promedioTotal += promedioVendedor;
                
                System.out.println("\nInforme de ventas para el vendedor: " + nombres[i]);
                System.out.println("El promedio de ventas anual para el vendedor " +nombres[i]+ " fue de: " + promedioVendedor);
            }
            
            double promedioGeneral = promedioTotal / cantidadVendedores;
            
            System.out.println("\nInforme general");
            System.out.println("El promedio de ventas anual de todos los vendedores fue de: " + promedioGeneral);
            
        }
    }
}
