public class Main {
    public static int creatHeroes () {
        Hero archer = new Hero(400, 45, 20);
        Hero medic = new Hero(600, 20, 55);
        Hero warrior = new Hero(400, 50);


        return 0;
    }


    public static void main(String[] args) {
        Boss john = new Boss();
        john.setHealth(500);
        john.setDamage(50);
        john.setKinetic(25);
        System.out.println("John health:" + john.getHealth() + "Damage:" + john.getDamage() + "Kinetic:"
                + john.getKinetic());
        creatHeroes();






    }





    }


