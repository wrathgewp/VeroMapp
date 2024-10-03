package com.example.demo.Scuole.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "scuole")
public class Scuole {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_OGGETTO")
    private Integer id_oggetto;

    @Column(name = "CODICE_SCU")
    private Integer codice_scu;

    @Column(name = "NOME_SCUOL")
    private String nome_scuol;

    @Column(name = "TELEFONO")
    private String telefono;

    @Column(name = "FAX")
    private String fax;

    @Column(name = "SCUFRE")
    private String scufres;

    @Column(name = "GRADO")
    private Integer grado;

    @Column(name = "CDTISC")
    private String cdtisc;

    @Column(name = "TIPOLOGIA")
    private String tipologia;

    @Column(name = "TIPO_SERVI")
    private String tipo_servizio;

    @Column(name = "INDIRIZZO")
    private String indirizzo;

    @Column(name = "CHIAVE")
    private String chiave;

    @Column(name = "COLORE")
    private String colore;

    @Column(name = "OMOGENEA")
    private String omogenea;

    @Column(name = "QUARTIERE")
    private String quartiere;

    @Column(name = "CIRCONSCRIZ")
    private String circonscriz;

    @Column(name = "TOOLTIP")
    private String tooltip;

    @Column(name = "Latitudine")
    private String latitudine;

    @Column(name = "Longitudine")
    private String longitudine;

    public Scuole(Integer id_oggetto, Integer codice_scu, String nome_scuol, String telefono, String fax, String scufres, Integer grado, String cdtisc, String tipologia, String tipo_servizio, String indirizzo, String chiave, String colore, String omogenea, String quartiere, String circonscriz, String tooltip, String latitudine, String longitudine) {
        this.id_oggetto = id_oggetto;
        this.codice_scu = codice_scu;
        this.nome_scuol = nome_scuol;
        this.telefono = telefono;
        this.fax = fax;
        this.scufres = scufres;
        this.grado = grado;
        this.cdtisc = cdtisc;
        this.tipologia = tipologia;
        this.tipo_servizio = tipo_servizio;
        this.indirizzo = indirizzo;
        this.chiave = chiave;
        this.colore = colore;
        this.omogenea = omogenea;
        this.quartiere = quartiere;
        this.circonscriz = circonscriz;
        this.tooltip = tooltip;
        this.latitudine = latitudine;
        this.longitudine = longitudine;
    
    }

    public Scuole() {
        // Costruttore vuoto
    }

    // Getter e setter per tutti i campi

    public Integer getId_oggetto() {
        return id_oggetto;
    }

    public void setId_oggetto(Integer id_oggetto) {
        this.id_oggetto = id_oggetto;
    }

    public Integer getCodice_scu() {
        return codice_scu;
    }

    public void setCodice_scu(Integer codice_scu) {
        this.codice_scu = codice_scu;
    }

    public String getNome_scuol() {
        return nome_scuol;
    }

    public void setNome_scuol(String nome_scuol) {
        this.nome_scuol = nome_scuol;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getScufres() {
        return scufres;
    }

    public void setScufres(String scufres) {
        this.scufres = scufres;
    }

    public Integer getGrado() {
        return grado;
    }

    public void setGrado(Integer grado) {
        this.grado = grado;
    }

    public String getCdtisc() {
        return cdtisc;
    }

    public void setCdtisc(String cdtisc) {
        this.cdtisc = cdtisc;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getTipo_servizio() {
        return tipo_servizio;
    }

    public void setTipo_servizio(String tipo_servizio) {
        this.tipo_servizio = tipo_servizio;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getChiave() {
        return chiave;
    }

    public void setChiave(String chiave) {
        this.chiave = chiave;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
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

    public String getCirconscriz() {
        return circonscriz;
    }

    public void setCirconscriz(String circonscriz) {
        this.circonscriz = circonscriz;
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
