public class SaltWater extends Fish{

    private boolean dirtyWater;
    public SaltWater(String name, int length, boolean dirtyWater) {
        super(name, length);
        this.dirtyWater = dirtyWater;
    }

    public boolean isDirtyWater() {
        return dirtyWater;
    }

    public void setDirtyWater(boolean dirtyWater) {
        this.dirtyWater = dirtyWater;
    }
}
