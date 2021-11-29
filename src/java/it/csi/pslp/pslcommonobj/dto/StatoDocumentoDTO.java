/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DTOJediStrategy
package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;

/**
 * The Class StatoDocumentoDTO.
 */
public class StatoDocumentoDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The Constant COD_STATO_DOCUMENTO_NON_INVIATO. */
    public static final String COD_STATO_DOCUMENTO_NON_INVIATO = "NI";
    
    /** The Constant COD_STATO_DOCUMENTO_INVIATO. */
    public static final String COD_STATO_DOCUMENTO_INVIATO = "IN";
    
    /** The Constant COD_STATO_DOCUMENTO_ACCETTATO. */
    public static final String COD_STATO_DOCUMENTO_ACCETTATO = "AC";
    
    /** The Constant COD_STATO_DOCUMENTO_NON_ACCETTATO. */
    public static final String COD_STATO_DOCUMENTO_NON_ACCETTATO = "NA";

    /** The cod stato documento. */
    // campo chiave primaria
    private String codStatoDocumento = null;

    /** The descr stato documento. */
    private String descrStatoDocumento = null;

    /**
     * Instantiates a new stato documento DTO.
     */
    public StatoDocumentoDTO() {
    }

    /**
     * Instantiates a new stato documento DTO.
     *
     * @param codStatoDocumento the cod stato documento
     */
    public StatoDocumentoDTO(String codStatoDocumento) {
        this.codStatoDocumento = codStatoDocumento;
    }

    /**
     * Gets the cod stato documento.
     *
     * @return the cod stato documento
     */
    public String getCodStatoDocumento() {
        return codStatoDocumento;
    }

    /**
     * Gets the descr stato documento.
     *
     * @return the descr stato documento
     */
    public String getDescrStatoDocumento() {
        return descrStatoDocumento;
    }

    /**
     * Sets the cod stato documento.
     *
     * @param codStatoDocumento the new cod stato documento
     */
    public void setCodStatoDocumento(String codStatoDocumento) {
        this.codStatoDocumento = codStatoDocumento;
    }

    /**
     * Sets the descr stato documento.
     *
     * @param descrStatoDocumento the new descr stato documento
     */
    public void setDescrStatoDocumento(String descrStatoDocumento) {
        this.descrStatoDocumento = descrStatoDocumento;
    }

    /**
     * Gets the dto for test.
     *
     * @return the dto for test
     */
    public static StatoDocumentoDTO getDtoForTest() {
        return new StatoDocumentoDTO();
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("StatoDocumentoDTO [");
        if (codStatoDocumento != null) {
            builder.append("codStatoDocumento=");
            builder.append(codStatoDocumento);
            builder.append(", ");
        }
        if (descrStatoDocumento != null) {
            builder.append("descrStatoDocumento=");
            builder.append(descrStatoDocumento);
        }
        builder.append("]");
        return builder.toString();
    }
} // fine classe
