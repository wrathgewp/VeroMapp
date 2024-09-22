package com.example.demo.Farmacie.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "farmacie")
public class Farmacie {

    @Id
    @Column(name = "FARMACIA")
    private Integer id;

    @Column(name = "DENOMINAZI")
    private String denominazi;

    @Column(name = "CHIAVE")
    private String chiave;

    @Column(name = "INDIRIZZO")
    private String indirizzo;

    @Column(name = "OMOGENEA")
    private String omogenea;

    @Column(name = "QUARTIERE")
    private String quartiere;

    @Column(name = "CIRCOSCRIZ")
    private String circoscrizio;

    @Column(name = "TOOLTIP")
    private String tooltip;

    @Column(name = "LATITUDINE")
    private String latitudine;

    @Column(name = "LONGITUDINE")
    private String longitudine;


    public Farmacie(Integer id, String denominazi, String chiave, String indirizzo, String omogenea, String quartiere, String circoscrizio, String tooltip, String latitudine, String longitudine) {
        this.id = id;
        this.denominazi = denominazi;
        this.chiave = chiave;
        this.indirizzo = indirizzo;
        this.omogenea = omogenea;
        this.quartiere = quartiere;
        this.circoscrizio = circoscrizio;
        this.tooltip = tooltip;
        this.latitudine = latitudine;
        this.longitudine = longitudine;
    }

    public Farmacie() {
        // Costruttore vuoto
    }


    // Metodi getter e setter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDenominazi() {
        return denominazi;
    }

    public void setDenominazi(String denominazi) {
        this.denominazi = denominazi;
    }

    public String getChiave() {
        return chiave;
    }

    public void setChiave(String chiave) {
        this.chiave = chiave;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getOmogenea() {
        return omogenea;
    }

    public void setOmogenea(String omogenea) {
        this.omogenea = omogenea;
    }

    public String getQuartiere() {
        return quartiere;
    }

    public void setQuartiere(String quartiere) {
        this.quartiere = quartiere;
    }

    public String getCircoscrizio() {
        return circoscrizio;
    }

    public void setCircoscrizio(String circoscrizio) {
        this.circoscrizio = circoscrizio;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public String getLatitudine() {
        return latitudine;
    }

    public void setLatitudine(String latitudine) {
        this.latitudine = latitudine;
    }

    public String getLongitudine() {
        return longitudine;
    }

    public void setLongitudine(String longitudine) {
        this.longitudine = longitudine;
    }
}
