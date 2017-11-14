package calcActions;

public class Division {
    public  static double div(double num1, double... nums) {
        
        for(int i = 0; i < nums.length; i++) {
            num1 /= nums[i];
        }
        return num1;
    }
}
