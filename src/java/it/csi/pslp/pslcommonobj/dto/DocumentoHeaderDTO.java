/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class DocumentoHeaderDTO.
 */
public class DocumentoHeaderDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The nome documento. */
    private String nomeDocumento = null;

    /** The cod ambito. */
    private String codAmbito;

    /** The tipo documento. */
    private TipoDocumentoDTO tipoDocumento;

    /** The data inserimento. */
    private Date dataInserimento = null;

    /** The cod operatore. */
    private Long codOperatore = null;

    /** The cod user aggiorn. */
    private String codUserAggiorn = null;

    /** The data aggiorn. */
    private Date dataAggiorn = null;

    /** The id documento. */
    // campo chiave primaria
    private Long idDocumento = null;

    /** The subcodice. */
    private Long subcodice = null;

    /** The note operatore. */
    private String noteOperatore = null;

    /** The data invio. */
    private Date dataInvio = null;

    /** The utente. */
    private UtenteDTO utente = null;

    /** The note cittadino. */
    private String noteCittadino = null;

    /** The data inserim. */
    private Date dataInserim = null;

    /** The cod user inserim. */
    private String codUserInserim = null;

    /** The stato documento. */
    private StatoDocumentoDTO statoDocumento = null;

    /** The gruppo operatore. */
    private String gruppoOperatore = null;

    /** The cf operatore. */
    private String cfOperatore = null;

    /** The cod estensione. */
    private String codEstensione;

    /** The id sil lav sap did. */
    private Long idSilLavSapDid;

    private Long idSilpRichCollMir;

    // Aggiunta campo flgObbligatorio per la gestione degli allegati della richiesta
    // di iscrizione
    private String flgObbligatorio;

    /**
     * Gets the id sil lav sap did.
     *
     * @return the id sil lav sap did
     */
    public Long getIdSilLavSapDid() {
        return idSilLavSapDid;
    }

    /**
     * Sets the id sil lav sap did.
     *
     * @param idSilLavSapDid the new id sil lav sap did
     */
    public void setIdSilLavSapDid(Long idSilLavSapDid) {
        this.idSilLavSapDid = idSilLavSapDid;
    }

    /**
     * Gets the nome documento.
     *
     * @return the nome documento
     */
    public String getNomeDocumento() {
        return nomeDocumento;
    }

    /**
     * Sets the nome documento.
     *
     * @param nomeDocumento the new nome documento
     */
    public void setNomeDocumento(String nomeDocumento) {
        this.nomeDocumento = nomeDocumento;
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
     * Sets the cod operatore.
     *
     * @param codOperatore the new cod operatore
     */
    public void setCodOperatore(Long codOperatore) {
        this.codOperatore = codOperatore;
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
     * Gets the id documento.
     *
     * @return the id documento
     */
    public Long getIdDocumento() {
        return idDocumento;
    }

    /**
     * Sets the id documento.
     *
     * @param idDocumento the new id documento
     */
    public void setIdDocumento(Long idDocumento) {
        this.idDocumento = idDocumento;
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
     * Sets the subcodice.
     *
     * @param subcodice the new subcodice
     */
    public void setSubcodice(Long subcodice) {
        this.subcodice = subcodice;
    }

    /**
     * Gets the note operatore.
     *
     * @return the note operatore
     */
    public String getNoteOperatore() {
        return noteOperatore;
    }

    /**
     * Sets the note operatore.
     *
     * @param noteOperatore the new note operatore
     */
    public void setNoteOperatore(String noteOperatore) {
        this.noteOperatore = noteOperatore;
    }

    /**
     * Gets the utente.
     *
     * @return the utente
     */
    public UtenteDTO getUtente() {
        return utente;
    }

    /**
     * Sets the utente.
     *
     * @param utente the new utente
     */
    public void setUtente(UtenteDTO utente) {
        this.utente = utente;
    }

    /**
     * Gets the note cittadino.
     *
     * @return the note cittadino
     */
    public String getNoteCittadino() {
        return noteCittadino;
    }

    /**
     * Sets the note cittadino.
     *
     * @param noteCittadino the new note cittadino
     */
    public void setNoteCittadino(String noteCittadino) {
        this.noteCittadino = noteCittadino;
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
     * Gets the stato documento.
     *
     * @return the stato documento
     */
    public StatoDocumentoDTO getStatoDocumento() {
        return statoDocumento;
    }

    /**
     * Sets the stato documento.
     *
     * @param statoDocumento the new stato documento
     */
    public void setStatoDocumento(StatoDocumentoDTO statoDocumento) {
        this.statoDocumento = statoDocumento;
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
     * Sets the gruppo operatore.
     *
     * @param gruppoOperatore the new gruppo operatore
     */
    public void setGruppoOperatore(String gruppoOperatore) {
        this.gruppoOperatore = gruppoOperatore;
    }

    /**
     * Gets the cf operatore.
     *
     * @return the cf operatore
     */
    public String getCfOperatore() {
        return cfOperatore;
    }

    /**
     * Sets the cf operatore.
     *
     * @param cfOperatore the new cf operatore
     */
    public void setCfOperatore(String cfOperatore) {
        this.cfOperatore = cfOperatore;
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
     * Gets the cod estensione.
     *
     * @return the cod estensione
     */
    public String getCodEstensione() {
        return codEstensione;
    }

    /**
     * Sets the cod estensione.
     *
     * @param codEstensione the new cod estensione
     */
    public void setCodEstensione(String codEstensione) {
        this.codEstensione = codEstensione;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("DocumentoHeaderDTO [");
        if (nomeDocumento != null) {
            builder.append("nomeDocumento=");
            builder.append(nomeDocumento);
            builder.append(", ");
        }
        if (codAmbito != null) {
            builder.append("codAmbito=");
            builder.append(codAmbito);
            builder.append(", ");
        }
        if (tipoDocumento != null) {
            builder.append("tipoDocumento=");
            builder.append(tipoDocumento);
            builder.append(", ");
        }
        if (dataInserimento != null) {
            builder.append("dataInserimento=");
            builder.append(dataInserimento);
            builder.append(", ");
        }
        if (codOperatore != null) {
            builder.append("codOperatore=");
            builder.append(codOperatore);
            builder.append(", ");
        }
        if (codUserAggiorn != null) {
            builder.append("codUserAggiorn=");
            builder.append(codUserAggiorn);
            builder.append(", ");
        }
        if (dataAggiorn != null) {
            builder.append("dataAggiorn=");
            builder.append(dataAggiorn);
            builder.append(", ");
        }
        if (idDocumento != null) {
            builder.append("idDocumento=");
            builder.append(idDocumento);
            builder.append(", ");
        }
        if (subcodice != null) {
            builder.append("subcodice=");
            builder.append(subcodice);
            builder.append(", ");
        }
        if (noteOperatore != null) {
            builder.append("noteOperatore=");
            builder.append(noteOperatore);
            builder.append(", ");
        }
        if (dataInvio != null) {
            builder.append("dataInvio=");
            builder.append(dataInvio);
            builder.append(", ");
        }
        if (utente != null) {
            builder.append("utente=");
            builder.append(utente);
            builder.append(", ");
        }
        if (noteCittadino != null) {
            builder.append("noteCittadino=");
            builder.append(noteCittadino);
            builder.append(", ");
        }
        if (dataInserim != null) {
            builder.append("dataInserim=");
            builder.append(dataInserim);
            builder.append(", ");
        }
        if (codUserInserim != null) {
            builder.append("codUserInserim=");
            builder.append(codUserInserim);
            builder.append(", ");
        }
        if (statoDocumento != null) {
            builder.append("statoDocumento=");
            builder.append(statoDocumento);
            builder.append(", ");
        }
        if (gruppoOperatore != null) {
            builder.append("gruppoOperatore=");
            builder.append(gruppoOperatore);
            builder.append(", ");
        }
        if (cfOperatore != null) {
            builder.append("cfOperatore=");
            builder.append(cfOperatore);
            builder.append(", ");
        }
        if (codEstensione != null) {
            builder.append("codEstensione=");
            builder.append(codEstensione);
            builder.append(", ");
        }
        if (idSilLavSapDid != null) {
            builder.append("idSilLavSapDid=");
            builder.append(idSilLavSapDid);
        }

        builder.append("]");
        return builder.toString();
    }

    /**
     * Gets the data inserimento.
     *
     * @return the data inserimento
     */
    public Date getDataInserimento() {
        return dataInserimento;
    }

    /**
     * Sets the data inserimento.
     *
     * @param dataInserimento the new data inserimento
     */
    public void setDataInserimento(Date dataInserimento) {
        this.dataInserimento = dataInserimento;
    }

    /**
     * Gets the data aggiorn.
     *
     * @return the data aggiorn
     */
    public Date getDataAggiorn() {
        return dataAggiorn;
    }

    /**
     * Sets the data aggiorn.
     *
     * @param dataAggiorn the new data aggiorn
     */
    public void setDataAggiorn(Date dataAggiorn) {
        this.dataAggiorn = dataAggiorn;
    }

    /**
     * Gets the data invio.
     *
     * @return the data invio
     */
    public Date getDataInvio() {
        return dataInvio;
    }

    /**
     * Sets the data invio.
     *
     * @param dataInvio the new data invio
     */
    public void setDataInvio(Date dataInvio) {
        this.dataInvio = dataInvio;
    }

    /**
     * Gets the data inserim.
     *
     * @return the data inserim
     */
    public Date getDataInserim() {
        return dataInserim;
    }

    /**
     * Sets the data inserim.
     *
     * @param dataInserim the new data inserim
     */
    public void setDataInserim(Date dataInserim) {
        this.dataInserim = dataInserim;
    }

    /**
     * Gets the tipo documento.
     *
     * @return the tipo documento
     */
    public TipoDocumentoDTO getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the tipo documento.
     *
     * @param tipoDocumento the new tipo documento
     */
    public void setTipoDocumento(TipoDocumentoDTO tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getFlgObbligatorio() {
        return flgObbligatorio;
    }

    public void setFlgObbligatorio(String flgObbligatorio) {
        this.flgObbligatorio = flgObbligatorio;
    }

    public Long getIdSilpRichCollMir() {
        return idSilpRichCollMir;
    }

    public void setIdSilpRichCollMir(Long idSilpRichCollMir) {
        this.idSilpRichCollMir = idSilpRichCollMir;
    }

} // fine classe
