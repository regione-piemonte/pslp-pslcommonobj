/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DTOJediStrategy
package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;

/**
 * The Class TipoUtenteDTO.
 */
public class TipoUtenteDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The cod tipo utente. */
  // campo chiave primaria
  private String codTipoUtente = null;

  /** The descr tipo utente. */
  private String descrTipoUtente = null;
  
  /**
   * Instantiates a new tipo utente DTO.
   */
  public TipoUtenteDTO() {
  }
  
  /**
   * Instantiates a new tipo utente DTO.
   *
   * @param codTipoUtente the cod tipo utente
   */
  public TipoUtenteDTO(String codTipoUtente) {
    this.codTipoUtente = codTipoUtente;
  }

  /**
   * Gets the cod tipo utente.
   *
   * @return the cod tipo utente
   */
  public String getCodTipoUtente() {
    return codTipoUtente;
  }

  /**
   * Gets the descr tipo utente.
   *
   * @return the descr tipo utente
   */
  public String getDescrTipoUtente() {
    return descrTipoUtente;
  }

  /**
   * Sets the cod tipo utente.
   *
   * @param codTipoUtente the new cod tipo utente
   */
  public void setCodTipoUtente(String codTipoUtente) {
    this.codTipoUtente = codTipoUtente;
  }

  /**
   * Sets the descr tipo utente.
   *
   * @param descrTipoUtente the new descr tipo utente
   */
  public void setDescrTipoUtente(String descrTipoUtente) {
    this.descrTipoUtente = descrTipoUtente;
  }

  /**
   * Gets the keys.
   *
   * @return the keys
   */
  public Object[] getKeys() {
    return new Object[] { codTipoUtente };
  }

  /**
   * Gets the dto for test.
   *
   * @return the dto for test
   */
  public static TipoUtenteDTO getDtoForTest() {
    return new TipoUtenteDTO();
  }
} // fine classe
