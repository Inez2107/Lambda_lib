package com.company;

import com.company.menu.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu extends MenuItem {
    Scanner scanner = new Scanner(System.in);

    private List<MenuItem> menuItems = new ArrayList<>();
    public Menu (String titel){
        super(titel);
    }
    public void addMenuItem (MenuItem item) {
        menuItems.add(item);
    }

    @Override
    public void uitvoeren () {
        System.out.println("0. Stoppen");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, menuItems.get(i).getTitel());
        }
        System.out.printf(" %n Uw keuze : ");
        Scanner scannner = new Scanner(System.in);
        int keuze = Integer.parseInt(scannner.nextLine());
        while (keuze != 0) {
            menuItems.get(keuze - 1).uitvoeren();
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.printf("%d. %s%n", i + 1, menuItems.get(i).getTitel());
            }
            System.out.println("0. Stoppen");
            System.out.printf(" %n Uw keuze : ");
            scannner = new Scanner(System.in);
            keuze = Integer.parseInt(scannner.nextLine());
        }
    }
}
