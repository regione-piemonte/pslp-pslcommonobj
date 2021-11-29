/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DTOJediStrategy
package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;

/**
 * The Class TipoMessaggioDTO.
 */
public class TipoMessaggioDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The cod tipo messaggio. */
  // campo chiave primaria
  private String codTipoMessaggio = null;

  /** The descr tipo messaggio. */
  private String descrTipoMessaggio = null;

  /**
   * Gets the cod tipo messaggio.
   *
   * @return the cod tipo messaggio
   */
  public String getCodTipoMessaggio() {
    return codTipoMessaggio;
  }

  /**
   * Gets the descr tipo messaggio.
   *
   * @return the descr tipo messaggio
   */
  public String getDescrTipoMessaggio() {
    return descrTipoMessaggio;
  }

  /**
   * Sets the cod tipo messaggio.
   *
   * @param codTipoMessaggio the new cod tipo messaggio
   */
  public void setCodTipoMessaggio(String codTipoMessaggio) {
    this.codTipoMessaggio = codTipoMessaggio;
  }

  /**
   * Sets the descr tipo messaggio.
   *
   * @param descrTipoMessaggio the new descr tipo messaggio
   */
  public void setDescrTipoMessaggio(String descrTipoMessaggio) {
    this.descrTipoMessaggio = descrTipoMessaggio;
  }

  /**
   * Gets the keys.
   *
   * @return the keys
   */
  public Object[] getKeys() {
    return new Object[] { codTipoMessaggio };
  }

  /**
   * Gets the dto for test.
   *
   * @return the dto for test
   */
  public static TipoMessaggioDTO getDtoForTest() {
    return new TipoMessaggioDTO();
  }
} // fine classe
