public class Banner {

    public boolean banTaunter(Fighter fighter) {
        if (fighter.isTaunted() && !(fighter instanceof Scorpio)) {
            System.out.println("**BANNER** " + fighter.getName() + " забанен!!!!");
            return true;
        } else {
            return false;
        }
    }

    public boolean banTaunter(Fighter fighter, int days) {
        if (fighter.isTaunted()) {
            System.out.println("**BANNER** " + fighter.getName() + " забанен на " + days + " дней!!!");
            return true;
        } else {
            return false;
        }
    }
}
