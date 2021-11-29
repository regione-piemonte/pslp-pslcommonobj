/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.PrenotazioneDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class PrenotazioneFilter.
 */
public class PrenotazioneFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The slot. */
  // campo chiave esterna verso la colonna ID_SLOT della tabella PSLP_T_SLOT
  private SlotFilter slot = new SlotFilter();

  /** The utente. */
  // campo chiave esterna verso la colonna ID_UTENTE della tabella PSLP_T_UTENTE
  private UtenteFilter utente = new UtenteFilter();

  /** The d inserim. */
  private DateFilter dInserim = new DateFilter();

  /** The id prenotazione. */
  // campo chiave primaria
  private LongFilter idPrenotazione = new LongFilter();

  /** The cod user inserim. */
  private StringFilter codUserInserim = new StringFilter();

  /** The note. */
  private StringFilter note = new StringFilter();

  /** The cod user aggiorn. */
  private StringFilter codUserAggiorn = new StringFilter();

  /** The d aggiorn. */
  private DateFilter dAggiorn = new DateFilter();

  /** The id stato appuntamento. */
  private StringFilter idStatoAppuntamento = new StringFilter();
  
  /** The id sil in contatto. */
  private LongFilter idSilInContatto = new LongFilter();
  
  /** The gruppo operatore. */
  private StringFilter gruppoOperatore = new StringFilter();  

  /** The cod operatore. */
  private LongFilter codOperatore = new LongFilter();
  
  /** The subcodice. */
  private LongFilter subcodice = new LongFilter();
  
  /** The flg inviato promemoria. */
  private StringFilter flgInviatoPromemoria = new StringFilter();  
  
  /** The id sil rif ambito. */
  private LongFilter idSilRifAmbito = new LongFilter();
  
  /** The expr QBE. */
  PrenotazioneDTO exprQBE = new PrenotazioneDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public PrenotazioneDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(PrenotazioneDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * Gets the slot.
   *
   * @return the slot
   */
  public SlotFilter getSlot() {
    return slot;
  }

  /**
   * Gets the utente.
   *
   * @return the utente
   */
  public UtenteFilter getUtente() {
    return utente;
  }

  /**
   * Gets the d inserim.
   *
   * @return the d inserim
   */
  public DateFilter getDInserim() {
    return dInserim;
  }

  /**
   * Gets the id prenotazione.
   *
   * @return the id prenotazione
   */
  public LongFilter getIdPrenotazione() {
    return idPrenotazione;
  }

  /**
   * Gets the cod user inserim.
   *
   * @return the cod user inserim
   */
  public StringFilter getCodUserInserim() {
    return codUserInserim;
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
   * Gets the cod user aggiorn.
   *
   * @return the cod user aggiorn
   */
  public StringFilter getCodUserAggiorn() {
    return codUserAggiorn;
  }

  /**
   * Gets the d aggiorn.
   *
   * @return the d aggiorn
   */
  public DateFilter getDAggiorn() {
    return dAggiorn;
  }

  /**
   * Sets the slot.
   *
   * @param slot the new slot
   */
  public void setSlot(SlotFilter slot) {
    this.slot = slot;
  }

  /**
   * Sets the utente.
   *
   * @param utente the new utente
   */
  public void setUtente(UtenteFilter utente) {
    this.utente = utente;
  }

  /**
   * Sets the d inserim.
   *
   * @param dInserim the new d inserim
   */
  public void setDInserim(DateFilter dInserim) {
    this.dInserim = dInserim;
  }

  /**
   * Sets the id prenotazione.
   *
   * @param idPrenotazione the new id prenotazione
   */
  public void setIdPrenotazione(LongFilter idPrenotazione) {
    this.idPrenotazione = idPrenotazione;
  }

  /**
   * Sets the cod user inserim.
   *
   * @param codUserInserim the new cod user inserim
   */
  public void setCodUserInserim(StringFilter codUserInserim) {
    this.codUserInserim = codUserInserim;
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
   * Sets the cod user aggiorn.
   *
   * @param codUserAggiorn the new cod user aggiorn
   */
  public void setCodUserAggiorn(StringFilter codUserAggiorn) {
    this.codUserAggiorn = codUserAggiorn;
  }

  /**
   * Sets the d aggiorn.
   *
   * @param dAggiorn the new d aggiorn
   */
  public void setDAggiorn(DateFilter dAggiorn) {
    this.dAggiorn = dAggiorn;
  }

  /**
   * Gets the id stato appuntamento.
   *
   * @return the id stato appuntamento
   */
  public StringFilter getIdStatoAppuntamento() {
    return idStatoAppuntamento;
  }

  /**
   * Sets the id stato appuntamento.
   *
   * @param idStatoAppuntamento the new id stato appuntamento
   */
  public void setIdStatoAppuntamento(StringFilter idStatoAppuntamento) {
    this.idStatoAppuntamento = idStatoAppuntamento;
  }

  /**
   * Gets the id sil in contatto.
   *
   * @return the id sil in contatto
   */
  public LongFilter getIdSilInContatto() {
    return idSilInContatto;
  }

  /**
   * Sets the id sil in contatto.
   *
   * @param idSilInContatto the new id sil in contatto
   */
  public void setIdSilInContatto(LongFilter idSilInContatto) {
    this.idSilInContatto = idSilInContatto;
  }

  

  /**
   * Gets the gruppo operatore.
   *
   * @return the gruppo operatore
   */
  public StringFilter getGruppoOperatore() {
    return gruppoOperatore;
  }

  /**
   * Sets the gruppo operatore.
   *
   * @param gruppoOperatore the new gruppo operatore
   */
  public void setGruppoOperatore(StringFilter gruppoOperatore) {
    this.gruppoOperatore = gruppoOperatore;
  }

  /**
   * Gets the cod operatore.
   *
   * @return the cod operatore
   */
  public LongFilter getCodOperatore() {
    return codOperatore;
  }

  /**
   * Sets the cod operatore.
   *
   * @param codOperatore the new cod operatore
   */
  public void setCodOperatore(LongFilter codOperatore) {
    this.codOperatore = codOperatore;
  }

  /**
   * Gets the subcodice.
   *
   * @return the subcodice
   */
  public LongFilter getSubcodice() {
    return subcodice;
  }

  /**
   * Sets the subcodice.
   *
   * @param subcodice the new subcodice
   */
  public void setSubcodice(LongFilter subcodice) {
    this.subcodice = subcodice;
  }

  /**
   * Gets the flg inviato promemoria.
   *
   * @return the flg inviato promemoria
   */
  public StringFilter getFlgInviatoPromemoria() {
    return flgInviatoPromemoria;
  }

  /**
   * Sets the flg inviato promemoria.
   *
   * @param flgInviatoPromemoria the new flg inviato promemoria
   */
  public void setFlgInviatoPromemoria(StringFilter flgInviatoPromemoria) {
    this.flgInviatoPromemoria = flgInviatoPromemoria;
  }

  /**
   * Gets the id sil rif ambito.
   *
   * @return the id sil rif ambito
   */
  public LongFilter getIdSilRifAmbito() {
    return idSilRifAmbito;
  }

  /**
   * Sets the id sil rif ambito.
   *
   * @param idSilRifAmbito the new id sil rif ambito
   */
  public void setIdSilRifAmbito(LongFilter idSilRifAmbito) {
    this.idSilRifAmbito = idSilRifAmbito;
  }


} // fine classe
