public class MonsterTest {
     public static void main(String[] args) {
        Monster orc = new Monster("오크");
        Monster skeleton = new Monster("해골");
        Monster.battle(orc, skeleton);
     }
 }
    

class Monster{
    private String name;
    private int hp;
    private static int maxHp = 30;

    public Monster(String s){ 
        this.hp = maxHp;
        this.name = s; // 멤버필드를 위에서 가져와서 변수이름 s를 함께 써준다.
    }

    public void attack(Monster enemy){
        int damage = 10;
        enemy.hp -= damage; // 데미지 적용. 변수 = 변수 - 피연산자
    }

    public static void battle(Monster a, Monster b){
        while (a.hp>0 && b.hp>0) {
            Monster attacker = (Math.random()<0.5) ? a:b; 
            //a아니면 b가 50%확률로 지정됨
            Monster defender = (attacker == a) ? b:a;
            //a가 공격이 되면 b가 자동으로 수비가 됨.
            if (attacker == a){
                a.attack(b); //객체 참조변수.멤버
            }else{
                b.attack(a);
            }
            System.out.printf("[%s]의 공격 -> [%s]의 체력: %d/30\n", attacker.name, defender.name,defender.hp);
        }
    }
}