/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.AmbitoDTO;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class AmbitoFilter.
 */
public class AmbitoFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The id sil T in servizio. */
  private LongFilter idSilTInServizio = new LongFilter();

  /** The cod ambito. */
  // campo chiave primaria
  private StringFilter codAmbito = new StringFilter();

  /** The descr ambito. */
  private StringFilter descrAmbito = new StringFilter();

  /** The expr QBE. */
  AmbitoDTO exprQBE = new AmbitoDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public AmbitoDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(AmbitoDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * Gets the id sil T in servizio.
   *
   * @return the id sil T in servizio
   */
  public LongFilter getIdSilTInServizio() {
    return idSilTInServizio;
  }

  /**
   * Gets the cod ambito.
   *
   * @return the cod ambito
   */
  public StringFilter getCodAmbito() {
    return codAmbito;
  }

  /**
   * Gets the descr ambito.
   *
   * @return the descr ambito
   */
  public StringFilter getDescrAmbito() {
    return descrAmbito;
  }

  /**
   * Sets the id sil T in servizio.
   *
   * @param idSilTInServizio the new id sil T in servizio
   */
  public void setIdSilTInServizio(LongFilter idSilTInServizio) {
    this.idSilTInServizio = idSilTInServizio;
  }

  /**
   * Sets the cod ambito.
   *
   * @param codAmbito the new cod ambito
   */
  public void setCodAmbito(StringFilter codAmbito) {
    this.codAmbito = codAmbito;
  }

  /**
   * Sets the descr ambito.
   *
   * @param descrAmbito the new descr ambito
   */
  public void setDescrAmbito(StringFilter descrAmbito) {
    this.descrAmbito = descrAmbito;
  }
} // fine classe
