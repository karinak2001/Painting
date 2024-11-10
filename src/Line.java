public class Line {
    Point start;
    Point end;
    String color;

    public Line(Point start, Point end, String color){

        this.start = start;
        this.end = end;
        this.color = color;
    }

    public Point getStart(){
        return start;
    }

    public void setStart(Point start){
        this.start = start;
    }

    public Point getEnd(){
        return end;
    }

    public void setEnd(Point end){
        this.end = end;
    }

    public String toString(){
        return "The line starts at point: " + this.start + " and ends at: " + this.end + " ,The color of the line is: " + this.color;
    }


}
