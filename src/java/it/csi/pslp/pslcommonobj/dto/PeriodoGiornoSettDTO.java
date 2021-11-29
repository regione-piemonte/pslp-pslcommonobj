/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DTOJediStrategy
package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class PeriodoGiornoSettDTO.
 */
public class PeriodoGiornoSettDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The durata slot. */
  private Integer durataSlot = null;

  /** The num max prenotazioni. */
  private Integer numMaxPrenotazioni = null;

  /** The d inserim. */
  private Date dInserim = null;

  /** The id periodo giorno sett. */
  // campo chiave primaria
  private Long idPeriodoGiornoSett = null;

  /** The cod user inserim. */
  private String codUserInserim = null;

  /** The id giorno settimana. */
  private Integer idGiornoSettimana = null;

  /** The ora fine. */
  private Integer oraFine = null;

  /** The cod user aggiorn. */
  private String codUserAggiorn = null;

  /** The ora inizio. */
  private Integer oraInizio = null;

  /** The d aggiorn. */
  private Date dAggiorn = null;

  // campo chiave esterna verso la colonna ID_PERIODO della tabella
  /** The id periodo. */
  // PSLP_T_PERIODO
  private Long idPeriodo = null;

  /**
   * Gets the durata slot.
   *
   * @return the durata slot
   */
  public Integer getDurataSlot() {
    return durataSlot;
  }

  /**
   * Gets the d inserim.
   *
   * @return the d inserim
   */
  public Date getDInserim() {
    return dInserim;
  }

  /**
   * Gets the id periodo giorno sett.
   *
   * @return the id periodo giorno sett
   */
  public Long getIdPeriodoGiornoSett() {
    return idPeriodoGiornoSett;
  }

  /**
   * Gets the cod user inserim.
   *
   * @return the cod user inserim
   */
  public String getCodUserInserim() {
    return codUserInserim;
  }

  /**
   * Gets the id giorno settimana.
   *
   * @return the id giorno settimana
   */
  public Integer getIdGiornoSettimana() {
    return idGiornoSettimana;
  }

  /**
   * Gets the ora fine.
   *
   * @return the ora fine
   */
  public Integer getOraFine() {
    return oraFine;
  }

  /**
   * Gets the cod user aggiorn.
   *
   * @return the cod user aggiorn
   */
  public String getCodUserAggiorn() {
    return codUserAggiorn;
  }

  /**
   * Gets the ora inizio.
   *
   * @return the ora inizio
   */
  public Integer getOraInizio() {
    return oraInizio;
  }

  /**
   * Gets the d aggiorn.
   *
   * @return the d aggiorn
   */
  public Date getDAggiorn() {
    return dAggiorn;
  }

  /**
   * Gets the id periodo.
   *
   * @return the id periodo
   */
  public Long getIdPeriodo() {
    return idPeriodo;
  }

  /**
   * Sets the durata slot.
   *
   * @param durataSlot the new durata slot
   */
  public void setDurataSlot(Integer durataSlot) {
    this.durataSlot = durataSlot;
  }

  /**
   * Sets the d inserim.
   *
   * @param dInserim the new d inserim
   */
  public void setDInserim(Date dInserim) {
    this.dInserim = dInserim;
  }

  /**
   * Sets the id periodo giorno sett.
   *
   * @param idPeriodoGiornoSett the new id periodo giorno sett
   */
  public void setIdPeriodoGiornoSett(Long idPeriodoGiornoSett) {
    this.idPeriodoGiornoSett = idPeriodoGiornoSett;
  }

  /**
   * Sets the cod user inserim.
   *
   * @param codUserInserim the new cod user inserim
   */
  public void setCodUserInserim(String codUserInserim) {
    this.codUserInserim = codUserInserim;
  }

  /**
   * Sets the id giorno settimana.
   *
   * @param idGiornoSettimana the new id giorno settimana
   */
  public void setIdGiornoSettimana(Integer idGiornoSettimana) {
    this.idGiornoSettimana = idGiornoSettimana;
  }

  /**
   * Sets the ora fine.
   *
   * @param oraFine the new ora fine
   */
  public void setOraFine(Integer oraFine) {
    this.oraFine = oraFine;
  }

  /**
   * Sets the cod user aggiorn.
   *
   * @param codUserAggiorn the new cod user aggiorn
   */
  public void setCodUserAggiorn(String codUserAggiorn) {
    this.codUserAggiorn = codUserAggiorn;
  }

  /**
   * Sets the ora inizio.
   *
   * @param oraInizio the new ora inizio
   */
  public void setOraInizio(Integer oraInizio) {
    this.oraInizio = oraInizio;
  }

  /**
   * Sets the d aggiorn.
   *
   * @param dAggiorn the new d aggiorn
   */
  public void setDAggiorn(Date dAggiorn) {
    this.dAggiorn = dAggiorn;
  }

  /**
   * Sets the id periodo.
   *
   * @param idPeriodo the new id periodo
   */
  public void setIdPeriodo(Long idPeriodo) {
    this.idPeriodo = idPeriodo;
  }

  /**
   * Gets the num max prenotazioni.
   *
   * @return the num max prenotazioni
   */
  public Integer getNumMaxPrenotazioni() {
    return numMaxPrenotazioni;
  }

  /**
   * Sets the num max prenotazioni.
   *
   * @param numMaxPrenotazioni the new num max prenotazioni
   */
  public void setNumMaxPrenotazioni(Integer numMaxPrenotazioni) {
    this.numMaxPrenotazioni = numMaxPrenotazioni;
  }

  /**
   * Gets the keys.
   *
   * @return the keys
   */
  public Object[] getKeys() {
    return new Object[] { idPeriodoGiornoSett };
  }

  /**
   * Gets the dto for test.
   *
   * @return the dto for test
   */
  public static PeriodoGiornoSettDTO getDtoForTest() {
    return new PeriodoGiornoSettDTO();
  }
} // fine classe
