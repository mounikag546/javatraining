package Exam;

public class  Number {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 3, 45, 67};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
            }
            System.out.println("maximum number" + max);


        }
    }
