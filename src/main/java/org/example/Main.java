package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String filePath = "src/main/resources/realtime.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(";");

                String datum = tokens[8];
                String ort = tokens[6];
                String titel = tokens[11];

                if (istImZeitraum(datum)) {
                    System.out.println("Ort: " + ort + " | Titel: " + titel);
                }

            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        /*
        ================================================================================
         */

        List<Championship> championships = new ArrayList<>();

        championships.add(new Championship(
                515, 3253, 2013,
                new Date(113, 10, 19), new Date(113, 10, 25),
                "ISSF World Cup Munich", "Munich", "GER",
                new Date(113, 10, 20), "14:30:00", "15:00:00", "Final 10m Air Rifle Men"));

        championships.add(new Championship(
                516, 3254, 2013,
                new Date(113, 10, 19), new Date(113, 10, 25),
                "ISSF World Cup Munich", "Munich", "GER",
                new Date(113, 10, 21), "17:00:00", "17:30:00", "Final Trap Women"));

        championships.add(new Championship(
                517, 3255, 2013,
                new Date(113, 10, 19), new Date(113, 10, 25),
                "ISSF World Cup Munich", "Munich", "GER",
                new Date(113, 10, 22), "15:05:00", "15:35:00", "Final 10m Air Rifle Women"));

        championships.add(new Championship(
                518, 3256, 2013,
                new Date(113, 10, 19), new Date(113, 10, 25),
                "ISSF World Cup Munich", "Munich", "GER",
                new Date(113, 10, 23), "13:00:00", "13:30:00", "Final 50m Pistol Men"));

        championships.add(new Championship(
                519, 3257, 2013,
                new Date(113, 10, 19), new Date(113, 10, 25),
                "ISSF World Cup Munich", "Munich", "GER",
                new Date(113, 10, 24), "16:30:00", "17:00:00", "Final Trap Men"));

        for (Championship c : championships) {
            System.out.println(championships.toString());
        }

        /*
        ==========================================================================================
         */

        List<Championship> championships1 = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();

            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(";");

                int blub_idfs = Integer.parseInt(tokens[0]);
                int id = Integer.parseInt(tokens[1]);
                int year = Integer.parseInt(tokens[2]);
                Date date_from = dateFormat.parse(tokens[3]);
                Date date_to = dateFormat.parse(tokens[4]);
                String championship = tokens[5];
                String city = tokens[6];
                String country = tokens[7];
                Date event_date = dateFormat.parse(tokens[8]);
                String event_time_from = tokens[9];
                String event_time_to = tokens[10];
                String event_title = tokens[11];

                Championship championshipObj = new Championship(
                        blub_idfs, id, year, date_from, date_to,
                        championship, city, country, event_date, event_time_from, event_time_to, event_title
                );
                championships1.add(championshipObj);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        for (Championship c : championships) {
            System.out.println("-----------------------------------------------------");
            System.out.println("Championship: " + c.getChampionship());
            System.out.println("Ort: " + c.getCity());
            System.out.println("Land: " + c.getCountry());
            System.out.println("Ereignisdatum: " + c.getEvent_date());
            System.out.println("Ereigniszeit von: " + c.getEvent_time_from());
            System.out.println("Ereigniszeit bis: " + c.getEvent_time_to());
            System.out.println("Titel: " + c.getEvent_title());

        }



    }

    private static boolean istImZeitraum(String datum) {
        try {
            String[] parts = datum.split("\\.");
            int tag = Integer.parseInt(parts[0]);
            int monat = Integer.parseInt(parts[1]);
            int jahr = Integer.parseInt(parts[2]);

            return (jahr == 2005 && monat == 11 && tag >= 19 && tag <= 25);
        } catch (Exception e) {
            return false;
        }
    }


}