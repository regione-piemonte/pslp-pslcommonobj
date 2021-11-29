/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.UtenteEnteDTO;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class UtenteEnteFilter.
 */
public class UtenteEnteFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  // campo chiave primaria
  /** The id utente. */
  // campo chiave esterna verso la colonna ID_UTENTE della tabella PSLP_T_UTENTE
  private LongFilter idUtente = new LongFilter();

  /** The flg utente master. */
  private StringFilter flgUtenteMaster = new StringFilter();

  /** The cod operatore. */
  // campo chiave primaria
  private LongFilter codOperatore = new LongFilter();

  /** The gruppo operatore. */
  // campo chiave primaria
  private StringFilter gruppoOperatore = new StringFilter();

  /** The subcodice. */
  // campo chiave primaria
  private LongFilter subcodice = new LongFilter();

  /** The expr QBE. */
  UtenteEnteDTO exprQBE = new UtenteEnteDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public UtenteEnteDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(UtenteEnteDTO exprQBE) {
    this.exprQBE = exprQBE;
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
   * Gets the flg utente master.
   *
   * @return the flg utente master
   */
  public StringFilter getFlgUtenteMaster() {
    return flgUtenteMaster;
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
   * Gets the gruppo operatore.
   *
   * @return the gruppo operatore
   */
  public StringFilter getGruppoOperatore() {
    return gruppoOperatore;
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
   * Sets the id utente.
   *
   * @param idUtente the new id utente
   */
  public void setIdUtente(LongFilter idUtente) {
    this.idUtente = idUtente;
  }

  /**
   * Sets the flg utente master.
   *
   * @param flgUtenteMaster the new flg utente master
   */
  public void setFlgUtenteMaster(StringFilter flgUtenteMaster) {
    this.flgUtenteMaster = flgUtenteMaster;
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
   * Sets the gruppo operatore.
   *
   * @param gruppoOperatore the new gruppo operatore
   */
  public void setGruppoOperatore(StringFilter gruppoOperatore) {
    this.gruppoOperatore = gruppoOperatore;
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
