/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;

/**
 * The Class ParametriRicercaSlotDTO.
 */
public class ParametriRicercaSlotDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The parametri ricerca calendario DTO. */
  private ParametriRicercaCalendarioDTO parametriRicercaCalendarioDTO;

  /** The da giorno. */
  private String daGiorno;

  /** The a giorno. */
  private String aGiorno;

  /**
   * Gets the parametri ricerca calendario DTO.
   *
   * @return the parametri ricerca calendario DTO
   */
  public ParametriRicercaCalendarioDTO getParametriRicercaCalendarioDTO() {
    return parametriRicercaCalendarioDTO;
  }

  /**
   * Sets the parametri ricerca calendario DTO.
   *
   * @param parametriRicercaCalendarioDTO the new parametri ricerca calendario DTO
   */
  public void setParametriRicercaCalendarioDTO(ParametriRicercaCalendarioDTO parametriRicercaCalendarioDTO) {
    this.parametriRicercaCalendarioDTO = parametriRicercaCalendarioDTO;
  }

  /**
   * Gets the da giorno.
   *
   * @return the da giorno
   */
  public String getDaGiorno() {
    return daGiorno;
  }

  /**
   * Sets the da giorno.
   *
   * @param daGiorno the new da giorno
   */
  public void setDaGiorno(String daGiorno) {
    this.daGiorno = daGiorno;
  }

  /**
   * Gets the a giorno.
   *
   * @return the a giorno
   */
  public String getAGiorno() {
    return aGiorno;
  }

  /**
   * Sets the a giorno.
   *
   * @param aGiorno the new a giorno
   */
  public void setAGiorno(String aGiorno) {
    this.aGiorno = aGiorno;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "ParametriRicercaSlotDTO [parametriRicercaCalendarioDTO=" + parametriRicercaCalendarioDTO + ", daGiorno=" + daGiorno + ", aGiorno=" + aGiorno + "]";
  }

}
