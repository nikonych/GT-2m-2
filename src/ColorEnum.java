import java.util.Random;

public enum ColorEnum {
    black, white, red, green;

    private static final Random PRNG = new Random();

    public static ColorEnum randomColor()  {
        ColorEnum[] colorenum = values();
        return colorenum[PRNG.nextInt(colorenum.length)];
    }
}
