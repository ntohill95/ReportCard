package com.example.android.reportcard;

import android.util.Log;

import static android.R.attr.name;

/**
 * Created by Niamh on 13/06/2017.
 */

public class ReportCard {

    private int highFrequencySystems;
    private int embeddedSystems;
    private int connectedHealth;
    private int digitalSystems;
    private String hfs="High Frequency Systems";
    private String es="Embedded Systems";
    private String ch="Connected Health";
    private String ds="Digital Systems";

    public ReportCard(int highFrequencySystems, int embeddedSystems, int connectedHealth, int digitalSystems) {
        this.highFrequencySystems = highFrequencySystems;
        this.embeddedSystems = embeddedSystems;
        this.connectedHealth = connectedHealth;
        this.digitalSystems = digitalSystems;
    }

    public void setHighFrequencySystems(int highFrequencySystems) {
        this.highFrequencySystems = highFrequencySystems;
    }

    public int getHighFrequencySystems() {
        return highFrequencySystems;
    }

    public void setEmbeddedSystems(int embeddedSystems) {
        this.embeddedSystems = embeddedSystems;
    }

    public int getEmbeddedSystems() {
        return embeddedSystems;
    }
    public void setConnectedHealth(int connectedHealth) {
        this.connectedHealth = connectedHealth;
    }

    public int getConnectedHealth() {
        return connectedHealth;
    }
    public void setDigitalSystems(int digitalSystems) {
        this.digitalSystems = digitalSystems;
    }

    public int getDigitalSystems() {
        return digitalSystems;
    }

    public void setHfs(String hfs) {
        this.hfs = hfs;
    }

    public String getHfs() {
        return hfs;
    }

    public void setEs(String es) {
        this.es = es;
    }

    public String getEs() {
        return es;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    public String getCh() {
        return ch;
    }

    public void setDs(String ds) {
        this.ds = ds;
    }

    public String getDs() {
        return ds;
    }

    @Override
    public String toString() {
        return "ReportCard - " + '\'' +
                getHfs() + " : " + getHighFrequencySystems() +
                getEs() + " : " + getEmbeddedSystems() +
                getCh() +" : " + getConnectedHealth() +
                getDs() + " : " + getDigitalSystems() ;
    }
}
