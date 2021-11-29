/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DTOJediStrategy
package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class MessaggioDTO.
 */
public class MessaggioDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The d fine. */
  private Date dFine = null;

  // campo chiave esterna verso la colonna COD_AMBITO della tabella
  /** The cod ambito. */
  // PSLP_D_AMBITO
  private String codAmbito = null;

  /** The id messaggio. */
  // campo chiave primaria
  private Long idMessaggio = null;

  /** The cod messaggio. */
  private String codMessaggio = null;

  // campo chiave esterna verso la colonna COD_TIPO_MESSAGGIO della tabella
  /** The cod tipo messaggio. */
  // PSLP_D_TIPO_MESSAGGIO
  private String codTipoMessaggio = null;

  /** The d inizio. */
  private Date dInizio = null;

  /** The intestazione. */
  private String intestazione = null;

  /** The testo. */
  private String testo = null;

  /** The descr messaggio. */
  private String descrMessaggio = null;

  
  /**
   * Gets the d fine.
   *
   * @return the d fine
   */
  public Date getdFine() {
    return dFine;
  }

  /**
   * Sets the d fine.
   *
   * @param dFine the new d fine
   */
  public void setdFine(Date dFine) {
    this.dFine = dFine;
  }

  /**
   * Gets the id messaggio.
   *
   * @return the id messaggio
   */
  public Long getIdMessaggio() {
    return idMessaggio;
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
   * Gets the d inizio.
   *
   * @return the d inizio
   */
  public Date getdInizio() {
    return dInizio;
  }

  /**
   * Sets the d inizio.
   *
   * @param dInizio the new d inizio
   */
  public void setdInizio(Date dInizio) {
    this.dInizio = dInizio;
  }

  /**
   * Gets the d fine.
   *
   * @return the d fine
   */
  public Date getDFine() {
    return dFine;
  }

  /**
   * Gets the cod ambito.
   *
   * @return the cod ambito
   */
  public String getCodAmbito() {
    return codAmbito;
  }

  /**
   * Gets the cod messaggio.
   *
   * @return the cod messaggio
   */
  public String getCodMessaggio() {
    return codMessaggio;
  }

  /**
   * Gets the cod tipo messaggio.
   *
   * @return the cod tipo messaggio
   */
  public String getCodTipoMessaggio() {
    return codTipoMessaggio;
  }

  /**
   * Gets the d inizio.
   *
   * @return the d inizio
   */
  public Date getDInizio() {
    return dInizio;
  }

  /**
   * Gets the intestazione.
   *
   * @return the intestazione
   */
  public String getIntestazione() {
    return intestazione;
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
   * Gets the descr messaggio.
   *
   * @return the descr messaggio
   */
  public String getDescrMessaggio() {
    return descrMessaggio;
  }

  /**
   * Sets the d fine.
   *
   * @param dFine the new d fine
   */
  public void setDFine(Date dFine) {
    this.dFine = dFine;
  }

  /**
   * Sets the cod ambito.
   *
   * @param codAmbito the new cod ambito
   */
  public void setCodAmbito(String codAmbito) {
    this.codAmbito = codAmbito;
  }

  /**
   * Sets the cod messaggio.
   *
   * @param codMessaggio the new cod messaggio
   */
  public void setCodMessaggio(String codMessaggio) {
    this.codMessaggio = codMessaggio;
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
   * Sets the d inizio.
   *
   * @param dInizio the new d inizio
   */
  public void setDInizio(Date dInizio) {
    this.dInizio = dInizio;
  }

  /**
   * Sets the intestazione.
   *
   * @param intestazione the new intestazione
   */
  public void setIntestazione(String intestazione) {
    this.intestazione = intestazione;
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
   * Sets the descr messaggio.
   *
   * @param descrMessaggio the new descr messaggio
   */
  public void setDescrMessaggio(String descrMessaggio) {
    this.descrMessaggio = descrMessaggio;
  }

  /**
   * Gets the keys.
   *
   * @return the keys
   */
  public Object[] getKeys() {
    return new Object[] { codMessaggio };
  }

  /**
   * Gets the dto for test.
   *
   * @return the dto for test
   */
  public static MessaggioDTO getDtoForTest() {
    return new MessaggioDTO();
  }
} // fine classe
