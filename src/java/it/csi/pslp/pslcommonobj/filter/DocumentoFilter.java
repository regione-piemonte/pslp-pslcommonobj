/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.DocumentoDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class DocumentoFilter.
 */
public class DocumentoFilter extends Filter {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The tipo documento. */
    private TipoDocumentoFilter tipoDocumento = new TipoDocumentoFilter();

    /** The cod ambito. */
    private StringFilter codAmbito = new StringFilter();

    /** The nome documento. */
    private StringFilter nomeDocumento = new StringFilter();

    /** The data inserimento. */
    private DateFilter dataInserimento = new DateFilter();

    /** The cod operatore. */
    private LongFilter codOperatore = new LongFilter();

    /** The cod user aggiorn. */
    private StringFilter codUserAggiorn = new StringFilter();

    /** The data aggiorn. */
    private DateFilter dataAggiorn = new DateFilter();

    /** The id documento. */
    // campo chiave primaria
    private LongFilter idDocumento = new LongFilter();

    /** The subcodice. */
    private LongFilter subcodice = new LongFilter();

    /** The note operatore. */
    private StringFilter noteOperatore = new StringFilter();

    /** The data invio. */
    private DateFilter dataInvio = new DateFilter();

    /** The utente. */
    private UtenteFilter utente = new UtenteFilter();

    /** The note cittadino. */
    private StringFilter noteCittadino = new StringFilter();

    /** The data inserim. */
    private DateFilter dataInserim = new DateFilter();

    /** The cod user inserim. */
    private StringFilter codUserInserim = new StringFilter();

    /** The stato documento. */
    private StatoDocumentoFilter statoDocumento = new StatoDocumentoFilter();

    /** The gruppo operatore. */
    private StringFilter gruppoOperatore = new StringFilter();

    /** The cf operatore. */
    private StringFilter cfOperatore = new StringFilter();

    /** The cod estensione. */
    private StringFilter codEstensione = new StringFilter();

    /** The id sil lav sap did. */
    private LongFilter idSilLavSapDid = new LongFilter();

    private LongFilter idSilpRichCollMir = new LongFilter();

    /**
     * Gets the id sil lav sap did.
     *
     * @return the id sil lav sap did
     */
    public LongFilter getIdSilLavSapDid() {
        return idSilLavSapDid;
    }

    /**
     * Sets the id sil lav sap did.
     *
     * @param idSilLavSapDid the new id sil lav sap did
     */
    public void setIdSilLavSapDid(LongFilter idSilLavSapDid) {
        this.idSilLavSapDid = idSilLavSapDid;
    }

    /** The expr QBE. */
    DocumentoDTO exprQBE = new DocumentoDTO();

    /**
     * Gets the expr QBE.
     *
     * @return the expr QBE
     */
    public DocumentoDTO getExprQBE() {
        return exprQBE;
    }

    /**
     * Sets the expr QBE.
     *
     * @param exprQBE the new expr QBE
     */
    public void setExprQBE(DocumentoDTO exprQBE) {
        this.exprQBE = exprQBE;
    }

    /**
     * Gets the tipo documento.
     *
     * @return the tipo documento
     */
    public TipoDocumentoFilter getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the tipo documento.
     *
     * @param tipoDocumento the new tipo documento
     */
    public void setTipoDocumento(TipoDocumentoFilter tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
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
     * Gets the nome documento.
     *
     * @return the nome documento
     */
    public StringFilter getNomeDocumento() {
        return nomeDocumento;
    }

    /**
     * Sets the nome documento.
     *
     * @param nomeDocumento the new nome documento
     */
    public void setNomeDocumento(StringFilter nomeDocumento) {
        this.nomeDocumento = nomeDocumento;
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
     * Gets the cod operatore.
     *
     * @return the cod operatore
     */
    public LongFilter getCodOperatore() {
        return codOperatore;
    }

    /**
     * Sets the cod operatore.
     *
     * @param codOperatore the new cod operatore
     */
    public void setCodOperatore(LongFilter codOperatore) {
        this.codOperatore = codOperatore;
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
     * Gets the id documento.
     *
     * @return the id documento
     */
    public LongFilter getIdDocumento() {
        return idDocumento;
    }

    /**
     * Sets the id documento.
     *
     * @param idDocumento the new id documento
     */
    public void setIdDocumento(LongFilter idDocumento) {
        this.idDocumento = idDocumento;
    }

    /**
     * Gets the subcodice.
     *
     * @return the subcodice
     */
    public LongFilter getSubcodice() {
        return subcodice;
    }

    /**
     * Sets the subcodice.
     *
     * @param subcodice the new subcodice
     */
    public void setSubcodice(LongFilter subcodice) {
        this.subcodice = subcodice;
    }

    /**
     * Gets the note operatore.
     *
     * @return the note operatore
     */
    public StringFilter getNoteOperatore() {
        return noteOperatore;
    }

    /**
     * Sets the note operatore.
     *
     * @param noteOperatore the new note operatore
     */
    public void setNoteOperatore(StringFilter noteOperatore) {
        this.noteOperatore = noteOperatore;
    }

    /**
     * Gets the data invio.
     *
     * @return the data invio
     */
    public DateFilter getDataInvio() {
        return dataInvio;
    }

    /**
     * Sets the data invio.
     *
     * @param dataInvio the new data invio
     */
    public void setDataInvio(DateFilter dataInvio) {
        this.dataInvio = dataInvio;
    }

    /**
     * Gets the utente.
     *
     * @return the utente
     */
    public UtenteFilter getUtente() {
        return utente;
    }

    /**
     * Sets the utente.
     *
     * @param utente the new utente
     */
    public void setUtente(UtenteFilter utente) {
        this.utente = utente;
    }

    /**
     * Gets the note cittadino.
     *
     * @return the note cittadino
     */
    public StringFilter getNoteCittadino() {
        return noteCittadino;
    }

    /**
     * Sets the note cittadino.
     *
     * @param noteCittadino the new note cittadino
     */
    public void setNoteCittadino(StringFilter noteCittadino) {
        this.noteCittadino = noteCittadino;
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
     * Gets the stato documento.
     *
     * @return the stato documento
     */
    public StatoDocumentoFilter getStatoDocumento() {
        return statoDocumento;
    }

    /**
     * Sets the stato documento.
     *
     * @param statoDocumento the new stato documento
     */
    public void setStatoDocumento(StatoDocumentoFilter statoDocumento) {
        this.statoDocumento = statoDocumento;
    }

    /**
     * Gets the gruppo operatore.
     *
     * @return the gruppo operatore
     */
    public StringFilter getGruppoOperatore() {
        return gruppoOperatore;
    }

    /**
     * Sets the gruppo operatore.
     *
     * @param gruppoOperatore the new gruppo operatore
     */
    public void setGruppoOperatore(StringFilter gruppoOperatore) {
        this.gruppoOperatore = gruppoOperatore;
    }

    /**
     * Gets the cf operatore.
     *
     * @return the cf operatore
     */
    public StringFilter getCfOperatore() {
        return cfOperatore;
    }

    /**
     * Sets the cf operatore.
     *
     * @param cfOperatore the new cf operatore
     */
    public void setCfOperatore(StringFilter cfOperatore) {
        this.cfOperatore = cfOperatore;
    }

    /**
     * Gets the cod estensione.
     *
     * @return the cod estensione
     */
    public StringFilter getCodEstensione() {
        return codEstensione;
    }

    /**
     * Sets the cod estensione.
     *
     * @param codEstensione the new cod estensione
     */
    public void setCodEstensione(StringFilter codEstensione) {
        this.codEstensione = codEstensione;
    }

    public LongFilter getIdSilpRichCollMir() {
        return idSilpRichCollMir;
    }

    public void setIdSilpRichCollMir(LongFilter idSilpRichCollMir) {
        this.idSilpRichCollMir = idSilpRichCollMir;
    }

} // fine classe
