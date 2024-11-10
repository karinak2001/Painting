import javax.print.attribute.standard.OrientationRequested;

public class Tree {
    private Rectangle trunk;
    private Circle top;
    private Circle[] oranges;

    public Tree(Rectangle trunk, Circle top, Circle[] oranges){
        this.trunk = trunk;
        this.top = top;
        this.oranges = oranges;
    }


    public Rectangle getTrunk(){
        return trunk;
    }

    public void setTrunk(Rectangle trunk){
        this.trunk = trunk;
    }


    public Circle getTop(){
        return top;
    }

    public void setTop(Circle top){
        this.top = top;
    }

    public Circle[] getOranges(){
        return oranges;
    }

    public void setOranges(Circle[] oranges){
        this.oranges = oranges;
    }


    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("trunk: ").append(this.trunk).append("\n");
        stringBuilder.append("top: ").append(this.top).append("\n");
        if (oranges != null){
            stringBuilder.append("oranges: ").append("\n");
            for (int i = 0; i < this.oranges.length; i++) {
                stringBuilder.append(i + 1).append(":").append(this.oranges[i]);
            }
        }
        return stringBuilder.toString();
    }
}
