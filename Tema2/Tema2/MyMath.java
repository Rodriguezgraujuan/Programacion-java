package Tema2;

public class MyMath {
    public static double squarePerimeter(double lado){
        double result = 0;
        if (lado>=0){
            result = (lado*4);
        }
        return result;
    }

    public static double squareArea(double lado) {
        double result = 0;
        if (lado>=0){
            result = (lado*lado);
        }
        return result;
    }

    public static double rectanglePerimeter(double base, double altura){
        double result = 0;
        if (base>0 && altura>0){
            result = (base*2+altura*2);
        }
        return result;
    }

    public static double rectangleArea(double base, double altura){
        double result = 0;
        if (base>0&&altura>0){
            result = (base*altura);
        }
        return result;
    }

    public static double circlePerimeter(double radio){
        double result=0;
        if (radio>0) {
            result = 2 * Math.PI * radio;
        }
        return result;
    }

    public static double circleArea(double radio){
        double result=0;
        if (radio>0) {
            result = Math.PI* Math.pow(radio, 2);
        }
        return result;
    }

    public static boolean isPrime(int number){
        boolean condicion = true;
        if (number<2){
            condicion = false;
        } else {
            for (int i = 2; i < number && condicion; i++) {
                if (number % i == 0) {
                    condicion = false;
                }
            }
        }
        return condicion;
    }

    public static boolean isNotPrime(int number){
        return !MyMath.isPrime(number);
    }

    public static int figureCount(int number){
        int contador = 0;
        number = Math.abs(number);
        if (number==0){
            contador=1;
        }
        while (number>0){
            number= number / 10;
            contador++;
        }
        return contador;
    }

    public static int evenFigureCount(int number){
        int contador=0;
        if (number==0){
            contador=1;
        }
        while (number!=0){
            if (number%2==0){
                contador++;
            }
            number= number / 10;
        }
        return contador;
    }

    public static int oddFigureCount(int number){
        int contador=0;
        number=Math.abs(number);
        while (number!=0){
            if (number%2==1){
                contador++;
            }
            number= number / 10;
        }

        return contador;
    }

    public static int factorial(int number){
        int result= 1;
        if (number<0){
            result=0;
        }else {
            for (int i = 1; i <= number; i++) {
                result = i * result;
            }
        }
        return result;
    }

    public static int factorialRecursive(int number){
        int result= 1;
        if (number<0){
            result=0;
        }else {
            for (int i = 1; i < number; number--) {
                result = number * result;
            }
        }
        return result;
    }

    public static int quadraticEcuationSolutions(int A, int B, int C){
        int result = 0;
        int D = B*2-4*A*C;
        if (D>0){
            result=2;
        } else if (D==0) {
            result=1;
        }
        return result;
    }

    public static int figuresSumatory(int number){
        number = Math.abs(number);
        int result = 0;
        while (number>0){
            result += number %10;
            number /= 10;
        }
        return result;
    }

}
