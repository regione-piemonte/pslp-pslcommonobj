/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.TipoResponsabilitaDTO;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class TipoResponsabilitaFilter.
 */
public class TipoResponsabilitaFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The codice. */
  // campo chiave primaria
  private StringFilter codice = new StringFilter();

  /** The descrizione. */
  private StringFilter descrizione = new StringFilter();

  /** The expr QBE. */
  TipoResponsabilitaDTO exprQBE = new TipoResponsabilitaDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public TipoResponsabilitaDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(TipoResponsabilitaDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * Gets the codice.
   *
   * @return the codice
   */
  public StringFilter getCodice() {
    return codice;
  }

  /**
   * Sets the codice.
   *
   * @param codice the new codice
   */
  public void setCodice(StringFilter codice) {
    this.codice = codice;
  }

  /**
   * Gets the descrizione.
   *
   * @return the descrizione
   */
  public StringFilter getDescrizione() {
    return descrizione;
  }

  /**
   * Sets the descrizione.
   *
   * @param descrizione the new descrizione
   */
  public void setDescrizione(StringFilter descrizione) {
    this.descrizione = descrizione;
  }

} // fine classe
