public class Painting {
    private House house;
    private Tree tree1;
    private Tree tree2;
    private Tree tree3;

    public Painting(House house, Tree tree1, Tree tree2, Tree tree3){
        this.house = house;
        this.tree1 = tree1;
        this.tree2 = tree2;
        this.tree3 = tree3;
    }

    public String toString(){
        return "House: " + this.house + "\n" +
                "tree1: " + this.tree1 + "\n" +
                "tree2: " + this.tree2 + "\n" +
                "tree3: " + this.tree3 + "\n";
    }
}
