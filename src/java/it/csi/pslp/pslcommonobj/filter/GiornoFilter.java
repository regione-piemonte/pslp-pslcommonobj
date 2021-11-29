/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.GiornoDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class GiornoFilter.
 */
public class GiornoFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The d inserim. */
  private DateFilter dInserim = new DateFilter();

  /** The cod user inserim. */
  private StringFilter codUserInserim = new StringFilter();

  /** The giorno. */
  private DateFilter giorno = new DateFilter();

  /** The cod user aggiorn. */
  private StringFilter codUserAggiorn = new StringFilter();

  /** The d aggiorn. */
  private DateFilter dAggiorn = new DateFilter();

  /** The id giorno. */
  // campo chiave primaria
  private LongFilter idGiorno = new LongFilter();

  // campo chiave esterna verso la colonna ID_PERIODO della tabella
  /** The periodo. */
  // PSLP_T_PERIODO
  private PeriodoFilter periodo = new PeriodoFilter();

  /** The expr QBE. */
  GiornoDTO exprQBE = new GiornoDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public GiornoDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(GiornoDTO exprQBE) {
    this.exprQBE = exprQBE;
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
   * Gets the giorno.
   *
   * @return the giorno
   */
  public DateFilter getGiorno() {
    return giorno;
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
   * Gets the id giorno.
   *
   * @return the id giorno
   */
  public LongFilter getIdGiorno() {
    return idGiorno;
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
   * Sets the giorno.
   *
   * @param giorno the new giorno
   */
  public void setGiorno(DateFilter giorno) {
    this.giorno = giorno;
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
   * Sets the id giorno.
   *
   * @param idGiorno the new id giorno
   */
  public void setIdGiorno(LongFilter idGiorno) {
    this.idGiorno = idGiorno;
  }

  /**
   * Gets the periodo.
   *
   * @return the periodo
   */
  public PeriodoFilter getPeriodo() {
    return periodo;
  }

  /**
   * Sets the periodo.
   *
   * @param periodo the new periodo
   */
  public void setPeriodo(PeriodoFilter periodo) {
    this.periodo = periodo;
  }
  

} // fine classe
