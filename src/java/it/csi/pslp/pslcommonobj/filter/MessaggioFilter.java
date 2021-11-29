/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.MessaggioDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class MessaggioFilter.
 */
public class MessaggioFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The d fine. */
  private DateFilter dFine = new DateFilter();

  // campo chiave esterna verso la colonna COD_AMBITO della tabella
  /** The cod ambito. */
  // PSLP_D_AMBITO
  private StringFilter codAmbito = new StringFilter();

  /** The id messaggio. */
  // campo chiave primaria
  private LongFilter idMessaggio = new LongFilter();

  /** The cod messaggio. */
  private StringFilter codMessaggio = new StringFilter();

  // campo chiave esterna verso la colonna COD_TIPO_MESSAGGIO della tabella
  /** The cod tipo messaggio. */
  // PSLP_D_TIPO_MESSAGGIO
  private StringFilter codTipoMessaggio = new StringFilter();

  /** The d inizio. */
  private DateFilter dInizio = new DateFilter();

  /** The intestazione. */
  private StringFilter intestazione = new StringFilter();

  /** The testo. */
  private StringFilter testo = new StringFilter();

  /** The descr messaggio. */
  private StringFilter descrMessaggio = new StringFilter();

  /** The expr QBE. */
  MessaggioDTO exprQBE = new MessaggioDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public MessaggioDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(MessaggioDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * Gets the id messaggio.
   *
   * @return the id messaggio
   */
  public LongFilter getIdMessaggio() {
    return idMessaggio;
  }

  /**
   * Sets the id messaggio.
   *
   * @param idMessaggio the new id messaggio
   */
  public void setIdMessaggio(LongFilter idMessaggio) {
    this.idMessaggio = idMessaggio;
  }

  /**
   * Gets the d inizio.
   *
   * @return the d inizio
   */
  public DateFilter getdInizio() {
    return dInizio;
  }

  /**
   * Sets the d inizio.
   *
   * @param dInizio the new d inizio
   */
  public void setdInizio(DateFilter dInizio) {
    this.dInizio = dInizio;
  }

  /**
   * Gets the d fine.
   *
   * @return the d fine
   */
  public DateFilter getDFine() {
    return dFine;
  }

  /**
   * Gets the cod ambito.
   *
   * @return the cod ambito
   */
  public StringFilter getCodAmbito() {
    return codAmbito;
  }

  /**
   * Gets the cod messaggio.
   *
   * @return the cod messaggio
   */
  public StringFilter getCodMessaggio() {
    return codMessaggio;
  }

  /**
   * Gets the cod tipo messaggio.
   *
   * @return the cod tipo messaggio
   */
  public StringFilter getCodTipoMessaggio() {
    return codTipoMessaggio;
  }

  /**
   * Gets the d inizio.
   *
   * @return the d inizio
   */
  public DateFilter getDInizio() {
    return dInizio;
  }

  /**
   * Gets the intestazione.
   *
   * @return the intestazione
   */
  public StringFilter getIntestazione() {
    return intestazione;
  }

  /**
   * Gets the testo.
   *
   * @return the testo
   */
  public StringFilter getTesto() {
    return testo;
  }

  /**
   * Gets the descr messaggio.
   *
   * @return the descr messaggio
   */
  public StringFilter getDescrMessaggio() {
    return descrMessaggio;
  }

  /**
   * Sets the d fine.
   *
   * @param dFine the new d fine
   */
  public void setDFine(DateFilter dFine) {
    this.dFine = dFine;
  }

  /**
   * Sets the cod ambito.
   *
   * @param codAmbito the new cod ambito
   */
  public void setCodAmbito(StringFilter codAmbito) {
    this.codAmbito = codAmbito;
  }

  /**
   * Sets the cod messaggio.
   *
   * @param codMessaggio the new cod messaggio
   */
  public void setCodMessaggio(StringFilter codMessaggio) {
    this.codMessaggio = codMessaggio;
  }

  /**
   * Sets the cod tipo messaggio.
   *
   * @param codTipoMessaggio the new cod tipo messaggio
   */
  public void setCodTipoMessaggio(StringFilter codTipoMessaggio) {
    this.codTipoMessaggio = codTipoMessaggio;
  }

  /**
   * Sets the d inizio.
   *
   * @param dInizio the new d inizio
   */
  public void setDInizio(DateFilter dInizio) {
    this.dInizio = dInizio;
  }

  /**
   * Sets the intestazione.
   *
   * @param intestazione the new intestazione
   */
  public void setIntestazione(StringFilter intestazione) {
    this.intestazione = intestazione;
  }

  /**
   * Sets the testo.
   *
   * @param testo the new testo
   */
  public void setTesto(StringFilter testo) {
    this.testo = testo;
  }

  /**
   * Sets the descr messaggio.
   *
   * @param descrMessaggio the new descr messaggio
   */
  public void setDescrMessaggio(StringFilter descrMessaggio) {
    this.descrMessaggio = descrMessaggio;
  }
} // fine classe
