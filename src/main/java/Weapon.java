public class Weapon implements RoomContent {

    private String name;
    private int damage;
    private String action;

    public Weapon(String name, int damage, String action){
        this.name = name;
        this.damage = damage;
        this.action = action;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }






}
