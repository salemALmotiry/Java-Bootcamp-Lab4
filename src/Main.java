public class Main {
    public static void main(String[] args) {

        System.out.println("\n\n_______________________Circle_________________________\n");

        Circle circle = new Circle(2);

        System.out.println("The circle radius is: "+circle.getRadius());
        circle.setRadius(6);
        System.out.println("The updated circle radius is: "+circle.getRadius());
        circle.calculateArea();
        circle.calculatePerimeter();

        //______________________________________________________________________

        System.out.println("\n\n_______________________Rectangle_________________________\n");

        Rectangle rectangle = new Rectangle(5, 6);
        System.out.println("The rectangle height is: "+rectangle.getHeight());
        System.out.println("The rectangle width is: "+rectangle.getWidth());
        rectangle.setHeight(10);
        rectangle.setWidth(4);
        System.out.println("The updated rectangle height is: "+rectangle.getHeight());
        System.out.println("The updated rectangle width is: "+rectangle.getWidth());
        rectangle.calculateArea();

        rectangle.calculatePerimeter();

        System.out.println("\n\n_______________________Triangle_________________________\n");

        Triangle triangle = new Triangle(5,3);
        System.out.println("The triangle height is: "+triangle.getHeight());
        System.out.println("The triangle base is: "+triangle.getBase());
        triangle.setHeight(3.4641);
        triangle.setBase(4);
        System.out.println("The updated triangle height is: "+triangle.getHeight());
        System.out.println("The updated triangle base is: "+triangle.getBase());
        triangle.calculateArea();

        triangle.calculatePerimeter();



    }
}