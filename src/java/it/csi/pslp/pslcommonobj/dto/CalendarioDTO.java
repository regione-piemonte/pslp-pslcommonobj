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
 * The Class CalendarioDTO.
 */
@JsonIgnoreProperties({"keys"})
public class CalendarioDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The flg invio conferma prenotaz. */
  private String flgInvioConfermaPrenotaz = null;

  // campo chiave esterna verso la colonna COD_AMBITO della tabella
  /** The ambito. */
  // PSLP_D_AMBITO
  private AmbitoDTO ambito = null;

  /** The cod operatore. */
  private Long codOperatore = null;

  /** The cod user aggiorn. */
  private String codUserAggiorn = null;

  /** The id calendario. */
  // campo chiave primaria
  private Long idCalendario = null;

  /** The flg annulla garanzia giovani. */
  private String flgAnnullaGaranziaGiovani = null;

  /** The d aggiorn. */
  private Date dAggiorn = null;

  /** The subcodice. */
  private Long subcodice = null;

  /** The d inserim. */
  private Date dInserim = null;

  /** The cod user inserim. */
  private String codUserInserim = null;

  /** The ore invio promemoria. */
  private Integer oreInvioPromemoria = null;

  /** The ore limite spostamento. */
  private Integer oreLimiteSpostamento = null;

  /** The d annullamento. */
  private Date dAnnullamento = null;

  /** The flg visibile cpi. */
  private String flgVisibileCpi = null;

  /** The gruppo operatore. */
  private String gruppoOperatore = null;

  /** The flg bloccato. */
  private String flgBloccato = null;

  /** The nome. */
  private String nome = null;
  
  /** The oggetto calendario. */
  private String oggettoCalendario;

  /**
   * Gets the flg invio conferma prenotaz.
   *
   * @return the flg invio conferma prenotaz
   */
  public String getFlgInvioConfermaPrenotaz() {
    return flgInvioConfermaPrenotaz;
  }

  /**
   * Gets the ambito.
   *
   * @return the ambito
   */
  public AmbitoDTO getAmbito() {
    return ambito;
  }

  /**
   * Gets the cod operatore.
   *
   * @return the cod operatore
   */
  public Long getCodOperatore() {
    return codOperatore;
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
   * Gets the id calendario.
   *
   * @return the id calendario
   */
  public Long getIdCalendario() {
    return idCalendario;
  }

  /**
   * Gets the flg annulla garanzia giovani.
   *
   * @return the flg annulla garanzia giovani
   */
  public String getFlgAnnullaGaranziaGiovani() {
    return flgAnnullaGaranziaGiovani;
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
   * Gets the subcodice.
   *
   * @return the subcodice
   */
  public Long getSubcodice() {
    return subcodice;
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
   * Gets the ore invio promemoria.
   *
   * @return the ore invio promemoria
   */
  public Integer getOreInvioPromemoria() {
    return oreInvioPromemoria;
  }

  /**
   * Gets the ore limite spostamento.
   *
   * @return the ore limite spostamento
   */
  public Integer getOreLimiteSpostamento() {
    return oreLimiteSpostamento;
  }

  /**
   * Gets the d annullamento.
   *
   * @return the d annullamento
   */
  public Date getDAnnullamento() {
    return dAnnullamento;
  }

  /**
   * Gets the flg visibile cpi.
   *
   * @return the flg visibile cpi
   */
  public String getFlgVisibileCpi() {
    return flgVisibileCpi;
  }

  /**
   * Gets the gruppo operatore.
   *
   * @return the gruppo operatore
   */
  public String getGruppoOperatore() {
    return gruppoOperatore;
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
   * Sets the flg invio conferma prenotaz.
   *
   * @param flgInvioConfermaPrenotaz the new flg invio conferma prenotaz
   */
  public void setFlgInvioConfermaPrenotaz(String flgInvioConfermaPrenotaz) {
    this.flgInvioConfermaPrenotaz = flgInvioConfermaPrenotaz;
  }

  /**
   * Sets the ambito.
   *
   * @param ambito the new ambito
   */
  public void setAmbito(AmbitoDTO ambito) {
    this.ambito = ambito;
  }

  /**
   * Sets the cod operatore.
   *
   * @param codOperatore the new cod operatore
   */
  public void setCodOperatore(Long codOperatore) {
    this.codOperatore = codOperatore;
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
   * Sets the id calendario.
   *
   * @param idCalendario the new id calendario
   */
  public void setIdCalendario(Long idCalendario) {
    this.idCalendario = idCalendario;
  }

  /**
   * Sets the flg annulla garanzia giovani.
   *
   * @param flgAnnullaGaranziaGiovani the new flg annulla garanzia giovani
   */
  public void setFlgAnnullaGaranziaGiovani(String flgAnnullaGaranziaGiovani) {
    this.flgAnnullaGaranziaGiovani = flgAnnullaGaranziaGiovani;
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
   * Sets the subcodice.
   *
   * @param subcodice the new subcodice
   */
  public void setSubcodice(Long subcodice) {
    this.subcodice = subcodice;
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
   * Sets the ore invio promemoria.
   *
   * @param oreInvioPromemoria the new ore invio promemoria
   */
  public void setOreInvioPromemoria(Integer oreInvioPromemoria) {
    this.oreInvioPromemoria = oreInvioPromemoria;
  }

  /**
   * Sets the ore limite spostamento.
   *
   * @param oreLimiteSpostamento the new ore limite spostamento
   */
  public void setOreLimiteSpostamento(Integer oreLimiteSpostamento) {
    this.oreLimiteSpostamento = oreLimiteSpostamento;
  }

  /**
   * Sets the d annullamento.
   *
   * @param dAnnullamento the new d annullamento
   */
  public void setDAnnullamento(Date dAnnullamento) {
    this.dAnnullamento = dAnnullamento;
  }

  /**
   * Sets the flg visibile cpi.
   *
   * @param flgVisibileCpi the new flg visibile cpi
   */
  public void setFlgVisibileCpi(String flgVisibileCpi) {
    this.flgVisibileCpi = flgVisibileCpi;
  }

  /**
   * Sets the gruppo operatore.
   *
   * @param gruppoOperatore the new gruppo operatore
   */
  public void setGruppoOperatore(String gruppoOperatore) {
    this.gruppoOperatore = gruppoOperatore;
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
   * Gets the flg bloccato.
   *
   * @return the flg bloccato
   */
  public String getFlgBloccato() {
    return flgBloccato;
  }

  /**
   * Sets the flg bloccato.
   *
   * @param flgBloccato the new flg bloccato
   */
  public void setFlgBloccato(String flgBloccato) {
    this.flgBloccato = flgBloccato;
  }

  /**
   * Gets the oggetto calendario.
   *
   * @return the oggetto calendario
   */
  public String getOggettoCalendario() {
    return oggettoCalendario;
  }

  /**
   * Sets the oggetto calendario.
   *
   * @param oggettoCalendario the new oggetto calendario
   */
  public void setOggettoCalendario(String oggettoCalendario) {
    this.oggettoCalendario = oggettoCalendario;
  }

  /**
   * Gets the keys.
   *
   * @return the keys
   */
  public Object[] getKeys() {
    return new Object[] { idCalendario };
  }

  /**
   * Gets the dto for test.
   *
   * @return the dto for test
   */
  public static CalendarioDTO getDtoForTest() {
    return new CalendarioDTO();
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "CalendarioDTO [flgInvioConfermaPrenotaz=" + flgInvioConfermaPrenotaz + ", ambito=" + ambito + ", codOperatore=" + codOperatore + ", codUserAggiorn=" + codUserAggiorn + ", idCalendario=" + idCalendario + ", flgAnnullaGaranziaGiovani=" + flgAnnullaGaranziaGiovani + ", dAggiorn=" + dAggiorn
        + ", subcodice=" + subcodice + ", dInserim=" + dInserim + ", codUserInserim=" + codUserInserim + ", oreInvioPromemoria=" + oreInvioPromemoria + ", oreLimiteSpostamento=" + oreLimiteSpostamento + ", dAnnullamento=" + dAnnullamento + ", flgVisibileCpi=" + flgVisibileCpi + ", gruppoOperatore="
        + gruppoOperatore + ", flgBloccato=" + flgBloccato + ", nome=" + nome + ", oggettoCalendario=" + oggettoCalendario + "]";
  }

  
  
} // fine classe
