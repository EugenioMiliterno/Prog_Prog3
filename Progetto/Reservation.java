package Progetto;

import java.time.LocalDate;
import java.io.*;
import java.util.Date;
import java.util.Enumeration; 

public class Reservation {
    private Date date;
    private int partySize;
    private String clientName;
    private String clientPhoneNumber;

    public Reservation(Date d, int partySize, String clientName, String clientPhoneNumber) {
        Date today = new Date(26, 5, 2021);
        this.partySize = partySize;
        this.clientName = clientName;
        this.clientPhoneNumber = clientPhoneNumber;
    }

    public Date getDate() {
        return date;
    }

    public Reservation getReservation() {
        return this;
    }

    public int getPartySize() {
        return partySize;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setPartySize(int partySize) {
        this.partySize = partySize;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setClientPhoneNumber(String clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "date=" + date +
                ", partySize=" + partySize +
                ", clientName='" + clientName + '\'' +
                ", clientPhoneNumber='" + clientPhoneNumber + '\'' +
                '}';
    }
}
