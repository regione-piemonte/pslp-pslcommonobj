/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto.sms;

import java.io.Serializable;

/**
 * The Class MessaggioInputDTO.
 */
public class MessaggioInputDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The caller. */
  protected String caller;

  /** The dati ente. */
  protected DatiEnteDTO datiEnte;

  /**
   * Gets the caller.
   *
   * @return the caller
   */
  public String getCaller() {
    return caller;
  }

  /**
   * Sets the caller.
   *
   * @param caller the new caller
   */
  public void setCaller(String caller) {
    this.caller = caller;
  }

  /**
   * Gets the dati ente.
   *
   * @return the dati ente
   */
  public DatiEnteDTO getDatiEnte() {
    return datiEnte;
  }

  /**
   * Sets the dati ente.
   *
   * @param datiEnte the new dati ente
   */
  public void setDatiEnte(DatiEnteDTO datiEnte) {
    this.datiEnte = datiEnte;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "MessaggioInputDTO [caller=" + caller + ", datiEnte=" + datiEnte + "]";
  }

}
