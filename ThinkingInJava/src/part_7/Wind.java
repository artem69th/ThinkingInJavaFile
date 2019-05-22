package part_7;
class Instrument {
    private final int ii = 1;

    public void play()
    {
    }
    static void tune(Instrument i) {
        //....
        i.play();
    }
}
public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute); // Восходящее преобразование
        //Объекты Wind также являются объектами Instrument,
        // поскольку они имеют тот же интерфейс:
        Instrument instrument = flute; //преобразование объекта Wind в Instrument
    }
}
