import java.util.Random;

public enum BikeTypeEnum {
    BMX, Mountain, Road, Electric;

    private static final Random PRNG = new Random();

    public static BikeTypeEnum randomType()  {
        BikeTypeEnum[] typeenum = values();
        return typeenum[PRNG.nextInt(typeenum.length)];
    }

}
