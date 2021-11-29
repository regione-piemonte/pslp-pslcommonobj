/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto.sms;

import java.io.Serializable;

/**
 * The Class MessaggioOutputDTO.
 */
public class MessaggioOutputDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The codice esito. */
  protected String codiceEsito;

  /** The descrizione esito. */
  protected String descrizioneEsito;

  /**
   * Gets the codice esito.
   *
   * @return the codice esito
   */
  public String getCodiceEsito() {
    return codiceEsito;
  }

  /**
   * Sets the codice esito.
   *
   * @param codiceEsito the new codice esito
   */
  public void setCodiceEsito(String codiceEsito) {
    this.codiceEsito = codiceEsito;
  }

  /**
   * Gets the descrizione esito.
   *
   * @return the descrizione esito
   */
  public String getDescrizioneEsito() {
    return descrizioneEsito;
  }

  /**
   * Sets the descrizione esito.
   *
   * @param descrizioneEsito the new descrizione esito
   */
  public void setDescrizioneEsito(String descrizioneEsito) {
    this.descrizioneEsito = descrizioneEsito;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "MessaggioOutputDTO [codiceEsito=" + codiceEsito + ", descrizioneEsito=" + descrizioneEsito + "]";
  }

}
