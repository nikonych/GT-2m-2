public class Scooter extends Transport implements Printable{
    ColorEnum color;
    int charge;

    public Scooter(int speed, ColorEnum color, int charge) {
        super(speed);
        this.color = color;
        this.charge = charge;
    }


    @Override
    public void print() {
        System.out.println("Scooter{" +
                "color=" + color +
                ", charge=" + charge +
                ", speed=" + speed +
                '}');
    }
}
