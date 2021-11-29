/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The Class SlotHeaderDTO.
 */
@JsonIgnoreProperties({"descrizioneOraInizio","descrizioneOraFine"})
public class SlotHeaderDTO extends SlotMixin implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The id slot. */
  private Long idSlot;

  /** The giorno. */
  private String giorno;

  /** The ora inizio. */
  private Integer oraInizio;

  /** The ora fine. */
  private Integer oraFine;

  /** The disponibilita. */
  private Integer disponibilita;

  /**
   * Gets the id slot.
   *
   * @return the id slot
   */
  public Long getIdSlot() {
    return idSlot;
  }

  /**
   * Sets the id slot.
   *
   * @param idSlot the new id slot
   */
  public void setIdSlot(Long idSlot) {
    this.idSlot = idSlot;
  }

  /**
   * Gets the giorno.
   *
   * @return the giorno
   */
  public String getGiorno() {
    return giorno;
  }

  /**
   * Sets the giorno.
   *
   * @param giorno the new giorno
   */
  public void setGiorno(String giorno) {
    this.giorno = giorno;
  }

  /**
   * Gets the ora inizio.
   *
   * @return the ora inizio
   */
  public Integer getOraInizio() {
    return oraInizio;
  }

  /**
   * Sets the ora inizio.
   *
   * @param oraInizio the new ora inizio
   */
  public void setOraInizio(Integer oraInizio) {
    this.oraInizio = oraInizio;
  }

  /**
   * Gets the ora fine.
   *
   * @return the ora fine
   */
  public Integer getOraFine() {
    return oraFine;
  }

  /**
   * Sets the ora fine.
   *
   * @param oraFine the new ora fine
   */
  public void setOraFine(Integer oraFine) {
    this.oraFine = oraFine;
  }

  /**
   * Gets the disponibilita.
   *
   * @return the disponibilita
   */
  public Integer getDisponibilita() {
    return disponibilita;
  }

  /**
   * Sets the disponibilita.
   *
   * @param disponibilita the new disponibilita
   */
  public void setDisponibilita(Integer disponibilita) {
    this.disponibilita = disponibilita;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "SlotHeaderDTO [idSlot=" + idSlot + ", giorno=" + giorno + ", oraInizio=" + oraInizio + ", oraFine=" + oraFine + ", disponibilita=" + disponibilita + "]";
  }

}
