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
 * The Class SlotDTO.
 */
@JsonIgnoreProperties({"keys","descrizioneOraInizio","descrizioneOraFine","dataOra"})
public class SlotDTO extends SlotMixin implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The id slot. */
  // campo chiave primaria
  private Long idSlot = null;

  /** The num prenotazioni valide. */
  private Integer numPrenotazioniValide = null;

  /** The d inserim. */
  private Date dInserim = null;

  /** The cod user inserim. */
  private String codUserInserim = null;

  /** The ora fine. */
  private Integer oraFine = null;

  /** The cod user aggiorn. */
  private String codUserAggiorn = null;

  /** The num max prenotazioni. */
  private Integer numMaxPrenotazioni = null;

  /** The ora inizio. */
  private Integer oraInizio = null;

  /** The d aggiorn. */
  private Date dAggiorn = null;

  /** The flg eccezione. */
  private String flgEccezione = null;

  /** The giorno. */
  // campo chiave esterna verso la colonna ID_GIORNO della tabella PSLP_T_GIORNO
  private GiornoDTO giorno = null;
  
  /** The numero lock. */
  private Long numeroLock = null;

  
  /**
   * Instantiates a new slot DTO.
   */
  public SlotDTO() {
  }
  
  /**
   * Instantiates a new slot DTO.
   *
   * @param idSlot the id slot
   */
  public SlotDTO(Long idSlot) {
    this.idSlot = idSlot;
  }

  /**
   * Gets the id slot.
   *
   * @return the id slot
   */
  public Long getIdSlot() {
    return idSlot;
  }

  /**
   * Gets the num prenotazioni valide.
   *
   * @return the num prenotazioni valide
   */
  public Integer getNumPrenotazioniValide() {
    return numPrenotazioniValide;
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
   * Gets the ora fine.
   *
   * @return the ora fine
   */
  public Integer getOraFine() {
    return oraFine;
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
   * Gets the num max prenotazioni.
   *
   * @return the num max prenotazioni
   */
  public Integer getNumMaxPrenotazioni() {
    return numMaxPrenotazioni;
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
   * Gets the d aggiorn.
   *
   * @return the d aggiorn
   */
  public Date getDAggiorn() {
    return dAggiorn;
  }

  /**
   * Gets the flg eccezione.
   *
   * @return the flg eccezione
   */
  public String getFlgEccezione() {
    return flgEccezione;
  }

  /**
   * Gets the giorno.
   *
   * @return the giorno
   */
  public GiornoDTO getGiorno() {
    return giorno;
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
   * Sets the num prenotazioni valide.
   *
   * @param numPrenotazioniValide the new num prenotazioni valide
   */
  public void setNumPrenotazioniValide(Integer numPrenotazioniValide) {
    this.numPrenotazioniValide = numPrenotazioniValide;
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
   * Sets the ora fine.
   *
   * @param oraFine the new ora fine
   */
  public void setOraFine(Integer oraFine) {
    this.oraFine = oraFine;
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
   * Sets the num max prenotazioni.
   *
   * @param numMaxPrenotazioni the new num max prenotazioni
   */
  public void setNumMaxPrenotazioni(Integer numMaxPrenotazioni) {
    this.numMaxPrenotazioni = numMaxPrenotazioni;
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
   * Sets the d aggiorn.
   *
   * @param dAggiorn the new d aggiorn
   */
  public void setDAggiorn(Date dAggiorn) {
    this.dAggiorn = dAggiorn;
  }

  /**
   * Sets the flg eccezione.
   *
   * @param flgEccezione the new flg eccezione
   */
  public void setFlgEccezione(String flgEccezione) {
    this.flgEccezione = flgEccezione;
  }

  /**
   * Sets the giorno.
   *
   * @param giorno the new giorno
   */
  public void setGiorno(GiornoDTO giorno) {
    this.giorno = giorno;
  }
  
  /**
   * Gets the data ora.
   *
   * @return the data ora
   */
  public Date getDataOra() {
    if(giorno!=null) {
      Date data = giorno.getGiorno();
      return new Date(data.getTime()+oraInizio*60000);
    }
    return null;
  }

  /**
   * Gets the keys.
   *
   * @return the keys
   */
  public Object[] getKeys() {
    return new Object[] { idSlot };
  }

  /**
   * Gets the dto for test.
   *
   * @return the dto for test
   */
  public static SlotDTO getDtoForTest() {
    return new SlotDTO();
  }

  
  /**
   * Gets the numero lock.
   *
   * @return the numero lock
   */
  public Long getNumeroLock() {
    return numeroLock;
  }

  /**
   * Sets the numero lock.
   *
   * @param numeroLock the new numero lock
   */
  public void setNumeroLock(Long numeroLock) {
    this.numeroLock = numeroLock;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "SlotDTO [idSlot=" + idSlot + ", numPrenotazioniValide=" + numPrenotazioniValide + ", dInserim=" + dInserim + ", codUserInserim=" + codUserInserim + ", oraFine=" + oraFine + ", codUserAggiorn=" + codUserAggiorn + ", numMaxPrenotazioni=" + numMaxPrenotazioni + ", oraInizio=" + oraInizio
        + ", dAggiorn=" + dAggiorn + ", flgEccezione=" + flgEccezione + ", giorno=" + giorno + ", numeroLock=" + numeroLock + "]";
  }

  
} // fine classe
