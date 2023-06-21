package de.ezeise;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate christmas = LocalDate.of(today.getYear(), 12, 24);

        int daysUntilChristmas = christmas.getDayOfYear() - today.getDayOfYear();

        if (daysUntilChristmas < 0) {
            System.out.println("Frohe Weihnachten!");
        } else {
            System.out.println("Noch " + daysUntilChristmas + " Tage bis Weihnachten!");

            switch (daysUntilChristmas) {
                case 24:
                    System.out.println("Tag 24: Herzlichen Glückwunsch! Es ist Heiligabend!");
                    break;
                case 23:
                    System.out.println("Tag 23: Nur noch 1 Tag bis Weihnachten!");
                    break;
                case 22:
                    System.out.println("Tag 22: Weihnachten rückt näher!");
                    break;
                default:
                    System.out.println("Bald ist Weihnachten!");
                    break;
            }
        }

    }
}