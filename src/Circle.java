public class Circle extends Shape {

    private double radius;

    private final double PI = 3.14;


    public Circle(double radius) {
        if(radius <=0){
            System.out.println("The radius must be greater than 0");
        }else
            this.radius = radius;
    }

    @Override
    public void calculateArea() {
        System.out.printf("The area of the circle is : %,.2f ", (PI * radius * radius));
    }

    @Override
    public void calculatePerimeter() {
        System.out.printf("\nThe perimeter of the circle is : %,.2f ", (2 * PI * radius));

    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
     if(radius <=0){
         System.out.println("The radius must be greater than 0");
     }else
        this.radius = radius;
    }
}
