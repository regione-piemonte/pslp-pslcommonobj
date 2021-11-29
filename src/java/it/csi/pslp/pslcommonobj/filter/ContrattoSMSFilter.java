/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.ContrattoSMSDDTO;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class ContrattoSMSFilter.
 */
public class ContrattoSMSFilter extends Filter {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The codice. */
    private StringFilter codice = new StringFilter();

    /** The descrizione. */
    private StringFilter descrizione = new StringFilter();

    /** The username. */
    private StringFilter username = new StringFilter();

    /** The password. */
    private StringFilter password = new StringFilter();

    /** The codice progetto. */
    private StringFilter codiceProgetto = new StringFilter();

    /** The expr QBE. */
    ContrattoSMSDDTO exprQBE = new ContrattoSMSDDTO();

    /**
     * Gets the codice.
     *
     * @return the codice
     */
    public StringFilter getCodice() {
        return codice;
    }

    /**
     * Sets the codice.
     *
     * @param codice the new codice
     */
    public void setCodice(StringFilter codice) {
        this.codice = codice;
    }

    /**
     * Gets the descrizione.
     *
     * @return the descrizione
     */
    public StringFilter getDescrizione() {
        return descrizione;
    }

    /**
     * Sets the descrizione.
     *
     * @param descrizione the new descrizione
     */
    public void setDescrizione(StringFilter descrizione) {
        this.descrizione = descrizione;
    }

    /**
     * Gets the username.
     *
     * @return the username
     */
    public StringFilter getUsername() {
        return username;
    }

    /**
     * Sets the username.
     *
     * @param username the new username
     */
    public void setUsername(StringFilter username) {
        this.username = username;
    }

    /**
     * Gets the password.
     *
     * @return the password
     */
    public StringFilter getPassword() {
        return password;
    }

    /**
     * Sets the password.
     *
     * @param password the new password
     */
    public void setPassword(StringFilter password) {
        this.password = password;
    }

    /**
     * Gets the codice progetto.
     *
     * @return the codice progetto
     */
    public StringFilter getCodiceProgetto() {
        return codiceProgetto;
    }

    /**
     * Sets the codice progetto.
     *
     * @param codiceProgetto the new codice progetto
     */
    public void setCodiceProgetto(StringFilter codiceProgetto) {
        this.codiceProgetto = codiceProgetto;
    }

    /**
     * Gets the expr QBE.
     *
     * @return the expr QBE
     */
    public ContrattoSMSDDTO getExprQBE() {
        return exprQBE;
    }

    /**
     * Sets the expr QBE.
     *
     * @param exprQBE the new expr QBE
     */
    public void setExprQBE(ContrattoSMSDDTO exprQBE) {
        this.exprQBE = exprQBE;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "ContrattoSMSFilter [codice=" + codice + ", descrizione=" + descrizione + ", username=" + username + ", password=" + password
                + ", codiceProgetto=" + codiceProgetto + ", exprQBE=" + exprQBE + "]";
    }

}
