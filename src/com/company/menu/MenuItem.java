package com.company.menu;

public class MenuItem {
    private String titel;
    private Uitvoerbaar runObject;

    protected MenuItem (String titel) {
        this.titel = titel;
    }

    public MenuItem(String titel, Uitvoerbaar runObject) {
        this.titel = titel;
        this.runObject = runObject;
    }

    public String getTitel() {
        return titel;
    }
    public void uitvoeren () {
        runObject.uitvoeren();
    }
}
