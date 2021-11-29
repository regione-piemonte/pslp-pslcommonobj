/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The Class UtentePrivacyDTO.
 */
@JsonIgnoreProperties({"keys"})
public class UtentePrivacyDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;
  
  /** The id utente privacy. */
  private Long idUtentePrivacy = null;
  
  /** The id utente. */
  private Long idUtente = null;

  /** The data presa visione. */
  private Date dataPresaVisione = null;
  
  /** The cod ambito. */
  private String codAmbito = null;

  /** The data inserimento. */
  private Date dataInserimento = null;

  /** The cod user inserim. */
  private String codUserInserim = null;

  /** The data aggiorn. */
  private Date dataAggiorn = null;

  /** The cod user aggiorn. */
  private String codUserAggiorn = null;

  /**
   * Gets the id utente privacy.
   *
   * @return the id utente privacy
   */
  public Long getIdUtentePrivacy() {
    return idUtentePrivacy;
  }

  /**
   * Sets the id utente privacy.
   *
   * @param idUtentePrivacy the new id utente privacy
   */
  public void setIdUtentePrivacy(Long idUtentePrivacy) {
    this.idUtentePrivacy = idUtentePrivacy;
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
   * Sets the id utente.
   *
   * @param idUtente the new id utente
   */
  public void setIdUtente(Long idUtente) {
    this.idUtente = idUtente;
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
   * Gets the data inserimento.
   *
   * @return the data inserimento
   */
  public Date getDataInserimento() {
    return dataInserimento;
  }

  /**
   * Sets the data inserimento.
   *
   * @param dataInserimento the new data inserimento
   */
  public void setDataInserimento(Date dataInserimento) {
    this.dataInserimento = dataInserimento;
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
    return "UtentePrivacyDTO [idUtentePrivacy=" + idUtentePrivacy + ", idUtente=" + idUtente + ", dataPresaVisione=" + dataPresaVisione + ", codAmbito=" + codAmbito + ", dataInserimento=" + dataInserimento + ", codUserInserim=" + codUserInserim + ", dataAggiorn=" + dataAggiorn + ", codUserAggiorn="
        + codUserAggiorn + "]";
  }

}
