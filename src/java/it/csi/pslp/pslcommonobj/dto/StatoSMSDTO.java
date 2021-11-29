/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The Class StatoSMSDTO.
 */
@JsonIgnoreProperties({ "keys" })
public class StatoSMSDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;
  
  /** The Constant SALVATO. */
  public static final String SALVATO = "S";
  
  /** The Constant PRENOTATO. */
  public static final String PRENOTATO = "P";
  
  /** The Constant INVIATO. */
  public static final String INVIATO = "I";
  
  /** The Constant IN_ATTESA_DI_RISPOSTA. */
  public static final String IN_ATTESA_DI_RISPOSTA = "W";
  
  /** The Constant IN_ATTESA_DI_RISPOSTA_DAL_GATEWAY. */
  public static final String IN_ATTESA_DI_RISPOSTA_DAL_GATEWAY = "R";
  
  /** The Constant ERRORE. */
  public static final String ERRORE = "E";

  /** The codice. */
  private String codice;

  /** The descrizione. */
  private String descrizione;

  /** The data inizio. */
  private Date dataInizio;

  /** The data fine. */
  private Date dataFine;
  
  /**
   * Instantiates a new stato SMSDTO.
   */
  public StatoSMSDTO() {
  }

  /**
   * Instantiates a new stato SMSDTO.
   *
   * @param codice the codice
   */
  public StatoSMSDTO(String codice) {
    this.codice = codice;
  }

  /**
   * Gets the codice.
   *
   * @return the codice
   */
  public String getCodice() {
    return codice;
  }

  /**
   * Sets the codice.
   *
   * @param codice the new codice
   */
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * Gets the descrizione.
   *
   * @return the descrizione
   */
  public String getDescrizione() {
    return descrizione;
  }

  /**
   * Sets the descrizione.
   *
   * @param descrizione the new descrizione
   */
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * Gets the data inizio.
   *
   * @return the data inizio
   */
  public Date getDataInizio() {
    return dataInizio;
  }

  /**
   * Sets the data inizio.
   *
   * @param dataInizio the new data inizio
   */
  public void setDataInizio(Date dataInizio) {
    this.dataInizio = dataInizio;
  }

  /**
   * Gets the data fine.
   *
   * @return the data fine
   */
  public Date getDataFine() {
    return dataFine;
  }

  /**
   * Sets the data fine.
   *
   * @param dataFine the new data fine
   */
  public void setDataFine(Date dataFine) {
    this.dataFine = dataFine;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "StatoSMSDTO [codice=" + codice + ", descrizione=" + descrizione + ", dataInizio=" + dataInizio + ", dataFine=" + dataFine + "]";
  }

}
