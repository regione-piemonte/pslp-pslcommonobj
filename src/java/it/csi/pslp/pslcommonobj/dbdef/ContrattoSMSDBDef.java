/* **************************************************** */
/* Copyright Regione Piemonte - 2021					*/
/* SPDX-License-Identifier: EUPL-1.2-or-later			*/
/* **************************************************** */

package it.csi.pslp.pslcommonobj.dbdef;

import it.csi.pslp.pslcommonobj.dto.ContrattoSMSDDTO;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class ContrattoSMSDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_D_CONTRATTO_SMS")
public abstract class ContrattoSMSDBDef extends ContrattoSMSDDTO {

    /**
     * Gets the codice.
     *
     * @return the codice
     */
    @Override
    @Column(name = "COD_CONTRATTO_SMS", pk = true)
    public abstract String getCodice();

    /**
     * Gets the descrizione.
     *
     * @return the descrizione
     */
    @Override
    @Column(name = "DESCR_CONTRATTO")
    public abstract String getDescrizione();

    /**
     * Gets the username.
     *
     * @return the username
     */
    @Override
    @Column(name = "USERNAME_UTENTE")
    public abstract String getUsername();

    /**
     * Gets the password.
     *
     * @return the password
     */
    @Override
    @Column(name = "PASSWORD_UTENTE")
    public abstract String getPassword();

    /**
     * Gets the codice progetto.
     *
     * @return the codice progetto
     */
    @Override
    @Column(name = "COD_PROGETTO")
    public abstract String getCodiceProgetto();

}
