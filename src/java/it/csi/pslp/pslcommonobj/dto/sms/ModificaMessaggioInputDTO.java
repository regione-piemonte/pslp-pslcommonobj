/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto.sms;

/**
 * The Class ModificaMessaggioInputDTO.
 */
public class ModificaMessaggioInputDTO extends MessaggioInputDTO {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The id SMS. */
  private Long idSMS;

  /** The cellulare. */
  private String cellulare;

  /** The messaggio. */
  private String messaggio;

  /**
   * Gets the id SMS.
   *
   * @return the id SMS
   */
  public Long getIdSMS() {
    return idSMS;
  }

  /**
   * Sets the id SMS.
   *
   * @param idSMS the new id SMS
   */
  public void setIdSMS(Long idSMS) {
    this.idSMS = idSMS;
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
    return "ModificaMessaggioInputDTO [caller=" + caller + ", datiEnte=" + datiEnte + ", idSMS=" + idSMS + ", cellulare=" + cellulare + ", messaggio=" + messaggio + "]";
  }

}
