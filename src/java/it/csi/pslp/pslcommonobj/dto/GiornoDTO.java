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
 * The Class GiornoDTO.
 */
@JsonIgnoreProperties({"keys"})
public class GiornoDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The d inserim. */
  private Date dInserim = null;

  /** The cod user inserim. */
  private String codUserInserim = null;

  /** The giorno. */
  private Date giorno = null;

  /** The cod user aggiorn. */
  private String codUserAggiorn = null;

  /** The d aggiorn. */
  private Date dAggiorn = null;

  /** The id giorno. */
  // campo chiave primaria
  private Long idGiorno = null;

  // campo chiave esterna verso la colonna ID_PERIODO della tabella
  /** The periodo. */
  // PSLP_T_PERIODO
  private PeriodoDTO periodo;

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
   * Gets the giorno.
   *
   * @return the giorno
   */
  public Date getGiorno() {
    return giorno;
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
   * Gets the id giorno.
   *
   * @return the id giorno
   */
  public Long getIdGiorno() {
    return idGiorno;
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
   * Sets the giorno.
   *
   * @param giorno the new giorno
   */
  public void setGiorno(Date giorno) {
    this.giorno = giorno;
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
   * Sets the id giorno.
   *
   * @param idGiorno the new id giorno
   */
  public void setIdGiorno(Long idGiorno) {
    this.idGiorno = idGiorno;
  }

  /**
   * Gets the periodo.
   *
   * @return the periodo
   */
  public PeriodoDTO getPeriodo() {
    return periodo;
  }

  /**
   * Sets the periodo.
   *
   * @param periodo the new periodo
   */
  public void setPeriodo(PeriodoDTO periodo) {
    this.periodo = periodo;
  }

  /**
   * Gets the keys.
   *
   * @return the keys
   */
  public Object[] getKeys() {
    return new Object[] { idGiorno };
  }

  /**
   * Gets the dto for test.
   *
   * @return the dto for test
   */
  public static GiornoDTO getDtoForTest() {
    return new GiornoDTO();
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "GiornoDTO [dInserim=" + dInserim + ", codUserInserim=" + codUserInserim + ", giorno=" + giorno + ", codUserAggiorn=" + codUserAggiorn + ", dAggiorn=" + dAggiorn + ", idGiorno=" + idGiorno + ", periodo=" + periodo + "]";
  }
  

} // fine classe
