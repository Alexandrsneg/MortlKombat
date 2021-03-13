import java.util.TreeMap;

public abstract class Fighter{
   private String name;
   private int health = 100;
    private int damage = 10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("Goro")){
            health = 200;
            damage = 30;
        }
        this.name = name;
    }

    public int getHealth() {
        return health;
    }
    public int getDamage() { return damage; }

    public void run() {
        System.out.println("**FIGHTER** Сложный код ускорения персонажа");
    }

    public void jump() {
        System.out.println("**FIGHTER** Сложный код прыжка!");
    }

    public void hit() throws InterruptedException {
        System.out.println("**FIGHTER - hit** Логика связанная со здоровьем, блоками и тп");
        Thread.sleep(1000);
    }

    public void fatality() throws InterruptedException {
        System.out.println("**FIGHTER - fatality** Надпись фаталити в конце");
    }

}
