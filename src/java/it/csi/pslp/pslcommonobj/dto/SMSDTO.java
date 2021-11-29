/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The Class SMSDTO.
 */
@JsonIgnoreProperties({ "keys" })
public class SMSDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The Constant STATO_SALVATO. */
  public static final String STATO_SALVATO = "S";

  /** The Constant STATO_PRENOTATO. */
  public static final String STATO_PRENOTATO = "P";

  /** The Constant STATO_INVIATO. */
  public static final String STATO_INVIATO = "I";

  /** The Constant STATO_IN_ATTESA_DI_RISPOSTA. */
  public static final String STATO_IN_ATTESA_DI_RISPOSTA = "R";

  /** The Constant STATO_ERRORE. */
  public static final String STATO_ERRORE = "E";


  /** The id SMS. */
  private Long idSMS;

  /** The sistema chiamante. */
  private SistemaChiamanteDTO sistemaChiamante;

  /** The codice prenotazione. */
  private String codicePrenotazione;

  /** The ente. */
  private EnteServizioLavoroDTO ente;

  /** The cellulare. */
  private String cellulare;

  /** The messaggio. */
  private String messaggio;

  /** The stato. */
  private StatoSMSDTO stato;

  /** The data stato. */
  private Date dataStato;

  /** The codice errore. */
  private String codiceErrore;

  /** The codice contratto. */
  private String codiceContratto;

  /** The descrizione errore. */
  private String descrizioneErrore;

  /** The data cancellazione. */
  private Date dataCancellazione;

  /** The data aggiornamento sistema chiamante. */
  private Date dataAggiornamentoSistemaChiamante;

  /** The id SMS reinoltro. */
  private Long idSMSReinoltro;

  /** The data ultimo aggiornamento. */
  private Date dataUltimoAggiornamento;

  /** The data inserimento. */
  private Date dataInserimento;

  /** The data aggiornamento. */
  private Date dataAggiornamento;

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
   * Gets the codice prenotazione.
   *
   * @return the codice prenotazione
   */
  public String getCodicePrenotazione() {
    return codicePrenotazione;
  }

  /**
   * Sets the codice prenotazione.
   *
   * @param codicePrenotazione the new codice prenotazione
   */
  public void setCodicePrenotazione(String codicePrenotazione) {
    this.codicePrenotazione = codicePrenotazione;
  }

  /**
   * Gets the ente.
   *
   * @return the ente
   */
  public EnteServizioLavoroDTO getEnte() {
    return ente;
  }

  /**
   * Sets the ente.
   *
   * @param ente the new ente
   */
  public void setEnte(EnteServizioLavoroDTO ente) {
    this.ente = ente;
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
   * Gets the stato.
   *
   * @return the stato
   */
  public StatoSMSDTO getStato() {
    return stato;
  }

  /**
   * Sets the stato.
   *
   * @param stato the new stato
   */
  public void setStato(StatoSMSDTO stato) {
    this.stato = stato;
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
   * Gets the descrizione errore.
   *
   * @return the descrizione errore
   */
  public String getDescrizioneErrore() {
    return descrizioneErrore;
  }

  /**
   * Sets the descrizione errore.
   *
   * @param descrizioneErrore the new descrizione errore
   */
  public void setDescrizioneErrore(String descrizioneErrore) {
    this.descrizioneErrore = descrizioneErrore;
  }

  /**
   * Gets the data cancellazione.
   *
   * @return the data cancellazione
   */
  public Date getDataCancellazione() {
    return dataCancellazione;
  }

  /**
   * Sets the data cancellazione.
   *
   * @param dataCancellazione the new data cancellazione
   */
  public void setDataCancellazione(Date dataCancellazione) {
    this.dataCancellazione = dataCancellazione;
  }

  /**
   * Gets the data aggiornamento sistema chiamante.
   *
   * @return the data aggiornamento sistema chiamante
   */
  public Date getDataAggiornamentoSistemaChiamante() {
    return dataAggiornamentoSistemaChiamante;
  }

  /**
   * Sets the data aggiornamento sistema chiamante.
   *
   * @param dataAggiornamentoSistemaChiamante the new data aggiornamento sistema chiamante
   */
  public void setDataAggiornamentoSistemaChiamante(Date dataAggiornamentoSistemaChiamante) {
    this.dataAggiornamentoSistemaChiamante = dataAggiornamentoSistemaChiamante;
  }

  /**
   * Gets the id SMS reinoltro.
   *
   * @return the id SMS reinoltro
   */
  public Long getIdSMSReinoltro() {
    return idSMSReinoltro;
  }

  /**
   * Sets the id SMS reinoltro.
   *
   * @param idSMSReinoltro the new id SMS reinoltro
   */
  public void setIdSMSReinoltro(Long idSMSReinoltro) {
    this.idSMSReinoltro = idSMSReinoltro;
  }

  /**
   * Gets the data ultimo aggiornamento.
   *
   * @return the data ultimo aggiornamento
   */
  public Date getDataUltimoAggiornamento() {
    return dataUltimoAggiornamento;
  }

  /**
   * Sets the data ultimo aggiornamento.
   *
   * @param dataUltimoAggiornamento the new data ultimo aggiornamento
   */
  public void setDataUltimoAggiornamento(Date dataUltimoAggiornamento) {
    this.dataUltimoAggiornamento = dataUltimoAggiornamento;
  }

  /**
   * Gets the data inserimento.
   *
   * @return the data inserimento
   */
  public Date getDataInserimento() {
    return dataInserimento;
  }

  /**
   * Sets the data inserimento.
   *
   * @param dataInserimento the new data inserimento
   */
  public void setDataInserimento(Date dataInserimento) {
    this.dataInserimento = dataInserimento;
  }

  /**
   * Gets the data aggiornamento.
   *
   * @return the data aggiornamento
   */
  public Date getDataAggiornamento() {
    return dataAggiornamento;
  }

  /**
   * Sets the data aggiornamento.
   *
   * @param dataAggiornamento the new data aggiornamento
   */
  public void setDataAggiornamento(Date dataAggiornamento) {
    this.dataAggiornamento = dataAggiornamento;
  }

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
   * Gets the sistema chiamante.
   *
   * @return the sistema chiamante
   */
  public SistemaChiamanteDTO getSistemaChiamante() {
    return sistemaChiamante;
  }

  /**
   * Sets the sistema chiamante.
   *
   * @param sistemaChiamante the new sistema chiamante
   */
  public void setSistemaChiamante(SistemaChiamanteDTO sistemaChiamante) {
    this.sistemaChiamante = sistemaChiamante;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "SMSDTO [idSMS=" + idSMS + ", sistemaChiamante=" + sistemaChiamante + ", codicePrenotazione=" + codicePrenotazione + ", ente=" + ente + ", cellulare=" + cellulare + ", messaggio=" + messaggio + ", stato=" + stato + ", dataStato=" + dataStato + ", codiceErrore=" + codiceErrore
        + ", codiceContratto=" + codiceContratto + ", descrizioneErrore=" + descrizioneErrore + ", dataCancellazione=" + dataCancellazione + ", dataAggiornamentoSistemaChiamante=" + dataAggiornamentoSistemaChiamante + ", idSMSReinoltro=" + idSMSReinoltro + ", dataUltimoAggiornamento="
        + dataUltimoAggiornamento + ", dataInserimento=" + dataInserimento + ", dataAggiornamento=" + dataAggiornamento + "]";
  }


}
