public class MonsterTest     {
    public static void main(String[] args) throws Exception {
        Monster orc = new Monster("오크");
        Monster skeleton = new Monster("해골");
        Monster.battle(orc, skeleton);
    }
}

class Monster {
    private String name;
    private int hp;
    private static int maxHp = 30;

    public Monster(String s) {
        this.name = s;
        this.hp = 30;
    }

    public void attack(Monster enemy){
        enemy.hp -= 10;
    }

    public static void battle(Monster a, Monster b) {
        while(a.hp>0 && b.hp>0){
            Monster attacker = (Math.random()<0.5) ? a:b;
            Monster defender = (attacker == a) ? b:a;
            while (true) {
                if (defender.hp == maxHp) {
                    attacker.attack(defender);
                    System.out.printf("[%s]의 공격 -> %s의 체력: %d/%d\n", attacker.name, defender.name, defender.hp, maxHp);               
                }
                else if (defender.hp < 30) {
                    attacker.attack(defender);
                    System.out.printf("[%s]의 공격 -> %s의 체력: %d/%d\n", attacker.name, defender.name, defender.hp, maxHp);
                }
                else if (defender.hp == 0 || attacker.hp == 0) {
                    break;
                }
                break;
            }
        }
    }
}
