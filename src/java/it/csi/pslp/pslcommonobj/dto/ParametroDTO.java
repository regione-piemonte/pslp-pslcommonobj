/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DTOJediStrategy
package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class ParametroDTO.
 */
public class ParametroDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The cod parametro. */
  private String codParametro = null;

  /** The dt fine. */
  private Date dtFine = null;

  /** The valore parametro ext. */
  private String valoreParametroExt = null;

  /** The dt inizio. */
  private Date dtInizio = null;

  /** The descr parametro. */
  private String descrParametro = null;

  /** The id parametro. */
  // campo chiave primaria
  private Long idParametro = null;

  /** The valore parametro. */
  private String valoreParametro = null;

  /**
   * Gets the cod parametro.
   *
   * @return the cod parametro
   */
  public String getCodParametro() {
    return codParametro;
  }

  /**
   * Gets the dt fine.
   *
   * @return the dt fine
   */
  public Date getDtFine() {
    return dtFine;
  }

  /**
   * Gets the valore parametro ext.
   *
   * @return the valore parametro ext
   */
  public String getValoreParametroExt() {
    return valoreParametroExt;
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
   * Gets the descr parametro.
   *
   * @return the descr parametro
   */
  public String getDescrParametro() {
    return descrParametro;
  }

  /**
   * Gets the id parametro.
   *
   * @return the id parametro
   */
  public Long getIdParametro() {
    return idParametro;
  }

  /**
   * Gets the valore parametro.
   *
   * @return the valore parametro
   */
  public String getValoreParametro() {
    return valoreParametro;
  }

  /**
   * Sets the cod parametro.
   *
   * @param codParametro the new cod parametro
   */
  public void setCodParametro(String codParametro) {
    this.codParametro = codParametro;
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
   * Sets the valore parametro ext.
   *
   * @param valoreParametroExt the new valore parametro ext
   */
  public void setValoreParametroExt(String valoreParametroExt) {
    this.valoreParametroExt = valoreParametroExt;
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
   * Sets the descr parametro.
   *
   * @param descrParametro the new descr parametro
   */
  public void setDescrParametro(String descrParametro) {
    this.descrParametro = descrParametro;
  }

  /**
   * Sets the id parametro.
   *
   * @param idParametro the new id parametro
   */
  public void setIdParametro(Long idParametro) {
    this.idParametro = idParametro;
  }

  /**
   * Sets the valore parametro.
   *
   * @param valoreParametro the new valore parametro
   */
  public void setValoreParametro(String valoreParametro) {
    this.valoreParametro = valoreParametro;
  }

  /**
   * Gets the keys.
   *
   * @return the keys
   */
  public Object[] getKeys() {
    return new Object[] { idParametro };
  }

  /**
   * Gets the dto for test.
   *
   * @return the dto for test
   */
  public static ParametroDTO getDtoForTest() {
    return new ParametroDTO();
  }
} // fine classe
