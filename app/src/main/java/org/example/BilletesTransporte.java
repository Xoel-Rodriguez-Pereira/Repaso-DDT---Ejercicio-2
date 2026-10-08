package org.example;

public class BilletesTransporte {

    public int calcularPrecioPeniques(String tickets) {
        int precio = 0;
        String[] arrtickets = tickets.split(" ");
        for (int i = 0; i < arrtickets.length; i++) {
            switch (i) {
                case 0 -> precio += Integer.parseInt(arrtickets[i]) * 12; //dentro normal
                case 1 -> precio += Integer.parseInt(arrtickets[i]) * 9;  //fuera normal
                case 2 -> precio += Integer.parseInt(arrtickets[i]) * 18; //dentro comodo
                case 3 -> precio += Integer.parseInt(arrtickets[i]) * 12; //fuera comodo
            }
        }
        return precio;
    }

    public String calcularMonedas(int precioPeniques) {
        int peniques = precioPeniques;

        int chelines = peniques/12;
        peniques -= chelines*12;
        
        int libras = chelines/20;
        chelines -= libras*20;

        return "%d %d %d".formatted(libras, chelines, peniques) ;
    }
}