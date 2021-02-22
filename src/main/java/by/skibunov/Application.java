package by.skibunov;

import by.skibunov.lab_1.method.GaussMethod;
import by.skibunov.lab_1.method.SqrtMethod;

public class Application {

    public static void main(String[] args) {

        GaussMethod gaussMethod = new GaussMethod();
        SqrtMethod sqrtMethod = new SqrtMethod();


        System.out.println(gaussMethod);
        System.out.println(gaussMethod.determinant());

        System.out.println(sqrtMethod);
        System.out.println(sqrtMethod.determinant());


    }
}
