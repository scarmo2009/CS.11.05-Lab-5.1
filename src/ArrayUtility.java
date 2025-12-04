public class ArrayUtility {

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }

    }

    public static int sum(int[] array) {
        int adding = 0;
        for (int i = 0; i < array.length; i++) {
            adding = adding + (array[i]);
        }
        return adding;
    }

    public static double average(int[] array) {
        double holder = 0;
        for (int i = 0; i < array.length; i++) {
            holder = holder + (array[i]);
        }
        holder = holder / array.length;
        holder = Math.floor(holder * 100.0) / 100.0;
        return holder;
    }

    public static int minimum(int[] array) {
        int minholder = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minholder) {
                minholder = array[i];
            }
        }

        return minholder;
    }

    public static int maximum(int[] array) {
        int maxholder = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxholder) {
                maxholder = array[i];
            }
        }
        return maxholder;
    }

    public static int evenCount(int[] array) {
        int even = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                even = even + 1;
            }
        }
        return even;
    }

    public static int[] reverseOne(int[] array) {
        int[] numbers = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            numbers[i] = array[array.length - i - 1];
        }
        return numbers;
    }

    public static void reverseTwo(int[] array) {
        int[] numbers = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            numbers[i] = array[array.length - i - 1];
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = numbers[i];
        }
    }

    public static boolean linearSearchInt(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean linearSearchString(String[] array, String str) {
        for (String s : array) {
            if (s.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void multiplyByTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
    }

    public static void multiplyByN(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= n;
        }
    }

    public static String toString(int[] array) {
        String results = "";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                results = results + array[i];
            } else {
                results = results + array[i] + ", ";
            }
        }
        return results;
    }


    public static boolean twoSum(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void shiftRight(int[] array) {
        int last = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;
    }

    public static void shiftLeft(int[] array) {
        int first = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = first;
    }

    public static void shiftRightNTimes(int[] array, int n) {
        if (array == null || array.length == 0 || n <= 0) {
            return;
        }

        int length = array.length;
        n = n % length;
        int[] arrayNew = new int[length];
        for (int i = 0; i < length; i++) {
            arrayNew[(i + n) % length] = array[i];
        }
        for (int i = 0; i < length; i++) {
            array[i] = arrayNew[i];
        }
    }

    public static void shiftLeftNTimes(int[] array, int n) {
        if (array == null || array.length == 0 || n <= 0) {
            return;
        }

        int length = array.length;
        n = n % length;
        for (int i = 0; i < n; i++) {
            shiftLeft(array);
        }
    }
}