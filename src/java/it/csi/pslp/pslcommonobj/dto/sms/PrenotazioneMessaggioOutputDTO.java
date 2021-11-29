/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto.sms;

import java.util.List;

/**
 * The Class PrenotazioneMessaggioOutputDTO.
 */
public class PrenotazioneMessaggioOutputDTO extends MessaggioOutputDTO {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The dati invio. */
  private List<PrenotazioneMessaggioDatiInvioDTO> datiInvio;

  /**
   * Gets the dati invio.
   *
   * @return the dati invio
   */
  public List<PrenotazioneMessaggioDatiInvioDTO> getDatiInvio() {
    return datiInvio;
  }

  /**
   * Sets the dati invio.
   *
   * @param datiInvio the new dati invio
   */
  public void setDatiInvio(List<PrenotazioneMessaggioDatiInvioDTO> datiInvio) {
    this.datiInvio = datiInvio;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "PrenotazioneMessaggioOutputDTO [datiInvio=" + datiInvio + ", codiceEsito=" + codiceEsito + ", descrizioneEsito=" + descrizioneEsito + "]";
  }

}
