package org.dominhdang;

import org.dominhdang.DAO.SystemDAO;
import org.dominhdang.UI.MenuSelection;
import org.dominhdang.UI.UI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * The program will connect to the Postgres server and
         * create database named Student_Mng. The database should be
         * deleted if it is already exist in the server in order to
         * avoid duplicated database in the server
         */

        SystemDAO.dropDatabase("Student_Mng");
        SystemDAO.createDatabase("Student_Mng");

        MenuSelection menuSelection;
        do {
            menuSelection = UI.ChooseOption(scanner);
            UI.HandleOption(menuSelection, scanner);
        } while (menuSelection != MenuSelection.EXIT);

        /*
         * Delete entire the database before closing the program
         */

        SystemDAO.dropDatabase("Student_Mng");

        scanner.close();

    }
}
