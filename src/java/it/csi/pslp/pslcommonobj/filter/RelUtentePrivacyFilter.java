/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.RelUtentePrivacyDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class RelUtentePrivacyFilter.
 */
public class RelUtentePrivacyFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The id rel utente privacy. */
  private LongFilter idRelUtentePrivacy = new LongFilter();

  /** The id responsabile. */
  private LongFilter idResponsabile = new LongFilter();

  /** The id tutelato. */
  private LongFilter idTutelato = new LongFilter();

  /** The data presa visione. */
  private DateFilter dataPresaVisione = new DateFilter();

  /** The cod ambito. */
  private StringFilter codAmbito = new StringFilter();

  /** The data inserim. */
  private DateFilter dataInserim = new DateFilter();

  /** The cod user inserim. */
  private StringFilter codUserInserim = new StringFilter();

  /** The data aggiorn. */
  private DateFilter dataAggiorn = new DateFilter();

  /** The cod user aggiorn. */
  private StringFilter codUserAggiorn = new StringFilter();

  /** The expr QBE. */
  RelUtentePrivacyDTO exprQBE = new RelUtentePrivacyDTO();

  /**
   * Gets the id rel utente privacy.
   *
   * @return the id rel utente privacy
   */
  public LongFilter getIdRelUtentePrivacy() {
    return idRelUtentePrivacy;
  }

  /**
   * Sets the id rel utente privacy.
   *
   * @param idRelUtentePrivacy the new id rel utente privacy
   */
  public void setIdRelUtentePrivacy(LongFilter idRelUtentePrivacy) {
    this.idRelUtentePrivacy = idRelUtentePrivacy;
  }

  /**
   * Gets the id responsabile.
   *
   * @return the id responsabile
   */
  public LongFilter getIdResponsabile() {
    return idResponsabile;
  }

  /**
   * Sets the id responsabile.
   *
   * @param idResponsabile the new id responsabile
   */
  public void setIdResponsabile(LongFilter idResponsabile) {
    this.idResponsabile = idResponsabile;
  }

  /**
   * Gets the id tutelato.
   *
   * @return the id tutelato
   */
  public LongFilter getIdTutelato() {
    return idTutelato;
  }

  /**
   * Sets the id tutelato.
   *
   * @param idTutelato the new id tutelato
   */
  public void setIdTutelato(LongFilter idTutelato) {
    this.idTutelato = idTutelato;
  }

  /**
   * Gets the data presa visione.
   *
   * @return the data presa visione
   */
  public DateFilter getDataPresaVisione() {
    return dataPresaVisione;
  }

  /**
   * Sets the data presa visione.
   *
   * @param dataPresaVisione the new data presa visione
   */
  public void setDataPresaVisione(DateFilter dataPresaVisione) {
    this.dataPresaVisione = dataPresaVisione;
  }

  /**
   * Gets the cod ambito.
   *
   * @return the cod ambito
   */
  public StringFilter getCodAmbito() {
    return codAmbito;
  }

  /**
   * Sets the cod ambito.
   *
   * @param codAmbito the new cod ambito
   */
  public void setCodAmbito(StringFilter codAmbito) {
    this.codAmbito = codAmbito;
  }

  /**
   * Gets the data inserim.
   *
   * @return the data inserim
   */
  public DateFilter getDataInserim() {
    return dataInserim;
  }

  /**
   * Sets the data inserim.
   *
   * @param dataInserim the new data inserim
   */
  public void setDataInserim(DateFilter dataInserim) {
    this.dataInserim = dataInserim;
  }

  /**
   * Gets the cod user inserim.
   *
   * @return the cod user inserim
   */
  public StringFilter getCodUserInserim() {
    return codUserInserim;
  }

  /**
   * Sets the cod user inserim.
   *
   * @param codUserInserim the new cod user inserim
   */
  public void setCodUserInserim(StringFilter codUserInserim) {
    this.codUserInserim = codUserInserim;
  }

  /**
   * Gets the data aggiorn.
   *
   * @return the data aggiorn
   */
  public DateFilter getDataAggiorn() {
    return dataAggiorn;
  }

  /**
   * Sets the data aggiorn.
   *
   * @param dataAggiorn the new data aggiorn
   */
  public void setDataAggiorn(DateFilter dataAggiorn) {
    this.dataAggiorn = dataAggiorn;
  }

  /**
   * Gets the cod user aggiorn.
   *
   * @return the cod user aggiorn
   */
  public StringFilter getCodUserAggiorn() {
    return codUserAggiorn;
  }

  /**
   * Sets the cod user aggiorn.
   *
   * @param codUserAggiorn the new cod user aggiorn
   */
  public void setCodUserAggiorn(StringFilter codUserAggiorn) {
    this.codUserAggiorn = codUserAggiorn;
  }

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public RelUtentePrivacyDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(RelUtentePrivacyDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "RelUtentePrivacyFilter [idRelUtentePrivacy=" + idRelUtentePrivacy + ", idResponsabile=" + idResponsabile + ", idTutelato=" + idTutelato + ", dataPresaVisione=" + dataPresaVisione + ", codAmbito=" + codAmbito + ", dataInserim=" + dataInserim + ", codUserInserim=" + codUserInserim
        + ", dataAggiorn=" + dataAggiorn + ", codUserAggiorn=" + codUserAggiorn + ", exprQBE=" + exprQBE + "]";
  }

}
