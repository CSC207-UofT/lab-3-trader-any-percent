public class Donkey implements Domesticatable, Tradable{
    private String donkeysound = "HEE HAW";

    @Override
    public String sound() {return donkeysound;}

    @Override
    public int getPrice(){
        return 100;
    }
}
