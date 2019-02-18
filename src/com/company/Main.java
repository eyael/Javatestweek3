package com.company;

import java.util.ArrayList;
import java.util.Scanner;

;

public class Main {

    static Double tax;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Customer myobj = new Customer();
        String user = "";
        String addanotheritem = "";
        int quan = 0;
        double taxMD = 0.06;
        double taxDC = 0.053;
        double taxVA = 0.0575;
        double taxOT = 0.05;


        ArrayList<Customer> item = new ArrayList<>();
        ArrayList<Invoice> item2 = new ArrayList<Invoice>();


        System.out.println("Enter your name: ");
        String customername = sc.nextLine();

        System.out.println("Enter your Street Address: ");
        String address = sc.nextLine();


        System.out.println("Enter the Date://MM/D/YR ");
        String date = sc.next();


        System.out.println("Enter your Account number: ");
        String accountnumber = sc.next();
        System.out.println();
        item.add(new Customer(customername, accountnumber, date, address));
        double subtotal = 0;
        double salestax = 0;
        double cost=0;

        double Total;

        do {
            System.out.println("Enter item name:");
            String itemname = sc.next();

            System.out.println("price:");
            double price = sc.nextDouble();

            System.out.println("quantity:");
            int quantity = sc.nextInt();

             cost += price*quantity;

            subtotal += cost;


            System.out.println("is it taxable(true|false):");
            boolean taxable = sc.nextBoolean();
            if (taxable) {

                System.out.println("Enter your state: ");
                String state = sc.next();
                if (state.equalsIgnoreCase("MD")) {
//
                    tax = quantity * price * 0.06;
                } else if (state.equalsIgnoreCase("DC")) {
                    tax = quantity * price * 0.053;

                } else if (state.equalsIgnoreCase("VA")) {

                    tax = quantity * price * 0.0575;

                } else if (state.equalsIgnoreCase("OT")) {
                    tax = quantity * price * 0.05;

                }
            }

            salestax += tax;
            Total = subtotal += salestax;


            item2.add(new Invoice(itemname, price, quantity, taxable));

            System.out.println("Add another item?(type any key to continue | type 'no' to exit)");
            addanotheritem = sc.next();
            System.out.println();

        } while (!addanotheritem.equalsIgnoreCase("no"));

        for (Customer itemss : item) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Customer name: " + itemss.getCustomername());
            System.out.print("Address: " + itemss.getAddress() + "," + itemss.getAddress() + "," + itemss.getAddress() + "\n");
            System.out.println("Date: " + itemss.getDate());
            System.out.println("Account Number: " + itemss.getAccountnumber());
            System.out.println("--------------------------------------------------------------------");
            System.out.println();
        }


            System.out.println("Item Name         Quantity         Price       Cost          Taxable\n");
            System.out.println("===========================================================================\n");

        for (Invoice name : item2) {
            System.out.print(name.getItemname() + "               " + name.getQuantity() + "                " +
                    name.getPrice() + "           " + cost + "          " + name.isTaxable() + "\n");  }
            System.out.println("Subtotal: $" + subtotal);
            System.out.println("Sates Tax: " + salestax);
            System.out.println("------------------------------------------------------------------------------");
            System.out.println("Total: $" +(subtotal+salestax));

        }
    }




