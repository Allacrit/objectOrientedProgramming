package lesson1.task2;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        System.out.printf("Ширина %sмм.%n",rectangle.getWidth());
        System.out.printf("Высота %sмм.%n",rectangle.getHeight());
        System.out.printf("Площадь %sмм2.%n",rectangle.calculateArea());
        System.out.printf("Периметр %sмм.%n",rectangle.calculatePerimeter());
        System.out.println();

        Rectangle rectangle1 = new Rectangle(17.0,22.0);
        System.out.printf("Ширина %sмм.%n",rectangle1.getWidth());
        System.out.printf("Высота %sмм.%n",rectangle1.getHeight());
        System.out.printf("Площадь %sмм2.%n",rectangle1.calculateArea());
        System.out.printf("Периметр %sмм.%n",rectangle1.calculatePerimeter());
        System.out.println();

        rectangle1.setHeight(10.0);
        System.out.printf("Ширина %sмм.%n",rectangle1.getWidth());
        System.out.printf("Высота %sмм.%n",rectangle1.getHeight());
        System.out.printf("Площадь %sмм2.%n",rectangle1.calculateArea());
        System.out.printf("Периметр %sмм.%n",rectangle1.calculatePerimeter());

    }
}
