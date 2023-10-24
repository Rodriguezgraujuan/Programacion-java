package Tema2;

public class MyMath {
    public static double squarePerimeter(double aside){
        return aside*4;
    }

    public static double squareArea(double aside) {
        return aside*aside;
    }

    public static double rectanglePerimeter(double base, double height){
        return base*2+height*2;
    }

    public static double rectangleArea(double base, double height){
        return base*height;
    }

    public static double circlePerimeter(double radius){
        return 2*Math.PI*radius;
    }

    public static double circleArea(double radius){
        return Math.PI* Math.pow(radius, 2);
    }

    public static int prime(int number){

    }
}
