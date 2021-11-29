/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.TipoEventoDTO;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class TipoEventoFilter.
 */
public class TipoEventoFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The id tipo evento. */
  // campo chiave primaria
  private LongFilter idTipoEvento = new LongFilter();

  /** The descr tipo evento. */
  private StringFilter descrTipoEvento = new StringFilter();

  /** The expr QBE. */
  TipoEventoDTO exprQBE = new TipoEventoDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public TipoEventoDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(TipoEventoDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * Gets the id tipo evento.
   *
   * @return the id tipo evento
   */
  public LongFilter getIdTipoEvento() {
    return idTipoEvento;
  }

  /**
   * Gets the descr tipo evento.
   *
   * @return the descr tipo evento
   */
  public StringFilter getDescrTipoEvento() {
    return descrTipoEvento;
  }

  /**
   * Sets the id tipo evento.
   *
   * @param idTipoEvento the new id tipo evento
   */
  public void setIdTipoEvento(LongFilter idTipoEvento) {
    this.idTipoEvento = idTipoEvento;
  }

  /**
   * Sets the descr tipo evento.
   *
   * @param descrTipoEvento the new descr tipo evento
   */
  public void setDescrTipoEvento(StringFilter descrTipoEvento) {
    this.descrTipoEvento = descrTipoEvento;
  }
} // fine classe
