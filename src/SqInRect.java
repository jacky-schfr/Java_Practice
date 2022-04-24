/** Exercise by g964 from Codewars
 *
 *  We get a "true" rectangle. If the rectangle is not "true" (-->width == height), null will be returned.
 *  Now we cut this rectangle into as many and as big squares as possible.
 *  We will return a List with the length of one side from each square.
 *
 */

import java.util.ArrayList;
import java.util.List;

public class SqInRect {

    public static List<Integer> sqInRect(int hght, int wdth) {
        int x = wdth, y = hght;
        ArrayList<Integer> values = new ArrayList<>();
        int value;

        if (hght != wdth) {
            while (y != 0 && x != 0) {
                value = chooseBigger(x, y);
                if (x != value) {
                    values.add(x);
                    value = y - x;
                    y -= x;
                }
                if (y != value) {
                    values.add(y);
                    x -= y;
                }
                if (x == y) {
                    values.add(x);
                    y = 0;
                    x = 0;
                }
            }
            return values;
        } else {
            return null;
        }
    }

    public static int chooseBigger(int x, int y) {
        int value = 0;

        if (x > y) {
            value = x;
        }
        if (y > x) {
            value = y;
        }
        if (x == y) {
            value = x;
        }
        return value;
    }
}
