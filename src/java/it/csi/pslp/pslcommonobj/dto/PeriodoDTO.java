/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DTOJediStrategy
package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The Class PeriodoDTO.
 */
@JsonIgnoreProperties({"keys"})
public class PeriodoDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The dt fine. */
  private Date dtFine = null;

  /** The dt inizio. */
  private Date dtInizio = null;

  /** The d inserim. */
  private Date dInserim = null;

  /** The cod user inserim. */
  private String codUserInserim = null;

  /** The cod user aggiorn. */
  private String codUserAggiorn = null;

  // campo chiave esterna verso la colonna ID_CALENDARIO della tabella
  /** The calendario. */
  // PSLP_T_CALENDARIO
  private CalendarioDTO calendario = null;

  /** The d aggiorn. */
  private Date dAggiorn = null;

  /** The id periodo. */
  // campo chiave primaria
  private Long idPeriodo = null;

  /**
   * Gets the dt fine.
   *
   * @return the dt fine
   */
  public Date getDtFine() {
    return dtFine;
  }

  /**
   * Gets the dt inizio.
   *
   * @return the dt inizio
   */
  public Date getDtInizio() {
    return dtInizio;
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
   * Gets the cod user inserim.
   *
   * @return the cod user inserim
   */
  public String getCodUserInserim() {
    return codUserInserim;
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
   * Sets the dt fine.
   *
   * @param dtFine the new dt fine
   */
  public void setDtFine(Date dtFine) {
    this.dtFine = dtFine;
  }

  /**
   * Sets the dt inizio.
   *
   * @param dtInizio the new dt inizio
   */
  public void setDtInizio(Date dtInizio) {
    this.dtInizio = dtInizio;
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
   * Sets the cod user inserim.
   *
   * @param codUserInserim the new cod user inserim
   */
  public void setCodUserInserim(String codUserInserim) {
    this.codUserInserim = codUserInserim;
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
   * Gets the keys.
   *
   * @return the keys
   */
  public Object[] getKeys() {
    return new Object[] { idPeriodo };
  }

  /**
   * Gets the dto for test.
   *
   * @return the dto for test
   */
  public static PeriodoDTO getDtoForTest() {
    return new PeriodoDTO();
  }

  /**
   * Gets the calendario.
   *
   * @return the calendario
   */
  public CalendarioDTO getCalendario() {
    return calendario;
  }

  /**
   * Sets the calendario.
   *
   * @param calendario the new calendario
   */
  public void setCalendario(CalendarioDTO calendario) {
    this.calendario = calendario;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "PeriodoDTO [dtFine=" + dtFine + ", dtInizio=" + dtInizio + ", dInserim=" + dInserim + ", codUserInserim=" + codUserInserim + ", codUserAggiorn=" + codUserAggiorn + ", calendario=" + calendario + ", dAggiorn=" + dAggiorn + ", idPeriodo=" + idPeriodo + "]";
  }
  

} // fine classe
