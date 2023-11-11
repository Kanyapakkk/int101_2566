/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package int101.homework02;
import work01.Utilitor;
import work02.Person;
import work03.Account;

/**
 *
 * @author Admin
 */
public class Homework02 {

 

    public static void main(String[] args) {
       work01Utilitor();
       work02Person();
       work03Account();
    }

    static void work01Utilitor() {

        String validateName = Utilitor.testString("get kanyapak", "");
        System.out.println("Validate Name:" + validateName);

        double validateValue = Utilitor.testPositive(45);
        System.out.println("Validate Value:" + validateValue);

        long isbn10 = 1265459643L;
        long computeIsbn10 = Utilitor.computeIsbn10(isbn10);
        System.out.println("ISBN10 = " + computeIsbn10);
    }
    

 

   static void work02Person() {

        Person P1 = new Person("Get", "Kanyapak");
        Person P2 = new Person("Gift", "Kawis");

        System.out.println("\nPerson details: " + P1);
        P1.setFirstname("Peter");
        P1.setLastname("Pan");
        System.out.println("Updated Person details: " + P1);
        System.out.println("ID: " + P1.getId());
        System.out.println("First Name: " + P1.getFirstname());
        System.out.println("Last Name: " + P1.getLastname());

        System.out.println("Person detailed: " + P2);
    }
   
    static void work03Account() {


        Person P1 = new Person("Get", "Kan");
        Person P2 = new Person("John", "Pee");
        Person P3 = new Person("Pete","ture");
        Person P4 = new Person("May","Lee");

        Account account1 = new Account(P1);
        Account account2 = new Account(P2);
        Account account3 = new Account(P3);
        Account account4 = new Account(P4);

        account1.deposit(5000.0);
        account1.withdraw(500.0);

        account1.transfer(100.0, account2);

        System.out.println("\nAccount 1: " + account1);
        System.out.println("Account 2: " + account2);
        System.out.println("Account 3: " + account3);
        System.out.println("Account 4: " + account4);

    }
}
 
