package lt.codeacademy.shape;

public class RoundRect extends Shape {

    private final String RESET = ConsoleColors.RESET;

    //https://stackoverflow.com/questions/22273046/how-to-print-the-extended-ascii-code-in-java-from-integer-value
    private String leftTopCornerElement = "/";
    private String rightTopCornerElement = "\\";
    private String leftBottomCornerElement = "\\";
    private String rightBottomCornerElement = "/";
    private String verticalElement = "\u2502";
    private String horizontalElement = "\u2500";

    @Override
    public void draw(){
        String color = this.getColorCode();
        if(this.getX() >= 2 && this.getY() >=2){
            int drawX = (int)this.getX() - 2;
            int drawY = (int)this.getY() - 2;
            String innerPattern = " "; // \u2591, \u2592, \u2593
            String offsetLeft = " ";
            int margin = 12; // Can be centered ... :) (get lenght of shape type... - shapw width ) /2
            Print.console( String.format(offsetLeft.repeat(margin) + color + leftTopCornerElement +"%s" +rightTopCornerElement, horizontalElement.repeat(drawX)) );
            for (int i = 0; i < drawY; i++) {
                Print.console(String.format(offsetLeft.repeat(margin) + verticalElement + "%s" + verticalElement, innerPattern.repeat(drawX)));
            }
            Print.console( String.format(offsetLeft.repeat(margin) + leftBottomCornerElement +"%s" +rightBottomCornerElement + this.RESET, horizontalElement.repeat(drawX)) );

        } else {
            Print.error("Shape is too small to draw. Increase value of parameters X and Y.");
        }
    }

    @Override
    public double getArea(){
        return this.getX() * this.getY() - (this.getR() * this.getR()) * (4-super.PI);
    }

    @Override
    public double getPerimeter(){
        return 2 * (this.getX() + this.getY() - this.getR() * (4 - super.PI));
    }


}
