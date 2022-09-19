public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;

    }

    public String info(){
        return "Урон босса "+ getDamage() + "\n Zdorovve BOssa" + getHalth()  +  "\n orugie boss" +
                weapon.getWeaponType() + "\n Orugie " + weapon.getWeaponType();

    }
}
