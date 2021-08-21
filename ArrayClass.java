import java.util.Arrays;

class ArrayClassDemo {

    public static void main(String[] args) {

        int[] numbers = {1, 4, 5, 6, 7};
        int index = Arrays.binarySearch(numbers, 4);
        System.out.println(index);

        Integer[] nums = {19, 0, 3, 4, 21, 95};
        Arrays.sort(nums);

        for (int i:nums){
            System.out.print(i + " ");
        }

    }

}