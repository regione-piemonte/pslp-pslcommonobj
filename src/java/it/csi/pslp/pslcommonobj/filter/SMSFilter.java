/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.SMSDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class SMSFilter.
 */
public class SMSFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The id SMS. */
  private LongFilter idSMS = new LongFilter();

  /** The sistema chiamante. */
  private SistemaChiamanteFilter sistemaChiamante = new SistemaChiamanteFilter();

  /** The codice prenotazione. */
  private StringFilter codicePrenotazione = new StringFilter();

  /** The ente. */
  private EnteServizioLavoroFilter ente = new EnteServizioLavoroFilter();

  /** The cellulare. */
  private StringFilter cellulare = new StringFilter();

  /** The messaggio. */
  private StringFilter messaggio = new StringFilter();

  /** The codice contratto. */
  private StringFilter codiceContratto = new StringFilter();

  /** The stato. */
  private StatoSMSFilter stato = new StatoSMSFilter();

  /** The data stato. */
  private DateFilter dataStato = new DateFilter();

  /** The codice errore. */
  private StringFilter codiceErrore = new StringFilter();

  /** The descrizione errore. */
  private StringFilter descrizioneErrore = new StringFilter();

  /** The data cancellazione. */
  private DateFilter dataCancellazione = new DateFilter();

  /** The data aggiornamento sistema chiamante. */
  private DateFilter dataAggiornamentoSistemaChiamante = new DateFilter();

  /** The id SMS reinoltro. */
  private LongFilter idSMSReinoltro = new LongFilter();

  /** The data ultimo aggiornamento. */
  private DateFilter dataUltimoAggiornamento = new DateFilter();

  /** The data inserimento. */
  private DateFilter dataInserimento = new DateFilter();

  /** The data aggiornamento. */
  private DateFilter dataAggiornamento = new DateFilter();

  /** The expr QBE. */
  SMSDTO exprQBE = new SMSDTO();

  /**
   * Gets the id SMS.
   *
   * @return the id SMS
   */
  public LongFilter getIdSMS() {
    return idSMS;
  }

  /**
   * Sets the id SMS.
   *
   * @param idSMS the new id SMS
   */
  public void setIdSMS(LongFilter idSMS) {
    this.idSMS = idSMS;
  }

  /**
   * Gets the codice prenotazione.
   *
   * @return the codice prenotazione
   */
  public StringFilter getCodicePrenotazione() {
    return codicePrenotazione;
  }

  /**
   * Sets the codice prenotazione.
   *
   * @param codicePrenotazione the new codice prenotazione
   */
  public void setCodicePrenotazione(StringFilter codicePrenotazione) {
    this.codicePrenotazione = codicePrenotazione;
  }

  /**
   * Gets the ente.
   *
   * @return the ente
   */
  public EnteServizioLavoroFilter getEnte() {
    return ente;
  }

  /**
   * Sets the ente.
   *
   * @param ente the new ente
   */
  public void setEnte(EnteServizioLavoroFilter ente) {
    this.ente = ente;
  }

  /**
   * Gets the cellulare.
   *
   * @return the cellulare
   */
  public StringFilter getCellulare() {
    return cellulare;
  }

  /**
   * Sets the cellulare.
   *
   * @param cellulare the new cellulare
   */
  public void setCellulare(StringFilter cellulare) {
    this.cellulare = cellulare;
  }

  /**
   * Gets the messaggio.
   *
   * @return the messaggio
   */
  public StringFilter getMessaggio() {
    return messaggio;
  }

  /**
   * Sets the messaggio.
   *
   * @param messaggio the new messaggio
   */
  public void setMessaggio(StringFilter messaggio) {
    this.messaggio = messaggio;
  }

  /**
   * Gets the stato.
   *
   * @return the stato
   */
  public StatoSMSFilter getStato() {
    return stato;
  }

  /**
   * Sets the stato.
   *
   * @param stato the new stato
   */
  public void setStato(StatoSMSFilter stato) {
    this.stato = stato;
  }

  /**
   * Gets the data stato.
   *
   * @return the data stato
   */
  public DateFilter getDataStato() {
    return dataStato;
  }

  /**
   * Sets the data stato.
   *
   * @param dataStato the new data stato
   */
  public void setDataStato(DateFilter dataStato) {
    this.dataStato = dataStato;
  }

  /**
   * Gets the codice errore.
   *
   * @return the codice errore
   */
  public StringFilter getCodiceErrore() {
    return codiceErrore;
  }

  /**
   * Sets the codice errore.
   *
   * @param codiceErrore the new codice errore
   */
  public void setCodiceErrore(StringFilter codiceErrore) {
    this.codiceErrore = codiceErrore;
  }

  /**
   * Gets the descrizione errore.
   *
   * @return the descrizione errore
   */
  public StringFilter getDescrizioneErrore() {
    return descrizioneErrore;
  }

  /**
   * Sets the descrizione errore.
   *
   * @param descrizioneErrore the new descrizione errore
   */
  public void setDescrizioneErrore(StringFilter descrizioneErrore) {
    this.descrizioneErrore = descrizioneErrore;
  }

  /**
   * Gets the data cancellazione.
   *
   * @return the data cancellazione
   */
  public DateFilter getDataCancellazione() {
    return dataCancellazione;
  }

  /**
   * Sets the data cancellazione.
   *
   * @param dataCancellazione the new data cancellazione
   */
  public void setDataCancellazione(DateFilter dataCancellazione) {
    this.dataCancellazione = dataCancellazione;
  }

  /**
   * Gets the data aggiornamento sistema chiamante.
   *
   * @return the data aggiornamento sistema chiamante
   */
  public DateFilter getDataAggiornamentoSistemaChiamante() {
    return dataAggiornamentoSistemaChiamante;
  }

  /**
   * Sets the data aggiornamento sistema chiamante.
   *
   * @param dataAggiornamentoSistemaChiamante the new data aggiornamento sistema chiamante
   */
  public void setDataAggiornamentoSistemaChiamante(DateFilter dataAggiornamentoSistemaChiamante) {
    this.dataAggiornamentoSistemaChiamante = dataAggiornamentoSistemaChiamante;
  }

  /**
   * Gets the id SMS reinoltro.
   *
   * @return the id SMS reinoltro
   */
  public LongFilter getIdSMSReinoltro() {
    return idSMSReinoltro;
  }

  /**
   * Sets the id SMS reinoltro.
   *
   * @param idSMSReinoltro the new id SMS reinoltro
   */
  public void setIdSMSReinoltro(LongFilter idSMSReinoltro) {
    this.idSMSReinoltro = idSMSReinoltro;
  }

  /**
   * Gets the data ultimo aggiornamento.
   *
   * @return the data ultimo aggiornamento
   */
  public DateFilter getDataUltimoAggiornamento() {
    return dataUltimoAggiornamento;
  }

  /**
   * Sets the data ultimo aggiornamento.
   *
   * @param dataUltimoAggiornamento the new data ultimo aggiornamento
   */
  public void setDataUltimoAggiornamento(DateFilter dataUltimoAggiornamento) {
    this.dataUltimoAggiornamento = dataUltimoAggiornamento;
  }

  /**
   * Gets the data inserimento.
   *
   * @return the data inserimento
   */
  public DateFilter getDataInserimento() {
    return dataInserimento;
  }

  /**
   * Sets the data inserimento.
   *
   * @param dataInserimento the new data inserimento
   */
  public void setDataInserimento(DateFilter dataInserimento) {
    this.dataInserimento = dataInserimento;
  }

  /**
   * Gets the data aggiornamento.
   *
   * @return the data aggiornamento
   */
  public DateFilter getDataAggiornamento() {
    return dataAggiornamento;
  }

  /**
   * Sets the data aggiornamento.
   *
   * @param dataAggiornamento the new data aggiornamento
   */
  public void setDataAggiornamento(DateFilter dataAggiornamento) {
    this.dataAggiornamento = dataAggiornamento;
  }

  /**
   * Gets the codice contratto.
   *
   * @return the codice contratto
   */
  public StringFilter getCodiceContratto() {
    return codiceContratto;
  }

  /**
   * Sets the codice contratto.
   *
   * @param codiceContratto the new codice contratto
   */
  public void setCodiceContratto(StringFilter codiceContratto) {
    this.codiceContratto = codiceContratto;
  }

  /**
   * Gets the sistema chiamante.
   *
   * @return the sistema chiamante
   */
  public SistemaChiamanteFilter getSistemaChiamante() {
    return sistemaChiamante;
  }

  /**
   * Sets the sistema chiamante.
   *
   * @param sistemaChiamante the new sistema chiamante
   */
  public void setSistemaChiamante(SistemaChiamanteFilter sistemaChiamante) {
    this.sistemaChiamante = sistemaChiamante;
  }

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public SMSDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(SMSDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "SMSFilter [idSMS=" + idSMS + ", sistemaChiamante=" + sistemaChiamante + ", codicePrenotazione=" + codicePrenotazione + ", ente=" + ente + ", cellulare=" + cellulare + ", messaggio=" + messaggio + ", codiceContratto=" + codiceContratto + ", stato=" + stato + ", dataStato=" + dataStato
        + ", codiceErrore=" + codiceErrore + ", descrizioneErrore=" + descrizioneErrore + ", dataCancellazione=" + dataCancellazione + ", dataAggiornamentoSistemaChiamante=" + dataAggiornamentoSistemaChiamante + ", idSMSReinoltro=" + idSMSReinoltro + ", dataUltimoAggiornamento="
        + dataUltimoAggiornamento + ", dataInserimento=" + dataInserimento + ", dataAggiornamento=" + dataAggiornamento + ", exprQBE=" + exprQBE + "]";
  }


}
