package by.skibunov.method;

import by.skibunov.constant.Constant;
import by.skibunov.matrix.ArrayMatrix;

public class GaussMethod {
    private ArrayMatrix arrayMatrix = new ArrayMatrix();
    private double[][] matrix = arrayMatrix.getMatrix();

    private int n = 3;
    private int m = 4;

    private double x1,x2,x3;

    public GaussMethod() {
        getTriangle();
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
        this.x3 = Math.round(matrix[2][2] / matrix[2][3]);
        this.x2 = Math.round((matrix[1][3] - matrix[1][2]*x3) / matrix[1][1]);
        this.x1 = Math.round((matrix[0][3] - matrix[0][2]*x3 - matrix[0][1]*x2)/matrix[0][0]);
    }

    public double[][] getMatrix() {
        return matrix;
    }

    @Override
    public String toString() {
        return "x1 = "+this.x1+"\n"+
               "x2 = "+this.x2+"\n"+
                "x3 = "+this.x3+"\n";
    }
}
