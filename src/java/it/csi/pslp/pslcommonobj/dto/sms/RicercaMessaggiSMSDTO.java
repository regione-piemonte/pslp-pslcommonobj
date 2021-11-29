/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto.sms;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class RicercaMessaggiSMSDTO.
 */
public class RicercaMessaggiSMSDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The dati ente. */
  private DatiEnteDTO datiEnte;

  /** The id SMS. */
  private Long idSMS;

  /** The cellulare. */
  private String cellulare;

  /** The testo messaggio. */
  private String testoMessaggio;

  /** The codice prenotazione gateway. */
  private String codicePrenotazioneGateway;

  /** The codice stato. */
  private String codiceStato;

  /** The descrizione stato. */
  private String descrizioneStato;

  /** The data stato. */
  private Date dataStato;

  /** The codice errore. */
  private String codiceErrore;

  /** The errore. */
  private String errore;

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
   * Gets the testo messaggio.
   *
   * @return the testo messaggio
   */
  public String getTestoMessaggio() {
    return testoMessaggio;
  }

  /**
   * Sets the testo messaggio.
   *
   * @param testoMessaggio the new testo messaggio
   */
  public void setTestoMessaggio(String testoMessaggio) {
    this.testoMessaggio = testoMessaggio;
  }

  /**
   * Gets the codice prenotazione gateway.
   *
   * @return the codice prenotazione gateway
   */
  public String getCodicePrenotazioneGateway() {
    return codicePrenotazioneGateway;
  }

  /**
   * Sets the codice prenotazione gateway.
   *
   * @param codicePrenotazioneGateway the new codice prenotazione gateway
   */
  public void setCodicePrenotazioneGateway(String codicePrenotazioneGateway) {
    this.codicePrenotazioneGateway = codicePrenotazioneGateway;
  }

  /**
   * Gets the codice stato.
   *
   * @return the codice stato
   */
  public String getCodiceStato() {
    return codiceStato;
  }

  /**
   * Sets the codice stato.
   *
   * @param codiceStato the new codice stato
   */
  public void setCodiceStato(String codiceStato) {
    this.codiceStato = codiceStato;
  }

  /**
   * Gets the descrizione stato.
   *
   * @return the descrizione stato
   */
  public String getDescrizioneStato() {
    return descrizioneStato;
  }

  /**
   * Sets the descrizione stato.
   *
   * @param descrizioneStato the new descrizione stato
   */
  public void setDescrizioneStato(String descrizioneStato) {
    this.descrizioneStato = descrizioneStato;
  }

  /**
   * Gets the data stato.
   *
   * @return the data stato
   */
  public Date getDataStato() {
    return dataStato;
  }

  /**
   * Sets the data stato.
   *
   * @param dataStato the new data stato
   */
  public void setDataStato(Date dataStato) {
    this.dataStato = dataStato;
  }

  /**
   * Gets the codice errore.
   *
   * @return the codice errore
   */
  public String getCodiceErrore() {
    return codiceErrore;
  }

  /**
   * Sets the codice errore.
   *
   * @param codiceErrore the new codice errore
   */
  public void setCodiceErrore(String codiceErrore) {
    this.codiceErrore = codiceErrore;
  }

  /**
   * Gets the errore.
   *
   * @return the errore
   */
  public String getErrore() {
    return errore;
  }

  /**
   * Sets the errore.
   *
   * @param errore the new errore
   */
  public void setErrore(String errore) {
    this.errore = errore;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "RicercaMessaggiSMSDTO [datiEnte=" + datiEnte + ", idSMS=" + idSMS + ", cellulare=" + cellulare + ", testoMessaggio=" + testoMessaggio + ", codicePrenotazioneGateway=" + codicePrenotazioneGateway + ", codiceStato=" + codiceStato + ", descrizioneStato=" + descrizioneStato + ", dataStato="
        + dataStato + ", codiceErrore=" + codiceErrore + ", errore=" + errore + "]";
  }

}
