public class Motorbike extends Transport implements Printable{
    ColorEnum color;
    int horsepower;

    public Motorbike(int speed, ColorEnum color, int horsepower) {
        super(speed);
        this.color = color;
        this.horsepower = horsepower;
    }


    @Override
    public void print() {
        System.out.println("Motorbike{" +
                "color=" + color +
                ", horsepower=" + horsepower +
                ", speed=" + speed +
                '}');
    }
}
