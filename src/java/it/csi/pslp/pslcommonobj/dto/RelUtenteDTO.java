/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DTOJediStrategy
package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class RelUtenteDTO.
 */
public class RelUtenteDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The d inserim. */
  private Date dInserim = null;

  /** The cod user inserim. */
  private String codUserInserim = null;

  // campo chiave esterna verso la colonna COD_TIPO_RESPONSABILITA della tabella
  /** The tipo responsabilita. */
  // PSLP_D_TIPO_RESPONSABILITA
  private TipoResponsabilitaDTO tipoResponsabilita = null;

  /** The cod user aggiorn. */
  private String codUserAggiorn = null;

  /** The d aggiorn. */
  private Date dAggiorn = null;

  // campo chiave primaria
  /** The id responsabile. */
  // campo chiave esterna verso la colonna ID_UTENTE della tabella PSLP_T_UTENTE
  private Long idResponsabile = null;

  // campo chiave primaria
  /** The tutelato. */
  // campo chiave esterna verso la colonna ID_UTENTE della tabella PSLP_T_UTENTE
  private UtenteDTO tutelato = null;

  /**
   * Gets the d inserim.
   *
   * @return the d inserim
   */
  public Date getDInserim() {
    return dInserim;
  }

  /**
   * Gets the cod user inserim.
   *
   * @return the cod user inserim
   */
  public String getCodUserInserim() {
    return codUserInserim;
  }

  /**
   * Gets the cod user aggiorn.
   *
   * @return the cod user aggiorn
   */
  public String getCodUserAggiorn() {
    return codUserAggiorn;
  }

  /**
   * Gets the d aggiorn.
   *
   * @return the d aggiorn
   */
  public Date getDAggiorn() {
    return dAggiorn;
  }

  /**
   * Gets the id responsabile.
   *
   * @return the id responsabile
   */
  public Long getIdResponsabile() {
    return idResponsabile;
  }

  /**
   * Sets the d inserim.
   *
   * @param dInserim the new d inserim
   */
  public void setDInserim(Date dInserim) {
    this.dInserim = dInserim;
  }

  /**
   * Sets the cod user inserim.
   *
   * @param codUserInserim the new cod user inserim
   */
  public void setCodUserInserim(String codUserInserim) {
    this.codUserInserim = codUserInserim;
  }

  /**
   * Gets the tipo responsabilita.
   *
   * @return the tipo responsabilita
   */
  public TipoResponsabilitaDTO getTipoResponsabilita() {
    return tipoResponsabilita;
  }

  /**
   * Sets the tipo responsabilita.
   *
   * @param tipoResponsabilita the new tipo responsabilita
   */
  public void setTipoResponsabilita(TipoResponsabilitaDTO tipoResponsabilita) {
    this.tipoResponsabilita = tipoResponsabilita;
  }

  /**
   * Sets the cod user aggiorn.
   *
   * @param codUserAggiorn the new cod user aggiorn
   */
  public void setCodUserAggiorn(String codUserAggiorn) {
    this.codUserAggiorn = codUserAggiorn;
  }

  /**
   * Sets the d aggiorn.
   *
   * @param dAggiorn the new d aggiorn
   */
  public void setDAggiorn(Date dAggiorn) {
    this.dAggiorn = dAggiorn;
  }

  /**
   * Sets the id responsabile.
   *
   * @param idResponsabile the new id responsabile
   */
  public void setIdResponsabile(Long idResponsabile) {
    this.idResponsabile = idResponsabile;
  }

  /**
   * Gets the tutelato.
   *
   * @return the tutelato
   */
  public UtenteDTO getTutelato() {
    return tutelato;
  }

  /**
   * Sets the tutelato.
   *
   * @param tutelato the new tutelato
   */
  public void setTutelato(UtenteDTO tutelato) {
    this.tutelato = tutelato;
  }

  /**
   * Gets the keys.
   *
   * @return the keys
   */
  public Object[] getKeys() {
    return new Object[] { idResponsabile, tutelato.getIdUtente() };
  }

  /**
   * Gets the dto for test.
   *
   * @return the dto for test
   */
  public static RelUtenteDTO getDtoForTest() {
    return new RelUtenteDTO();
  }
} // fine classe
