
public class JohnyCage extends Fighter implements SpecialMoves {
    public JohnyCage(String name) {
        setName(name);
    }

    @Override
    public void fatality() throws InterruptedException {
        executeFatality();
        Thread.sleep(1000);
        super.fatality();
    }

    @Override
    public void hit() throws InterruptedException {
        System.out.println("**JohnyCage - hit** анимация ударов " + getName());
        Thread.sleep(1000);
        super.hit();
    }

    @Override
    public void executeFatality() {
        System.out.println("**JohnyCage - fatality** " + getName() + " фаталирует ногами");
    }

    @Override
    public void moves() {
        //Супер удары для JohnyCage
    }
}




