/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DTOJediStrategy
package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class MessaggioCalendarioDTO.
 */
public class MessaggioCalendarioDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;
  
  /** The Constant SPOSTAMENTO_APPUNTAMENTO. */
  public static final String SPOSTAMENTO_APPUNTAMENTO = "001";
  
  /** The Constant ANNULLAMENTO_APPUNTAMENTO. */
  public static final String ANNULLAMENTO_APPUNTAMENTO = "002";

  /** The id messaggio. */
  // campo chiave primaria
  private Long idMessaggio = null;

  /** The id calendario. */
  private Long idCalendario = null;

  /** The cod tipo messaggio calendario. */
  private String codTipoMessaggioCalendario = null;

  /** The d inserim. */
  private Date dInserim = null;

  /** The cod user inserim. */
  private String codUserInserim = null;

  /** The cod user aggiorn. */
  private String codUserAggiorn = null;

  /** The d aggiorn. */
  private Date dAggiorn = null;

  /** The testo. */
  private String testo = null;

  /**
   * Gets the id messaggio.
   *
   * @return the id messaggio
   */
  public Long getIdMessaggio() {
    return idMessaggio;
  }

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
   * Gets the testo.
   *
   * @return the testo
   */
  public String getTesto() {
    return testo;
  }

  /**
   * Sets the id messaggio.
   *
   * @param idMessaggio the new id messaggio
   */
  public void setIdMessaggio(Long idMessaggio) {
    this.idMessaggio = idMessaggio;
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
   * Sets the testo.
   *
   * @param testo the new testo
   */
  public void setTesto(String testo) {
    this.testo = testo;
  }

  /**
   * Gets the id calendario.
   *
   * @return the id calendario
   */
  public Long getIdCalendario() {
    return idCalendario;
  }

  /**
   * Sets the id calendario.
   *
   * @param idCalendario the new id calendario
   */
  public void setIdCalendario(Long idCalendario) {
    this.idCalendario = idCalendario;
  }

  /**
   * Gets the cod tipo messaggio calendario.
   *
   * @return the cod tipo messaggio calendario
   */
  public String getCodTipoMessaggioCalendario() {
    return codTipoMessaggioCalendario;
  }

  /**
   * Sets the cod tipo messaggio calendario.
   *
   * @param codTipoMessaggioCalendario the new cod tipo messaggio calendario
   */
  public void setCodTipoMessaggioCalendario(String codTipoMessaggioCalendario) {
    this.codTipoMessaggioCalendario = codTipoMessaggioCalendario;
  }

  /**
   * Gets the keys.
   *
   * @return the keys
   */
  public Object[] getKeys() {
    return new Object[] { idMessaggio };
  }

  /**
   * Gets the dto for test.
   *
   * @return the dto for test
   */
  public static MessaggioCalendarioDTO getDtoForTest() {
    return new MessaggioCalendarioDTO();
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "MessaggioCalendarioDTO [idMessaggio=" + idMessaggio + ", idCalendario=" + idCalendario + ", codTipoMessaggioCalendario=" + codTipoMessaggioCalendario + ", dInserim=" + dInserim + ", codUserInserim=" + codUserInserim + ", codUserAggiorn=" + codUserAggiorn + ", dAggiorn=" + dAggiorn
        + ", testo=" + testo + "]";
  }
  
  
} // fine classe
