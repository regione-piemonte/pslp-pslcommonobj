/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.util.Vector;

/**
 * The Class EsitoRicercaDocumentoDTO.
 */
public class EsitoRicercaDocumentoDTO extends EsitoDTO {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The elenco documenti. */
    private Vector<DocumentoDTO> elencoDocumenti = new Vector<DocumentoDTO>();

    /**
     * Gets the elenco documenti.
     *
     * @return the elenco documenti
     */
    public Vector<DocumentoDTO> getElencoDocumenti() {
        return elencoDocumenti;
    }

    /**
     * Sets the elenco documenti.
     *
     * @param elencoDocumenti the new elenco documenti
     */
    public void setElencoDocumenti(Vector<DocumentoDTO> elencoDocumenti) {
        this.elencoDocumenti = elencoDocumenti;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("EsitoRicercaDocumentoDTO [");
        if (elencoDocumenti != null) {
            builder.append("elencoDocumenti=");
            builder.append(elencoDocumenti);
        }
        builder.append("]");
        return builder.toString();
    }

}
