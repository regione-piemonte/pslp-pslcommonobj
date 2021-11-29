/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DTOJediStrategy
package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The Class UtenteDTO.
 */
@JsonIgnoreProperties({"keys"})
public class UtenteDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The cf utente. */
  private String cfUtente = null;

  /** The cognome. */
  private String cognome = null;

  /** The id sil lav angrafica. */
  private Long idSilLavAngrafica = null;

  /** The cod user aggiorn. */
  private String codUserAggiorn = null;

  /** The email. */
  private String email = null;

  /** The d aggiorn. */
  private Date dAggiorn = null;

  /** The cod tipo utente. */
  private String codTipoUtente = null;

  /** The identificativo sap. */
  private String identificativoSap = null;

  /** The id utente. */
  // campo chiave primaria
  private Long idUtente = null;

  /** The d inserim. */
  private Date dInserim = null;

  /** The cod user inserim. */
  private String codUserInserim = null;

  /** The nome. */
  private String nome = null;

  /**
   * Instantiates a new utente DTO.
   */
  public UtenteDTO() {
  }
  
  /**
   * Instantiates a new utente DTO.
   *
   * @param idUtente the id utente
   */
  public UtenteDTO(Long idUtente) {
    this.idUtente = idUtente;
  }

  /**
   * Gets the cf utente.
   *
   * @return the cf utente
   */
  public String getCfUtente() {
    return cfUtente;
  }

  /**
   * Gets the cognome.
   *
   * @return the cognome
   */
  public String getCognome() {
    return cognome;
  }

  /**
   * Gets the id sil lav angrafica.
   *
   * @return the id sil lav angrafica
   */
  public Long getIdSilLavAngrafica() {
    return idSilLavAngrafica;
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
   * Gets the email.
   *
   * @return the email
   */
  public String getEmail() {
    return email;
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
   * Gets the cod tipo utente.
   *
   * @return the cod tipo utente
   */
  public String getCodTipoUtente() {
    return codTipoUtente;
  }

  /**
   * Gets the identificativo sap.
   *
   * @return the identificativo sap
   */
  public String getIdentificativoSap() {
    return identificativoSap;
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
   * Gets the nome.
   *
   * @return the nome
   */
  public String getNome() {
    return nome;
  }

  /**
   * Sets the cf utente.
   *
   * @param cfUtente the new cf utente
   */
  public void setCfUtente(String cfUtente) {
    this.cfUtente = cfUtente;
  }

  /**
   * Sets the cognome.
   *
   * @param cognome the new cognome
   */
  public void setCognome(String cognome) {
    this.cognome = cognome;
  }

  /**
   * Sets the id sil lav angrafica.
   *
   * @param idSilLavAngrafica the new id sil lav angrafica
   */
  public void setIdSilLavAngrafica(Long idSilLavAngrafica) {
    this.idSilLavAngrafica = idSilLavAngrafica;
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
   * Sets the email.
   *
   * @param email the new email
   */
  public void setEmail(String email) {
    this.email = email;
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
   * Sets the cod tipo utente.
   *
   * @param codTipoUtente the new cod tipo utente
   */
  public void setCodTipoUtente(String codTipoUtente) {
    this.codTipoUtente =codTipoUtente;
  }

  /**
   * Sets the identificativo sap.
   *
   * @param identificativoSap the new identificativo sap
   */
  public void setIdentificativoSap(String identificativoSap) {
    this.identificativoSap = identificativoSap;
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
   * Sets the nome.
   *
   * @param nome the new nome
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Gets the keys.
   *
   * @return the keys
   */
  public Object[] getKeys() {
    return new Object[] { idUtente };
  }

  /**
   * Gets the dto for test.
   *
   * @return the dto for test
   */
  public static UtenteDTO getDtoForTest() {
    return new UtenteDTO();
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "UtenteDTO [cfUtente=" + cfUtente + ", cognome=" + cognome + ", idSilLavAngrafica=" + idSilLavAngrafica + ", codUserAggiorn=" + codUserAggiorn + ", email=" + email + ", dAggiorn=" + dAggiorn + ", codTipoUtente=" + codTipoUtente + ", identificativoSap=" + identificativoSap + ", idUtente="
        + idUtente + ", dInserim=" + dInserim + ", codUserInserim=" + codUserInserim + ", nome=" + nome + "]";
  }
  

} // fine classe
