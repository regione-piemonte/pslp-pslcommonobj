/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.TipoMessaggioDTO;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class TipoMessaggioFilter.
 */
public class TipoMessaggioFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The cod tipo messaggio. */
  // campo chiave primaria
  private StringFilter codTipoMessaggio = new StringFilter();

  /** The descr tipo messaggio. */
  private StringFilter descrTipoMessaggio = new StringFilter();

  /** The expr QBE. */
  TipoMessaggioDTO exprQBE = new TipoMessaggioDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public TipoMessaggioDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(TipoMessaggioDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * Gets the cod tipo messaggio.
   *
   * @return the cod tipo messaggio
   */
  public StringFilter getCodTipoMessaggio() {
    return codTipoMessaggio;
  }

  /**
   * Gets the descr tipo messaggio.
   *
   * @return the descr tipo messaggio
   */
  public StringFilter getDescrTipoMessaggio() {
    return descrTipoMessaggio;
  }

  /**
   * Sets the cod tipo messaggio.
   *
   * @param codTipoMessaggio the new cod tipo messaggio
   */
  public void setCodTipoMessaggio(StringFilter codTipoMessaggio) {
    this.codTipoMessaggio = codTipoMessaggio;
  }

  /**
   * Sets the descr tipo messaggio.
   *
   * @param descrTipoMessaggio the new descr tipo messaggio
   */
  public void setDescrTipoMessaggio(StringFilter descrTipoMessaggio) {
    this.descrTipoMessaggio = descrTipoMessaggio;
  }
} // fine classe
