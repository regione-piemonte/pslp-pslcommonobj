/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DTOJediStrategy
package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class MessaggioAggiuntivoDTO.
 */
public class MessaggioAggiuntivoDTO implements Serializable {
  
  /** The Constant MAIL_CONFERMA. */
  public static final String MAIL_CONFERMA = "MAIL_CONFERMA";
  
  /** The Constant MAIL_PROMEMORIA. */
  public static final String MAIL_PROMEMORIA = "MAIL_PROMEMORIA";
  
  /** The Constant MAIL_ANNULLAMENTO. */
  public static final String MAIL_ANNULLAMENTO = "MAIL_ANNULLAMENTO";
  
  /** The Constant MAIL_NON_PRESENTATO. */
  public static final String MAIL_NON_PRESENTATO = "MAIL_NON_PRESENTATO";
  
  /** The Constant MAIL_OPEN_SILP. */
  public static final String MAIL_OPEN_SILP = "MAIL_OPEN_SILP";
  
  /** The Constant MAIL_CLOSE_SILP. */
  public static final String MAIL_CLOSE_SILP = "MAIL_CLOSE_SILP";

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  // campo chiave esterna verso la colonna ID_MESSAGGIO della tabella
  /** The messaggio. */
  // PSLP_D_MESSAGGIO
  private MessaggioDTO messaggio = null;

  /** The id messaggio aggiuntivo. */
  // campo chiave primaria
  private Long idMessaggioAggiuntivo = null;

  /** The d inserim. */
  private Date dInserim = null;

  /** The cod user inserim. */
  private String codUserInserim = null;

  /** The cod operatore. */
  private Long codOperatore = null;

  /** The cod user aggiorn. */
  private String codUserAggiorn = null;

  /** The gruppo operatore. */
  private String gruppoOperatore = null;

  /** The calendario. */
  private CalendarioDTO calendario = null;

  /** The d aggiorn. */
  private Date dAggiorn = null;

  /** The testo. */
  private String testo = null;

  /** The subcodice. */
  private Long subcodice = null;

  /**
   * Gets the id messaggio aggiuntivo.
   *
   * @return the id messaggio aggiuntivo
   */
  public Long getIdMessaggioAggiuntivo() {
    return idMessaggioAggiuntivo;
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
   * Gets the cod operatore.
   *
   * @return the cod operatore
   */
  public Long getCodOperatore() {
    return codOperatore;
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
   * Gets the gruppo operatore.
   *
   * @return the gruppo operatore
   */
  public String getGruppoOperatore() {
    return gruppoOperatore;
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
   * Gets the subcodice.
   *
   * @return the subcodice
   */
  public Long getSubcodice() {
    return subcodice;
  }

  /**
   * Sets the id messaggio aggiuntivo.
   *
   * @param idMessaggioAggiuntivo the new id messaggio aggiuntivo
   */
  public void setIdMessaggioAggiuntivo(Long idMessaggioAggiuntivo) {
    this.idMessaggioAggiuntivo = idMessaggioAggiuntivo;
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
   * Sets the cod operatore.
   *
   * @param codOperatore the new cod operatore
   */
  public void setCodOperatore(Long codOperatore) {
    this.codOperatore = codOperatore;
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
   * Sets the gruppo operatore.
   *
   * @param gruppoOperatore the new gruppo operatore
   */
  public void setGruppoOperatore(String gruppoOperatore) {
    this.gruppoOperatore = gruppoOperatore;
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
   * Sets the subcodice.
   *
   * @param subcodice the new subcodice
   */
  public void setSubcodice(Long subcodice) {
    this.subcodice = subcodice;
  }

  
  /**
   * Gets the messaggio.
   *
   * @return the messaggio
   */
  public MessaggioDTO getMessaggio() {
    return messaggio;
  }

  /**
   * Sets the messaggio.
   *
   * @param messaggio the new messaggio
   */
  public void setMessaggio(MessaggioDTO messaggio) {
    this.messaggio = messaggio;
  }

  /**
   * Gets the calendario.
   *
   * @return the calendario
   */
  public CalendarioDTO getCalendario() {
    return calendario;
  }

  /**
   * Sets the calendario.
   *
   * @param calendario the new calendario
   */
  public void setCalendario(CalendarioDTO calendario) {
    this.calendario = calendario;
  }

  /**
   * Gets the keys.
   *
   * @return the keys
   */
  public Object[] getKeys() {
    return new Object[] { idMessaggioAggiuntivo };
  }

} // fine classe
