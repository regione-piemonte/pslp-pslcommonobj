/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The Class EccezioneDTO.
 */
@JsonIgnoreProperties({"keys"})
public class EccezioneDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The id eccezione. */
  private Long idEccezione;
    
  /** The id periodo. */
  private Long idPeriodo;
  
  /** The giorno. */
  private Date giorno;
  
  /** The ora inizio. */
  private Integer oraInizio;
  
  /** The ora fine. */
  private Integer oraFine;
  
  /** The num max prenotazioni. */
  private Integer numMaxPrenotazioni;
  
  /** The flg elaborata. */
  private String flgElaborata;

  /**
   * Gets the id eccezione.
   *
   * @return the id eccezione
   */
  public Long getIdEccezione() {
    return idEccezione;
  }

  /**
   * Sets the id eccezione.
   *
   * @param idEccezione the new id eccezione
   */
  public void setIdEccezione(Long idEccezione) {
    this.idEccezione = idEccezione;
  }

  /**
   * Gets the id periodo.
   *
   * @return the id periodo
   */
  public Long getIdPeriodo() {
    return idPeriodo;
  }

  /**
   * Sets the id periodo.
   *
   * @param idPeriodo the new id periodo
   */
  public void setIdPeriodo(Long idPeriodo) {
    this.idPeriodo = idPeriodo;
  }

  /**
   * Gets the giorno.
   *
   * @return the giorno
   */
  public Date getGiorno() {
    return giorno;
  }

  /**
   * Sets the giorno.
   *
   * @param giorno the new giorno
   */
  public void setGiorno(Date giorno) {
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
   * Gets the num max prenotazioni.
   *
   * @return the num max prenotazioni
   */
  public Integer getNumMaxPrenotazioni() {
    return numMaxPrenotazioni;
  }

  /**
   * Sets the num max prenotazioni.
   *
   * @param numMaxPrenotazioni the new num max prenotazioni
   */
  public void setNumMaxPrenotazioni(Integer numMaxPrenotazioni) {
    this.numMaxPrenotazioni = numMaxPrenotazioni;
  }

  /**
   * Gets the flg elaborata.
   *
   * @return the flg elaborata
   */
  public String getFlgElaborata() {
    return flgElaborata;
  }

  /**
   * Sets the flg elaborata.
   *
   * @param flgElaborata the new flg elaborata
   */
  public void setFlgElaborata(String flgElaborata) {
    this.flgElaborata = flgElaborata;
  }


  /**
   * Gets the keys.
   *
   * @return the keys
   */
  public Object[] getKeys() {
    return new Object[] { idEccezione };
  }

  /**
   * Gets the dto for test.
   *
   * @return the dto for test
   */
  public static EccezioneDTO getDtoForTest() {
    return new EccezioneDTO();
  }
  

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "EccezioneDTO [idEccezione=" + idEccezione + ", idPeriodo=" + idPeriodo + ", giorno=" + giorno + ", oraInizio=" + oraInizio + ", oraFine=" + oraFine + ", numMaxPrenotazioni=" + numMaxPrenotazioni + ", flgElaborata=" + flgElaborata + "]";
  }

}
