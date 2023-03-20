import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TicketCinema {
    public static void main(String[] args) {
        Queue<String> customers = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean cont = true;
        do {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập tên khách hàng chờ mua vé xem phim\n" +
                    "2. Khách tiếp theo\n" +
                    "3. Thoát");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Enter name of customer");
                    String newCustomer = sc.nextLine();
                    customers.add(newCustomer);
                    break;
                case 2:
                    System.out.println(customers.peek());
                    customers.remove();
                    break;
                case 3:
                    cont = false;
            }
        } while (cont);

    }
}
