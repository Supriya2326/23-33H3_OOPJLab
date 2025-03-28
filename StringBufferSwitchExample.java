import java.util.Scanner;

public class StringBufferSwitchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        StringBuffer sb = new StringBuffer("Hello, Java World!");
        
        System.out.println("Original String: " + sb);
        
       
        System.out.println("\nChoose an operation:");
        System.out.println("1: Delete a substring");
        System.out.println("2: Delete a specific character");
        
        System.out.print("Enter your choice: ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
         
                sb.delete(7, 12); // "Java" starts at index 7 and ends at 11
                System.out.println("After deleting 'Java': " + sb);
                break;
                
            case 2:

                sb.deleteCharAt(4);
                System.out.println("After deleting ',': " + sb);
                break;

           
           
                
            default:
                System.out.println("Invalid choice! No changes made.");
        }
        
        scanner.close();
    }
}