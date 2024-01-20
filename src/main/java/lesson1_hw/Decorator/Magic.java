package lesson1_hw.Decorator;

/**
 * This Magic class
 */
public class Magic {
    /**
     *
     * @param name - person name
     * @param sound - animal sound
     * @return - Person meet animal
     */
    public static String useMagic(String name, String sound){
        String result = name+' '+sound;
        return result;
    }
}
