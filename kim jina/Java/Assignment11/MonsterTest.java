class Monster {
    private String name;
    private int hp;
    private static int maxHp = 30; //모든 몬스터의 최대 체력

    public Monster(String s) {
        this.name = s;
        this.hp = 30;
    } //monster의 생성자 메소드
    public void attack(Monster enemy) {
        enemy.hp = enemy.hp - 10; 
        }
    public static void battle(Monster a, Monster b) {
        while (a.hp > 0 && b.hp > 0) {
            Monster attacker = (Math.random() < 0.5) ? a : b;
            Monster defender = (attacker == a) ? b : a;

        while (true) {
            if (defender.hp > 0) {
                defender.attack(defender);
                System.out.printf("[%s]의 공격 -> %s의 체력: %d/%d", 
                attacker.name, defender.name, defender.hp, maxHp);
                System.out.println("");
                break;
            }
            else if (defender.hp == 0) {
                System.out.printf("[%s의 공격] -> %s의 체력: %d/%d", 
                attacker.name, defender.name, defender.hp, maxHp);
                System.out.println("");
                break;
            }
            else {
                break;
            }
            }
        }
    }
}
public class MonsterTest {
    public static void main(String[] args) throws Exception {
        Monster orc = new Monster("오크");
        Monster skeleton = new Monster("해골");
        Monster.battle(orc, skeleton);
        
    }
}
