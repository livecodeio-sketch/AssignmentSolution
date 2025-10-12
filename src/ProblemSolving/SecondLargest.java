package ProblemSolving;

public class SecondLargest {
    public static void main(String[] args) {
        // -5 -2 -10 -3
        // 7 7 7 7
        // 5 8 12 7 3
        // 5 8 6 1 2
        int [] arr = {5,8,6,1,2};
        // int [] arr = {7, 7, 7 ,7};

        int largest = -99999;
        int secondLargest = -99999;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]> secondLargest){
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest: "+ largest);
        System.out.println("Second Largest: "+secondLargest);

    }
}
