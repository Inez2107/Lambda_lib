package com.company;

import com.company.menu.MenuItem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MenuItem[] menuItems = new MenuItem[2];

        MenuItem item1 = new MenuItem("item1", () -> System.out.printf("Dag allemaal! %n"));
        MenuItem item2 = new MenuItem("item2", () -> System.out.printf("Hallo! %n"));
        Menu menu = new Menu ("Hoofdmenu");
        menu.addMenuItem(item1);
        menu.addMenuItem(item2);

        MenuItem item3 = new MenuItem("item3",
                () -> System.out.printf("Submenu dag allemaal"));
        MenuItem item4 = new MenuItem("item4",
                () -> System.out.printf("Submenu hallo"));
        Menu submenu = new Menu("Submenu");
        submenu.addMenuItem(item3);
        submenu.addMenuItem(item4);
        menu.addMenuItem(submenu);
        menu.uitvoeren();
    }

}
