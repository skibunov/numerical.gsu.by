package by.skibunov;

import by.skibunov.matrix.ArrayMatrix;
import by.skibunov.method.GaussMethod;
import by.skibunov.method.SqrtMethod;

public class Application {

    public static void main(String[] args) {

        GaussMethod gaussMethod = new GaussMethod();


        System.out.println(gaussMethod.determinant());

        System.out.println(gaussMethod);



    }
}
