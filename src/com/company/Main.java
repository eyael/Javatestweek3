package com.company;
import java.util.ArrayList;
import java.util.Scanner;

;
public class Main {
    static String streetAddress;
    static int zipcode;
    static String state;
    static String ad;
    static Double cost;
    static Double tax;
    static double subtotal;
    static double salestax;
    static double Total;
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Customer myobj = new Customer();
        String user = "";
        String addanotheritem ="";
        int quan = 0;
        double taxMD = 0.06;
        double taxDC = 0.053;
        double taxVA = 0.0575;
        double taxOT = 0.05;


        ArrayList<Customer> item = new ArrayList<>();
        ArrayList<Address>  item2=new ArrayList<>();


        do { System.out.println("Enter your name: ");
             String customername = sc.nextLine();

             System.out.println("Enter your Street Address: ");
            streetAddress = sc.nextLine();

            System.out.println("Enter your zipcode: ");
            zipcode = sc.nextInt();

            System.out.println("Enter your State: ");
            state = sc.next();


            System.out.println("Enter the Date://MM/D/YR ");
            String date = sc.next();


            System.out.println("Enter your Account number: ");
            String accountnumber = sc.next();


            System.out.println("Enter item name");
            String Name = sc.next();


            System.out.println("price");
            double price = sc.nextDouble();

            System.out.println("quantity");
            int quantity = sc.nextInt();

            System.out.println("is it taxable(true|false)");
            boolean taxable = sc.nextBoolean();

            item2.add(new Address(streetAddress,zipcode,state));


            item.add(new Customer(customername,ad,date,accountnumber,Name,price,quantity,taxable));
            System.out.println("Add another item?(type any key to continue | type 'no' to exit)");
            addanotheritem=sc.next();

        }while(!addanotheritem.equalsIgnoreCase("no"));

        for (Customer address :item) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Customer name: "+ address.getCustomername());
            System.out.print("Address: "+address.getAddress()+","+address.getAddress()+","+address.getAddress()+"\n");
            System.out.println("Date: "+address.getDate());
            System.out.println("Account Number: "+address.getAccountnumber());
            System.out.println("--------------------------------------------------------------------");

            if(user.equalsIgnoreCase("MD")) {
                tax = address.getQuantity() * address.getPrice()*0.06;

            }
            else if(user.equalsIgnoreCase("DC")){
                tax = address.getQuantity() * address.getPrice()*0.053;

            }
            else if(user.equalsIgnoreCase("VA")){

                tax = address.getQuantity() * address.getPrice()*0.0575;

            } else {
                tax = address.getQuantity() * address.getPrice() * 0.05;


                cost = address.getQuantity() * address.getPrice();
                subtotal += cost;
                salestax += tax;
                Total = subtotal+=salestax;

            System.out.print("Item Name         Quantity         Price       Cost          Taxable\n");
            System.out.print("===========================================================================\n");
            System.out.print(address.getName()+"               "+address.getQuantity()+"                "+address.getPrice()+"           "+cost+"          "+address.isTaxable()+"\n");
            System.out.println("Subtotal"+subtotal);
            System.out.println("Sates Tax"+salestax);
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("Total");}

        }

    }

}