/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.ResponsabileDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class ResponsabileFilter.
 */
public class ResponsabileFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The id sil T nazione res. */
  private StringFilter idSilTNazioneRes = new StringFilter();

  /** The ds indirizzo dom. */
  private StringFilter dsIndirizzoDom = new StringFilter();

  /** The ds fax. */
  private StringFilter dsFax = new StringFilter();

  /** The ds num civico dom. */
  private StringFilter dsNumCivicoDom = new StringFilter();

  /** The id sil T comune dom. */
  private StringFilter idSilTComuneDom = new StringFilter();

  /** The genere. */
  private StringFilter genere = new StringFilter();

  /** The d inserim. */
  private DateFilter dInserim = new DateFilter();

  /** The cap dom. */
  private StringFilter capDom = new StringFilter();

  /** The ds indirizzo res. */
  private StringFilter dsIndirizzoRes = new StringFilter();

  /** The id sil T comune res. */
  private StringFilter idSilTComuneRes = new StringFilter();

  /** The d scadenza perm sogg. */
  private DateFilter dScadenzaPermSogg = new DateFilter();

  /** The id sil T cittadinanza. */
  private StringFilter idSilTCittadinanza = new StringFilter();

  /** The id sil T provincia dom. */
  private StringFilter idSilTProvinciaDom = new StringFilter();

  /** The id sil T toponimo dom. */
  private StringFilter idSilTToponimoDom = new StringFilter();

  /** The id sil T provincia res. */
  private StringFilter idSilTProvinciaRes = new StringFilter();

  /** The d nascita. */
  private DateFilter dNascita = new DateFilter();

  /** The cod user aggiorn. */
  private StringFilter codUserAggiorn = new StringFilter();

  /** The ds telefono cellulare. */
  private StringFilter dsTelefonoCellulare = new StringFilter();

  /** The ds indirizzo res esteso. */
  private StringFilter dsIndirizzoResEsteso = new StringFilter();

  /** The id sil T comune nasc. */
  private StringFilter idSilTComuneNasc = new StringFilter();

  /** The d aggiorn. */
  private DateFilter dAggiorn = new DateFilter();

  // campo chiave primaria
  /** The id responsabile. */
  // campo chiave esterna verso la colonna ID_UTENTE della tabella PSLP_T_UTENTE
  private LongFilter idResponsabile = new LongFilter();

  /** The numero perm sogg. */
  private StringFilter numeroPermSogg = new StringFilter();

  /** The id sil T nazione nasc. */
  private StringFilter idSilTNazioneNasc = new StringFilter();

  /** The cap res. */
  private StringFilter capRes = new StringFilter();

  /** The ds telefono fisso. */
  private StringFilter dsTelefonoFisso = new StringFilter();

  /** The cod user inserim. */
  private StringFilter codUserInserim = new StringFilter();

  /** The ds num civico res. */
  private StringFilter dsNumCivicoRes = new StringFilter();

  /** The id sil T status lav extra ue. */
  private StringFilter idSilTStatusLavExtraUe = new StringFilter();

  /** The id sil T mot ril perm. */
  private StringFilter idSilTMotRilPerm = new StringFilter();

  /** The id sil T toponimo res. */
  private StringFilter idSilTToponimoRes = new StringFilter();
  
  /** The ds indirizzo dom esteso. */
  private StringFilter dsIndirizzoDomEsteso = new StringFilter();

  /** The id sil T nazione dom. */
  private StringFilter idSilTNazioneDom = new StringFilter();

  /** The expr QBE. */
  ResponsabileDTO exprQBE = new ResponsabileDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public ResponsabileDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(ResponsabileDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * Gets the id sil T nazione res.
   *
   * @return the id sil T nazione res
   */
  public StringFilter getIdSilTNazioneRes() {
    return idSilTNazioneRes;
  }

  /**
   * Gets the ds indirizzo dom.
   *
   * @return the ds indirizzo dom
   */
  public StringFilter getDsIndirizzoDom() {
    return dsIndirizzoDom;
  }

  /**
   * Gets the ds fax.
   *
   * @return the ds fax
   */
  public StringFilter getDsFax() {
    return dsFax;
  }

  /**
   * Gets the ds num civico dom.
   *
   * @return the ds num civico dom
   */
  public StringFilter getDsNumCivicoDom() {
    return dsNumCivicoDom;
  }

  /**
   * Gets the id sil T comune dom.
   *
   * @return the id sil T comune dom
   */
  public StringFilter getIdSilTComuneDom() {
    return idSilTComuneDom;
  }

  /**
   * Gets the genere.
   *
   * @return the genere
   */
  public StringFilter getGenere() {
    return genere;
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
   * Gets the cap dom.
   *
   * @return the cap dom
   */
  public StringFilter getCapDom() {
    return capDom;
  }

  /**
   * Gets the ds indirizzo res.
   *
   * @return the ds indirizzo res
   */
  public StringFilter getDsIndirizzoRes() {
    return dsIndirizzoRes;
  }

  /**
   * Gets the id sil T comune res.
   *
   * @return the id sil T comune res
   */
  public StringFilter getIdSilTComuneRes() {
    return idSilTComuneRes;
  }

  /**
   * Gets the d scadenza perm sogg.
   *
   * @return the d scadenza perm sogg
   */
  public DateFilter getDScadenzaPermSogg() {
    return dScadenzaPermSogg;
  }

  /**
   * Gets the id sil T cittadinanza.
   *
   * @return the id sil T cittadinanza
   */
  public StringFilter getIdSilTCittadinanza() {
    return idSilTCittadinanza;
  }

  /**
   * Gets the id sil T provincia dom.
   *
   * @return the id sil T provincia dom
   */
  public StringFilter getIdSilTProvinciaDom() {
    return idSilTProvinciaDom;
  }

  /**
   * Gets the id sil T toponimo dom.
   *
   * @return the id sil T toponimo dom
   */
  public StringFilter getIdSilTToponimoDom() {
    return idSilTToponimoDom;
  }

  /**
   * Gets the id sil T provincia res.
   *
   * @return the id sil T provincia res
   */
  public StringFilter getIdSilTProvinciaRes() {
    return idSilTProvinciaRes;
  }

  /**
   * Gets the d nascita.
   *
   * @return the d nascita
   */
  public DateFilter getDNascita() {
    return dNascita;
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
   * Gets the ds telefono cellulare.
   *
   * @return the ds telefono cellulare
   */
  public StringFilter getDsTelefonoCellulare() {
    return dsTelefonoCellulare;
  }

  /**
   * Gets the ds indirizzo res esteso.
   *
   * @return the ds indirizzo res esteso
   */
  public StringFilter getDsIndirizzoResEsteso() {
    return dsIndirizzoResEsteso;
  }

  /**
   * Gets the id sil T comune nasc.
   *
   * @return the id sil T comune nasc
   */
  public StringFilter getIdSilTComuneNasc() {
    return idSilTComuneNasc;
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
   * Gets the id responsabile.
   *
   * @return the id responsabile
   */
  public LongFilter getIdResponsabile() {
    return idResponsabile;
  }

  /**
   * Gets the numero perm sogg.
   *
   * @return the numero perm sogg
   */
  public StringFilter getNumeroPermSogg() {
    return numeroPermSogg;
  }

  /**
   * Gets the id sil T nazione nasc.
   *
   * @return the id sil T nazione nasc
   */
  public StringFilter getIdSilTNazioneNasc() {
    return idSilTNazioneNasc;
  }

  /**
   * Gets the cap res.
   *
   * @return the cap res
   */
  public StringFilter getCapRes() {
    return capRes;
  }

  /**
   * Gets the ds telefono fisso.
   *
   * @return the ds telefono fisso
   */
  public StringFilter getDsTelefonoFisso() {
    return dsTelefonoFisso;
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
   * Gets the ds num civico res.
   *
   * @return the ds num civico res
   */
  public StringFilter getDsNumCivicoRes() {
    return dsNumCivicoRes;
  }

  /**
   * Gets the id sil T status lav extra ue.
   *
   * @return the id sil T status lav extra ue
   */
  public StringFilter getIdSilTStatusLavExtraUe() {
    return idSilTStatusLavExtraUe;
  }

  /**
   * Gets the id sil T mot ril perm.
   *
   * @return the id sil T mot ril perm
   */
  public StringFilter getIdSilTMotRilPerm() {
    return idSilTMotRilPerm;
  }

  /**
   * Gets the id sil T toponimo res.
   *
   * @return the id sil T toponimo res
   */
  public StringFilter getIdSilTToponimoRes() {
    return idSilTToponimoRes;
  }

  /**
   * Gets the ds indirizzo dom esteso.
   *
   * @return the ds indirizzo dom esteso
   */
  public StringFilter getDsIndirizzoDomEsteso() {
    return dsIndirizzoDomEsteso;
  }

  /**
   * Gets the id sil T nazione dom.
   *
   * @return the id sil T nazione dom
   */
  public StringFilter getIdSilTNazioneDom() {
    return idSilTNazioneDom;
  }

  /**
   * Sets the id sil T nazione res.
   *
   * @param idSilTNazioneRes the new id sil T nazione res
   */
  public void setIdSilTNazioneRes(StringFilter idSilTNazioneRes) {
    this.idSilTNazioneRes = idSilTNazioneRes;
  }

  /**
   * Sets the ds indirizzo dom.
   *
   * @param dsIndirizzoDom the new ds indirizzo dom
   */
  public void setDsIndirizzoDom(StringFilter dsIndirizzoDom) {
    this.dsIndirizzoDom = dsIndirizzoDom;
  }

  /**
   * Sets the ds fax.
   *
   * @param dsFax the new ds fax
   */
  public void setDsFax(StringFilter dsFax) {
    this.dsFax = dsFax;
  }

  /**
   * Sets the ds num civico dom.
   *
   * @param dsNumCivicoDom the new ds num civico dom
   */
  public void setDsNumCivicoDom(StringFilter dsNumCivicoDom) {
    this.dsNumCivicoDom = dsNumCivicoDom;
  }

  /**
   * Sets the id sil T comune dom.
   *
   * @param idSilTComuneDom the new id sil T comune dom
   */
  public void setIdSilTComuneDom(StringFilter idSilTComuneDom) {
    this.idSilTComuneDom = idSilTComuneDom;
  }

  /**
   * Sets the genere.
   *
   * @param genere the new genere
   */
  public void setGenere(StringFilter genere) {
    this.genere = genere;
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
   * Sets the cap dom.
   *
   * @param capDom the new cap dom
   */
  public void setCapDom(StringFilter capDom) {
    this.capDom = capDom;
  }

  /**
   * Sets the ds indirizzo res.
   *
   * @param dsIndirizzoRes the new ds indirizzo res
   */
  public void setDsIndirizzoRes(StringFilter dsIndirizzoRes) {
    this.dsIndirizzoRes = dsIndirizzoRes;
  }

  /**
   * Sets the id sil T comune res.
   *
   * @param idSilTComuneRes the new id sil T comune res
   */
  public void setIdSilTComuneRes(StringFilter idSilTComuneRes) {
    this.idSilTComuneRes = idSilTComuneRes;
  }

  /**
   * Sets the d scadenza perm sogg.
   *
   * @param dScadenzaPermSogg the new d scadenza perm sogg
   */
  public void setDScadenzaPermSogg(DateFilter dScadenzaPermSogg) {
    this.dScadenzaPermSogg = dScadenzaPermSogg;
  }

  /**
   * Sets the id sil T cittadinanza.
   *
   * @param idSilTCittadinanza the new id sil T cittadinanza
   */
  public void setIdSilTCittadinanza(StringFilter idSilTCittadinanza) {
    this.idSilTCittadinanza = idSilTCittadinanza;
  }

  /**
   * Sets the id sil T provincia dom.
   *
   * @param idSilTProvinciaDom the new id sil T provincia dom
   */
  public void setIdSilTProvinciaDom(StringFilter idSilTProvinciaDom) {
    this.idSilTProvinciaDom = idSilTProvinciaDom;
  }

  /**
   * Sets the id sil T toponimo dom.
   *
   * @param idSilTToponimoDom the new id sil T toponimo dom
   */
  public void setIdSilTToponimoDom(StringFilter idSilTToponimoDom) {
    this.idSilTToponimoDom = idSilTToponimoDom;
  }

  /**
   * Sets the id sil T provincia res.
   *
   * @param idSilTProvinciaRes the new id sil T provincia res
   */
  public void setIdSilTProvinciaRes(StringFilter idSilTProvinciaRes) {
    this.idSilTProvinciaRes = idSilTProvinciaRes;
  }

  /**
   * Sets the d nascita.
   *
   * @param dNascita the new d nascita
   */
  public void setDNascita(DateFilter dNascita) {
    this.dNascita = dNascita;
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
   * Sets the ds telefono cellulare.
   *
   * @param dsTelefonoCellulare the new ds telefono cellulare
   */
  public void setDsTelefonoCellulare(StringFilter dsTelefonoCellulare) {
    this.dsTelefonoCellulare = dsTelefonoCellulare;
  }

  /**
   * Sets the ds indirizzo res esteso.
   *
   * @param dsIndirizzoResEsteso the new ds indirizzo res esteso
   */
  public void setDsIndirizzoResEsteso(StringFilter dsIndirizzoResEsteso) {
    this.dsIndirizzoResEsteso = dsIndirizzoResEsteso;
  }

  /**
   * Sets the id sil T comune nasc.
   *
   * @param idSilTComuneNasc the new id sil T comune nasc
   */
  public void setIdSilTComuneNasc(StringFilter idSilTComuneNasc) {
    this.idSilTComuneNasc = idSilTComuneNasc;
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
   * Sets the id responsabile.
   *
   * @param idResponsabile the new id responsabile
   */
  public void setIdResponsabile(LongFilter idResponsabile) {
    this.idResponsabile = idResponsabile;
  }

  /**
   * Sets the numero perm sogg.
   *
   * @param numeroPermSogg the new numero perm sogg
   */
  public void setNumeroPermSogg(StringFilter numeroPermSogg) {
    this.numeroPermSogg = numeroPermSogg;
  }

  /**
   * Sets the id sil T nazione nasc.
   *
   * @param idSilTNazioneNasc the new id sil T nazione nasc
   */
  public void setIdSilTNazioneNasc(StringFilter idSilTNazioneNasc) {
    this.idSilTNazioneNasc = idSilTNazioneNasc;
  }

  /**
   * Sets the cap res.
   *
   * @param capRes the new cap res
   */
  public void setCapRes(StringFilter capRes) {
    this.capRes = capRes;
  }

  /**
   * Sets the ds telefono fisso.
   *
   * @param dsTelefonoFisso the new ds telefono fisso
   */
  public void setDsTelefonoFisso(StringFilter dsTelefonoFisso) {
    this.dsTelefonoFisso = dsTelefonoFisso;
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
   * Sets the ds num civico res.
   *
   * @param dsNumCivicoRes the new ds num civico res
   */
  public void setDsNumCivicoRes(StringFilter dsNumCivicoRes) {
    this.dsNumCivicoRes = dsNumCivicoRes;
  }

  /**
   * Sets the id sil T status lav extra ue.
   *
   * @param idSilTStatusLavExtraUe the new id sil T status lav extra ue
   */
  public void setIdSilTStatusLavExtraUe(StringFilter idSilTStatusLavExtraUe) {
    this.idSilTStatusLavExtraUe = idSilTStatusLavExtraUe;
  }

  /**
   * Sets the id sil T mot ril perm.
   *
   * @param idSilTMotRilPerm the new id sil T mot ril perm
   */
  public void setIdSilTMotRilPerm(StringFilter idSilTMotRilPerm) {
    this.idSilTMotRilPerm = idSilTMotRilPerm;
  }

  /**
   * Sets the id sil T toponimo res.
   *
   * @param idSilTToponimoRes the new id sil T toponimo res
   */
  public void setIdSilTToponimoRes(StringFilter idSilTToponimoRes) {
    this.idSilTToponimoRes = idSilTToponimoRes;
  }

  /**
   * Sets the ds indirizzo dom esteso.
   *
   * @param dsIndirizzoDomEsteso the new ds indirizzo dom esteso
   */
  public void setDsIndirizzoDomEsteso(StringFilter dsIndirizzoDomEsteso) {
    this.dsIndirizzoDomEsteso = dsIndirizzoDomEsteso;
  }

  /**
   * Sets the id sil T nazione dom.
   *
   * @param idSilTNazioneDom the new id sil T nazione dom
   */
  public void setIdSilTNazioneDom(StringFilter idSilTNazioneDom) {
    this.idSilTNazioneDom = idSilTNazioneDom;
  }
} // fine classe
