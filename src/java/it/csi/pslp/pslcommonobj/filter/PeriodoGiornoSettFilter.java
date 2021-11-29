/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.PeriodoGiornoSettDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.IntegerFilter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class PeriodoGiornoSettFilter.
 */
public class PeriodoGiornoSettFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The durata slot. */
  private IntegerFilter durataSlot = new IntegerFilter();

  /** The num max prenotazioni. */
  private IntegerFilter numMaxPrenotazioni = new IntegerFilter();

  /** The d inserim. */
  private DateFilter dInserim = new DateFilter();

  /** The id periodo giorno sett. */
  // campo chiave primaria
  private LongFilter idPeriodoGiornoSett = new LongFilter();

  /** The cod user inserim. */
  private StringFilter codUserInserim = new StringFilter();

  /** The id giorno settimana. */
  private IntegerFilter idGiornoSettimana = new IntegerFilter();

  /** The ora fine. */
  private IntegerFilter oraFine = new IntegerFilter();

  /** The cod user aggiorn. */
  private StringFilter codUserAggiorn = new StringFilter();

  /** The ora inizio. */
  private IntegerFilter oraInizio = new IntegerFilter();

  /** The d aggiorn. */
  private DateFilter dAggiorn = new DateFilter();

  // campo chiave esterna verso la colonna ID_PERIODO della tabella
  /** The id periodo. */
  // PSLP_T_PERIODO
  private LongFilter idPeriodo = new LongFilter();

  /** The expr QBE. */
  PeriodoGiornoSettDTO exprQBE = new PeriodoGiornoSettDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public PeriodoGiornoSettDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(PeriodoGiornoSettDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * Gets the durata slot.
   *
   * @return the durata slot
   */
  public IntegerFilter getDurataSlot() {
    return durataSlot;
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
   * Gets the id periodo giorno sett.
   *
   * @return the id periodo giorno sett
   */
  public LongFilter getIdPeriodoGiornoSett() {
    return idPeriodoGiornoSett;
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
   * Gets the id giorno settimana.
   *
   * @return the id giorno settimana
   */
  public IntegerFilter getIdGiornoSettimana() {
    return idGiornoSettimana;
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
   * Gets the id periodo.
   *
   * @return the id periodo
   */
  public LongFilter getIdPeriodo() {
    return idPeriodo;
  }

  /**
   * Sets the durata slot.
   *
   * @param durataSlot the new durata slot
   */
  public void setDurataSlot(IntegerFilter durataSlot) {
    this.durataSlot = durataSlot;
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
   * Sets the id periodo giorno sett.
   *
   * @param idPeriodoGiornoSett the new id periodo giorno sett
   */
  public void setIdPeriodoGiornoSett(LongFilter idPeriodoGiornoSett) {
    this.idPeriodoGiornoSett = idPeriodoGiornoSett;
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
   * Sets the id giorno settimana.
   *
   * @param idGiornoSettimana the new id giorno settimana
   */
  public void setIdGiornoSettimana(IntegerFilter idGiornoSettimana) {
    this.idGiornoSettimana = idGiornoSettimana;
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
   * Sets the ora inizio.
   *
   * @param oraInizio the new ora inizio
   */
  public void setOraInizio(IntegerFilter oraInizio) {
    this.oraInizio = oraInizio;
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
   * Sets the num max prenotazioni.
   *
   * @param numMaxPrenotazioni the new num max prenotazioni
   */
  public void setNumMaxPrenotazioni(IntegerFilter numMaxPrenotazioni) {
    this.numMaxPrenotazioni = numMaxPrenotazioni;
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
   * Sets the id periodo.
   *
   * @param idPeriodo the new id periodo
   */
  public void setIdPeriodo(LongFilter idPeriodo) {
    this.idPeriodo = idPeriodo;
  }
} // fine classe
