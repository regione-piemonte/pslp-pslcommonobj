/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto.sms;

import java.util.List;

/**
 * The Class PrenotazioneMessaggioInputDTO.
 */
public class PrenotazioneMessaggioInputDTO extends MessaggioInputDTO {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;
  
  /** The codice contratto. */
  private String codiceContratto;

  /** The cellulare. */
  private List<String> cellulare;

  /** The messaggio. */
  private String messaggio;

  /**
   * Gets the codice contratto.
   *
   * @return the codice contratto
   */
  public String getCodiceContratto() {
    return codiceContratto;
  }

  /**
   * Sets the codice contratto.
   *
   * @param codiceContratto the new codice contratto
   */
  public void setCodiceContratto(String codiceContratto) {
    this.codiceContratto = codiceContratto;
  }

  /**
   * Gets the cellulare.
   *
   * @return the cellulare
   */
  public List<String> getCellulare() {
    return cellulare;
  }

  /**
   * Sets the cellulare.
   *
   * @param cellulare the new cellulare
   */
  public void setCellulare(List<String> cellulare) {
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
    return "PrenotazioneMessaggioInputDTO [codiceContratto=" + codiceContratto + ", cellulare=" + cellulare + ", messaggio=" + messaggio + ", caller=" + caller + ", datiEnte=" + datiEnte + "]";
  }


}
