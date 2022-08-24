// public class App {
//     public static void main(String[] args) {
//         Square s = new Square();
//         s.name = "정사각형";
//         s.length = 3;
//         Triangle t = new Triangle();
//         t.name = "삼각형";
//         t.base = 4;
//         t.height = 3;
//         Circle c = new Circle();
//         c.name = "원";
//         c.radius = 4;
//         Shape[] shapes = {s,t,c};
//         for (int i =0; i<shapes.length; i++){
//             System.out.printf("%s의 넓이: %.2f\n", shapes[i].name,shapes[i].area());
//         }
//     }
// }
// class Shape{
//     String name;
//     double area(){
//         return 0;
//     }
// }
// class Square extends Shape{
//     int length;
//     double area() {
//         return length * length;
//     }
// }class Triangle extends Shape{
//     int base;
//     int height;
//     double area(){
//         return base * height / 2;
//     }
// }
// class Circle extends Shape {
//     int radius;
//     double area(){
//         return radius * radius * 3.141592;
//     }
// }

class Monster {
    private String name;           
    private int hp;
    private static int maxHp = 30;   // 모든 몬스터의 최대 체력
    
    public Monster(String s) {
        name = s;
        hp = maxHp;  
        }
    public void attack(Monster enemy) {
        enemy.hp = enemy.hp - 10;
    }
    public static void battle(Monster a, Monster b) {
        while (a.hp >0 && b.hp >0) {
            Monster attacker = (Math.random() < 0.5) ? a: b;
            Monster defender = (attacker == a) ? b : a;
            if (attacker == a) {
                attacker.attack(b);
            }else {
                defender.attack(a);
            }
            System.out.printf("[%s]의 공격 -> [%s]의 체력: %d/30\n", attacker.name, defender.name,
            defender.hp);
        }
    }
}    

    public class App {
    public static void main(String[] args) {
        Monster orc = new Monster("오크");
        Monster skeleton = new Monster("해골");
        Monster.battle(orc, skeleton);
    }
}
