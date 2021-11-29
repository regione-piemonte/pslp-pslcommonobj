/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

/**
 * The Class SlotMixin.
 */
public abstract class SlotMixin {

    /**
     * Gets the ora inizio.
     *
     * @return the ora inizio
     */
    public abstract Integer getOraInizio();

    /**
     * Gets the ora fine.
     *
     * @return the ora fine
     */
    public abstract Integer getOraFine();

    /**
     * Gets the descrizione ora inizio.
     *
     * @return the descrizione ora inizio
     */
    public String getDescrizioneOraInizio() {
        if (getOraInizio() == null) {
            return "";

        }
        String ora = "" + (getOraInizio() / 60);
        if (ora.length() == 1) {
            ora = "0" + ora;

        }
        String min = "" + (getOraInizio() % 60);
        if (min.length() == 1) {
            min = "0" + min;

        }
        return ora + ":" + min;
    }

    /**
     * Gets the descrizione ora fine.
     *
     * @return the descrizione ora fine
     */
    public String getDescrizioneOraFine() {
        if (getOraFine() == null) {
            return "";

        }
        String ora = "" + (getOraFine() / 60);
        if (ora.length() == 1) {
            ora = "0" + ora;

        }
        String min = "" + (getOraFine() % 60);
        if (min.length() == 1) {
            min = "0" + min;

        }
        return ora + ":" + min;
    }

}
