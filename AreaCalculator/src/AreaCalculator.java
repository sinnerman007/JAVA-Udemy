public class AreaCalculator {
    public static double area(double radius){
        if(radius < 0){
            return -1.0;
        }
        double pi = Math.PI;
        double areaOfCircle = radius * radius * pi;
        System.out.println("Radius of circle is "+ areaOfCircle);
        return areaOfCircle;
    }
    public static double area(double x,double y){
        if(x<0 || y<0){
            return -1.0;
        }
        double areaOfRect = x * y;
        System.out.println("area of reactangle is "+ areaOfRect);
        return areaOfRect;
    }

}
