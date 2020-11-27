/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if10k.pkg10119912.rezkiramadhan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 */ 
public class QUIZIF10K10119912REZKIRAMADHAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        int serviceItem;
        boolean isMember;
        float price, discount;
        
        Scanner scanner = new Scanner(System.in);
        
        ServicePrice serviceprice = new ServicePrice();
        Customer customer    = new Customer();
     
        System.out.println("====Program Kasir Rock n Roll Haircut====");
        System.out.print("Customer Name \t : ");
        customer.setName(scanner.next());
        System.out.print("Customer Email \t : ");
        customer.setEmail(scanner.next());
        serviceprice.displayService();
        serviceItem = scanner.nextInt();
        serviceprice.setPriceService(serviceprice.getPrice(serviceItem));        
        System.out.print("Are you Member (yes/no) : ");
        isMember = serviceprice.checkMemberStatus(scanner.next());
        discount = serviceprice.getSale(isMember, serviceprice.getPriceService());
        
        System.out.println("\n");
        System.out.println("#******************************#");
        System.out.println("#******************************#");
        System.out.println("Date Transaction : " + customer.currentTime());
        System.out.println("Service Price : " + serviceprice.getPriceService());
        System.out.println("Discount : " + discount);
        System.out.println("Total Pay : " + serviceprice.getTotalPay(serviceprice.getPriceService(), discount));
    }
    
}
