/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.UtentePrivacyDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.LongFilter;

/**
 * The Class UtentePrivacyFilter.
 */
public class UtentePrivacyFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The id utente privacy. */
  private LongFilter idUtentePrivacy = new LongFilter();

  /** The id utente. */
  private LongFilter idUtente = new LongFilter();

  /** The data presa visione. */
  private DateFilter dataPresaVisione = new DateFilter();

  /** The cod ambito. */
  private String codAmbito = null;

  /** The data inserimento. */
  private DateFilter dataInserimento = new DateFilter();

  /** The cod user inserim. */
  private String codUserInserim = null;

  /** The data aggiorn. */
  private DateFilter dataAggiorn = new DateFilter();

  /** The cod user aggiorn. */
  private String codUserAggiorn = null;

  /** The expr QBE. */
  UtentePrivacyDTO exprQBE = new UtentePrivacyDTO();

  /**
   * Gets the id utente privacy.
   *
   * @return the id utente privacy
   */
  public LongFilter getIdUtentePrivacy() {
    return idUtentePrivacy;
  }

  /**
   * Sets the id utente privacy.
   *
   * @param idUtentePrivacy the new id utente privacy
   */
  public void setIdUtentePrivacy(LongFilter idUtentePrivacy) {
    this.idUtentePrivacy = idUtentePrivacy;
  }

  /**
   * Gets the id utente.
   *
   * @return the id utente
   */
  public LongFilter getIdUtente() {
    return idUtente;
  }

  /**
   * Sets the id utente.
   *
   * @param idUtente the new id utente
   */
  public void setIdUtente(LongFilter idUtente) {
    this.idUtente = idUtente;
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
  public DateFilter getDataInserimento() {
    return dataInserimento;
  }

  /**
   * Sets the data inserimento.
   *
   * @param dataInserimento the new data inserimento
   */
  public void setDataInserimento(DateFilter dataInserimento) {
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
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public UtentePrivacyDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(UtentePrivacyDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "UtentePrivacyFilter [idUtentePrivacy=" + idUtentePrivacy + ", idUtente=" + idUtente + ", dataPresaVisione=" + dataPresaVisione + ", codAmbito=" + codAmbito + ", dataInserimento=" + dataInserimento + ", codUserInserim=" + codUserInserim + ", dataAggiorn=" + dataAggiorn
        + ", codUserAggiorn=" + codUserAggiorn + ", exprQBE=" + exprQBE + "]";
  }

}
