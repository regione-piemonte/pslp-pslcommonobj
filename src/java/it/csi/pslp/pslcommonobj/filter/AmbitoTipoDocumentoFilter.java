/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.AmbitoTipoDocumentoDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;

/**
 * The Class AmbitoTipoDocumentoFilter.
 */
public class AmbitoTipoDocumentoFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The ambito. */
  // campo chiave primaria
  private AmbitoFilter ambito = new AmbitoFilter();

  /** The tipo documento. */
  private TipoDocumentoFilter tipoDocumento = new TipoDocumentoFilter();

  /** The d inizio. */
  private DateFilter dInizio = new DateFilter();

  /** The d fine. */
  private DateFilter dFine = new DateFilter();

  /** The expr QBE. */
  AmbitoTipoDocumentoDTO exprQBE = new AmbitoTipoDocumentoDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public AmbitoTipoDocumentoDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(AmbitoTipoDocumentoDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * Gets the ambito.
   *
   * @return the ambito
   */
  public AmbitoFilter getAmbito() {
    return ambito;
  }

  /**
   * Sets the ambito.
   *
   * @param ambito the new ambito
   */
  public void setAmbito(AmbitoFilter ambito) {
    this.ambito = ambito;
  }

  /**
   * Gets the tipo documento.
   *
   * @return the tipo documento
   */
  public TipoDocumentoFilter getTipoDocumento() {
    return tipoDocumento;
  }

  /**
   * Sets the tipo documento.
   *
   * @param tipoDocumento the new tipo documento
   */
  public void setTipoDocumento(TipoDocumentoFilter tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }

  /**
   * Gets the d inizio.
   *
   * @return the d inizio
   */
  public DateFilter getDInizio() {
    return dInizio;
  }

  /**
   * Sets the d inizio.
   *
   * @param dInizio the new d inizio
   */
  public void setDInizio(DateFilter dInizio) {
    this.dInizio = dInizio;
  }

  /**
   * Gets the d fine.
   *
   * @return the d fine
   */
  public DateFilter getDFine() {
    return dFine;
  }

  /**
   * Sets the d fine.
   *
   * @param dFine the new d fine
   */
  public void setDFine(DateFilter dFine) {
    this.dFine = dFine;
  }

} // fine classe
