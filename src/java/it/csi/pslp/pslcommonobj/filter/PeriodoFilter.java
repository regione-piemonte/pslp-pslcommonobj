/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.PeriodoDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class PeriodoFilter.
 */
public class PeriodoFilter extends Filter {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The dt fine. */
    private DateFilter dtFine = new DateFilter();

    /** The dt inizio. */
    private DateFilter dtInizio = new DateFilter();

    /** The d inserim. */
    private DateFilter dInserim = new DateFilter();

    /** The cod user inserim. */
    private StringFilter codUserInserim = new StringFilter();

    /** The cod user aggiorn. */
    private StringFilter codUserAggiorn = new StringFilter();

    // campo chiave esterna verso la colonna ID_CALENDARIO della tabella
    /** The calendario. */
    // PSLP_T_CALENDARIO
    private CalendarioFilter calendario = new CalendarioFilter();

    /** The d aggiorn. */
    private DateFilter dAggiorn = new DateFilter();

    /** The id periodo. */
    // campo chiave primaria
    private LongFilter idPeriodo = new LongFilter();

    /** The expr QBE. */
    PeriodoDTO exprQBE = new PeriodoDTO();

    /**
     * Gets the expr QBE.
     *
     * @return the expr QBE
     */
    public PeriodoDTO getExprQBE() {
        return exprQBE;
    }

    /**
     * Sets the expr QBE.
     *
     * @param exprQBE the new expr QBE
     */
    public void setExprQBE(PeriodoDTO exprQBE) {
        this.exprQBE = exprQBE;
    }

    /**
     * Gets the dt fine.
     *
     * @return the dt fine
     */
    public DateFilter getDtFine() {
        return dtFine;
    }

    /**
     * Gets the dt inizio.
     *
     * @return the dt inizio
     */
    public DateFilter getDtInizio() {
        return dtInizio;
    }

    /**
     * Gets the d inserim.
     *
     * @return the d inserim
     */
    public DateFilter getDInserim() {
        return dInserim;
    }

    /**
     * Gets the cod user inserim.
     *
     * @return the cod user inserim
     */
    public StringFilter getCodUserInserim() {
        return codUserInserim;
    }

    /**
     * Gets the cod user aggiorn.
     *
     * @return the cod user aggiorn
     */
    public StringFilter getCodUserAggiorn() {
        return codUserAggiorn;
    }

    /**
     * Gets the d aggiorn.
     *
     * @return the d aggiorn
     */
    public DateFilter getDAggiorn() {
        return dAggiorn;
    }

    /**
     * Gets the id periodo.
     *
     * @return the id periodo
     */
    public LongFilter getIdPeriodo() {
        return idPeriodo;
    }

    /**
     * Sets the dt fine.
     *
     * @param dtFine the new dt fine
     */
    public void setDtFine(DateFilter dtFine) {
        this.dtFine = dtFine;
    }

    /**
     * Sets the dt inizio.
     *
     * @param dtInizio the new dt inizio
     */
    public void setDtInizio(DateFilter dtInizio) {
        this.dtInizio = dtInizio;
    }

    /**
     * Sets the d inserim.
     *
     * @param dInserim the new d inserim
     */
    public void setDInserim(DateFilter dInserim) {
        this.dInserim = dInserim;
    }

    /**
     * Sets the cod user inserim.
     *
     * @param codUserInserim the new cod user inserim
     */
    public void setCodUserInserim(StringFilter codUserInserim) {
        this.codUserInserim = codUserInserim;
    }

    /**
     * Sets the cod user aggiorn.
     *
     * @param codUserAggiorn the new cod user aggiorn
     */
    public void setCodUserAggiorn(StringFilter codUserAggiorn) {
        this.codUserAggiorn = codUserAggiorn;
    }

    /**
     * Sets the d aggiorn.
     *
     * @param dAggiorn the new d aggiorn
     */
    public void setDAggiorn(DateFilter dAggiorn) {
        this.dAggiorn = dAggiorn;
    }

    /**
     * Sets the id periodo.
     *
     * @param idPeriodo the new id periodo
     */
    public void setIdPeriodo(LongFilter idPeriodo) {
        this.idPeriodo = idPeriodo;
    }

    /**
     * Gets the calendario.
     *
     * @return the calendario
     */
    public CalendarioFilter getCalendario() {
        return calendario;
    }

    /**
     * Sets the calendario.
     *
     * @param calendario the new calendario
     */
    public void setCalendario(CalendarioFilter calendario) {
        this.calendario = calendario;
    }

} // fine classe
