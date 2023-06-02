public class PowerOf {
    public static void main (String[] args) {
        int number = 10;
        int power = 18;
        
        int result = powerOf(number, power);
        
        System.out.println(number + " to the power of " + power + " is equal " + result);
    }

    public static int powerOf(int number, int power) {
        if (power == 0) {
            return 1;
        }
        
        int result = 1;
        
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        
        return result;
    }
}
