package NoteByMyself.Cha1Sec1;

/**
 * Array must be sorted.Function is to find position of  'key' in 'array'.
 */
public class BinarySearch {
    public static Integer rank(Integer key, Integer[] array) {
        int lo = 0;
        int hi = array.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < array[mid]) hi = mid - 1;
            else if (key > array[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
}
