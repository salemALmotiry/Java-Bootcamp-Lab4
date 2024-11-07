public class Rectangle extends Shape {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        if (height <= 0 || width <= 0) {
            System.out.println("Height and width should be greater than 0");
        }else{
            this.width = width;
            this.height = height;
        }

    }


    @Override
    public void calculateArea() {

        System.out.printf("Area of Rectangle is : %,.2f ",  (this.width * this.height));

    }

    @Override
    public void calculatePerimeter() {
        System.out.printf("\nPerimeter of Rectangle is: %,.2f ",  2*this.height+2*this.width);

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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0 ) {
            System.out.println("width should be greater than 0");
        }else{
            this.width = width;
        }
    }
}
