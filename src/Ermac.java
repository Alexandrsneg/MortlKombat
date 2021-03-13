
public class Ermac extends Ninja implements SpecialMoves {

    public Ermac(String name) {
        super(name, "RED");
    }

    @Override
    public void fatality() throws InterruptedException {
        executeFatality();
        Thread.sleep(1000);
        super.fatality();
    }

    @Override
    public void executeFatality() {
        System.out.println("**Ermac** " + getName() + " начинает фаталити");
    }

    @Override
    public void moves() {
        //Супер удары для скорпиона
    }
}




