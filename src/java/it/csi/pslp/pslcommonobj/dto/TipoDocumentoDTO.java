/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DTOJediStrategy
package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;

/**
 * The Class TipoDocumentoDTO.
 */
public class TipoDocumentoDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The cod tipo documento. */
    // campo chiave primaria
    private String codTipoDocumento = null;

    /** The descr tipo documento. */
    private String descrTipoDocumento = null;

    // Aggiungo flgObbligatorio
    private String flgObbligatorio;

    /**
     * Instantiates a new tipo documento DTO.
     */
    public TipoDocumentoDTO() {
    }

    /**
     * Instantiates a new tipo documento DTO.
     *
     * @param codTipoDocumento the cod tipo documento
     */
    public TipoDocumentoDTO(String codTipoDocumento) {
        this.codTipoDocumento = codTipoDocumento;
    }

    /**
     * Gets the cod tipo documento.
     *
     * @return the cod tipo documento
     */
    public String getCodTipoDocumento() {
        return codTipoDocumento;
    }

    /**
     * Gets the descr tipo documento.
     *
     * @return the descr tipo documento
     */
    public String getDescrTipoDocumento() {
        return descrTipoDocumento;
    }

    /**
     * Sets the cod tipo documento.
     *
     * @param codTipoDocumento the new cod tipo documento
     */
    public void setCodTipoDocumento(String codTipoDocumento) {
        this.codTipoDocumento = codTipoDocumento;
    }

    /**
     * Sets the descr tipo documento.
     *
     * @param descrTipoDocumento the new descr tipo documento
     */
    public void setDescrTipoDocumento(String descrTipoDocumento) {
        this.descrTipoDocumento = descrTipoDocumento;
    }

    /**
     * Gets the dto for test.
     *
     * @return the dto for test
     */
    public static TipoDocumentoDTO getDtoForTest() {
        return new TipoDocumentoDTO();
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("TipoDocumentoDTO [");
        if (codTipoDocumento != null) {
            builder.append("codTipoDocumento=");
            builder.append(codTipoDocumento);
            builder.append(", ");
        }
        if (descrTipoDocumento != null) {
            builder.append("descrTipoDocumento=");
            builder.append(descrTipoDocumento);
        }
        builder.append("]");
        return builder.toString();
    }

    public String getFlgObbligatorio() {
        return flgObbligatorio;
    }

    public void setFlgObbligatorio(String flgObbligatorio) {
        this.flgObbligatorio = flgObbligatorio;
    }
} // fine classe
