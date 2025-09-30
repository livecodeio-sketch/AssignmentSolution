package Week_2_Set_1;

public class ElementFrequency {
    public static void main(String[] args) {
        int arr[] = {2, 4, 2, 6, 2, 9, 6};
        boolean visited[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " appears " + count + " times");
        }
    }
}

class ElementFrequencyInPlace {
    public static void main(String[] args) {
        int arr[] = {2, 4, 2, 6, 2, 9, 6};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1;
                }
            }

            System.out.println(arr[i] + " appears " + count + " times");
        }
    }
}
