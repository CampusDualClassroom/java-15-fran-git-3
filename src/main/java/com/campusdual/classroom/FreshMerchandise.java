package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    private Date expirationDate; // Propiedad para la fecha de caducidad

    // Constructor
    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate; // Inicializa la fecha de caducidad
    }

    // Método para obtener la fecha de caducidad
    public Date getExpirationDate() {
        return expirationDate;
    }

    // Método para formatear la fecha
    public String getFormattedDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(date);
    }

    // Método que devuelve los datos específicos como un String
    public String getSpecificData() {
        // Construir el String con la información específica
        StringBuilder sb = new StringBuilder();
        sb.append("Localización: ").append(getLocation()).append("\n");
        sb.append("Fecha de caducidad: ").append(getFormattedDate(expirationDate));

        return sb.toString();
    }

    // Método para imprimir los datos específicos
    public void printSpecificData() {
        // Invoca al método getSpecificData y muestra el resultado
        System.out.println(getSpecificData());
    }
}
