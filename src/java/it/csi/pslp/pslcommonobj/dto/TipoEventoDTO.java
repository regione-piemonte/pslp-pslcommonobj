/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DTOJediStrategy
package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;

/**
 * The Class TipoEventoDTO.
 */
public class TipoEventoDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The id tipo evento. */
  // campo chiave primaria
  private Long idTipoEvento = null;

  /** The descr tipo evento. */
  private String descrTipoEvento = null;

  /**
   * Gets the id tipo evento.
   *
   * @return the id tipo evento
   */
  public Long getIdTipoEvento() {
    return idTipoEvento;
  }

  /**
   * Gets the descr tipo evento.
   *
   * @return the descr tipo evento
   */
  public String getDescrTipoEvento() {
    return descrTipoEvento;
  }

  /**
   * Sets the id tipo evento.
   *
   * @param idTipoEvento the new id tipo evento
   */
  public void setIdTipoEvento(Long idTipoEvento) {
    this.idTipoEvento = idTipoEvento;
  }

  /**
   * Sets the descr tipo evento.
   *
   * @param descrTipoEvento the new descr tipo evento
   */
  public void setDescrTipoEvento(String descrTipoEvento) {
    this.descrTipoEvento = descrTipoEvento;
  }

  /**
   * Gets the keys.
   *
   * @return the keys
   */
  public Object[] getKeys() {
    return new Object[] { idTipoEvento };
  }

  /**
   * Gets the dto for test.
   *
   * @return the dto for test
   */
  public static TipoEventoDTO getDtoForTest() {
    return new TipoEventoDTO();
  }
} // fine classe
