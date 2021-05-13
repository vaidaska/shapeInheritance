package lt.codeacademy.shape;

import java.text.DecimalFormat;

public class Shape {

    public final double PI = 3.14159;

    private double x;
    private double y;
    private double r;
    private String color;
    private String colorCode;

    DecimalFormat df = new DecimalFormat("####0.00");

    public void create(double width, double length, double radius, String color, String colorCode){
        this.x = width;
        this.y = length;
        this.r = radius;
        this.color = color;
        this.colorCode = colorCode;
    }

    public void draw(){
        Print.console("Drawing shape ....");
    }

    public String getSubType(){
        if(this.getClass().getSimpleName().equals("Rectangle")){
            if (this.x == this.y) {
                return "Square";
            } else {
                return "Rectangle";
            }
        } else if (this.getClass().getSimpleName().equals("Oval")) {
            if (this.x == this.y) {
                return "Circle";
            } else {
                return "Ellipse";
            }
        } else if (this.getClass().getSimpleName().equals("RoundRect")) {
            if (this.x == this.y) {
                return "Rounded corner Square";
            } else {
                return "Rounded corner Rectangle";
            }
        } else {
            return "Shape";
        }
    }

    public double getArea(){
        return this.x * this.y;
    }

    public double getPerimeter(){
        return (this.x + this.y) * 2;
    }

    public String formatDouble(double d){
        return df.format(d);
    }

    public void info(){
        Print.console(ConsoleColors.WHITE_BOLD + "Class:\t\t" + ConsoleColors.WHITE_BOLD_BRIGHT + this.getClass().getSimpleName() + ConsoleColors.RESET);
        Print.console(ConsoleColors.WHITE_BOLD + "Type:\t\t" + ConsoleColors.WHITE_BOLD_BRIGHT +  getSubType() + ConsoleColors.RESET);
        Print.console(ConsoleColors.WHITE_BOLD + "Color:\t\t" + this.getColorCode() + this.getColor() + ConsoleColors.RESET);
        Print.console(ConsoleColors.WHITE_BOLD + "Shape x:\t" + ConsoleColors.WHITE_BOLD_BRIGHT +  this.getX() + ConsoleColors.RESET);
        Print.console(ConsoleColors.WHITE_BOLD + "Shape y:\t" + ConsoleColors.WHITE_BOLD_BRIGHT +  this.getY() + ConsoleColors.RESET);
        Print.console(ConsoleColors.WHITE_BOLD + "Shape r:\t" + ConsoleColors.WHITE_BOLD_BRIGHT +  this.getR() + ConsoleColors.RESET);
        Print.console(ConsoleColors.WHITE_BOLD + "Area:\t\t" + ConsoleColors.WHITE_BOLD_BRIGHT + formatDouble(getArea()) + ConsoleColors.RESET);
        Print.console(ConsoleColors.WHITE_BOLD + "Perimeter:\t" + ConsoleColors.WHITE_BOLD_BRIGHT + formatDouble(getPerimeter()) + ConsoleColors.RESET + "\n");
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getR() {
        return this.r;
    }

//    public double getPi() {
//        return PI;
//    }

    public String getColor() {
        return this.color;
    }

    public String getColorCode() {
        return this.colorCode;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "class=" + this.getClass().getSimpleName() +
                ", subtype=" + getSubType() +
                ", x=" + x +
                ", y=" + y +
                ", r=" + r +
                ", area=" + formatDouble(getArea()) +
                ", perimeter=" + formatDouble(getPerimeter()) +
                ", color='" + color + '\'' +
                '}' + "\n";
    }
}