package model.enemies;

public class InfernalDog  extends Enemy{
    private String name = "Infernal Dog";
    private long healt = 13;
    private long damage;

    public InfernalDog() {
        livelMin = 1;
        livelMax = 2;
    }

    /*public Skeleton(){
        Enemy enemy = new Skeleton(name, 15);
    }

    public Skeleton(String name, long healt){
        this.name = name;
        this.healt = healt;
    }*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getHealt() {
        return healt;
    }

    @Override
    public void setHealt(long healt) {
        this.healt = healt;
    }

    public void setHealt(int healt) {
        this.healt = healt;
    }

    public long getDamage() {
        return damage;
    }

    @Override
    public void setDamage(long damage) {

    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public void doAttack() {

    }

    @Override
    public long doDefend() {
        return Math.round(Math.random() * (7 - 4) + 1);
    }

    @Override
    public void doSpecialAbility() {

    }

    public long setDamageOutput() {
        return Math.round(Math.random() * (7 - 5) + 5);
    }

    public boolean isAlive() {
        if (this.getHealt()>0) {
            return true;
        } else if (this.getHealt() <= 0) {
            return false;
        }
        return false;
    }

}
