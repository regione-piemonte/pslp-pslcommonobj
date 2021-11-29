/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The Class AmbitoTipoDocumentoDTO.
 */
@JsonIgnoreProperties({ "keys" })
public class AmbitoTipoDocumentoDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The ambito. */
    private AmbitoDTO ambito;

    /** The tipo documento. */
    private TipoDocumentoDTO tipoDocumento;

    /** The d inizio. */
    private Date dInizio;

    /** The d fine. */
    private Date dFine;

    // Aggiunta campo flgObbligatorio
    private String flgObbligatorio;

    /**
     * Instantiates a new ambito tipo documento DTO.
     */
    public AmbitoTipoDocumentoDTO() {
    }

    /**
     * Instantiates a new ambito tipo documento DTO.
     *
     * @param ambito        the ambito
     * @param tipoDocumento the tipo documento
     */
    public AmbitoTipoDocumentoDTO(AmbitoDTO ambito, TipoDocumentoDTO tipoDocumento) {
        this.ambito = ambito;
        this.tipoDocumento = tipoDocumento;
    }

    /**
     * Gets the ambito.
     *
     * @return the ambito
     */
    public AmbitoDTO getAmbito() {
        return ambito;
    }

    /**
     * Sets the ambito.
     *
     * @param ambito the new ambito
     */
    public void setAmbito(AmbitoDTO ambito) {
        this.ambito = ambito;
    }

    /**
     * Gets the tipo documento.
     *
     * @return the tipo documento
     */
    public TipoDocumentoDTO getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the tipo documento.
     *
     * @param tipoDocumento the new tipo documento
     */
    public void setTipoDocumento(TipoDocumentoDTO tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    /**
     * Gets the d inizio.
     *
     * @return the d inizio
     */
    public Date getDInizio() {
        return dInizio;
    }

    /**
     * Sets the d inizio.
     *
     * @param dInizio the new d inizio
     */
    public void setDInizio(Date dInizio) {
        this.dInizio = dInizio;
    }

    /**
     * Gets the d fine.
     *
     * @return the d fine
     */
    public Date getDFine() {
        return dFine;
    }

    /**
     * Sets the d fine.
     *
     * @param dFine the new d fine
     */
    public void setDFine(Date dFine) {
        this.dFine = dFine;
    }

    /**
     * Gets the keys.
     *
     * @return the keys
     */
    public Object[] getKeys() {
        return new Object[] { ambito.getCodAmbito(), tipoDocumento.getCodTipoDocumento() };
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "AmbitoTipoDocumentoDTO [ambito=" + ambito + ", tipoDocumento=" + tipoDocumento + ", dInizio=" + dInizio + ", dFine=" + dFine + "]";
    }

    public String getFlgObbligatorio() {
        return flgObbligatorio;
    }

    public void setFlgObbligatorio(String flgObbligatorio) {
        this.flgObbligatorio = flgObbligatorio;
    }
}
