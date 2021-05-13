package lt.codeacademy.shape;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Oval oval = new Oval();
        RoundRect roundRect = new RoundRect();

        rectangle.create(10,8, 0,  "Red", ConsoleColors.RED_BOLD_BRIGHT);
        rectangle.draw();
        rectangle.info();
        Print.console( rectangle.toString() );

        oval.create(5,4, 0,"Green", ConsoleColors.GREEN_BOLD_BRIGHT);
        oval.draw();
        oval.info();
        Print.console( oval.toString() );

        roundRect.create(10, 8, 5, "Yellow", ConsoleColors.YELLOW_BOLD_BRIGHT);
        roundRect.draw();
        roundRect.info();
        Print.console( roundRect.toString());
    }
}
