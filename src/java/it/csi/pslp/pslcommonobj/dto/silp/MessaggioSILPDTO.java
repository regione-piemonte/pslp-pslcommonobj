/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto.silp;

import java.io.Serializable;

/**
 * The Class MessaggioSILPDTO.
 */
public class MessaggioSILPDTO implements Serializable {
    
    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = -2560682617111460421L;

    /** The tipo. */
    private String tipo;
    
    /** The messaggio. */
    private String messaggio;

    /**
     * Gets the tipo.
     *
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the tipo.
     *
     * @param tipo the new tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Gets the messaggio.
     *
     * @return the messaggio
     */
    public String getMessaggio() {
        return messaggio;
    }

    /**
     * Sets the messaggio.
     *
     * @param messaggio the new messaggio
     */
    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "MessaggioSILPDTO [tipo=" + tipo + ", messaggio=" + messaggio + "]";
    }
}
