public class Hero {
        private int health;
        private int damage;
        private int magic;


        public Hero(int health,int damage,int magic){
         this.health=health;
         this.damage=damage;
         this.magic=magic;
        }
        public Hero(int health,int damage){
        this.health=health;
         this.damage=damage;
        }
        public int getHealth(){
            return this.health ;
        }

    public int getDamage() {
        return this.damage;
    }
    public int getMagic(){
            return this.magic;
    }
}
