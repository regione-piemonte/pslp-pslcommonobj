/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;

/**
 * The Class ContrattoSMSDDTO.
 */
public class ContrattoSMSDDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The codice. */
  private String codice;

  /** The descrizione. */
  private String descrizione;

  /** The username. */
  private String username;

  /** The password. */
  private String password;

  /** The codice progetto. */
  private String codiceProgetto;

  /**
   * Gets the codice.
   *
   * @return the codice
   */
  public String getCodice() {
    return codice;
  }

  /**
   * Sets the codice.
   *
   * @param codice the new codice
   */
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * Gets the descrizione.
   *
   * @return the descrizione
   */
  public String getDescrizione() {
    return descrizione;
  }

  /**
   * Sets the descrizione.
   *
   * @param descrizione the new descrizione
   */
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * Gets the username.
   *
   * @return the username
   */
  public String getUsername() {
    return username;
  }

  /**
   * Sets the username.
   *
   * @param username the new username
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Gets the password.
   *
   * @return the password
   */
  public String getPassword() {
    return password;
  }

  /**
   * Sets the password.
   *
   * @param password the new password
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Gets the codice progetto.
   *
   * @return the codice progetto
   */
  public String getCodiceProgetto() {
    return codiceProgetto;
  }

  /**
   * Sets the codice progetto.
   *
   * @param codiceProgetto the new codice progetto
   */
  public void setCodiceProgetto(String codiceProgetto) {
    this.codiceProgetto = codiceProgetto;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "ContrattoSMSDDTO [codice=" + codice + ", descrizione=" + descrizione + ", username=" + username + ", password=" + password + ", codiceProgetto=" + codiceProgetto + "]";
  }

}
