package com.example.demo.Impianti_Sportivi.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "impianti_sportivi")
public class Impianti_Sportivi {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID OGGETTO")
    private Integer id;

    @Column(name = "Street view")
    private String street_view;

    @Column(name = "DENOMINAZIONE EDIFICIO")
    private String denominazione_edificio;

    @Column(name = "INDIRIZZO")
    private String indirizzo;

    @Column(name = "CAP")
    private Integer cap;

    @Column(name = "TIPOLOGIA ATTIVITA' SPORTIVA")
    private String tipologia_attivita_sportiva;

    @Column(name = "OMOGENEA")
    private String omogenea;

    @Column(name = "QUARTIERE")
    private String quartiere;

    @Column(name = "CIRCOSCRIZIONE")
    private String circoscrizione;
    
    @Column(name = "LATITUDINE")
    private String latitudine;
    
    @Column(name = "LONGITUDINE")
    private String longitudine;

    // Costruttore
    public Impianti_Sportivi(Integer id, String street_view, String denominazione_edificio, String indirizzo, Integer cap, String tipologia_attivita_sportiva, String omogenea, String quartiere, String circoscrizione, String latitudine, String longitudine) {
        this.id = id;
        this.street_view = street_view;
        this.denominazione_edificio = denominazione_edificio;
        this.indirizzo = indirizzo;
        this.cap = cap;
        this.tipologia_attivita_sportiva = tipologia_attivita_sportiva;
        this.omogenea = omogenea;
        this.quartiere = quartiere;
        this.circoscrizione = circoscrizione;
        this.latitudine = latitudine;
        this.longitudine = longitudine;
    }

    // Costruttore vuoto
    public Impianti_Sportivi() {
    }

    // Metodi setter e getter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet_view() {
        return street_view;
    }

    public void setStreet_view(String street_view) {
        this.street_view = street_view;
    }

    public String getDenominazione_edificio() {
        return denominazione_edificio;
    }

    public void setDenominazione_edificio(String denominazione_edificio) {
        this.denominazione_edificio = denominazione_edificio;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Integer getCap() {
        return cap;
    }

    public void setCap(Integer cap) {
        this.cap = cap;
    }

    public String getTipologia_attivita_sportiva() {
        return tipologia_attivita_sportiva;
    }

    public void setTipologia_attivita_sportiva(String tipologia_attivita_sportiva) {
        this.tipologia_attivita_sportiva = tipologia_attivita_sportiva;
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

    public String getCircoscrizione() {
        return circoscrizione;
    }

    public void setCircoscrizione(String circoscrizione) {
        this.circoscrizione = circoscrizione;
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
