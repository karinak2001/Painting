public class Triangle {
    private Line line1;
    private Line line2;
    private Line line3;
    private String fillColor;

    public Triangle(Line line1, Line line2, Line line3, String fillColor) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
        this.fillColor = fillColor;
    }

    public Line getLine1() {
        return line1;
    }

    public void setLine1(Line line1) {
        this.line1 = line1;
    }

    public Line getLine2() {
        return line2;
    }

    public void setLine2(Line line2) {
        this.line2 = line2;
    }

    public Line getLine3() {
        return line3;
    }

    public void setLine3(Line line3) {
        this.line3 = line3;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    @Override
    public String toString() {
        String output = "line 1: " + this.line1 + "\n" +
                "line 2: " + this.line2 + "\n" +
                "line 3: " + this.line3 + "\n" +
                "fill color: " + this.fillColor;
        return output;
    }
}
