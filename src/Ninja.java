
public class Ninja extends Fighter {
    private String ninjaColor;

    public Ninja(String name, String color){
        if (!color.equals("BLACK"))
        this.ninjaColor = color;

        super.setName(name);

    }

    @Override
    public void run() {
        System.out.println("**NINJA** Анимация бега для ниндзей");
        super.run();
    }

    @Override
    public void jump() {
        System.out.println("**NINJA** Анимация прыжка для ниндзей");
        super.jump();
    }

    @Override
    public void hit() throws InterruptedException {
        System.out.println("**NINJA - hit** Анимация удара для ниндзей");
        Thread.sleep(1000);
        super.hit();
    }

    public void fatality() throws InterruptedException {
        String perkName = getName();
        switch (this.ninjaColor){
            case "YELLOW":
                System.out.println("**NINJA - fatality** " + perkName + " фаталирует огнем");
                break;
            case "BLUE":
                System.out.println("**NINJA - fatality** " +perkName + " фаталирует льдом");
                break;
            case "GREEN":
                System.out.println("**NINJA - fatality** " +perkName + " фаталирует кислотой");
                break;
            case "RED":
                System.out.println("**NINJA - fatality** " +perkName + " фаталирует по ЕРМАКовски");
                break;
        }
        Thread.sleep(1000);
        super.fatality();
    }

    private void ninjaFinalPose(){
        System.out.println("**NINJA** Анимация финальной позы");
    }
}
