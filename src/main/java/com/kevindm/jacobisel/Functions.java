package com.kevindm.jacobisel;

public class Functions {

    public static int iterator = 0;


    static double[][] m = getSystemMatrix(Panel.system_matrix.getText());

    public static String justifyMatrix() {
        String matrix = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if (m[i][j] >= 0) {
                    matrix += String.format("\t%s%.2f", " ", m[i][j]);
                    //System.out.printf("\t%s%.2f", " ", m[i][j]);
                } else {
                    matrix += String.format("\t%.2f", m[i][j]);
                    //System.out.printf("\t%.2f", m[i][j]);
                }
            }
            matrix += "\n";
            //System.out.println("");
        }
        return matrix;
        /*System.out.println("");
        System.out.println("");*/
    }
    
    public static int getMatrixDimensions(String a){
        int row = 1, col = 1;

        // TODO COMPROBAR SI CONTIENE CARACTERES NO VALIDOS

        // CANTIDAD DE FILAS
        for (int i=0; i<a.length()-1; i++){
            if (a.charAt(i) == '\n'){
                row++;
            }
        }

        // CANTIDAD DE COLUMNAS
        for (int i=0; i<a.length()-1; i++){
            if (a.charAt(i) != '\n'){
                if (a.charAt(i) == ' '){
                    col++;
                }
            }else{
                break;
            }
        }

        return row;
    }

    public static double[][] getSystemMatrix(String a){
        a+="\n";
        String row_array = "";
        double[][] double_matrix = new double[getMatrixDimensions(a)][getMatrixDimensions(a)];
        String num = "";
        double value;
        int r = 0;
        int c = 0;
        
        // EXTRAER DE FILA EN FILA PRIMERAMENTE...
        for (int i=0; i<a.length(); i++){
            if (a.charAt(i) != '\n'){
                row_array += a.charAt(i);
            }else if (a.charAt(i) == '\n'){
                // CUANDO SE ALCANCE EL SALTO DE LINEA PROCEDO A PARSEAR LOS NUMEROS BASADO EN LOS ESPACIOS
                row_array += " ";
                for (int b=0; b<row_array.length(); b++){             
                    if (row_array.charAt(b) != ' '){
                        num += row_array.charAt(b);
                    }
                    // CUANDO SE ENCUENTRE UN ESPACIO PROCEDO A PARSEAR EL NUMERO EN UN DOUBLE, Y METERLO EN LA MATRIZ
                    if (row_array.charAt(b) == ' '){
                        value = Double.parseDouble(num);
                        double_matrix[r][c] = value;
                        num = "";

                        // BUSCAR POSICION BASANDOSE EN LA CANTIDAD DE COLUMNAS
                        c++;
                        if (c >= getMatrixDimensions(a)){
                            c=0;
                            r++;
                        }
                    }
                }
                row_array = "";
            }
        }
        return double_matrix;
    }

    public static String getStringMatrix(double[][] m) {
        String matrix = "";

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                if (m[i][j] >= 0) {
                    matrix += "  " + m[i][j];
                    //System.out.printf("\t%s%.2f", " ", m[i][j]);
                } else {
                    matrix += m[i][j];
                    //System.out.printf("\t%.2f", m[i][j]);
                }
            }
            matrix += "\n";
            //System.out.println("");
        }
        matrix += "\n\n";
        //System.out.println("");
        //System.out.println("");
        
        return matrix;
    }

    public static double[] getAmpliatedMatrix(String a){
        String num = "";
        double value;
        int c = 0;
        double[] ampliated_matrix = new double[getMatrixDimensions(a)];
        for (int i=0; i<a.length(); i++){
            if (a.charAt(i) != '\n'){
                num+=a.charAt(i);
            }
            if (a.charAt(i) == '\n'){
                value = Double.parseDouble(num);
                num = "";
                ampliated_matrix[c] = value;
                c++;
            }
        }
        return ampliated_matrix;
    }

    public static String jacobi(double b[], double epsilon, String a) {
        String log = "";
        int N = getMatrixDimensions(a);
        double norma = 1.0;
        double sumaAux;
        //Inicializamos en vector de aproximacion inicial en 0.0.
        double X_Anterior[] = new double[N];
        for(int i=0; i <X_Anterior.length; i++) {
            X_Anterior[i] = 0.0;
        }
        double X_Actual[] = new double[N];
        for(int i=0; i <X_Actual.length; i++) {
            X_Actual[i] = 0.0;
        }
        //Revisa si se cumple con el criterio de detención
        while((norma/vectorNorm(X_Actual)) >= epsilon) {
            sumaAux = 0.0;
            iterator++;
            log += "Iteración " + iterator + ":\n";
            //System.out.println("Iteración " + contadorIteraciones + ":");
            //Actualizamos el vector de aproximación inicial
            for(int i=0; i <X_Anterior.length; i++) {
                X_Anterior[i] = X_Actual[i];
            }
            for(int i=0; i <=N-1; i++) {
                for(int j=0; j <=N-1; j++) {
                    if(j != i) {
                        sumaAux += m[i][j]*X_Anterior[j];
                    }
                }
                X_Actual[i] = (b[i] - sumaAux)/m[i][i];
                log += "X["+(i+1)+"]: " + X_Actual[i] + "\n";
                //System.out.println("X["+(i+1)+"]: " + X_Actual[i]);
                sumaAux = 0.0;
            }

            log += "\n\n";
            /*System.out.println("");
            System.out.println("");*/
            norma = vectorNorm(vectorDif(X_Actual, X_Anterior));
        }
        return log;
    }

    public static double vectorNorm(double v[]) {
        double norm = 0.0;
        double sum = 0.0;
        for(int i=0; i <v.length; i++) {
            sum += Math.pow(v[i], 2);
        }
        norm = Math.sqrt(sum);
        return norm;
    }

    public static double[] vectorDif(double v1[], double v2[]) {
        double dif[] = new double[v1.length];
        for(int i=0; i <dif.length; i++) {
            dif[i] = v1[i] - v2[i];
        }
        return dif;
    }
}
