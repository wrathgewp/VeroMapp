package com.example.demo.Aree_Verdi.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "parchi_giardini_aree_verdi")
public class Aree_Verdi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Genera gli ID auto_increment
    private Integer id;

    private String nome_layer;
    private Integer codice;
    private Integer id_oggetto;
    private Integer cod_via;
    private Integer censimento;
    private String tipo_area;
    private String denominazi;
    private String nome_via;
    private Integer sup_verde;
    private Integer sup_pavim;
    private String irrigazion;
    private String manutenzio;
    private String annotazion;
    private String circoscriz;
    private String aggiorname;
    private String tooltip;
    private String url_rel;

    public Aree_Verdi() {
    }

    // Metodi setter e getter
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome_layer() {
        return nome_layer;
    }

    public void setNome_layer(String nome_layer) {
        this.nome_layer = nome_layer;
    }

    public Integer getCodice() {
        return codice;
    }

    public void setCodice(Integer codice) {
        this.codice = codice;
    }

    public Integer getId_oggetto() {
        return id_oggetto;
    }

    public void setId_oggetto(Integer id_oggetto) {
        this.id_oggetto = id_oggetto;
    }

    public Integer getCod_via() {
        return cod_via;
    }

    public void setCod_via(Integer cod_via) {
        this.cod_via = cod_via;
    }

    public Integer getCensimento() {
        return censimento;
    }

    public void setCensimento(Integer censimento) {
        this.censimento = censimento;
    }

    public String getTipo_area() {
        return tipo_area;
    }

    public void setTipo_area(String tipo_area) {
        this.tipo_area = tipo_area;
    }

    public String getDenominazi() {
        return denominazi;
    }

    public void setDenominazi(String denominazi) {
        this.denominazi = denominazi;
    }

    public String getNome_via() {
        return nome_via;
    }

    public void setNome_via(String nome_via) {
        this.nome_via = nome_via;
    }

    public Integer getSup_verde() {
        return sup_verde;
    }

    public void setSup_verde(Integer sup_verde) {
        this.sup_verde = sup_verde;
    }

    public Integer getSup_pavim() {
        return sup_pavim;
    }

    public void setSup_pavim(Integer sup_pavim) {
        this.sup_pavim = sup_pavim;
    }

    public String getIrrigazion() {
        return irrigazion;
    }

    public void setIrrigazion(String irrigazion) {
        this.irrigazion = irrigazion;
    }

    public String getManutenzio() {
        return manutenzio;
    }

    public void setManutenzio(String manutenzio) {
        this.manutenzio = manutenzio;
    }

    public String getAnnotazion() {
        return annotazion;
    }

    public void setAnnotazion(String annotazion) {
        this.annotazion = annotazion;
    }

    public String getCircoscriz() {
        return circoscriz;
    }

    public void setCircoscriz(String circoscriz) {
        this.circoscriz = circoscriz;
    }

    public String getAggiorname() {
        return aggiorname;
    }

    public void setAggiorname(String aggiorname) {
        this.aggiorname = aggiorname;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public String getUrl_rel() {
        return url_rel;
    }

    public void setUrl_rel(String url_rel) {
        this.url_rel = url_rel;
    }
}
