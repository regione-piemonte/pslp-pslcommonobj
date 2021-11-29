/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.TipoDocumentoEstensioneDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;

/**
 * The Class TipoDocumentoEstensioneFilter.
 */
public class TipoDocumentoEstensioneFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The estensione. */
  private EstensioneFilter estensione = new EstensioneFilter();

  /** The cod tipo documento. */
  private TipoDocumentoFilter codTipoDocumento = new TipoDocumentoFilter();

  /** The d inizio. */
  private DateFilter dInizio = new DateFilter();

  /** The d fine. */
  private DateFilter dFine = new DateFilter();

  /** The expr QBE. */
  TipoDocumentoEstensioneDTO exprQBE = new TipoDocumentoEstensioneDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public TipoDocumentoEstensioneDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(TipoDocumentoEstensioneDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * Gets the estensione.
   *
   * @return the estensione
   */
  public EstensioneFilter getEstensione() {
    return estensione;
  }

  /**
   * Sets the estensione.
   *
   * @param estensione the new estensione
   */
  public void setEstensione(EstensioneFilter estensione) {
    this.estensione = estensione;
  }

  /**
   * Gets the cod tipo documento.
   *
   * @return the cod tipo documento
   */
  public TipoDocumentoFilter getCodTipoDocumento() {
    return codTipoDocumento;
  }

  /**
   * Sets the cod tipo documento.
   *
   * @param codTipoDocumento the new cod tipo documento
   */
  public void setCodTipoDocumento(TipoDocumentoFilter codTipoDocumento) {
    this.codTipoDocumento = codTipoDocumento;
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
   * Sets the d inizio.
   *
   * @param dInizio the new d inizio
   */
  public void setDInizio(DateFilter dInizio) {
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
   * Sets the d fine.
   *
   * @param dFine the new d fine
   */
  public void setDFine(DateFilter dFine) {
    this.dFine = dFine;
  }

} // fine classe
