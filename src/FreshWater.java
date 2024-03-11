public class FreshWater extends Fish{

    private boolean dirtyWater;

    public FreshWater(String name, int length, boolean dirtyWater) {
        super(name, length);
        this.dirtyWater = dirtyWater;
    }

    public String toString(){
        String output  = super.toString();
        output += " It lives in ";
        if(dirtyWater){
            output += " dirty water.";
        }
        else{
            output += " clean water.";
        }
        
        return output;
    }

    public boolean isDirtyWater() {
        return dirtyWater;
    }

    public void setDirtyWater(boolean dirtyWater) {
        this.dirtyWater = dirtyWater;
    }
}
