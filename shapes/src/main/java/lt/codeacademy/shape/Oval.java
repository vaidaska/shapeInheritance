package lt.codeacademy.shape;

public class Oval extends Shape {

    private final double PI = 3.14159;
    private final String RESET = ConsoleColors.RESET;

    private String topElement = "_";
    private String leftTopElement = "/";
    private String rightTopElement = "\\";
    private String leftBottomElement = "\\";
    private String rightBottomCornerElement = "/";
    private String bottomElement = "-";

    @Override
    public void draw(){
        String color = this.getColorCode();
        if(this.getX() >= 2 && this.getY() >=2) {

            String innerPattern = "*"; // \u2591, \u2592, \u2593
            String offsetLeft = " ";
            String drawPatren = "";

            int margin = 12; // Can be centered ... :) (get lenght of shape type... - shapw width ) /2
            int newX; int newY;

            //Lyginius oasididianm vienetu kad paprasciau butu dirbti su centrais.
            if (this.getX() % 2 == 0){
                newX = (int) this.getX() + 1;
            } else {
                newX = (int) this.getX();
            }
            if (this.getY() % 2 == 0){
                newY = (int) this.getY() + 1;
            } else {
                newY = (int) this.getY();
            }

            int centrasX = Math.round(newX);
            int centrasY = Math.round(newY);

            Print.console("CentasX: " + centrasX);
            Print.console("CentasY: " + centrasY);

            for (int i = 0; i < newY; i++) {
                //Print.console(String.format(offsetLeft.repeat(margin)) + "*");
                for (int j = 0; j < newX; j++) {
                    //Print.console(String.format(offsetLeft.repeat(margin)) + (drawPatren += innerPattern));
                }
            }


//            Print.console( String.format(offsetLeft.repeat(margin) + color + leftTopCornerElement +"%s" +rightTopCornerElement, horizontalElement.repeat(drawX)) );
//            for (int i = 0; i < this.getX(); i++) {
//                Print.console(String.format(offsetLeft.repeat(margin) + verticalElement + "%s" + verticalElement, innerPattern.repeat((int)this.getX())));
//            }
//            Print.console( String.format(offsetLeft.repeat(margin) + leftBottomCornerElement +"%s" +rightBottomCornerElement + this.RESET, horizontalElement.repeat(drawX)) );
        } else {
            Print.error("Shape is too small to draw. Increase value of parameters X and Y.");
        }
    }

    @Override
    public double getArea(){
        if (this.getX() == this.getY()) {
            return 2 * this.PI * this.getX();
        } else {
            return this.PI * this.getX() * this.getY();
        }

        //if (this.getX() != this.getY()
    }

    @Override
    public double getPerimeter(){
        return 2 * this.PI * Math.sqrt((this.getX() * this.getX() + this.getY() * this.getY()) / 2);
    }
}
