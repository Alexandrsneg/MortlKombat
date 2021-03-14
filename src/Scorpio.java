
public class Scorpio extends Ninja implements SpecialMoves {

    public Scorpio(String name) {
        super(name, "YELLOW");
    }

    @Override
    public void fatality() throws InterruptedException {
        executeFatality();
        Thread.sleep(1000);
        super.fatality();
    }

    @Override
    public void taunt() {
        System.out.println("**Scorpio** " + getName() + " угарает над противником по Скорпионовски");
        super.taunt();
    }

    @Override
    public void executeFatality() {
        System.out.println("**Scorpio** " + getName() + " набрана павильная комбинация для фаталити Скорпиона");
    }

    @Override
    public void moves() {
        //Супер удары для скорпиона
    }
}




