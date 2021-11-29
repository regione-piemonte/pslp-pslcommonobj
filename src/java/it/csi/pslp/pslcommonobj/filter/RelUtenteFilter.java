/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.RelUtenteDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class RelUtenteFilter.
 */
public class RelUtenteFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The d inserim. */
  private DateFilter dInserim = new DateFilter();

  /** The cod user inserim. */
  private StringFilter codUserInserim = new StringFilter();

  // campo chiave esterna verso la colonna COD_TIPO_RESPONSABILITA della tabella
  /** The tipo responsabilita. */
  // PSLP_D_TIPO_RESPONSABILITA
  private TipoResponsabilitaFilter tipoResponsabilita = new TipoResponsabilitaFilter();

  /** The cod user aggiorn. */
  private StringFilter codUserAggiorn = new StringFilter();

  /** The d aggiorn. */
  private DateFilter dAggiorn = new DateFilter();

  // campo chiave primaria
  /** The id responsabile. */
  // campo chiave esterna verso la colonna ID_UTENTE della tabella PSLP_T_UTENTE
  private LongFilter idResponsabile = new LongFilter();

  // campo chiave primaria
  /** The tutelato. */
  // campo chiave esterna verso la colonna ID_UTENTE della tabella PSLP_T_UTENTE
  private UtenteFilter tutelato = new UtenteFilter();

  /** The expr QBE. */
  RelUtenteDTO exprQBE = new RelUtenteDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public RelUtenteDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(RelUtenteDTO exprQBE) {
    this.exprQBE = exprQBE;
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
   * Gets the id responsabile.
   *
   * @return the id responsabile
   */
  public LongFilter getIdResponsabile() {
    return idResponsabile;
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
   * Gets the tipo responsabilita.
   *
   * @return the tipo responsabilita
   */
  public TipoResponsabilitaFilter getTipoResponsabilita() {
    return tipoResponsabilita;
  }

  /**
   * Sets the tipo responsabilita.
   *
   * @param tipoResponsabilita the new tipo responsabilita
   */
  public void setTipoResponsabilita(TipoResponsabilitaFilter tipoResponsabilita) {
    this.tipoResponsabilita = tipoResponsabilita;
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
   * Sets the id responsabile.
   *
   * @param idResponsabile the new id responsabile
   */
  public void setIdResponsabile(LongFilter idResponsabile) {
    this.idResponsabile = idResponsabile;
  }

  /**
   * Gets the tutelato.
   *
   * @return the tutelato
   */
  public UtenteFilter getTutelato() {
    return tutelato;
  }

  /**
   * Sets the tutelato.
   *
   * @param tutelato the new tutelato
   */
  public void setTutelato(UtenteFilter tutelato) {
    this.tutelato = tutelato;
  }

} // fine classe
