/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;

/**
 * The Class ParametriRicercaCalendarioDTO.
 */
public class ParametriRicercaCalendarioDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The gruppo operatore. */
  private String gruppoOperatore;
  
  /** The cod operatore. */
  private Integer codOperatore;
  
  /** The subcodice. */
  private Integer subcodice;
  
  /** The cod ambito. */
  private String codAmbito;

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
   * Gets the cod operatore.
   *
   * @return the cod operatore
   */
  public Integer getCodOperatore() {
    return codOperatore;
  }

  /**
   * Sets the cod operatore.
   *
   * @param codOperatore the new cod operatore
   */
  public void setCodOperatore(Integer codOperatore) {
    this.codOperatore = codOperatore;
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
   * Gets the cod ambito.
   *
   * @return the cod ambito
   */
  public String getCodAmbito() {
    return codAmbito;
  }

  /**
   * Sets the cod ambito.
   *
   * @param codAmbito the new cod ambito
   */
  public void setCodAmbito(String codAmbito) {
    this.codAmbito = codAmbito;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "ParametriRicercaCalendarioDTO [gruppoOperatore=" + gruppoOperatore + ", codOperatore=" + codOperatore + ", subcodice=" + subcodice + ", codAmbito=" + codAmbito + "]";
  }

}
