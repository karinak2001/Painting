public class Circle {
    private Point center;
    private int radius;
    private String fillColor;


    public Circle(Point center, int radius, String fillColor){
        this.center = center;
        this.radius = radius;
        this.fillColor = fillColor;
    }


    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }


    public String toString(){
        return "center: " + this.center + "\n" +
                "radius: " + this.radius + "\n" +
                "fill color: " + this.fillColor;
    }
}
