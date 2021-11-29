/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The Class RelUtentePrivacyDTO.
 */
@JsonIgnoreProperties({ "keys" })
public class RelUtentePrivacyDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The id rel utente privacy. */
  private Long idRelUtentePrivacy = null;

  /** The id responsabile. */
  private Long idResponsabile = null;

  /** The id tutelato. */
  private Long idTutelato = null;

  /** The data presa visione. */
  private Date dataPresaVisione = null;

  /** The cod ambito. */
  private String codAmbito = null;

  /** The data inserim. */
  private Date dataInserim = null;

  /** The cod user inserim. */
  private String codUserInserim = null;

  /** The data aggiorn. */
  private Date dataAggiorn = null;

  /** The cod user aggiorn. */
  private String codUserAggiorn = null;

  /**
   * Gets the id rel utente privacy.
   *
   * @return the id rel utente privacy
   */
  public Long getIdRelUtentePrivacy() {
    return idRelUtentePrivacy;
  }

  /**
   * Sets the id rel utente privacy.
   *
   * @param idRelUtentePrivacy the new id rel utente privacy
   */
  public void setIdRelUtentePrivacy(Long idRelUtentePrivacy) {
    this.idRelUtentePrivacy = idRelUtentePrivacy;
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
   * Sets the id responsabile.
   *
   * @param idResponsabile the new id responsabile
   */
  public void setIdResponsabile(Long idResponsabile) {
    this.idResponsabile = idResponsabile;
  }

  /**
   * Gets the id tutelato.
   *
   * @return the id tutelato
   */
  public Long getIdTutelato() {
    return idTutelato;
  }

  /**
   * Sets the id tutelato.
   *
   * @param idTutelato the new id tutelato
   */
  public void setIdTutelato(Long idTutelato) {
    this.idTutelato = idTutelato;
  }

  /**
   * Gets the data presa visione.
   *
   * @return the data presa visione
   */
  public Date getDataPresaVisione() {
    return dataPresaVisione;
  }

  /**
   * Sets the data presa visione.
   *
   * @param dataPresaVisione the new data presa visione
   */
  public void setDataPresaVisione(Date dataPresaVisione) {
    this.dataPresaVisione = dataPresaVisione;
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
   * Sets the cod ambito.
   *
   * @param codAmbito the new cod ambito
   */
  public void setCodAmbito(String codAmbito) {
    this.codAmbito = codAmbito;
  }

  /**
   * Gets the data inserim.
   *
   * @return the data inserim
   */
  public Date getDataInserim() {
    return dataInserim;
  }

  /**
   * Sets the data inserim.
   *
   * @param dataInserim the new data inserim
   */
  public void setDataInserim(Date dataInserim) {
    this.dataInserim = dataInserim;
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
   * Sets the cod user inserim.
   *
   * @param codUserInserim the new cod user inserim
   */
  public void setCodUserInserim(String codUserInserim) {
    this.codUserInserim = codUserInserim;
  }

  /**
   * Gets the data aggiorn.
   *
   * @return the data aggiorn
   */
  public Date getDataAggiorn() {
    return dataAggiorn;
  }

  /**
   * Sets the data aggiorn.
   *
   * @param dataAggiorn the new data aggiorn
   */
  public void setDataAggiorn(Date dataAggiorn) {
    this.dataAggiorn = dataAggiorn;
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
   * Sets the cod user aggiorn.
   *
   * @param codUserAggiorn the new cod user aggiorn
   */
  public void setCodUserAggiorn(String codUserAggiorn) {
    this.codUserAggiorn = codUserAggiorn;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "RelUtentePrivacyDTO [idRelUtentePrivacy=" + idRelUtentePrivacy + ", idResponsabile=" + idResponsabile + ", idTutelato=" + idTutelato + ", dataPresaVisione=" + dataPresaVisione + ", codAmbito=" + codAmbito + ", dataInserim=" + dataInserim + ", codUserInserim=" + codUserInserim
        + ", dataAggiorn=" + dataAggiorn + ", codUserAggiorn=" + codUserAggiorn + "]";
  }

}
