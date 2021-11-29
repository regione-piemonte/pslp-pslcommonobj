/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

/**
 * The Class EsitoSalvataggioIncontroDTO.
 */
public class EsitoSalvataggioIncontroDTO extends EsitoDTO {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;
  
  /** The prenotazione. */
  private PrenotazioneDTO prenotazione;

  /**
   * Gets the prenotazione.
   *
   * @return the prenotazione
   */
  public PrenotazioneDTO getPrenotazione() {
    return prenotazione;
  }

  /**
   * Sets the prenotazione.
   *
   * @param prenotazione the new prenotazione
   */
  public void setPrenotazione(PrenotazioneDTO prenotazione) {
    this.prenotazione = prenotazione;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "EsitoSalvataggioIncontroDTO [prenotazione=" + prenotazione + ", super.toString()=" + super.toString() + "]";
  }

}
