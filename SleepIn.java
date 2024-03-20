public class SleepIn {
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if ((!weekday && !vacation) || (weekday && vacation))
            return true;
        else{
            return false;
        }
    }
    public static void main (String[] args){
        boolean result = sleepIn(false, false);
        System.out.println(result);

    }
}