/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class ParametriNotificaCambioStatoAppuntamento.
 */
public class ParametriNotificaCambioStatoAppuntamento implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id incontro silp. */
    private Long idIncontroSilp;

    /** The cod stato incontro. */
    private String codStatoIncontro;

    /** The codice fiscale lavoratore. */
    private String codiceFiscaleLavoratore;

    /** The codice operatore. */
    private String codiceOperatore;

    /** The note. */
    private String note;

    /** The data esito incontro. */
    private Date dataEsitoIncontro;

    /**
     * Gets the id incontro silp.
     *
     * @return the id incontro silp
     */
    public Long getIdIncontroSilp() {
        return idIncontroSilp;
    }

    /**
     * Sets the id incontro silp.
     *
     * @param idIncontroSilp the new id incontro silp
     */
    public void setIdIncontroSilp(Long idIncontroSilp) {
        this.idIncontroSilp = idIncontroSilp;
    }

    /**
     * Gets the cod stato incontro.
     *
     * @return the cod stato incontro
     */
    public String getCodStatoIncontro() {
        return codStatoIncontro;
    }

    /**
     * Sets the cod stato incontro.
     *
     * @param codStatoIncontro the new cod stato incontro
     */
    public void setCodStatoIncontro(String codStatoIncontro) {
        this.codStatoIncontro = codStatoIncontro;
    }

    /**
     * Gets the codice fiscale lavoratore.
     *
     * @return the codice fiscale lavoratore
     */
    public String getCodiceFiscaleLavoratore() {
        return codiceFiscaleLavoratore;
    }

    /**
     * Sets the codice fiscale lavoratore.
     *
     * @param codiceFiscaleLavoratore the new codice fiscale lavoratore
     */
    public void setCodiceFiscaleLavoratore(String codiceFiscaleLavoratore) {
        this.codiceFiscaleLavoratore = codiceFiscaleLavoratore;
    }

    /**
     * Gets the codice operatore.
     *
     * @return the codice operatore
     */
    public String getCodiceOperatore() {
        return codiceOperatore;
    }

    /**
     * Sets the codice operatore.
     *
     * @param codiceOperatore the new codice operatore
     */
    public void setCodiceOperatore(String codiceOperatore) {
        this.codiceOperatore = codiceOperatore;
    }

    /**
     * Gets the note.
     *
     * @return the note
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the note.
     *
     * @param note the new note
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * Gets the data esito incontro.
     *
     * @return the data esito incontro
     */
    public Date getDataEsitoIncontro() {
        return dataEsitoIncontro;
    }

    /**
     * Sets the data esito incontro.
     *
     * @param dataEsitoIncontro the new data esito incontro
     */
    public void setDataEsitoIncontro(Date dataEsitoIncontro) {
        this.dataEsitoIncontro = dataEsitoIncontro;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ParametriNotificaCambioStatoAppuntamento [");
        if (idIncontroSilp != null) {
            builder.append("idIncontroSilp=");
            builder.append(idIncontroSilp);
            builder.append(", ");
        }
        if (codStatoIncontro != null) {
            builder.append("codStatoIncontro=");
            builder.append(codStatoIncontro);
            builder.append(", ");
        }
        if (codiceFiscaleLavoratore != null) {
            builder.append("codiceFiscaleLavoratore=");
            builder.append(codiceFiscaleLavoratore);
            builder.append(", ");
        }
        if (codiceOperatore != null) {
            builder.append("codiceOperatore=");
            builder.append(codiceOperatore);
            builder.append(", ");
        }
        if (note != null) {
            builder.append("note=");
            builder.append(note);
            builder.append(", ");
        }
        if (dataEsitoIncontro != null) {
            builder.append("dataEsitoIncontro=");
            builder.append(dataEsitoIncontro);
        }
        builder.append("]");
        return builder.toString();
    }

}
