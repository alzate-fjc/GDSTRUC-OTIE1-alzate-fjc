public class Main {
    public static void main(String[] args) {
        int[] nums = {-75, -22, 9, 24, 61, 78, 91, 653};

        int findValue = 61;
        int index = altEndsSearch(findValue, nums);

        if (index == -1) {
            System.out.println("Value " + findValue + " is not in the array.");
        }
        else {
            System.out.println("Value " + findValue + " is found at index " + index);
        }

        findValue = 100;
        index = altEndsSearch(findValue, nums);

        if (index == -1) {
            System.out.println("Value " + findValue + " is not in the array.");
        }
        else {
            System.out.println("Value " + findValue + " is found at index " + index);
        }
    }

    private static int altEndsSearch(int value, int[] nums) {
        //UNSORTED
        //1 - Two pointers, one at the beginning and one at the end
        //2 - Check if value exists at the left pointer
        //3 - Check if value exists at the right pointer
        //4 - Move left pointer forward and right pointer backward.
        //5 - Repeat till the pointers cross over
        //6 - Return -1 if value not found
        // Time complexity - O(n)

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[left] == value) {
                return left;
            }

            if (left != right && nums[right] == value) {
                return right;
            }

            left++;
            right--;
        }

        return -1;
    }
}

