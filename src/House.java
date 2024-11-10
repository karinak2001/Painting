public class House {
    private Rectangle structure;
    private Rectangle door;
    private Rectangle leftWindow;
    private Rectangle rightWindow;
    private Rectangle chimney;
    private Triangle roof;
    private Circle doorHandle;


    public House(Rectangle structure, Rectangle door, Rectangle leftWindow,
                 Rectangle rightWindow, Rectangle chimney, Triangle roof, Circle doorHandle){
        this.structure = structure;
        this.door = door;
        this.leftWindow = leftWindow;
        this.rightWindow = rightWindow;
        this.chimney = chimney;
        this.roof = roof;
        this.doorHandle = doorHandle;
    }


    public Rectangle getStructure(){
        return structure;
    }

    public void setStructure(Rectangle structure){
        this.structure = structure;
    }

    public Rectangle getDoor(){
        return door;
    }

    public void setDoor(Rectangle door){
        this.door = door;
    }

    public Rectangle getLeftWindow(){
        return leftWindow;
    }

    public void setLeftWindow(Rectangle leftWindow){
        this.leftWindow = leftWindow;
    }

    public Rectangle getRightWindow(){
        return rightWindow;
    }

    public void setRightWindow(Rectangle rightWindow){
        this.rightWindow = rightWindow;
    }

    public Rectangle getChimney(){
        return chimney;
    }

    public void setChimney(Rectangle chimney){
        this.chimney = chimney;
    }

    public Triangle getRoof(){
        return roof;
    }

    public void setRoof(Triangle roof){
        this.roof = roof;
    }

    public Circle getDoorHandle(){
        return doorHandle;
    }

    public void setDoorHandle(Circle doorHandle){
        this.doorHandle = doorHandle;
    }

    public String toString(){
        return "structure: " + this.structure + "\n" +
                "door: " + this.door + "\n" +
                "left window: " + this.leftWindow + "\n" +
                "right window: " + this.rightWindow + "\n" +
                "chimney: " + this.chimney + "\n" +
                "roof: " + this.roof + "\n" +
                "door handle: " + this.doorHandle + "\n";
    }
}
