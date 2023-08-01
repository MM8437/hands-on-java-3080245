package bank;

import java.util.Scanner;

public class Menu {
  private Scanner scanner;

  public static void main(String[] args){
    System.out.println("Welcome to Globe Bank Int");

    Menu menu = new Menu();
    menu.scanner = new Scanner(System.in);




    menu.scanner.close();
  }
  private Customer authenticateUser(){
    System.out.println("Please Enter your USername");
    String username = scanner.next();

    System.out.println("Please enter password");
    String password = scanner.next();

    Customer customer = null;
    try{
      customer = Authenticator.login(username, password);
    }

  }
}
