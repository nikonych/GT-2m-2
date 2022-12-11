public class Bike extends Transport implements Printable{
    ColorEnum color;
    BikeTypeEnum type;

    public Bike(int speed, ColorEnum color, BikeTypeEnum type) {
        super(speed);
        this.color = color;
        this.type = type;
    }


    @Override
    public void print() {
        System.out.println("Bike{" +
                "color=" + color +
                ", type=" + type +
                ", speed=" + speed +
                '}');
    }
}
