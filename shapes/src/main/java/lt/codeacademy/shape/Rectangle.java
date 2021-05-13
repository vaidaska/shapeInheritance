package lt.codeacademy.shape;

public class Rectangle extends Shape {

    //https://stackoverflow.com/questions/22273046/how-to-print-the-extended-ascii-code-in-java-from-integer-value
    private String leftTopCornerElement = "\u250C";
    private String rightTopCornerElement = "\u2510";
    private String leftBottomCornerElement = "\u2514";
    private String rightBottomCornerElement = "\u2518";
    private String verticalElement = "\u2502";
    private String horizontalElement = "\u2500";

    private final String reset = ConsoleColors.RESET;

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
            Print.console( String.format(offsetLeft.repeat(margin) + leftBottomCornerElement +"%s" +rightBottomCornerElement + reset, horizontalElement.repeat(drawX)) );

        } else {
            Print.error("Shape is too small to draw. Increase value of parameters X and Y.");
        }
    }
}
