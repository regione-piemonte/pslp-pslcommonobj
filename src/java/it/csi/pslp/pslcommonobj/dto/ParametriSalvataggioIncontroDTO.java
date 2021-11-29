/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;

/**
 * The Class ParametriSalvataggioIncontroDTO.
 */
public class ParametriSalvataggioIncontroDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The id prenotazione. */
  private Long idPrenotazione = null;

  /** The id prenotazione old. */
  private Long idPrenotazioneOld = null;

  /** The id utente. */
  private Long idUtente = null;

  /** The id slot. */
  private Long idSlot = null;

  /** The id stato appuntamento. */
  private String idStatoAppuntamento = null;

  /** The note. */
  private String note = null;
  
  /** The codice fiscale utente collegato. */
  private String codiceFiscaleUtenteCollegato;
  
  /** The id adesione. */
  private Long idAdesione;

  /**
   * Gets the id prenotazione.
   *
   * @return the id prenotazione
   */
  public Long getIdPrenotazione() {
    return idPrenotazione;
  }

  /**
   * Sets the id prenotazione.
   *
   * @param idPrenotazione the new id prenotazione
   */
  public void setIdPrenotazione(Long idPrenotazione) {
    this.idPrenotazione = idPrenotazione;
  }


  /**
   * Gets the id prenotazione old.
   *
   * @return the id prenotazione old
   */
  public Long getIdPrenotazioneOld() {
    return idPrenotazioneOld;
  }

  /**
   * Sets the id prenotazione old.
   *
   * @param idPrenotazioneOld the new id prenotazione old
   */
  public void setIdPrenotazioneOld(Long idPrenotazioneOld) {
    this.idPrenotazioneOld = idPrenotazioneOld;
  }

  /**
   * Gets the id utente.
   *
   * @return the id utente
   */
  public Long getIdUtente() {
    return idUtente;
  }

  /**
   * Sets the id utente.
   *
   * @param idUtente the new id utente
   */
  public void setIdUtente(Long idUtente) {
    this.idUtente = idUtente;
  }

  /**
   * Gets the id slot.
   *
   * @return the id slot
   */
  public Long getIdSlot() {
    return idSlot;
  }

  /**
   * Sets the id slot.
   *
   * @param idSlot the new id slot
   */
  public void setIdSlot(Long idSlot) {
    this.idSlot = idSlot;
  }

  /**
   * Gets the id stato appuntamento.
   *
   * @return the id stato appuntamento
   */
  public String getIdStatoAppuntamento() {
    return idStatoAppuntamento;
  }

  /**
   * Sets the id stato appuntamento.
   *
   * @param idStatoAppuntamento the new id stato appuntamento
   */
  public void setIdStatoAppuntamento(String idStatoAppuntamento) {
    this.idStatoAppuntamento = idStatoAppuntamento;
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
   * Gets the codice fiscale utente collegato.
   *
   * @return the codice fiscale utente collegato
   */
  public String getCodiceFiscaleUtenteCollegato() {
    return codiceFiscaleUtenteCollegato;
  }

  /**
   * Sets the codice fiscale utente collegato.
   *
   * @param codiceFiscaleUtenteCollegato the new codice fiscale utente collegato
   */
  public void setCodiceFiscaleUtenteCollegato(String codiceFiscaleUtenteCollegato) {
    this.codiceFiscaleUtenteCollegato = codiceFiscaleUtenteCollegato;
  }

  
  /**
   * Gets the id adesione.
   *
   * @return the id adesione
   */
  public Long getIdAdesione() {
    return idAdesione;
  }

  /**
   * Sets the id adesione.
   *
   * @param idAdesione the new id adesione
   */
  public void setIdAdesione(Long idAdesione) {
    this.idAdesione = idAdesione;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "ParametriSalvataggioIncontroDTO [idPrenotazione=" + idPrenotazione + ", idPrenotazioneOld=" + idPrenotazioneOld + ", idUtente=" + idUtente + ", idSlot=" + idSlot + ", idStatoAppuntamento=" + idStatoAppuntamento + ", note=" + note + ", codiceFiscaleUtenteCollegato="
        + codiceFiscaleUtenteCollegato + ", idAdesione=" + idAdesione + "]";
  }



}
