import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CustomerServiceQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> customerQueue = new LinkedList<>();

        while (true) {
            System.out.println("--- Customer Service Queue ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Remove Customer");
            System.out.println("3. View Next Customer");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Customer ID: ");
                    int customerId = scanner.nextInt();
                    customerQueue.add(customerId);
                    System.out.println("Customer added to the queue.");
                    break;

                case 2:
                    if (!customerQueue.isEmpty()) {
                        int removedCustomer = customerQueue.poll();
                        System.out.println("Customer ID " + removedCustomer + " has been removed from the queue.");
                    } else {
                        System.out.println("The queue is empty. No customer to remove.");
                    }
                    break;

                case 3:
                    if (!customerQueue.isEmpty()) {
                        System.out.println("Next customer ID: " + customerQueue.peek());
                    } else {
                        System.out.println("The queue is empty. No next customer.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}