/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.StatoDocumentoDTO;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class StatoDocumentoFilter.
 */
public class StatoDocumentoFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The cod stato documento. */
  // campo chiave primaria
  private StringFilter codStatoDocumento = new StringFilter();

  /** The descr stato documento. */
  private StringFilter descrStatoDocumento = new StringFilter();

  /** The expr QBE. */
  StatoDocumentoDTO exprQBE = new StatoDocumentoDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public StatoDocumentoDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(StatoDocumentoDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * Gets the cod stato documento.
   *
   * @return the cod stato documento
   */
  public StringFilter getCodStatoDocumento() {
    return codStatoDocumento;
  }

  /**
   * Gets the descr stato documento.
   *
   * @return the descr stato documento
   */
  public StringFilter getDescrStatoDocumento() {
    return descrStatoDocumento;
  }

  /**
   * Sets the cod stato documento.
   *
   * @param codStatoDocumento the new cod stato documento
   */
  public void setCodStatoDocumento(StringFilter codStatoDocumento) {
    this.codStatoDocumento = codStatoDocumento;
  }

  /**
   * Sets the descr stato documento.
   *
   * @param descrStatoDocumento the new descr stato documento
   */
  public void setDescrStatoDocumento(StringFilter descrStatoDocumento) {
    this.descrStatoDocumento = descrStatoDocumento;
  }
} // fine classe
