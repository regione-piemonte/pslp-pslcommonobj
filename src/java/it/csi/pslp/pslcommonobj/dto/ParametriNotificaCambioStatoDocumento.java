/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;

/**
 * Parametro con le informazioni relative a un cambio stato documento ricevuto
 * da silp o da chiamante esterno. Contiene info sul lavoratore e sui relativi
 * incontri eventuali da modificare.
 * 
 * Richiede idDocumento e anche idUtente per sicurezza per evitare di modificare
 * un id generico
 * 
 * @author 1871
 *
 */
public class ParametriNotificaCambioStatoDocumento implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id documento. */
    private Long idDocumento;

    /** The id anagrafica. */
    private Long idAnagrafica;

    /** The cod stato documento. */
    private String codStatoDocumento = null;

    /** The codice fiscale operatore. */
    private String codiceFiscaleOperatore;

    /** The gruppo operatore. */
    // Per identificare l'ente
    private String gruppoOperatore;
    
    /** The codice operatore. */
    private Long codiceOperatore;
    
    /** The sub codice. */
    private Long subCodice;

    /** The note operatore. */
    private String noteOperatore;

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
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ParametriNotificaCambioStatoDocumento [");
        if (idDocumento != null) {
            builder.append("idDocumento=");
            builder.append(idDocumento);
            builder.append(", ");
        }
        if (idAnagrafica != null) {
            builder.append("idAnagrafica=");
            builder.append(idAnagrafica);
            builder.append(", ");
        }
        if (codStatoDocumento != null) {
            builder.append("codStatoDocumento=");
            builder.append(codStatoDocumento);
            builder.append(", ");
        }
        if (codiceFiscaleOperatore != null) {
            builder.append("codiceFiscaleOperatore=");
            builder.append(codiceFiscaleOperatore);
            builder.append(", ");
        }
        if (gruppoOperatore != null) {
            builder.append("gruppoOperatore=");
            builder.append(gruppoOperatore);
            builder.append(", ");
        }
        if (codiceOperatore != null) {
            builder.append("codiceOperatore=");
            builder.append(codiceOperatore);
            builder.append(", ");
        }
        if (subCodice != null) {
            builder.append("subCodice=");
            builder.append(subCodice);
            builder.append(", ");
        }
        if (noteOperatore != null) {
            builder.append("noteOperatore=");
            builder.append(noteOperatore);
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * Gets the id anagrafica.
     *
     * @return the id anagrafica
     */
    public Long getIdAnagrafica() {
        return idAnagrafica;
    }

    /**
     * Sets the id anagrafica.
     *
     * @param idAnagrafica the new id anagrafica
     */
    public void setIdAnagrafica(Long idAnagrafica) {
        this.idAnagrafica = idAnagrafica;
    }

    /**
     * Gets the codice fiscale operatore.
     *
     * @return the codice fiscale operatore
     */
    public String getCodiceFiscaleOperatore() {
        return codiceFiscaleOperatore;
    }

    /**
     * Sets the codice fiscale operatore.
     *
     * @param codiceFiscaleOperatore the new codice fiscale operatore
     */
    public void setCodiceFiscaleOperatore(String codiceFiscaleOperatore) {
        this.codiceFiscaleOperatore = codiceFiscaleOperatore;
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
     * Sets the codice operatore.
     *
     * @param codiceOperatore the new codice operatore
     */
    public void setCodiceOperatore(Long codiceOperatore) {
        this.codiceOperatore = codiceOperatore;
    }

    /**
     * Sets the sub codice.
     *
     * @param subCodice the new sub codice
     */
    public void setSubCodice(Long subCodice) {
        this.subCodice = subCodice;
    }

    /**
     * Gets the codice operatore.
     *
     * @return the codice operatore
     */
    public Long getCodiceOperatore() {
        return codiceOperatore;
    }

    /**
     * Gets the sub codice.
     *
     * @return the sub codice
     */
    public Long getSubCodice() {
        return subCodice;
    }

}
