/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.MessaggioAggiuntivoDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class MessaggioAggiuntivoFilter.
 */
public class MessaggioAggiuntivoFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  // campo chiave esterna verso la colonna ID_MESSAGGIO della tabella
  /** The messaggio. */
  // PSLP_D_MESSAGGIO
  private MessaggioFilter messaggio = new MessaggioFilter();

  /** The id messaggio aggiuntivo. */
  // campo chiave primaria
  private LongFilter idMessaggioAggiuntivo = new LongFilter();

  /** The d inserim. */
  private DateFilter dInserim = new DateFilter();

  /** The cod user inserim. */
  private StringFilter codUserInserim = new StringFilter();

  /** The cod operatore. */
  private LongFilter codOperatore = new LongFilter();

  /** The cod user aggiorn. */
  private StringFilter codUserAggiorn = new StringFilter();

  /** The gruppo operatore. */
  private StringFilter gruppoOperatore = new StringFilter();

  /** The calendario. */
  private CalendarioFilter calendario = new CalendarioFilter();

  /** The d aggiorn. */
  private DateFilter dAggiorn = new DateFilter();

  /** The testo. */
  private StringFilter testo = new StringFilter();

  /** The subcodice. */
  private LongFilter subcodice = new LongFilter();

  /** The expr QBE. */
  MessaggioAggiuntivoDTO exprQBE = new MessaggioAggiuntivoDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public MessaggioAggiuntivoDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(MessaggioAggiuntivoDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * Gets the id messaggio aggiuntivo.
   *
   * @return the id messaggio aggiuntivo
   */
  public LongFilter getIdMessaggioAggiuntivo() {
    return idMessaggioAggiuntivo;
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
   * Gets the cod operatore.
   *
   * @return the cod operatore
   */
  public LongFilter getCodOperatore() {
    return codOperatore;
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
   * Gets the gruppo operatore.
   *
   * @return the gruppo operatore
   */
  public StringFilter getGruppoOperatore() {
    return gruppoOperatore;
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
   * Gets the testo.
   *
   * @return the testo
   */
  public StringFilter getTesto() {
    return testo;
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
   * Sets the id messaggio aggiuntivo.
   *
   * @param idMessaggioAggiuntivo the new id messaggio aggiuntivo
   */
  public void setIdMessaggioAggiuntivo(LongFilter idMessaggioAggiuntivo) {
    this.idMessaggioAggiuntivo = idMessaggioAggiuntivo;
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
   * Sets the cod operatore.
   *
   * @param codOperatore the new cod operatore
   */
  public void setCodOperatore(LongFilter codOperatore) {
    this.codOperatore = codOperatore;
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
   * Sets the gruppo operatore.
   *
   * @param gruppoOperatore the new gruppo operatore
   */
  public void setGruppoOperatore(StringFilter gruppoOperatore) {
    this.gruppoOperatore = gruppoOperatore;
  }

  /**
   * Gets the messaggio.
   *
   * @return the messaggio
   */
  public MessaggioFilter getMessaggio() {
    return messaggio;
  }

  /**
   * Sets the messaggio.
   *
   * @param messaggio the new messaggio
   */
  public void setMessaggio(MessaggioFilter messaggio) {
    this.messaggio = messaggio;
  }

  /**
   * Gets the calendario.
   *
   * @return the calendario
   */
  public CalendarioFilter getCalendario() {
    return calendario;
  }

  /**
   * Sets the calendario.
   *
   * @param calendario the new calendario
   */
  public void setCalendario(CalendarioFilter calendario) {
    this.calendario = calendario;
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
   * Sets the testo.
   *
   * @param testo the new testo
   */
  public void setTesto(StringFilter testo) {
    this.testo = testo;
  }

  /**
   * Sets the subcodice.
   *
   * @param subcodice the new subcodice
   */
  public void setSubcodice(LongFilter subcodice) {
    this.subcodice = subcodice;
  }
} // fine classe
