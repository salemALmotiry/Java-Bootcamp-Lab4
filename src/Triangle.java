public class Triangle extends Shape{

    private double height;
    private double base;


    public Triangle(double height, double base) {
        if (height <= 0 || base <= 0) {
            System.out.println("Height and base should be greater than 0");
        }else{
            this.base = base;
            this.height = height;
        }
    }


    @Override
    public void calculateArea() {

        System.out.printf("The area of a triangle is : %,.2f ",(base*height)/2);

    }

    @Override
    public void calculatePerimeter() {

        System.out.printf("The perimeter of a triangle is : %,.2f ",3*base);

    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0 ) {
            System.out.println("Height should be greater than 0");
        }else{
            this.height = height;
        }
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <= 0 ) {
            System.out.println("base should be greater than 0");
        }else{
            this.base = base;
        }
    }
}
