/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DTOJediStrategy
package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;

/**
 * The Class UtenteEnteDTO.
 */
public class UtenteEnteDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  // campo chiave primaria
  /** The id utente. */
  // campo chiave esterna verso la colonna ID_UTENTE della tabella PSLP_T_UTENTE
  private Long idUtente = null;

  /** The flg utente master. */
  private String flgUtenteMaster = null;

  /** The cod operatore. */
  // campo chiave primaria
  private Long codOperatore = null;

  /** The gruppo operatore. */
  // campo chiave primaria
  private String gruppoOperatore = null;

  /** The subcodice. */
  // campo chiave primaria
  private Long subcodice = null;

  /**
   * Gets the id utente.
   *
   * @return the id utente
   */
  public Long getIdUtente() {
    return idUtente;
  }

  /**
   * Gets the flg utente master.
   *
   * @return the flg utente master
   */
  public String getFlgUtenteMaster() {
    return flgUtenteMaster;
  }

  /**
   * Gets the cod operatore.
   *
   * @return the cod operatore
   */
  public Long getCodOperatore() {
    return codOperatore;
  }

  /**
   * Gets the gruppo operatore.
   *
   * @return the gruppo operatore
   */
  public String getGruppoOperatore() {
    return gruppoOperatore;
  }

  /**
   * Gets the subcodice.
   *
   * @return the subcodice
   */
  public Long getSubcodice() {
    return subcodice;
  }

  /**
   * Sets the id utente.
   *
   * @param idUtente the new id utente
   */
  public void setIdUtente(Long idUtente) {
    this.idUtente = idUtente;
  }

  /**
   * Sets the flg utente master.
   *
   * @param flgUtenteMaster the new flg utente master
   */
  public void setFlgUtenteMaster(String flgUtenteMaster) {
    this.flgUtenteMaster = flgUtenteMaster;
  }

  /**
   * Sets the cod operatore.
   *
   * @param codOperatore the new cod operatore
   */
  public void setCodOperatore(Long codOperatore) {
    this.codOperatore = codOperatore;
  }

  /**
   * Sets the gruppo operatore.
   *
   * @param gruppoOperatore the new gruppo operatore
   */
  public void setGruppoOperatore(String gruppoOperatore) {
    this.gruppoOperatore = gruppoOperatore;
  }

  /**
   * Sets the subcodice.
   *
   * @param subcodice the new subcodice
   */
  public void setSubcodice(Long subcodice) {
    this.subcodice = subcodice;
  }

  /**
   * Gets the keys.
   *
   * @return the keys
   */
  public Object[] getKeys() {
    return new Object[] { idUtente, codOperatore, gruppoOperatore, subcodice };
  }

  /**
   * Gets the dto for test.
   *
   * @return the dto for test
   */
  public static UtenteEnteDTO getDtoForTest() {
    return new UtenteEnteDTO();
  }
} // fine classe
