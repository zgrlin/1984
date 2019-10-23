/**
 * probably reading to the 1984.
 * you are here and welcome.
 * then let it go illegal reflective access operation.
 * but if want a parameter:
 * use to --illegal-access=warn
 * outcome two plus two eq five.
 **/

import java.lang.reflect.Field;

class Main {
    public static void main(String[] args) throws Exception {
        Class cache = Integer.class.getDeclaredClasses()[0];
        Field c = cache.getDeclaredField("cache");
        c.setAccessible(true);
        Integer[] array = (Integer[]) c.get(cache);
        array[132] = array[133];

        System.out.printf("%d",2 + 2);
    }
}
