/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.MessaggioCalendarioDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class MessaggioCalendarioFilter.
 */
public class MessaggioCalendarioFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The id messaggio. */
  // campo chiave primaria
  private LongFilter idMessaggio = new LongFilter();

  /** The d inserim. */
  private DateFilter dInserim = new DateFilter();

  /** The cod user inserim. */
  private StringFilter codUserInserim = new StringFilter();

  /** The cod user aggiorn. */
  private StringFilter codUserAggiorn = new StringFilter();

  // campo chiave esterna verso la colonna ID_CALENDARIO della tabella
  /** The id calendario. */
  // PSLP_T_CALENDARIO
  private LongFilter idCalendario = new LongFilter();

  /** The d aggiorn. */
  private DateFilter dAggiorn = new DateFilter();

  /** The testo. */
  private StringFilter testo = new StringFilter();
  
  /** The cod tipo messaggio calendario. */
  private StringFilter codTipoMessaggioCalendario = new StringFilter();

  /** The expr QBE. */
  MessaggioCalendarioDTO exprQBE = new MessaggioCalendarioDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public MessaggioCalendarioDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(MessaggioCalendarioDTO exprQBE) {
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
   * Gets the id calendario.
   *
   * @return the id calendario
   */
  public LongFilter getIdCalendario() {
    return idCalendario;
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
   * Gets the testo.
   *
   * @return the testo
   */
  public StringFilter getTesto() {
    return testo;
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
   * Sets the id calendario.
   *
   * @param idCalendario the new id calendario
   */
  public void setIdCalendario(LongFilter idCalendario) {
    this.idCalendario = idCalendario;
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
   * Sets the testo.
   *
   * @param testo the new testo
   */
  public void setTesto(StringFilter testo) {
    this.testo = testo;
  }

  /**
   * Gets the cod tipo messaggio calendario.
   *
   * @return the cod tipo messaggio calendario
   */
  public StringFilter getCodTipoMessaggioCalendario() {
    return codTipoMessaggioCalendario;
  }

  /**
   * Sets the cod tipo messaggio calendario.
   *
   * @param codTipoMessaggioCalendario the new cod tipo messaggio calendario
   */
  public void setCodTipoMessaggioCalendario(StringFilter codTipoMessaggioCalendario) {
    this.codTipoMessaggioCalendario = codTipoMessaggioCalendario;
  }
  
  
} // fine classe
