/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto.sms;

import java.io.Serializable;

/**
 * The Class DatiEnteDTO.
 */
public class DatiEnteDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The gruppo operatore. */
  private String gruppoOperatore;

  /** The codice operatore. */
  private Integer codiceOperatore;

  /** The subcodice. */
  private Integer subcodice;

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
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "DatiEnte [gruppoOperatore=" + gruppoOperatore + ", codiceOperatore=" + codiceOperatore + ", subcodice=" + subcodice + "]";
  }

}
