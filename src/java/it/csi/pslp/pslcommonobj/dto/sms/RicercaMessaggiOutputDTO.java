/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto.sms;

import java.util.List;

/**
 * The Class RicercaMessaggiOutputDTO.
 */
public class RicercaMessaggiOutputDTO extends MessaggioOutputDTO {

    /* commento di prova per commit e push */

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The sms. */
    private List<RicercaMessaggiSMSDTO> sms;

    /**
     * Gets the sms.
     *
     * @return the sms
     */
    public List<RicercaMessaggiSMSDTO> getSms() {
        return sms;
    }

    /**
     * Sets the sms.
     *
     * @param sms the new sms
     */
    public void setSms(List<RicercaMessaggiSMSDTO> sms) {
        this.sms = sms;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "RicercaMessaggiOutputDTO [sms=" + sms + "]";
    }

}
