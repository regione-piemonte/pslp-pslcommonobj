/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.ChiamataSMSDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class ChiamataSMSFilter.
 */
public class ChiamataSMSFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;
  
  /** The id chiamata SMS. */
  private LongFilter idChiamataSMS = new LongFilter();

  /** The sms. */
  private SMSFilter sms = new SMSFilter();

  /** The sistema chiamante. */
  private SistemaChiamanteFilter sistemaChiamante = new SistemaChiamanteFilter();

  /** The metodo chiamato. */
  private StringFilter metodoChiamato = new StringFilter();

  /** The ora inizio. */
  private DateFilter oraInizio = new DateFilter();

  /** The ora fine. */
  private DateFilter oraFine = new DateFilter();

  /** The msg input. */
  private StringFilter msgInput = new StringFilter();

  /** The codice esito. */
  private StringFilter codiceEsito = new StringFilter();

  /** The descrizione esito. */
  private StringFilter descrizioneEsito = new StringFilter();

  /** The note. */
  private StringFilter note = new StringFilter();

  /** The expr QBE. */
  ChiamataSMSDTO exprQBE = new ChiamataSMSDTO();

  /**
   * Gets the id chiamata SMS.
   *
   * @return the id chiamata SMS
   */
  public LongFilter getIdChiamataSMS() {
    return idChiamataSMS;
  }

  /**
   * Sets the id chiamata SMS.
   *
   * @param idChiamataSMS the new id chiamata SMS
   */
  public void setIdChiamataSMS(LongFilter idChiamataSMS) {
    this.idChiamataSMS = idChiamataSMS;
  }

  /**
   * Gets the sms.
   *
   * @return the sms
   */
  public SMSFilter getSms() {
    return sms;
  }

  /**
   * Sets the sms.
   *
   * @param sms the new sms
   */
  public void setSms(SMSFilter sms) {
    this.sms = sms;
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
   * Gets the metodo chiamato.
   *
   * @return the metodo chiamato
   */
  public StringFilter getMetodoChiamato() {
    return metodoChiamato;
  }

  /**
   * Sets the metodo chiamato.
   *
   * @param metodoChiamato the new metodo chiamato
   */
  public void setMetodoChiamato(StringFilter metodoChiamato) {
    this.metodoChiamato = metodoChiamato;
  }

  /**
   * Gets the ora inizio.
   *
   * @return the ora inizio
   */
  public DateFilter getOraInizio() {
    return oraInizio;
  }

  /**
   * Sets the ora inizio.
   *
   * @param oraInizio the new ora inizio
   */
  public void setOraInizio(DateFilter oraInizio) {
    this.oraInizio = oraInizio;
  }

  /**
   * Gets the ora fine.
   *
   * @return the ora fine
   */
  public DateFilter getOraFine() {
    return oraFine;
  }

  /**
   * Sets the ora fine.
   *
   * @param oraFine the new ora fine
   */
  public void setOraFine(DateFilter oraFine) {
    this.oraFine = oraFine;
  }

  /**
   * Gets the msg input.
   *
   * @return the msg input
   */
  public StringFilter getMsgInput() {
    return msgInput;
  }

  /**
   * Sets the msg input.
   *
   * @param msgInput the new msg input
   */
  public void setMsgInput(StringFilter msgInput) {
    this.msgInput = msgInput;
  }

  /**
   * Gets the codice esito.
   *
   * @return the codice esito
   */
  public StringFilter getCodiceEsito() {
    return codiceEsito;
  }

  /**
   * Sets the codice esito.
   *
   * @param codiceEsito the new codice esito
   */
  public void setCodiceEsito(StringFilter codiceEsito) {
    this.codiceEsito = codiceEsito;
  }

  /**
   * Gets the descrizione esito.
   *
   * @return the descrizione esito
   */
  public StringFilter getDescrizioneEsito() {
    return descrizioneEsito;
  }

  /**
   * Sets the descrizione esito.
   *
   * @param descrizioneEsito the new descrizione esito
   */
  public void setDescrizioneEsito(StringFilter descrizioneEsito) {
    this.descrizioneEsito = descrizioneEsito;
  }

  /**
   * Gets the note.
   *
   * @return the note
   */
  public StringFilter getNote() {
    return note;
  }

  /**
   * Sets the note.
   *
   * @param note the new note
   */
  public void setNote(StringFilter note) {
    this.note = note;
  }

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public ChiamataSMSDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(ChiamataSMSDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "ChiamataSMSFilter [idChiamataSMS=" + idChiamataSMS + ", sms=" + sms + ", sistemaChiamante=" + sistemaChiamante + ", metodoChiamato=" + metodoChiamato + ", oraInizio=" + oraInizio + ", oraFine=" + oraFine + ", msgInput=" + msgInput + ", codiceEsito=" + codiceEsito + ", descrizioneEsito="
        + descrizioneEsito + ", note=" + note + ", exprQBE=" + exprQBE + "]";
  }

  
}
