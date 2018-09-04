package com.leyao.chapter.chapter1_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author leyao
 * @version 2018-7-10
 */
public class Transaction {
    private String userName;
    private Date date;
    private double amount;
    private SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

    public Transaction(String userName, Date date, double amount) {
        this.userName = userName;
        this.date = date;
        this.amount = amount;
    }

    public Transaction(String transaction) throws ParseException {
        String[] params = transaction.split("\\s+");
        userName = params[0];
        date = sdf.parse(params[1]);
        amount = Double.parseDouble(params[2]);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        Transaction that = (Transaction) object;
        if (!this.userName.equals(that.userName)) {
            return false;
        }
        if (!this.date.equals(that.date)) {
            return false;
        }
        if (this.amount != that.amount) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return userName + ": " + sdf.format(date) + ", " + amount;
    }
}
