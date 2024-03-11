public class Fish {

    private String name;
    private int length;

    public Fish(String name, int length){
        this.length = length;
        this.name = name;
    }
    public String eat(){
        String output = name + " ate a fish";
        return output;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String toString(){
        String output  = "This fishes name is " + getName() + " and it is " + getLength() + " inches long.";
        return output;
    }

}
