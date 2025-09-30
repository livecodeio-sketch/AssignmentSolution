package Week_2_Set_1;

public class SecondLargestElement {
    public static void main(String[] args) {
        int arr[] = {14, 28, 19, 33, 45, 12};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second Largest Element = " + secondLargest);
        }
    }
}

