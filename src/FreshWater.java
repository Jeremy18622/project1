public class FreshWater extends Fish{

    private boolean dirtyWater;

    public FreshWater(String name, int length, boolean dirtyWater) {
        super(name, length);
        this.dirtyWater = dirtyWater;
    }

    public String toString(){
        String output  = "";
        return output;
    }

    public boolean isDirtyWater() {
        return dirtyWater;
    }

    public void setDirtyWater(boolean dirtyWater) {
        this.dirtyWater = dirtyWater;
    }
}
