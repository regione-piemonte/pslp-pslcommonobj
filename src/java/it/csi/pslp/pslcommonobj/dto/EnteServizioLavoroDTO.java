/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;

/**
 * The Class EnteServizioLavoroDTO.
 */
public class EnteServizioLavoroDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;
  
  /** The id ente servizio lavoro. */
  private Long idEnteServizioLavoro;

  /** The descrizione. */
  private String descrizione;

  /** The codice tipo ente. */
  private String codiceTipoEnte;

  /** The codice ministeriale. */
  private String codiceMinisteriale;

  /** The indirizzo. */
  private String indirizzo;

  /** The id provincia. */
  private String idProvincia;

  /** The telefono. */
  private String telefono;

  /** The email. */
  private String email;

  /** The gruppo operatore. */
  private String gruppoOperatore;

  /** The codice operatore. */
  private Integer codiceOperatore;

  /** The subcodice. */
  private Integer subcodice;

  /** The id ente servizio lavoro padre. */
  private Long idEnteServizioLavoroPadre;

  /** The latitudine. */
  private Float latitudine;

  /** The longitidine. */
  private Float longitidine;

  /** The orario di apertura. */
  private String orarioDiApertura;

  /** The note. */
  private String note;

  /**
   * Gets the id ente servizio lavoro.
   *
   * @return the id ente servizio lavoro
   */
  public Long getIdEnteServizioLavoro() {
    return idEnteServizioLavoro;
  }

  /**
   * Sets the id ente servizio lavoro.
   *
   * @param idEnteServizioLavoro the new id ente servizio lavoro
   */
  public void setIdEnteServizioLavoro(Long idEnteServizioLavoro) {
    this.idEnteServizioLavoro = idEnteServizioLavoro;
  }

  /**
   * Gets the descrizione.
   *
   * @return the descrizione
   */
  public String getDescrizione() {
    return descrizione;
  }

  /**
   * Sets the descrizione.
   *
   * @param descrizione the new descrizione
   */
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * Gets the codice tipo ente.
   *
   * @return the codice tipo ente
   */
  public String getCodiceTipoEnte() {
    return codiceTipoEnte;
  }

  /**
   * Sets the codice tipo ente.
   *
   * @param codiceTipoEnte the new codice tipo ente
   */
  public void setCodiceTipoEnte(String codiceTipoEnte) {
    this.codiceTipoEnte = codiceTipoEnte;
  }

  /**
   * Gets the codice ministeriale.
   *
   * @return the codice ministeriale
   */
  public String getCodiceMinisteriale() {
    return codiceMinisteriale;
  }

  /**
   * Sets the codice ministeriale.
   *
   * @param codiceMinisteriale the new codice ministeriale
   */
  public void setCodiceMinisteriale(String codiceMinisteriale) {
    this.codiceMinisteriale = codiceMinisteriale;
  }

  /**
   * Gets the indirizzo.
   *
   * @return the indirizzo
   */
  public String getIndirizzo() {
    return indirizzo;
  }

  /**
   * Sets the indirizzo.
   *
   * @param indirizzo the new indirizzo
   */
  public void setIndirizzo(String indirizzo) {
    this.indirizzo = indirizzo;
  }

  /**
   * Gets the id provincia.
   *
   * @return the id provincia
   */
  public String getIdProvincia() {
    return idProvincia;
  }

  /**
   * Sets the id provincia.
   *
   * @param idProvincia the new id provincia
   */
  public void setIdProvincia(String idProvincia) {
    this.idProvincia = idProvincia;
  }

  /**
   * Gets the telefono.
   *
   * @return the telefono
   */
  public String getTelefono() {
    return telefono;
  }

  /**
   * Sets the telefono.
   *
   * @param telefono the new telefono
   */
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  /**
   * Gets the email.
   *
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * Sets the email.
   *
   * @param email the new email
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Gets the gruppo operatore.
   *
   * @return the gruppo operatore
   */
  public String getGruppoOperatore() {
    return gruppoOperatore;
  }

  /**
   * Sets the gruppo operatore.
   *
   * @param gruppoOperatore the new gruppo operatore
   */
  public void setGruppoOperatore(String gruppoOperatore) {
    this.gruppoOperatore = gruppoOperatore;
  }

  /**
   * Gets the codice operatore.
   *
   * @return the codice operatore
   */
  public Integer getCodiceOperatore() {
    return codiceOperatore;
  }

  /**
   * Sets the codice operatore.
   *
   * @param codiceOperatore the new codice operatore
   */
  public void setCodiceOperatore(Integer codiceOperatore) {
    this.codiceOperatore = codiceOperatore;
  }

  /**
   * Gets the subcodice.
   *
   * @return the subcodice
   */
  public Integer getSubcodice() {
    return subcodice;
  }

  /**
   * Sets the subcodice.
   *
   * @param subcodice the new subcodice
   */
  public void setSubcodice(Integer subcodice) {
    this.subcodice = subcodice;
  }

  /**
   * Gets the id ente servizio lavoro padre.
   *
   * @return the id ente servizio lavoro padre
   */
  public Long getIdEnteServizioLavoroPadre() {
    return idEnteServizioLavoroPadre;
  }

  /**
   * Sets the id ente servizio lavoro padre.
   *
   * @param idEnteServizioLavoroPadre the new id ente servizio lavoro padre
   */
  public void setIdEnteServizioLavoroPadre(Long idEnteServizioLavoroPadre) {
    this.idEnteServizioLavoroPadre = idEnteServizioLavoroPadre;
  }

  /**
   * Gets the latitudine.
   *
   * @return the latitudine
   */
  public Float getLatitudine() {
    return latitudine;
  }

  /**
   * Sets the latitudine.
   *
   * @param latitudine the new latitudine
   */
  public void setLatitudine(Float latitudine) {
    this.latitudine = latitudine;
  }

  /**
   * Gets the longitidine.
   *
   * @return the longitidine
   */
  public Float getLongitidine() {
    return longitidine;
  }

  /**
   * Sets the longitidine.
   *
   * @param longitidine the new longitidine
   */
  public void setLongitidine(Float longitidine) {
    this.longitidine = longitidine;
  }

  /**
   * Gets the orario di apertura.
   *
   * @return the orario di apertura
   */
  public String getOrarioDiApertura() {
    return orarioDiApertura;
  }

  /**
   * Sets the orario di apertura.
   *
   * @param orarioDiApertura the new orario di apertura
   */
  public void setOrarioDiApertura(String orarioDiApertura) {
    this.orarioDiApertura = orarioDiApertura;
  }

  /**
   * Gets the note.
   *
   * @return the note
   */
  public String getNote() {
    return note;
  }

  /**
   * Sets the note.
   *
   * @param note the new note
   */
  public void setNote(String note) {
    this.note = note;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "EnteServizioLavoroDTO [idEnteServizioLavoro=" + idEnteServizioLavoro + ", descrizione=" + descrizione + ", codiceTipoEnte=" + codiceTipoEnte + ", codiceMinisteriale=" + codiceMinisteriale + ", indirizzo=" + indirizzo + ", idProvincia=" + idProvincia + ", telefono=" + telefono
        + ", email=" + email + ", gruppoOperatore=" + gruppoOperatore + ", codiceOperatore=" + codiceOperatore + ", subcodice=" + subcodice + ", idEnteServizioLavoroPadre=" + idEnteServizioLavoroPadre + ", latitudine=" + latitudine + ", longitidine=" + longitidine + ", orarioDiApertura="
        + orarioDiApertura + ", note=" + note + "]";
  }

}
