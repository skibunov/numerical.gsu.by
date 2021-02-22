package by.skibunov.lab_1.method;

import by.skibunov.lab_1.matrix.ArrayMatrix;

public class SqrtMethod {

    private ArrayMatrix arrayMatrix = new ArrayMatrix();
    private double[][] matrix = arrayMatrix.getMatrix();
    private double[][] matrixTemp = new double[3][4];

    private int n = 3;
    private int m = 4;

    private double x1,x2,x3;

    public SqrtMethod() {
        getResult();
    }

    public void getTriangle(){
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                double koef = matrix[i][j] / matrix[i][i];
                for (int k = i; k < m; k++) {
                    matrix[j][k] = matrix[j][k] - (matrix[i][k] * koef);
                }
            }
        }

    }

    public double determinant(){
        double res = 1;
        double[][] matrixTemp = new double[4][3];

        getTriangle();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrixTemp[i][j] = matrix[j][i];

            }
        }

        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j){
                    res = matrixTemp[i][j] * res;
                }
            }
        }

        return Math.round(res);
    }


    public void getResult(){
        int n = 3;
        int m = 4;
        double temp = 0;

        for (int i = 0; i < n; i++){
            temp = 0;
            for (int k = 0; k < i; k++)
                temp = temp + matrixTemp[k][i] * matrixTemp[k][i];
            matrixTemp[i][i] = Math.sqrt(matrix[i][i] - temp);
            for (int j = i; j < n; j++){
                temp = 0;
                for (int k = 0; k < i; k++)
                    temp = temp + matrixTemp[k][i] * matrixTemp[k][j];
                matrixTemp[i][j] = (matrix[i][j] - temp) / matrixTemp[i][i];
            }
        }

        double[] x = new double[3];
        double[] y = new double[3];

        for (int i = 0; i < n; i++){
            temp = 0;
            for (int k = 0; k < i; k++)
                temp = temp + matrixTemp[k][i] * y[k];
            y[i] = (matrix[i][3] - temp) / matrixTemp[i][i];
        }

        for (int i = n - 1; i >= 0; i--){
            temp = 0;
            for (int k = i + 1; k < n; k++)
                temp = temp + matrixTemp[i][k] * x[k];
            x[i] = (y[i] - temp) / matrixTemp[i][i];
        }

        this.x1 = Math.round(x[0]);
        this.x2 = Math.round(x[1]);
        this.x3 = Math.round(x[2]);
    }

    @Override
    public String toString() {
        return "x1 = "+this.x1+"\n"+
                "x2 = "+this.x2+"\n"+
                "x3 = "+this.x3;
    }



}
