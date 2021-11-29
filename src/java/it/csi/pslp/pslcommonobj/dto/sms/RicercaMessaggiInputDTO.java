/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto.sms;

/**
 * The Class RicercaMessaggiInputDTO.
 */
public class RicercaMessaggiInputDTO extends MessaggioInputDTO {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The id SMS. */
  private Long idSMS;

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
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "RicercaMessaggiInputDTO [caller=" + caller + ", datiEnte=" + datiEnte + ", idSMS=" + idSMS + "]";
  }

}
