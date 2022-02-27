public class Weapon {
    protected int fire() {
        return 1;
    }
}

class Cannon extends Weapon {
    @Override
    protected int fire() {
        return 10;
    }


    public static void main(String[] args) {
        Weapon wp = new Weapon();
        wp.fire();
        System.out.println("무기 살상능력은 " + wp.fire());

        wp = new Cannon();
        wp.fire();
        System.out.println("무기 살상능력은 " + wp.fire());
    }
}
