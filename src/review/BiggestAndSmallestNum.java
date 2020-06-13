package review;

public class BiggestAndSmallestNum {
    public static void main(String[] args) {
        int [] a = {100,400, 500, -500, 0, -200};
        findBigAndsmall(a);
    }



    public static void findBigAndsmall(int[] nums) {

        int big = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > big) {
                big = num;
            }
            if (num < small) {
                small = num;
            }
        }
        System.out.println("Biggest number " + big);
        System.out.println("Smallest number " + small);
    }
}

