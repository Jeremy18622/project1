public class FishDriver {

    public static void main(String[] args) {

        Fish fish = new Fish("John the Fish", 12);
        SaltWater saltyFish = new SaltWater("Eric the saltwater fish", 40, false);
        FreshWater freshFish = new FreshWater("Maddie the freshwater fish", 16, true);
        Tarpon tarpon = new Tarpon("Tony the Tarpon", 60, true, "Pinfish");
        Bass bass = new Bass("Billy the Bass", 21, false, "Bluegill");
        Bluegill bluegill = new Bluegill("Ben the Bluegill", 6, false, "Minnows");

        Fish[][] array = {{fish, saltyFish, freshFish}, {tarpon, bass, bluegill}};

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length[i]; j++){
                System.out.println(array[i][j].toString());
                System.out.println(array[i][j].eat());
            }
        }
    }

}
