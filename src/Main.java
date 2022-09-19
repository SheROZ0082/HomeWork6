public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.getWeapon().setWeaponType(WeaponType.LazerWeapon);
        boss.getWeapon().setWeaponType("Kichen"); System.out.println(boss.info());
        boss.getWeapon().setWeaponType("Kichen");System.out.println(boss.info());
        boss.setHalth(1000);
        boss.setDamage(2000);


        Skeleton skeleton = new Skeleton();
        skeleton.getWeapon().setWeaponType(WeaponType.CosmoWeapon);
        skeleton.getWeapon().setWeaponType("galaxi");System.out.println(skeleton.info());
        skeleton.getWeapon().setWeaponType("galaxi");System.out.println(skeleton.info());
        skeleton.setHalth(500);
        skeleton.setDamage(70);

        Skeleton skeleton1 = new Skeleton();
        skeleton1.getWeapon().setWeaponType(WeaponType.CosmoWeapon);
        skeleton1.getWeapon().setWeaponType("galaxi");System.out.println(skeleton.info());
        skeleton1.getWeapon().setWeaponType("galaxi");System.out.println(skeleton.info());
        skeleton1.setHalth(200);
        skeleton1.setDamage(50);




    }
}