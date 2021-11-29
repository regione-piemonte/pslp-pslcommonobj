/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto.sms;

import java.io.Serializable;

/**
 * The Class PrenotazioneMessaggioDatiInvioDTO.
 */
public class PrenotazioneMessaggioDatiInvioDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The cellulare. */
    private String cellulare;

    /** The id SMS. */
    private Long idSMS;

    /** The codice esito. */
    private String codiceEsito;

    /**
     * Gets the cellulare.
     *
     * @return the cellulare
     */
    public String getCellulare() {
        return cellulare;
    }

    /**
     * Sets the cellulare.
     *
     * @param cellulare the new cellulare
     */
    public void setCellulare(String cellulare) {
        this.cellulare = cellulare;
    }

    /**
     * Gets the id SMS.
     *
     * @return the id SMS
     */
    public Long getIdSMS() {
        return idSMS;
    }

    /**
     * Sets the id SMS.
     *
     * @param idSMS the new id SMS
     */
    public void setIdSMS(Long idSMS) {
        this.idSMS = idSMS;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "PrenotazioneMessaggioDatiInvioDTO [cellulare=" + cellulare + ", idSMS=" + idSMS + ", codiceEsito=" + codiceEsito + "]";
    }

    /**
     * Gets the codice esito.
     *
     * @return the codice esito
     */
    public String getCodiceEsito() {
        return codiceEsito;
    }

    /**
     * Sets the codice esito.
     *
     * @param codiceEsito the new codice esito
     */
    public void setCodiceEsito(String codiceEsito) {
        this.codiceEsito = codiceEsito;
    }

}
