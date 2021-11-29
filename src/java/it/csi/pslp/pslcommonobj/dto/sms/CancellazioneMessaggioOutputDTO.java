/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto.sms;

/**
 * The Class CancellazioneMessaggioOutputDTO.
 */
public class CancellazioneMessaggioOutputDTO extends MessaggioOutputDTO {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "CancellazioneMessaggioOutputDTO [codiceEsito=" + codiceEsito + ", descrizioneEsito=" + descrizioneEsito + "]";
  }

}
