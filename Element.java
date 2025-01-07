import java.util.Scanner;

public class Element {
    void linearSearch(int arr[], int size, int key) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Element " + key + " found at index " + i);
                return;
            }
        }
        System.out.println("Element " + key + " not found.");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        
        System.out.print("Enter element to search: ");
        int key = scanner.nextInt();
        
        new Element().linearSearch(arr, n, key);
        scanner.close();
    }
}
