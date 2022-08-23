class Monster{
    private String name;
    private int hp;
    private static int maxHp = 30;
    public Monster(String s){
        this.name = s;
        this.hp = maxHp;
    }
    public void attack(Monster enemy){
        double damage = Math.random()*20;
        enemy.hp -= damage;
        System.out.printf("%s attacks %s for %.1f damage! \n", this.name, enemy.name,damage);
        System.out.println(this.name + ": "+this.hp +" "+ enemy.name+ ": "+ enemy.hp);
    }
    public static void battle(Monster a, Monster b){
        while (a.hp>0 && b.hp>0) {
            Monster attacker = (Math.random()<0.5)?a:b;
            Monster defender = (attacker == a)? b: a;
            attacker.attack(defender);
        }
    }
}
public class MonsterTest {
    public static void main(String[] args) {
        Monster orc = new Monster("오크");
        Monster skeleton = new Monster("해골");
        Monster.battle(orc, skeleton);
    }
}
