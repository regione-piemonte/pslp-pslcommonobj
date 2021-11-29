/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.StatoSMSDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class StatoSMSFilter.
 */
public class StatoSMSFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The codice. */
  private StringFilter codice = new StringFilter();

  /** The descrizione. */
  private StringFilter descrizione = new StringFilter();

  /** The data inizio. */
  private DateFilter dataInizio = new DateFilter();

  /** The data fine. */
  private DateFilter dataFine = new DateFilter();

  /** The expr QBE. */
  StatoSMSDTO exprQBE = new StatoSMSDTO();

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
   * Gets the data inizio.
   *
   * @return the data inizio
   */
  public DateFilter getDataInizio() {
    return dataInizio;
  }

  /**
   * Sets the data inizio.
   *
   * @param dataInizio the new data inizio
   */
  public void setDataInizio(DateFilter dataInizio) {
    this.dataInizio = dataInizio;
  }

  /**
   * Gets the data fine.
   *
   * @return the data fine
   */
  public DateFilter getDataFine() {
    return dataFine;
  }

  /**
   * Sets the data fine.
   *
   * @param dataFine the new data fine
   */
  public void setDataFine(DateFilter dataFine) {
    this.dataFine = dataFine;
  }

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public StatoSMSDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(StatoSMSDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "StatoSMSFilter [codice=" + codice + ", descrizione=" + descrizione + ", dataInizio=" + dataInizio + ", dataFine=" + dataFine + ", exprQBE=" + exprQBE + "]";
  }

}
