/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DTOJediStrategy
package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class ResponsabileDTO.
 */
public class ResponsabileDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id sil T nazione res. */
    private String idSilTNazioneRes = null;
    
    /** The ds indirizzo dom. */
    private String dsIndirizzoDom = null;
    
    /** The ds fax. */
    private String dsFax = null;
    
    /** The ds num civico dom. */
    private String dsNumCivicoDom = null;
    
    /** The id sil T comune dom. */
    private String idSilTComuneDom = null;
    
    /** The genere. */
    private String genere = null;
    
    /** The d inserim. */
    private Date dInserim = null;
    
    /** The cap dom. */
    private String capDom = null;
    
    /** The ds indirizzo res. */
    private String dsIndirizzoRes = null;
    
    /** The id sil T comune res. */
    private String idSilTComuneRes = null;
    
    /** The d scadenza perm sogg. */
    private Date dScadenzaPermSogg = null;
    
    /** The id sil T cittadinanza. */
    private String idSilTCittadinanza = null;
    
    /** The id sil T provincia dom. */
    private String idSilTProvinciaDom = null;
    
    /** The id sil T toponimo dom. */
    private String idSilTToponimoDom = null;
    
    /** The id sil T provincia res. */
    private String idSilTProvinciaRes = null;
    
    /** The d nascita. */
    private Date dNascita = null;
    
    /** The cod user aggiorn. */
    private String codUserAggiorn = null;
    
    /** The ds telefono cellulare. */
    private String dsTelefonoCellulare = null;
    
    /** The ds indirizzo res esteso. */
    private String dsIndirizzoResEsteso = null;
    
    /** The id sil T comune nasc. */
    private String idSilTComuneNasc = null;
    
    /** The d aggiorn. */
    private Date dAggiorn = null;

    // campo chiave primaria
    /** The id responsabile. */
    // campo chiave esterna verso la colonna ID_UTENTE della tabella PSLP_T_UTENTE
    private Long idResponsabile = null;
    
    /** The numero perm sogg. */
    private String numeroPermSogg = null;
    
    /** The id sil T nazione nasc. */
    private String idSilTNazioneNasc = null;
    
    /** The cap res. */
    private String capRes = null;
    
    /** The ds telefono fisso. */
    private String dsTelefonoFisso = null;
    
    /** The cod user inserim. */
    private String codUserInserim = null;
    
    /** The ds num civico res. */
    private String dsNumCivicoRes = null;
    
    /** The id sil T status lav extra ue. */
    private String idSilTStatusLavExtraUe = null;
    
    /** The id sil T mot ril perm. */
    private String idSilTMotRilPerm = null;
    
    /** The id sil T toponimo res. */
    private String idSilTToponimoRes = null;

    /** The ds indirizzo dom esteso. */
    // TODO: to add
    private String dsIndirizzoDomEsteso = null;
    
    /** The id sil T nazione dom. */
    private String idSilTNazioneDom = null;

    /**
     * Gets the id sil T nazione res.
     *
     * @return the id sil T nazione res
     */
    public String getIdSilTNazioneRes() {
        return idSilTNazioneRes;
    }

    /**
     * Gets the ds indirizzo dom.
     *
     * @return the ds indirizzo dom
     */
    public String getDsIndirizzoDom() {
        return dsIndirizzoDom;
    }

    /**
     * Gets the ds fax.
     *
     * @return the ds fax
     */
    public String getDsFax() {
        return dsFax;
    }

    /**
     * Gets the ds num civico dom.
     *
     * @return the ds num civico dom
     */
    public String getDsNumCivicoDom() {
        return dsNumCivicoDom;
    }

    /**
     * Gets the id sil T comune dom.
     *
     * @return the id sil T comune dom
     */
    public String getIdSilTComuneDom() {
        return idSilTComuneDom;
    }

    /**
     * Gets the genere.
     *
     * @return the genere
     */
    public String getGenere() {
        return genere;
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
     * Gets the cap dom.
     *
     * @return the cap dom
     */
    public String getCapDom() {
        return capDom;
    }

    /**
     * Gets the ds indirizzo res.
     *
     * @return the ds indirizzo res
     */
    public String getDsIndirizzoRes() {
        return dsIndirizzoRes;
    }

    /**
     * Gets the id sil T comune res.
     *
     * @return the id sil T comune res
     */
    public String getIdSilTComuneRes() {
        return idSilTComuneRes;
    }

    /**
     * Gets the d scadenza perm sogg.
     *
     * @return the d scadenza perm sogg
     */
    public Date getDScadenzaPermSogg() {
        return dScadenzaPermSogg;
    }

    /**
     * Gets the id sil T cittadinanza.
     *
     * @return the id sil T cittadinanza
     */
    public String getIdSilTCittadinanza() {
        return idSilTCittadinanza;
    }

    /**
     * Gets the id sil T provincia dom.
     *
     * @return the id sil T provincia dom
     */
    public String getIdSilTProvinciaDom() {
        return idSilTProvinciaDom;
    }

    /**
     * Gets the id sil T toponimo dom.
     *
     * @return the id sil T toponimo dom
     */
    public String getIdSilTToponimoDom() {
        return idSilTToponimoDom;
    }

    /**
     * Gets the id sil T provincia res.
     *
     * @return the id sil T provincia res
     */
    public String getIdSilTProvinciaRes() {
        return idSilTProvinciaRes;
    }

    /**
     * Gets the d nascita.
     *
     * @return the d nascita
     */
    public Date getDNascita() {
        return dNascita;
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
     * Gets the ds telefono cellulare.
     *
     * @return the ds telefono cellulare
     */
    public String getDsTelefonoCellulare() {
        return dsTelefonoCellulare;
    }

    /**
     * Gets the ds indirizzo res esteso.
     *
     * @return the ds indirizzo res esteso
     */
    public String getDsIndirizzoResEsteso() {
        return dsIndirizzoResEsteso;
    }

    /**
     * Gets the id sil T comune nasc.
     *
     * @return the id sil T comune nasc
     */
    public String getIdSilTComuneNasc() {
        return idSilTComuneNasc;
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
     * Gets the id responsabile.
     *
     * @return the id responsabile
     */
    public Long getIdResponsabile() {
        return idResponsabile;
    }

    /**
     * Gets the numero perm sogg.
     *
     * @return the numero perm sogg
     */
    public String getNumeroPermSogg() {
        return numeroPermSogg;
    }

    /**
     * Gets the id sil T nazione nasc.
     *
     * @return the id sil T nazione nasc
     */
    public String getIdSilTNazioneNasc() {
        return idSilTNazioneNasc;
    }

    /**
     * Gets the cap res.
     *
     * @return the cap res
     */
    public String getCapRes() {
        return capRes;
    }

    /**
     * Gets the ds telefono fisso.
     *
     * @return the ds telefono fisso
     */
    public String getDsTelefonoFisso() {
        return dsTelefonoFisso;
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
     * Gets the ds num civico res.
     *
     * @return the ds num civico res
     */
    public String getDsNumCivicoRes() {
        return dsNumCivicoRes;
    }

    /**
     * Gets the id sil T status lav extra ue.
     *
     * @return the id sil T status lav extra ue
     */
    public String getIdSilTStatusLavExtraUe() {
        return idSilTStatusLavExtraUe;
    }

    /**
     * Gets the id sil T mot ril perm.
     *
     * @return the id sil T mot ril perm
     */
    public String getIdSilTMotRilPerm() {
        return idSilTMotRilPerm;
    }

    /**
     * Gets the id sil T toponimo res.
     *
     * @return the id sil T toponimo res
     */
    public String getIdSilTToponimoRes() {
        return idSilTToponimoRes;
    }

    /**
     * Gets the ds indirizzo dom esteso.
     *
     * @return the ds indirizzo dom esteso
     */
    public String getDsIndirizzoDomEsteso() {
        return dsIndirizzoDomEsteso;
    }

    /**
     * Gets the id sil T nazione dom.
     *
     * @return the id sil T nazione dom
     */
    public String getIdSilTNazioneDom() {
        return idSilTNazioneDom;
    }

    /**
     * Sets the id sil T nazione res.
     *
     * @param idSilTNazioneRes the new id sil T nazione res
     */
    public void setIdSilTNazioneRes(String idSilTNazioneRes) {
        this.idSilTNazioneRes = idSilTNazioneRes;
    }

    /**
     * Sets the ds indirizzo dom.
     *
     * @param dsIndirizzoDom the new ds indirizzo dom
     */
    public void setDsIndirizzoDom(String dsIndirizzoDom) {
        this.dsIndirizzoDom = dsIndirizzoDom;
    }

    /**
     * Sets the ds fax.
     *
     * @param dsFax the new ds fax
     */
    public void setDsFax(String dsFax) {
        this.dsFax = dsFax;
    }

    /**
     * Sets the ds num civico dom.
     *
     * @param dsNumCivicoDom the new ds num civico dom
     */
    public void setDsNumCivicoDom(String dsNumCivicoDom) {
        this.dsNumCivicoDom = dsNumCivicoDom;
    }

    /**
     * Sets the id sil T comune dom.
     *
     * @param idSilTComuneDom the new id sil T comune dom
     */
    public void setIdSilTComuneDom(String idSilTComuneDom) {
        this.idSilTComuneDom = idSilTComuneDom;
    }

    /**
     * Sets the genere.
     *
     * @param genere the new genere
     */
    public void setGenere(String genere) {
        this.genere = genere;
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
     * Sets the cap dom.
     *
     * @param capDom the new cap dom
     */
    public void setCapDom(String capDom) {
        this.capDom = capDom;
    }

    /**
     * Sets the ds indirizzo res.
     *
     * @param dsIndirizzoRes the new ds indirizzo res
     */
    public void setDsIndirizzoRes(String dsIndirizzoRes) {
        this.dsIndirizzoRes = dsIndirizzoRes;
    }

    /**
     * Sets the id sil T comune res.
     *
     * @param idSilTComuneRes the new id sil T comune res
     */
    public void setIdSilTComuneRes(String idSilTComuneRes) {
        this.idSilTComuneRes = idSilTComuneRes;
    }

    /**
     * Sets the d scadenza perm sogg.
     *
     * @param dScadenzaPermSogg the new d scadenza perm sogg
     */
    public void setDScadenzaPermSogg(Date dScadenzaPermSogg) {
        this.dScadenzaPermSogg = dScadenzaPermSogg;
    }

    /**
     * Sets the id sil T cittadinanza.
     *
     * @param idSilTCittadinanza the new id sil T cittadinanza
     */
    public void setIdSilTCittadinanza(String idSilTCittadinanza) {
        this.idSilTCittadinanza = idSilTCittadinanza;
    }

    /**
     * Sets the id sil T provincia dom.
     *
     * @param idSilTProvinciaDom the new id sil T provincia dom
     */
    public void setIdSilTProvinciaDom(String idSilTProvinciaDom) {
        this.idSilTProvinciaDom = idSilTProvinciaDom;
    }

    /**
     * Sets the id sil T toponimo dom.
     *
     * @param idSilTToponimoDom the new id sil T toponimo dom
     */
    public void setIdSilTToponimoDom(String idSilTToponimoDom) {
        this.idSilTToponimoDom = idSilTToponimoDom;
    }

    /**
     * Sets the id sil T provincia res.
     *
     * @param idSilTProvinciaRes the new id sil T provincia res
     */
    public void setIdSilTProvinciaRes(String idSilTProvinciaRes) {
        this.idSilTProvinciaRes = idSilTProvinciaRes;
    }

    /**
     * Sets the d nascita.
     *
     * @param dNascita the new d nascita
     */
    public void setDNascita(Date dNascita) {
        this.dNascita = dNascita;
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
     * Sets the ds telefono cellulare.
     *
     * @param dsTelefonoCellulare the new ds telefono cellulare
     */
    public void setDsTelefonoCellulare(String dsTelefonoCellulare) {
        this.dsTelefonoCellulare = dsTelefonoCellulare;
    }

    /**
     * Sets the ds indirizzo res esteso.
     *
     * @param dsIndirizzoResEsteso the new ds indirizzo res esteso
     */
    public void setDsIndirizzoResEsteso(String dsIndirizzoResEsteso) {
        this.dsIndirizzoResEsteso = dsIndirizzoResEsteso;
    }

    /**
     * Sets the id sil T comune nasc.
     *
     * @param idSilTComuneNasc the new id sil T comune nasc
     */
    public void setIdSilTComuneNasc(String idSilTComuneNasc) {
        this.idSilTComuneNasc = idSilTComuneNasc;
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
     * Sets the id responsabile.
     *
     * @param idResponsabile the new id responsabile
     */
    public void setIdResponsabile(Long idResponsabile) {
        this.idResponsabile = idResponsabile;
    }

    /**
     * Sets the numero perm sogg.
     *
     * @param numeroPermSogg the new numero perm sogg
     */
    public void setNumeroPermSogg(String numeroPermSogg) {
        this.numeroPermSogg = numeroPermSogg;
    }

    /**
     * Sets the id sil T nazione nasc.
     *
     * @param idSilTNazioneNasc the new id sil T nazione nasc
     */
    public void setIdSilTNazioneNasc(String idSilTNazioneNasc) {
        this.idSilTNazioneNasc = idSilTNazioneNasc;
    }

    /**
     * Sets the cap res.
     *
     * @param capRes the new cap res
     */
    public void setCapRes(String capRes) {
        this.capRes = capRes;
    }

    /**
     * Sets the ds telefono fisso.
     *
     * @param dsTelefonoFisso the new ds telefono fisso
     */
    public void setDsTelefonoFisso(String dsTelefonoFisso) {
        this.dsTelefonoFisso = dsTelefonoFisso;
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
     * Sets the ds num civico res.
     *
     * @param dsNumCivicoRes the new ds num civico res
     */
    public void setDsNumCivicoRes(String dsNumCivicoRes) {
        this.dsNumCivicoRes = dsNumCivicoRes;
    }

    /**
     * Sets the id sil T status lav extra ue.
     *
     * @param idSilTStatusLavExtraUe the new id sil T status lav extra ue
     */
    public void setIdSilTStatusLavExtraUe(String idSilTStatusLavExtraUe) {
        this.idSilTStatusLavExtraUe = idSilTStatusLavExtraUe;
    }

    /**
     * Sets the id sil T mot ril perm.
     *
     * @param idSilTMotRilPerm the new id sil T mot ril perm
     */
    public void setIdSilTMotRilPerm(String idSilTMotRilPerm) {
        this.idSilTMotRilPerm = idSilTMotRilPerm;
    }

    /**
     * Sets the id sil T toponimo res.
     *
     * @param idSilTToponimoRes the new id sil T toponimo res
     */
    public void setIdSilTToponimoRes(String idSilTToponimoRes) {
        this.idSilTToponimoRes = idSilTToponimoRes;
    }

    /**
     * Sets the ds indirizzo dom esteso.
     *
     * @param dsIndirizzoDomEsteso the new ds indirizzo dom esteso
     */
    public void setDsIndirizzoDomEsteso(String dsIndirizzoDomEsteso) {
        this.dsIndirizzoDomEsteso = dsIndirizzoDomEsteso;
    }

    /**
     * Sets the id sil T nazione dom.
     *
     * @param idSilTNazioneDom the new id sil T nazione dom
     */
    public void setIdSilTNazioneDom(String idSilTNazioneDom) {
        this.idSilTNazioneDom = idSilTNazioneDom;
    }

    /**
     * Gets the keys.
     *
     * @return the keys
     */
    public Object[] getKeys() {
        return new Object[] { idResponsabile };
    }

    /**
     * Gets the dto for test.
     *
     * @return the dto for test
     */
    public static ResponsabileDTO getDtoForTest() {
        return new ResponsabileDTO();
    }
} // fine classe
