/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.SlotDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.IntegerFilter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class SlotFilter.
 */
public class SlotFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The id slot. */
  // campo chiave primaria
  private LongFilter idSlot = new LongFilter();

  /** The num prenotazioni valide. */
  private IntegerFilter numPrenotazioniValide = new IntegerFilter();

  /** The d inserim. */
  private DateFilter dInserim = new DateFilter();

  /** The cod user inserim. */
  private StringFilter codUserInserim = new StringFilter();

  /** The ora fine. */
  private IntegerFilter oraFine = new IntegerFilter();

  /** The cod user aggiorn. */
  private StringFilter codUserAggiorn = new StringFilter();

  /** The num max prenotazioni. */
  private IntegerFilter numMaxPrenotazioni = new IntegerFilter();

  /** The ora inizio. */
  private IntegerFilter oraInizio = new IntegerFilter();

  /** The d aggiorn. */
  private DateFilter dAggiorn = new DateFilter();

  /** The flg eccezione. */
  private StringFilter flgEccezione = new StringFilter();

  /** The giorno. */
  // campo chiave esterna verso la colonna ID_GIORNO della tabella PSLP_T_GIORNO
  private GiornoFilter giorno = new GiornoFilter();

  /** The numero lock. */
  private LongFilter numeroLock = new LongFilter();

  /** The expr QBE. */
  SlotDTO exprQBE = new SlotDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public SlotDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(SlotDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * Gets the id slot.
   *
   * @return the id slot
   */
  public LongFilter getIdSlot() {
    return idSlot;
  }

  /**
   * Gets the num prenotazioni valide.
   *
   * @return the num prenotazioni valide
   */
  public IntegerFilter getNumPrenotazioniValide() {
    return numPrenotazioniValide;
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
   * Gets the cod user inserim.
   *
   * @return the cod user inserim
   */
  public StringFilter getCodUserInserim() {
    return codUserInserim;
  }

  /**
   * Gets the ora fine.
   *
   * @return the ora fine
   */
  public IntegerFilter getOraFine() {
    return oraFine;
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
   * Gets the num max prenotazioni.
   *
   * @return the num max prenotazioni
   */
  public IntegerFilter getNumMaxPrenotazioni() {
    return numMaxPrenotazioni;
  }

  /**
   * Gets the ora inizio.
   *
   * @return the ora inizio
   */
  public IntegerFilter getOraInizio() {
    return oraInizio;
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
   * Gets the flg eccezione.
   *
   * @return the flg eccezione
   */
  public StringFilter getFlgEccezione() {
    return flgEccezione;
  }

  /**
   * Gets the giorno.
   *
   * @return the giorno
   */
  public GiornoFilter getGiorno() {
    return giorno;
  }

  /**
   * Sets the id slot.
   *
   * @param idSlot the new id slot
   */
  public void setIdSlot(LongFilter idSlot) {
    this.idSlot = idSlot;
  }

  /**
   * Sets the num prenotazioni valide.
   *
   * @param numPrenotazioniValide the new num prenotazioni valide
   */
  public void setNumPrenotazioniValide(IntegerFilter numPrenotazioniValide) {
    this.numPrenotazioniValide = numPrenotazioniValide;
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
   * Sets the cod user inserim.
   *
   * @param codUserInserim the new cod user inserim
   */
  public void setCodUserInserim(StringFilter codUserInserim) {
    this.codUserInserim = codUserInserim;
  }

  /**
   * Sets the ora fine.
   *
   * @param oraFine the new ora fine
   */
  public void setOraFine(IntegerFilter oraFine) {
    this.oraFine = oraFine;
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
   * Sets the num max prenotazioni.
   *
   * @param numMaxPrenotazioni the new num max prenotazioni
   */
  public void setNumMaxPrenotazioni(IntegerFilter numMaxPrenotazioni) {
    this.numMaxPrenotazioni = numMaxPrenotazioni;
  }

  /**
   * Sets the ora inizio.
   *
   * @param oraInizio the new ora inizio
   */
  public void setOraInizio(IntegerFilter oraInizio) {
    this.oraInizio = oraInizio;
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
   * Sets the flg eccezione.
   *
   * @param flgEccezione the new flg eccezione
   */
  public void setFlgEccezione(StringFilter flgEccezione) {
    this.flgEccezione = flgEccezione;
  }

  /**
   * Sets the giorno.
   *
   * @param giorno the new giorno
   */
  public void setGiorno(GiornoFilter giorno) {
    this.giorno = giorno;
  }

  /**
   * Gets the numero lock.
   *
   * @return the numero lock
   */
  public LongFilter getNumeroLock() {
    return numeroLock;
  }

  /**
   * Sets the numero lock.
   *
   * @param numeroLock the new numero lock
   */
  public void setNumeroLock(LongFilter numeroLock) {
    this.numeroLock = numeroLock;
  }
  

} // fine classe
