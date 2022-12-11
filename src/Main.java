import java.util.Random;

public class Main {





    public static void main(String[] args) {
        Transport transport1 = createObject("Bike");
        Transport transport2 = createObject("Motorbike");
        Transport transport3 = createObject("Scooter");


        transport1.print();
        transport2.print();
        transport3.print();


    }


    static Transport createObject(String className){
        Random random = new Random();
        switch (className){
            case "Bike":
                return new Bike(random.nextInt(100) , ColorEnum.randomColor(), BikeTypeEnum.randomType());
            case "Motorbike":
                return new Motorbike(random.nextInt(100), ColorEnum.randomColor(), random.nextInt(100));
            case "Scooter":
                return new Scooter(random.nextInt(100), ColorEnum.randomColor(), random.nextInt(100));
        }
        return null;
    }

}