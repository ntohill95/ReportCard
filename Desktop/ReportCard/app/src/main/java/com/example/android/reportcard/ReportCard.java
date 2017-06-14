package com.example.android.reportcard;

import android.util.Log;

import static android.R.attr.name;
import static android.support.v7.widget.AppCompatDrawableManager.get;

/**
 * Created by Niamh on 13/06/2017.
 * A class to create a report card for the modules i sat this year in my degree. The marks are awarded numerically out of 100 and so int values used.
 */

public class ReportCard {

    private int highFrequencySystemsMark;
    private int embeddedSystemsMark;
    private int connectedHealthMark;
    private int digitalSystemsMark;
    private String highFrequencySystems="High Frequency Systems";
    private String embeddedSystems="Embedded Systems";
    private String connectedHealth="Connected Health";
    private String digitalSystems="Digital Systems";

    public ReportCard(int highFrequencySystems, int embeddedSystems, int connectedHealth, int digitalSystems) {
        this.highFrequencySystemsMark = highFrequencySystemsMark;
        this.embeddedSystemsMark = embeddedSystemsMark;
        this.connectedHealthMark = connectedHealthMark;
        this.digitalSystemsMark = digitalSystemsMark;
    }

    public void setHighFrequencySystemsMark(int highFrequencySystemsMark) {
        this.highFrequencySystemsMark = highFrequencySystemsMark;
    }

    public int getHighFrequencySystemsMark() {

        return highFrequencySystemsMark;
    }

    public void setEmbeddedSystemsMark(int embeddedSystemsMark) {
        this.embeddedSystemsMark = embeddedSystemsMark;
    }

    public int getEmbeddedSystemsMark() {

        return embeddedSystemsMark;
    }
    public void setConnectedHealthMark(int connectedHealth) {
        this.connectedHealthMark = connectedHealthMark;
    }

    public int getConnectedHealthMark() {

        return connectedHealthMark;
    }
    public void setDigitalSystemsMark(int digitalSystems) {

        this.digitalSystemsMark = digitalSystemsMark;
    }

    public int getDigitalSystemsMark() {

        return digitalSystemsMark;
    }

    public void setHighFrequencySystems(String highFrequencySystems) {

        this.highFrequencySystems = highFrequencySystems;
    }

    public String getHighFrequencySystems() {

        return highFrequencySystems;
    }

    public void setEmbeddedSystems(String embeddedSystems) {

        this.embeddedSystems = embeddedSystems;
    }

    public String getEmbeddedSystems() {

        return embeddedSystems;
    }

    public void setConnectedHealth(String connectedHealth) {

        this.connectedHealth = connectedHealth;
    }

    public String getConnectedHealth() {

        return connectedHealth;
    }

    public void setDigitalSystems(String digitalSystems) {

        this.digitalSystems = digitalSystems;
    }

    public String getDigitalSystems() {
        return digitalSystems;
    }

    @Override
    public String toString() {
        return "ReportCard - " + '\'' +
                getHighFrequencySystemsMark() + " : " + getHighFrequencySystems() +
                getHighFrequencySystemsMark() + " : " + getEmbeddedSystems() +
                getHighFrequencySystemsMark() +" : " + getConnectedHealth() +
                getDigitalSystemsMark() + " : " + getDigitalSystems() ;
    }
}
