import java.time.LocalDate;
import java.util.Random;
import java.time.LocalDateTime;

public class currentOrder
{
    public int room;
    public double total;
    public String date;
    public short coffeeAmount;
    public String coffeeCreamer;
    public short cocoa;
    public short danish;
    public String danishFlavor;
    public short muffin;
    public String muffinFlavor;
    public short bar;
    public int identifier=new Random().nextInt();

    public currentOrder( double t, short ca, String cc, short c, short dan, String df, short m, String mf, short b)
    {
        date = LocalDate.now().toString();
        total = t;
        coffeeAmount = ca;
        coffeeCreamer = cc;
        cocoa = c;
        danish = dan;
        danishFlavor = df;
        muffin = m;
        muffinFlavor = mf;
        bar = b;
    }
}
