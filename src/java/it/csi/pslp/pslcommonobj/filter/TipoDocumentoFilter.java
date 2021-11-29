/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.TipoDocumentoDTO;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class TipoDocumentoFilter.
 */
public class TipoDocumentoFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The cod tipo documento. */
  // campo chiave primaria
  private StringFilter codTipoDocumento = new StringFilter();

  /** The descr tipo documento. */
  private StringFilter descrTipoDocumento = new StringFilter();

  /** The expr QBE. */
  TipoDocumentoDTO exprQBE = new TipoDocumentoDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public TipoDocumentoDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(TipoDocumentoDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * Gets the cod tipo documento.
   *
   * @return the cod tipo documento
   */
  public StringFilter getCodTipoDocumento() {
    return codTipoDocumento;
  }

  /**
   * Gets the descr tipo documento.
   *
   * @return the descr tipo documento
   */
  public StringFilter getDescrTipoDocumento() {
    return descrTipoDocumento;
  }

  /**
   * Sets the cod tipo documento.
   *
   * @param codTipoDocumento the new cod tipo documento
   */
  public void setCodTipoDocumento(StringFilter codTipoDocumento) {
    this.codTipoDocumento = codTipoDocumento;
  }

  /**
   * Sets the descr tipo documento.
   *
   * @param descrTipoDocumento the new descr tipo documento
   */
  public void setDescrTipoDocumento(StringFilter descrTipoDocumento) {
    this.descrTipoDocumento = descrTipoDocumento;
  }

} // fine classe
