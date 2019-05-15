package com.company;

import java.util.Scanner;

class Main {


    static int choice = 0;

    public static void main(String[] args) {
        Main object = new Main();
        Scanner intScan = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        String name, phone, business_name, contact_name;
        System.out.print("Enter 1 for residential, 2 for business or 3 to exit: ");

        while (choice != 3) {

            choice = intScan.nextInt();
            switch(choice) {

                case 1: {
                    System.out.print("Enter name: ");
                    name = scan.nextLine();
                    System.out.print("Enter phone: ");
                    phone = scan.nextLine();

                    object.display(name, phone);
                }	break;

                case 2:	{
                    System.out.print("Enter business name: ");
                    business_name = scan.nextLine();
                    System.out.print("Enter contact name: ");
                    contact_name = scan.nextLine();
                    System.out.print("Enter phone: ");
                    phone = scan.nextLine();

                    object.display(business_name, contact_name, phone);
                }	break;

                case 3:	{
                    System.out.print("\nExiting!\n");
                    return;
                }
                default:System.out.println("Error has occurred somewhere...\n");
                    break;
            }

            System.out.print("\n\nEnter choice: ");
        }

    }



    public static void display(String name, String phone) {

        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
    }


    public static void display(String business_name, String contact_name, String phone) {

        System.out.println("Business: " + business_name);
        System.out.println("Contact name: " + contact_name);
        System.out.println("Phone: " + phone);

    }

}

