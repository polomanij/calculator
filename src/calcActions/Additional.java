package calcActions;

public class Additional {
    public static double add(double ... nums) {
        double result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        
        return result;
    }
}
