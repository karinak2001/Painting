public class CustomPainting {
    private House[] houses;
    private Tree[] trees;

    public CustomPainting(House[] houses, Tree[] trees){
        this.houses = houses;
        this.trees = trees;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        if (houses != null){
            stringBuilder.append("Houses: ").append("\n");
            for (int i = 0; i < this.houses.length; i++) {
                stringBuilder.append(i + 1).append(": ").append(this.houses[i]);
            }
        }
        if (trees != null){
            stringBuilder.append("Trees: ").append("\n");
            for (int i = 0; i < this.trees.length; i++) {
                stringBuilder.append(i + 1).append(": ").append(this.trees[i]);
            }
        }
        return stringBuilder.toString();
    }

}
