/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.ParametroDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class ParametroFilter.
 */
public class ParametroFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The cod parametro. */
  private StringFilter codParametro = new StringFilter();

  /** The dt fine. */
  private DateFilter dtFine = new DateFilter();

  /** The valore parametro ext. */
  private StringFilter valoreParametroExt = new StringFilter();

  /** The dt inizio. */
  private DateFilter dtInizio = new DateFilter();

  /** The descr parametro. */
  private StringFilter descrParametro = new StringFilter();

  /** The id parametro. */
  // campo chiave primaria
  private LongFilter idParametro = new LongFilter();

  /** The valore parametro. */
  private StringFilter valoreParametro = new StringFilter();

  /** The expr QBE. */
  ParametroDTO exprQBE = new ParametroDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public ParametroDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(ParametroDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * Gets the cod parametro.
   *
   * @return the cod parametro
   */
  public StringFilter getCodParametro() {
    return codParametro;
  }

  /**
   * Gets the dt fine.
   *
   * @return the dt fine
   */
  public DateFilter getDtFine() {
    return dtFine;
  }

  /**
   * Gets the valore parametro ext.
   *
   * @return the valore parametro ext
   */
  public StringFilter getValoreParametroExt() {
    return valoreParametroExt;
  }

  /**
   * Gets the dt inizio.
   *
   * @return the dt inizio
   */
  public DateFilter getDtInizio() {
    return dtInizio;
  }

  /**
   * Gets the descr parametro.
   *
   * @return the descr parametro
   */
  public StringFilter getDescrParametro() {
    return descrParametro;
  }

  /**
   * Gets the id parametro.
   *
   * @return the id parametro
   */
  public LongFilter getIdParametro() {
    return idParametro;
  }

  /**
   * Gets the valore parametro.
   *
   * @return the valore parametro
   */
  public StringFilter getValoreParametro() {
    return valoreParametro;
  }

  /**
   * Sets the cod parametro.
   *
   * @param codParametro the new cod parametro
   */
  public void setCodParametro(StringFilter codParametro) {
    this.codParametro = codParametro;
  }

  /**
   * Sets the dt fine.
   *
   * @param dtFine the new dt fine
   */
  public void setDtFine(DateFilter dtFine) {
    this.dtFine = dtFine;
  }

  /**
   * Sets the valore parametro ext.
   *
   * @param valoreParametroExt the new valore parametro ext
   */
  public void setValoreParametroExt(StringFilter valoreParametroExt) {
    this.valoreParametroExt = valoreParametroExt;
  }

  /**
   * Sets the dt inizio.
   *
   * @param dtInizio the new dt inizio
   */
  public void setDtInizio(DateFilter dtInizio) {
    this.dtInizio = dtInizio;
  }

  /**
   * Sets the descr parametro.
   *
   * @param descrParametro the new descr parametro
   */
  public void setDescrParametro(StringFilter descrParametro) {
    this.descrParametro = descrParametro;
  }

  /**
   * Sets the id parametro.
   *
   * @param idParametro the new id parametro
   */
  public void setIdParametro(LongFilter idParametro) {
    this.idParametro = idParametro;
  }

  /**
   * Sets the valore parametro.
   *
   * @param valoreParametro the new valore parametro
   */
  public void setValoreParametro(StringFilter valoreParametro) {
    this.valoreParametro = valoreParametro;
  }
} // fine classe
