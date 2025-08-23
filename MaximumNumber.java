public class MaximumNumber {

    public static int findMaxNum(int[] arr){
        int max = arr[0];
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }
        return max;

    }

    public static void main(String[] args) {

        int[] arr = {3, 1, 4, 1, 5, 9, 7};

        System.out.println(findMaxNum(arr));

    }
}
