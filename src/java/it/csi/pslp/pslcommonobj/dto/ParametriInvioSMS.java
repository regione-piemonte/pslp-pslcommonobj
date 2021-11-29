/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;

/**
 * The Class ParametriInvioSMS.
 */
public class ParametriInvioSMS implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The caller. */
  private String caller;
  
  /** The ente proprietario. */
  private String enteProprietario;
  
  /** The cellulare. */
  private String cellulare;
  
  /** The messaggio. */
  private String messaggio;

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
   * Gets the ente proprietario.
   *
   * @return the ente proprietario
   */
  public String getEnteProprietario() {
    return enteProprietario;
  }

  /**
   * Sets the ente proprietario.
   *
   * @param enteProprietario the new ente proprietario
   */
  public void setEnteProprietario(String enteProprietario) {
    this.enteProprietario = enteProprietario;
  }

  /**
   * Gets the cellulare.
   *
   * @return the cellulare
   */
  public String getCellulare() {
    return cellulare;
  }

  /**
   * Sets the cellulare.
   *
   * @param cellulare the new cellulare
   */
  public void setCellulare(String cellulare) {
    this.cellulare = cellulare;
  }

  /**
   * Gets the messaggio.
   *
   * @return the messaggio
   */
  public String getMessaggio() {
    return messaggio;
  }

  /**
   * Sets the messaggio.
   *
   * @param messaggio the new messaggio
   */
  public void setMessaggio(String messaggio) {
    this.messaggio = messaggio;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "ParametriInvioSMS [caller=" + caller + ", enteProprietario=" + enteProprietario + ", cellulare=" + cellulare + ", messaggio=" + messaggio + "]";
  }
  

}
