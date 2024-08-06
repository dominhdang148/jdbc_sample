package org.dominhdang.UI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UI {

  public static void PrintMenu() {
    System.out.print("================================== MENU ==================================\n");
    System.out.printf("%d. Option 1\n", MenuSelection.valueOf("OPTION_1").ordinal());
    System.out.printf("%d. Option 2\n", MenuSelection.valueOf("OPTION_2").ordinal());
    System.out.printf("%d. Option 3\n", MenuSelection.valueOf("OPTION_3").ordinal());
    System.out.printf("%d. Option 4\n", MenuSelection.valueOf("OPTION_4").ordinal());
    System.out.printf("%d. Option 5\n", MenuSelection.valueOf("OPTION_5").ordinal());
    System.out.printf("%d. Option 6\n", MenuSelection.valueOf("OPTION_6").ordinal());
    System.out.printf("%d. Exit program\n", MenuSelection.valueOf("EXIT").ordinal());
    System.out.print("==========================================================================\n");
  }

  public static MenuSelection ChooseOption(Scanner scanner) {
    MenuSelection selection = null;
    boolean validInput = false;
    while (!validInput) {
      try {
        PrintMenu();
        System.out.print("Enter your option: ");
        int userInput = scanner.nextInt();

        if (userInput >= 0 && userInput < MenuSelection.values().length) {
          selection = MenuSelection.values()[userInput];
          validInput = true;
        }
      } catch (InputMismatchException e) {
        System.out.println("Invalid input. Please enter a number.");
        scanner.next();
      }
    }
    return selection;
  }

  public static void waitForEnterKey(Scanner scanner) {
    System.out.println("Press enter to continue");
    if (scanner.hasNextLine()) {
      scanner.nextLine();
    }
    scanner.nextLine();
  }

  public static void HandleOption(MenuSelection selection, Scanner scanner) {
    switch (selection) {
      case EXIT:
        break;
      case OPTION_1:
        System.out.println("Option 1");
        break;
      case OPTION_2:
        System.out.println("Option 2");
        break;
      case OPTION_3:
        System.out.println("Option 3");
        break;
      case OPTION_4:
        System.out.println("Option 4");
        break;
      case OPTION_5:
        System.out.println("Option 5");
        break;
      case OPTION_6:
        System.out.println("Option 6");
        break;
    }
    waitForEnterKey(scanner);
  }
}
