/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class ParametriRicercaDocumentoDTO.
 */
public class ParametriRicercaDocumentoDTO implements Serializable {

    /*
     * Eventuale elenco di documenti aggiunto per le richieste di iscrizione
     */
    private Long[] elencoId;

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id utente. */
    private Long idUtente;

    /** The id lavoratore. */
    private Long idLavoratore;

    /** The codice fiscale. */
    private String codiceFiscale;

    /** The cognome. */
    private String cognome;

    /** The nome. */
    private String nome;

    /** The id documento. */
    private Long idDocumento;

    /** The cod stato documento. */
    /*
     * NI Non inviato IN Inviato AC Accettato NA Non accettato
     */
    private String codStatoDocumento;

    /** The da. */
    private Date da;

    /** The a. */
    private Date a;

    /**
     * Gets the id utente.
     *
     * @return the id utente
     */
    public Long getIdUtente() {
        return idUtente;
    }

    /**
     * Sets the id utente.
     *
     * @param idUtente the new id utente
     */
    public void setIdUtente(Long idUtente) {
        this.idUtente = idUtente;
    }

    /**
     * Gets the codice fiscale.
     *
     * @return the codice fiscale
     */
    public String getCodiceFiscale() {
        return codiceFiscale;
    }

    /**
     * Sets the codice fiscale.
     *
     * @param codiceFiscale the new codice fiscale
     */
    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }

    /**
     * Gets the da.
     *
     * @return the da
     */
    public Date getDa() {
        return da;
    }

    /**
     * Sets the da.
     *
     * @param da the new da
     */
    public void setDa(Date da) {
        this.da = da;
    }

    /**
     * Gets the a.
     *
     * @return the a
     */
    public Date getA() {
        return a;
    }

    /**
     * Sets the a.
     *
     * @param a the new a
     */
    public void setA(Date a) {
        this.a = a;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ParametriRicercaDocumentoDTO [");
        if (idUtente != null) {
            builder.append("idUtente=");
            builder.append(idUtente);
            builder.append(", ");
        }
        if (idLavoratore != null) {
            builder.append("idLavoratore=");
            builder.append(idLavoratore);
            builder.append(", ");
        }
        if (codiceFiscale != null) {
            builder.append("codiceFiscale=");
            builder.append(codiceFiscale);
            builder.append(", ");
        }
        if (cognome != null) {
            builder.append("cognome=");
            builder.append(cognome);
            builder.append(", ");
        }
        if (nome != null) {
            builder.append("nome=");
            builder.append(nome);
            builder.append(", ");
        }
        if (idDocumento != null) {
            builder.append("idDocumento=");
            builder.append(idDocumento);
            builder.append(", ");
        }
        if (codStatoDocumento != null) {
            builder.append("codStatoDocumento=");
            builder.append(codStatoDocumento);
            builder.append(", ");
        }
        if (da != null) {
            builder.append("da=");
            builder.append(da);
            builder.append(", ");
        }
        if (a != null) {
            builder.append("a=");
            builder.append(a);
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * Gets the id lavoratore.
     *
     * @return the id lavoratore
     */
    public Long getIdLavoratore() {
        return idLavoratore;
    }

    /**
     * Sets the id lavoratore.
     *
     * @param idLavoratore the new id lavoratore
     */
    public void setIdLavoratore(Long idLavoratore) {
        this.idLavoratore = idLavoratore;
    }

    /**
     * Gets the cod stato documento.
     *
     * @return the cod stato documento
     */
    public String getCodStatoDocumento() {
        return codStatoDocumento;
    }

    /**
     * Sets the cod stato documento.
     *
     * @param codStatoDocumento the new cod stato documento
     */
    public void setCodStatoDocumento(String codStatoDocumento) {
        this.codStatoDocumento = codStatoDocumento;
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
     * Gets the cognome.
     *
     * @return the cognome
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Sets the cognome.
     *
     * @param cognome the new cognome
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
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
     * Sets the nome.
     *
     * @param nome the new nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long[] getElencoId() {
        return elencoId;
    }

    public void setElencoId(Long[] elencoId) {
        this.elencoId = elencoId;
    }

}
