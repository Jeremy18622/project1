public class Bluegill extends FreshWater{

    private String prey;
    public Bluegill(String name, int length, boolean dirtyWater, String prey) {
        super(name, length, dirtyWater);
    }

    public String eat(){
        String output = super.eat();
        output += " called " + prey;
        return output;
    }

    

    public String getPrey() {
        return prey;
    }

    public void setPrey(String prey) {
        this.prey = prey;
    }
}
