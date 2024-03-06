public class Tarpon extends SaltWater{

    private String prey;
    public Tarpon(String name, int length, boolean dirtyWater, String prey) {

        super(name, length, dirtyWater);
        this.prey = prey;
    }

    public String eat(){
        String output = super.eat();
        output += " called " + prey;
        return output;
    }

    public String toString(){
        String output  = "";
        return output;
    }

    public String getPrey() {
        return prey;
    }

    public void setPrey(String prey) {
        this.prey = prey;
    }
}
