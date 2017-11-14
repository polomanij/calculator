package calcActions;

public class Multiplication {
    public static double multiply(double... nums) {
        double result = nums[1];
        
        for(int i = 1; i < nums.length; i++) {
            result *= nums[i];
        }
        
        return result;
    }
}
