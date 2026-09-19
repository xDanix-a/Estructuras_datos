public class Ejecutar {
    public static void main(String [] args) {
        // Creacion del objeto para llamar los metodos de la clase
        // OperacionesMatrices.java

        OperacionesMatrices objM = new OperacionesMatrices();

        //llenar la matriz
        int[][] matriz = objM.llenarMatriz(3, 3, 1, 9);
        
        //mostrar la matriz
        System.out.println(objM.imprimirMatriz(matriz));

        //suma filas y columnas
        System.out.println(objM.sumaFilasColumnas(matriz));

    }
}