import Service.BillingService;
import entity.Customer;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    static void main(String []args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        BillingService service = new BillingService();
        while(true){
            System.out.println("1. Add Customer with Vehicles\n2. Generate Invoices\n3. Show Invoice\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1 -> {
                    System.out.print("Customer Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Phone: ");
                    String phone = scanner.next();
                    service.customerService.addCustomer(new Customer(0, phone, name));
                    System.out.print("Enter Vehicle Number: ");
                    String vehicleNum = scanner.next();
                    System.out.print("Enter Vehicle Model: ");
                    String model = scanner.next();
                    Customer customerBasedOnNum = service.customerService.getCustomerBasedOnNum(phone);
                }
                case 2 -> {
                    System.out.print("Enter Customer ID: ");
                    int cid = scanner.nextInt();
                    System.out.print("Enter Vehicle ID: ");
                    int vid = scanner.nextInt();
                    System.out.print("Enter Number Of Services: ");
                    int n = scanner.nextInt();
                    List<Integer> sids = new ArrayList<>();
                    for(int i = 0; i < n; i++){
                        System.out.print("Enter the service id: ");
                        sids.add(scanner.nextInt());
                    }
                    service.createInvoice(cid, vid, sids);
                }
                case 3 -> service.showAllInvoices();
                case 4 -> System.exit(0);
                default -> System.out.println("Not a valid choice!");
            }
        }
    }
}
