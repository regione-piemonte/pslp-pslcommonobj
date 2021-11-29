/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.LongFilter;

/**
 * The Class DocumentoBlobFilter.
 */
public class DocumentoBlobFilter extends Filter {

    /**
     * Instantiates a new documento blob filter.
     *
     * @param idDocumento the id documento
     */
    public DocumentoBlobFilter(Long idDocumento) {
        super();
        this.getIdDocumento().eq(idDocumento);
    }

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id documento. */
    // campo chiave primaria
    private LongFilter idDocumento = new LongFilter();

    /**
     * Gets the id documento.
     *
     * @return the id documento
     */
    public LongFilter getIdDocumento() {
        return idDocumento;
    }

    /**
     * Sets the id documento.
     *
     * @param idDocumento the new id documento
     */
    public void setIdDocumento(LongFilter idDocumento) {
        this.idDocumento = idDocumento;
    }

    /**
     * Gets the expr QBE.
     *
     * @return the expr QBE
     */
    @Override
    public Object getExprQBE() {
        // TODO Auto-generated method stub
        return null;
    }

} // fine classe
