/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.EventoDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class EventoFilter.
 */
public class EventoFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The cod esito. */
  private StringFilter codEsito = new StringFilter();

  // campo chiave esterna verso la colonna ID_TIPO_EVENTO della tabella
  /** The id tipo evento. */
  // PSLP_D_TIPO_EVENTO
  private LongFilter idTipoEvento = new LongFilter();

  /** The id utente. */
  // campo chiave esterna verso la colonna ID_UTENTE della tabella PSLP_T_UTENTE
  private LongFilter idUtente = new LongFilter();

  /** The d inserim. */
  private DateFilter dInserim = new DateFilter();

  /** The cod user inserim. */
  private StringFilter codUserInserim = new StringFilter();

  /** The note. */
  private StringFilter note = new StringFilter();

  /** The id evento. */
  // campo chiave primaria
  private LongFilter idEvento = new LongFilter();

  /** The cod user aggiorn. */
  private StringFilter codUserAggiorn = new StringFilter();

  /** The d evento. */
  private DateFilter dEvento = new DateFilter();

  /** The d aggiorn. */
  private DateFilter dAggiorn = new DateFilter();

  /** The codice ambito. */
  private StringFilter codiceAmbito = new StringFilter();

  /** The expr QBE. */
  EventoDTO exprQBE = new EventoDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public EventoDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(EventoDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * Gets the cod esito.
   *
   * @return the cod esito
   */
  public StringFilter getCodEsito() {
    return codEsito;
  }

  /**
   * Gets the id tipo evento.
   *
   * @return the id tipo evento
   */
  public LongFilter getIdTipoEvento() {
    return idTipoEvento;
  }

  /**
   * Gets the id utente.
   *
   * @return the id utente
   */
  public LongFilter getIdUtente() {
    return idUtente;
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
   * Gets the note.
   *
   * @return the note
   */
  public StringFilter getNote() {
    return note;
  }

  /**
   * Gets the id evento.
   *
   * @return the id evento
   */
  public LongFilter getIdEvento() {
    return idEvento;
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
   * Gets the d evento.
   *
   * @return the d evento
   */
  public DateFilter getDEvento() {
    return dEvento;
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
   * Sets the cod esito.
   *
   * @param codEsito the new cod esito
   */
  public void setCodEsito(StringFilter codEsito) {
    this.codEsito = codEsito;
  }

  /**
   * Sets the id tipo evento.
   *
   * @param idTipoEvento the new id tipo evento
   */
  public void setIdTipoEvento(LongFilter idTipoEvento) {
    this.idTipoEvento = idTipoEvento;
  }

  /**
   * Sets the id utente.
   *
   * @param idUtente the new id utente
   */
  public void setIdUtente(LongFilter idUtente) {
    this.idUtente = idUtente;
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
   * Sets the note.
   *
   * @param note the new note
   */
  public void setNote(StringFilter note) {
    this.note = note;
  }

  /**
   * Sets the id evento.
   *
   * @param idEvento the new id evento
   */
  public void setIdEvento(LongFilter idEvento) {
    this.idEvento = idEvento;
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
   * Sets the d evento.
   *
   * @param dEvento the new d evento
   */
  public void setDEvento(DateFilter dEvento) {
    this.dEvento = dEvento;
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
   * Gets the codice ambito.
   *
   * @return the codice ambito
   */
  public StringFilter getCodiceAmbito() {
    return codiceAmbito;
  }

  /**
   * Sets the codice ambito.
   *
   * @param codiceAmbito the new codice ambito
   */
  public void setCodiceAmbito(StringFilter codiceAmbito) {
    this.codiceAmbito = codiceAmbito;
  }
  
  
} // fine classe
