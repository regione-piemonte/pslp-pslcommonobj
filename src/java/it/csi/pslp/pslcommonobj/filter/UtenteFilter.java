/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.UtenteDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class UtenteFilter.
 */
public class UtenteFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The cf utente. */
  private StringFilter cfUtente = new StringFilter();

  /** The cognome. */
  private StringFilter cognome = new StringFilter();

  /** The id sil lav angrafica. */
  private LongFilter idSilLavAngrafica = new LongFilter();

  /** The cod user aggiorn. */
  private StringFilter codUserAggiorn = new StringFilter();

  /** The email. */
  private StringFilter email = new StringFilter();

  /** The d aggiorn. */
  private DateFilter dAggiorn = new DateFilter();

  // campo chiave esterna verso la colonna COD_TIPO_UTENTE della tabella
  /** The cod tipo utente. */
  // PSLP_D_TIPO_UTENTE
  private StringFilter codTipoUtente = new StringFilter();

  /** The identificativo sap. */
  private StringFilter identificativoSap = new StringFilter();

  /** The id utente. */
  // campo chiave primaria
  private LongFilter idUtente = new LongFilter();

  /** The d inserim. */
  private DateFilter dInserim = new DateFilter();

  /** The cod user inserim. */
  private StringFilter codUserInserim = new StringFilter();

  /** The nome. */
  private StringFilter nome = new StringFilter();

  /** The expr QBE. */
  UtenteDTO exprQBE = new UtenteDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public UtenteDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(UtenteDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * Gets the cf utente.
   *
   * @return the cf utente
   */
  public StringFilter getCfUtente() {
    return cfUtente;
  }

  /**
   * Gets the cognome.
   *
   * @return the cognome
   */
  public StringFilter getCognome() {
    return cognome;
  }

  /**
   * Gets the id sil lav angrafica.
   *
   * @return the id sil lav angrafica
   */
  public LongFilter getIdSilLavAngrafica() {
    return idSilLavAngrafica;
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
   * Gets the email.
   *
   * @return the email
   */
  public StringFilter getEmail() {
    return email;
  }

  /**
   * Gets the d aggiorn.
   *
   * @return the d aggiorn
   */
  public DateFilter getDAggiorn() {
    return dAggiorn;
  }

  /**
   * Gets the cod tipo utente.
   *
   * @return the cod tipo utente
   */
  public StringFilter getCodTipoUtente() {
    return codTipoUtente;
  }

  /**
   * Gets the identificativo sap.
   *
   * @return the identificativo sap
   */
  public StringFilter getIdentificativoSap() {
    return identificativoSap;
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
   * Gets the d inserim.
   *
   * @return the d inserim
   */
  public DateFilter getDInserim() {
    return dInserim;
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
   * Gets the nome.
   *
   * @return the nome
   */
  public StringFilter getNome() {
    return nome;
  }

  /**
   * Sets the cf utente.
   *
   * @param cfUtente the new cf utente
   */
  public void setCfUtente(StringFilter cfUtente) {
    this.cfUtente = cfUtente;
  }

  /**
   * Sets the cognome.
   *
   * @param cognome the new cognome
   */
  public void setCognome(StringFilter cognome) {
    this.cognome = cognome;
  }

  /**
   * Sets the id sil lav angrafica.
   *
   * @param idSilLavAngrafica the new id sil lav angrafica
   */
  public void setIdSilLavAngrafica(LongFilter idSilLavAngrafica) {
    this.idSilLavAngrafica = idSilLavAngrafica;
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
   * Sets the email.
   *
   * @param email the new email
   */
  public void setEmail(StringFilter email) {
    this.email = email;
  }

  /**
   * Sets the d aggiorn.
   *
   * @param dAggiorn the new d aggiorn
   */
  public void setDAggiorn(DateFilter dAggiorn) {
    this.dAggiorn = dAggiorn;
  }

  /**
   * Sets the cod tipo utente.
   *
   * @param codTipoUtente the new cod tipo utente
   */
  public void setCodTipoUtente(StringFilter codTipoUtente) {
    this.codTipoUtente = codTipoUtente;
  }

  /**
   * Sets the identificativo sap.
   *
   * @param identificativoSap the new identificativo sap
   */
  public void setIdentificativoSap(StringFilter identificativoSap) {
    this.identificativoSap = identificativoSap;
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
   * Sets the d inserim.
   *
   * @param dInserim the new d inserim
   */
  public void setDInserim(DateFilter dInserim) {
    this.dInserim = dInserim;
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
   * Sets the nome.
   *
   * @param nome the new nome
   */
  public void setNome(StringFilter nome) {
    this.nome = nome;
  }
} // fine classe
