/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.TipoUtenteDTO;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class TipoUtenteFilter.
 */
public class TipoUtenteFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The cod tipo utente. */
  // campo chiave primaria
  private StringFilter codTipoUtente = new StringFilter();

  /** The descr tipo utente. */
  private StringFilter descrTipoUtente = new StringFilter();

  /** The expr QBE. */
  TipoUtenteDTO exprQBE = new TipoUtenteDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public TipoUtenteDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(TipoUtenteDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * Gets the cod tipo utente.
   *
   * @return the cod tipo utente
   */
  public StringFilter getCodTipoUtente() {
    return codTipoUtente;
  }

  /**
   * Gets the descr tipo utente.
   *
   * @return the descr tipo utente
   */
  public StringFilter getDescrTipoUtente() {
    return descrTipoUtente;
  }

  /**
   * Sets the cod tipo utente.
   *
   * @param codTipoUtente the new cod tipo utente
   */
  public void setCodTipoUtente(StringFilter codTipoUtente) {
    this.codTipoUtente = codTipoUtente;
  }

  /**
   * Sets the descr tipo utente.
   *
   * @param descrTipoUtente the new descr tipo utente
   */
  public void setDescrTipoUtente(StringFilter descrTipoUtente) {
    this.descrTipoUtente = descrTipoUtente;
  }
} // fine classe
