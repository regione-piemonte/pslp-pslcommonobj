/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto.sms;

/**
 * The Class ModificaMessaggioOutputDTO.
 */
public class ModificaMessaggioOutputDTO extends MessaggioOutputDTO {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "ModificaMessaggioOutputDTO [codiceEsito=" + codiceEsito + ", descrizioneEsito=" + descrizioneEsito + "]";
    }

}
