/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;

/**
 * The Class ParametriAnnulloCalendario.
 */
public class ParametriAnnulloCalendario implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;
  
  /** The id calendario. */
  private Long idCalendario;
  
  /** The codice fiscale operatore. */
  private String codiceFiscaleOperatore;

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
   * Gets the codice fiscale operatore.
   *
   * @return the codice fiscale operatore
   */
  public String getCodiceFiscaleOperatore() {
    return codiceFiscaleOperatore;
  }

  /**
   * Sets the codice fiscale operatore.
   *
   * @param codiceFiscaleOperatore the new codice fiscale operatore
   */
  public void setCodiceFiscaleOperatore(String codiceFiscaleOperatore) {
    this.codiceFiscaleOperatore = codiceFiscaleOperatore;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "ParametriAnnulloCalendario [idCalendario=" + idCalendario + ", codiceFiscaleOperatore=" + codiceFiscaleOperatore + "]";
  }

  
}
