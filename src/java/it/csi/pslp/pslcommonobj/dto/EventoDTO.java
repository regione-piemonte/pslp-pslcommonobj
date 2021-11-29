/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DTOJediStrategy
package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class EventoDTO.
 */
public class EventoDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The cod esito. */
  private String codEsito = null;

  // campo chiave esterna verso la colonna ID_TIPO_EVENTO della tabella
  /** The id tipo evento. */
  // PSLP_D_TIPO_EVENTO
  private Long idTipoEvento = null;

  /** The id utente. */
  // campo chiave esterna verso la colonna ID_UTENTE della tabella PSLP_T_UTENTE
  private Long idUtente = null;

  /** The d inserim. */
  private Date dInserim = null;

  /** The cod user inserim. */
  private String codUserInserim = null;

  /** The note. */
  private String note = null;

  /** The id evento. */
  // campo chiave primaria
  private Long idEvento = null;

  /** The cod user aggiorn. */
  private String codUserAggiorn = null;

  /** The d evento. */
  private Date dEvento = null;

  /** The d aggiorn. */
  private Date dAggiorn = null;

  /** The ip chiamante. */
  private String ipChiamante = null;
  
  /** The codice ambito. */
  private String codiceAmbito;

  /**
   * Gets the cod esito.
   *
   * @return the cod esito
   */
  public String getCodEsito() {
    return codEsito;
  }

  /**
   * Gets the id tipo evento.
   *
   * @return the id tipo evento
   */
  public Long getIdTipoEvento() {
    return idTipoEvento;
  }

  /**
   * Gets the id utente.
   *
   * @return the id utente
   */
  public Long getIdUtente() {
    return idUtente;
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
   * Gets the note.
   *
   * @return the note
   */
  public String getNote() {
    return note;
  }

  /**
   * Gets the id evento.
   *
   * @return the id evento
   */
  public Long getIdEvento() {
    return idEvento;
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
   * Gets the d evento.
   *
   * @return the d evento
   */
  public Date getDEvento() {
    return dEvento;
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
   * Sets the cod esito.
   *
   * @param codEsito the new cod esito
   */
  public void setCodEsito(String codEsito) {
    this.codEsito = codEsito;
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
   * Sets the id utente.
   *
   * @param idUtente the new id utente
   */
  public void setIdUtente(Long idUtente) {
    this.idUtente = idUtente;
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
   * Sets the note.
   *
   * @param note the new note
   */
  public void setNote(String note) {
    this.note = note;
  }

  /**
   * Sets the id evento.
   *
   * @param idEvento the new id evento
   */
  public void setIdEvento(Long idEvento) {
    this.idEvento = idEvento;
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
   * Sets the d evento.
   *
   * @param dEvento the new d evento
   */
  public void setDEvento(Date dEvento) {
    this.dEvento = dEvento;
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
   * Gets the ip chiamante.
   *
   * @return the ip chiamante
   */
  public String getIpChiamante() {
    return ipChiamante;
  }

  /**
   * Sets the ip chiamante.
   *
   * @param ipChiamante the new ip chiamante
   */
  public void setIpChiamante(String ipChiamante) {
    this.ipChiamante = ipChiamante;
  }

  /**
   * Gets the keys.
   *
   * @return the keys
   */
  public Object[] getKeys() {
    return new Object[] { idEvento };
  }

  /**
   * Gets the dto for test.
   *
   * @return the dto for test
   */
  public static EventoDTO getDtoForTest() {
    return new EventoDTO();
  }

  
  /**
   * Gets the codice ambito.
   *
   * @return the codice ambito
   */
  public String getCodiceAmbito() {
    return codiceAmbito;
  }

  /**
   * Sets the codice ambito.
   *
   * @param codiceAmbito the new codice ambito
   */
  public void setCodiceAmbito(String codiceAmbito) {
    this.codiceAmbito = codiceAmbito;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "EventoDTO [codEsito=" + codEsito + ", idTipoEvento=" + idTipoEvento + ", idUtente=" + idUtente + ", dInserim=" + dInserim + ", codUserInserim=" + codUserInserim + ", note=" + note + ", idEvento=" + idEvento + ", codUserAggiorn=" + codUserAggiorn + ", dEvento=" + dEvento + ", dAggiorn="
        + dAggiorn + ", ipChiamante=" + ipChiamante + ", codiceAmbito=" + codiceAmbito + "]";
  }

  
} // fine classe
