/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The Class ChiamataSMSDTO.
 */
@JsonIgnoreProperties({ "keys" })
public class ChiamataSMSDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The id chiamata SMS. */
  private Long idChiamataSMS;

  /** The sms. */
  private SMSDTO sms;

  /** The sistema chiamante. */
  private SistemaChiamanteDTO sistemaChiamante;

  /** The metodo chiamato. */
  private String metodoChiamato;

  /** The ora inizio. */
  private Date oraInizio;

  /** The ora fine. */
  private Date oraFine;

  /** The msg input. */
  private String msgInput;

  /** The codice esito. */
  private String codiceEsito;

  /** The descrizione esito. */
  private String descrizioneEsito;

  /** The note. */
  private String note;
  
  /**
   * Gets the id chiamata SMS.
   *
   * @return the id chiamata SMS
   */
  public Long getIdChiamataSMS() {
    return idChiamataSMS;
  }

  /**
   * Sets the id chiamata SMS.
   *
   * @param idChiamataSMS the new id chiamata SMS
   */
  public void setIdChiamataSMS(Long idChiamataSMS) {
    this.idChiamataSMS = idChiamataSMS;
  }

  /**
   * Gets the sms.
   *
   * @return the sms
   */
  public SMSDTO getSms() {
    return sms;
  }

  /**
   * Sets the sms.
   *
   * @param sms the new sms
   */
  public void setSms(SMSDTO sms) {
    this.sms = sms;
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
   * Gets the metodo chiamato.
   *
   * @return the metodo chiamato
   */
  public String getMetodoChiamato() {
    return metodoChiamato;
  }

  /**
   * Sets the metodo chiamato.
   *
   * @param metodoChiamato the new metodo chiamato
   */
  public void setMetodoChiamato(String metodoChiamato) {
    this.metodoChiamato = metodoChiamato;
  }

  /**
   * Gets the ora inizio.
   *
   * @return the ora inizio
   */
  public Date getOraInizio() {
    return oraInizio;
  }

  /**
   * Sets the ora inizio.
   *
   * @param oraInizio the new ora inizio
   */
  public void setOraInizio(Date oraInizio) {
    this.oraInizio = oraInizio;
  }

  /**
   * Gets the ora fine.
   *
   * @return the ora fine
   */
  public Date getOraFine() {
    return oraFine;
  }

  /**
   * Sets the ora fine.
   *
   * @param oraFine the new ora fine
   */
  public void setOraFine(Date oraFine) {
    this.oraFine = oraFine;
  }

  /**
   * Gets the msg input.
   *
   * @return the msg input
   */
  public String getMsgInput() {
    return msgInput;
  }

  /**
   * Sets the msg input.
   *
   * @param msgInput the new msg input
   */
  public void setMsgInput(String msgInput) {
    this.msgInput = msgInput;
  }

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
   * Gets the note.
   *
   * @return the note
   */
  public String getNote() {
    return note;
  }

  /**
   * Sets the note.
   *
   * @param note the new note
   */
  public void setNote(String note) {
    this.note = note;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "ChiamataSMSDTO [idChiamataSMS=" + idChiamataSMS + ", sms=" + sms + ", sistemaChiamante=" + sistemaChiamante + ", metodoChiamato=" + metodoChiamato + ", oraInizio=" + oraInizio + ", oraFine=" + oraFine + ", msgInput=" + msgInput + ", codiceEsito=" + codiceEsito + ", descrizioneEsito="
        + descrizioneEsito + ", note=" + note + "]";
  }

}
