/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.CalendarioDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.IntegerFilter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class CalendarioFilter.
 */
public class CalendarioFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The flg invio conferma prenotaz. */
  private StringFilter flgInvioConfermaPrenotaz = new StringFilter();

  // campo chiave esterna verso la colonna COD_AMBITO della tabella
  /** The ambito. */
  // PSLP_D_AMBITO
  private AmbitoFilter ambito = new AmbitoFilter();

  /** The cod operatore. */
  private LongFilter codOperatore = new LongFilter();

  /** The cod user aggiorn. */
  private StringFilter codUserAggiorn = new StringFilter();

  /** The id calendario. */
  // campo chiave primaria
  private LongFilter idCalendario = new LongFilter();

  /** The flg annulla garanzia giovani. */
  private StringFilter flgAnnullaGaranziaGiovani = new StringFilter();

  /** The d aggiorn. */
  private DateFilter dAggiorn = new DateFilter();

  /** The subcodice. */
  private LongFilter subcodice = new LongFilter();

  /** The d inserim. */
  private DateFilter dInserim = new DateFilter();

  /** The cod user inserim. */
  private StringFilter codUserInserim = new StringFilter();

  /** The ore invio promemoria. */
  private IntegerFilter oreInvioPromemoria = new IntegerFilter();

  /** The ore limite spostamento. */
  private IntegerFilter oreLimiteSpostamento = new IntegerFilter();

  /** The d annullamento. */
  private DateFilter dAnnullamento = new DateFilter();

  /** The flg visibile cpi. */
  private StringFilter flgVisibileCpi = new StringFilter();

  /** The gruppo operatore. */
  private StringFilter gruppoOperatore = new StringFilter();

  /** The nome. */
  private StringFilter nome = new StringFilter();

  /** The oggetto calendario. */
  private StringFilter oggettoCalendario = new StringFilter();

  /** The flg bloccato. */
  private StringFilter flgBloccato = new StringFilter();

  /** The expr QBE. */
  CalendarioDTO exprQBE = new CalendarioDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public CalendarioDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(CalendarioDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * Gets the flg invio conferma prenotaz.
   *
   * @return the flg invio conferma prenotaz
   */
  public StringFilter getFlgInvioConfermaPrenotaz() {
    return flgInvioConfermaPrenotaz;
  }

  /**
   * Gets the ambito.
   *
   * @return the ambito
   */
  public AmbitoFilter getAmbito() {
    return ambito;
  }

  /**
   * Gets the cod operatore.
   *
   * @return the cod operatore
   */
  public LongFilter getCodOperatore() {
    return codOperatore;
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
   * Gets the flg annulla garanzia giovani.
   *
   * @return the flg annulla garanzia giovani
   */
  public StringFilter getFlgAnnullaGaranziaGiovani() {
    return flgAnnullaGaranziaGiovani;
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
   * Gets the subcodice.
   *
   * @return the subcodice
   */
  public LongFilter getSubcodice() {
    return subcodice;
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
   * Gets the ore invio promemoria.
   *
   * @return the ore invio promemoria
   */
  public IntegerFilter getOreInvioPromemoria() {
    return oreInvioPromemoria;
  }

  /**
   * Gets the ore limite spostamento.
   *
   * @return the ore limite spostamento
   */
  public IntegerFilter getOreLimiteSpostamento() {
    return oreLimiteSpostamento;
  }

  /**
   * Gets the d annullamento.
   *
   * @return the d annullamento
   */
  public DateFilter getDAnnullamento() {
    return dAnnullamento;
  }

  /**
   * Gets the flg visibile cpi.
   *
   * @return the flg visibile cpi
   */
  public StringFilter getFlgVisibileCpi() {
    return flgVisibileCpi;
  }

  /**
   * Gets the gruppo operatore.
   *
   * @return the gruppo operatore
   */
  public StringFilter getGruppoOperatore() {
    return gruppoOperatore;
  }

  /**
   * Gets the nome.
   *
   * @return the nome
   */
  public StringFilter getNome() {
    return nome;
  }

  /**
   * Sets the flg invio conferma prenotaz.
   *
   * @param flgInvioConfermaPrenotaz the new flg invio conferma prenotaz
   */
  public void setFlgInvioConfermaPrenotaz(StringFilter flgInvioConfermaPrenotaz) {
    this.flgInvioConfermaPrenotaz = flgInvioConfermaPrenotaz;
  }

  /**
   * Sets the ambito.
   *
   * @param ambito the new ambito
   */
  public void setAmbito(AmbitoFilter ambito) {
    this.ambito = ambito;
  }

  /**
   * Sets the cod operatore.
   *
   * @param codOperatore the new cod operatore
   */
  public void setCodOperatore(LongFilter codOperatore) {
    this.codOperatore = codOperatore;
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
   * Sets the flg annulla garanzia giovani.
   *
   * @param flgAnnullaGaranziaGiovani the new flg annulla garanzia giovani
   */
  public void setFlgAnnullaGaranziaGiovani(StringFilter flgAnnullaGaranziaGiovani) {
    this.flgAnnullaGaranziaGiovani = flgAnnullaGaranziaGiovani;
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
   * Sets the subcodice.
   *
   * @param subcodice the new subcodice
   */
  public void setSubcodice(LongFilter subcodice) {
    this.subcodice = subcodice;
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
   * Sets the ore invio promemoria.
   *
   * @param oreInvioPromemoria the new ore invio promemoria
   */
  public void setOreInvioPromemoria(IntegerFilter oreInvioPromemoria) {
    this.oreInvioPromemoria = oreInvioPromemoria;
  }

  /**
   * Sets the ore limite spostamento.
   *
   * @param oreLimiteSpostamento the new ore limite spostamento
   */
  public void setOreLimiteSpostamento(IntegerFilter oreLimiteSpostamento) {
    this.oreLimiteSpostamento = oreLimiteSpostamento;
  }

  /**
   * Sets the d annullamento.
   *
   * @param dAnnullamento the new d annullamento
   */
  public void setDAnnullamento(DateFilter dAnnullamento) {
    this.dAnnullamento = dAnnullamento;
  }

  /**
   * Sets the flg visibile cpi.
   *
   * @param flgVisibileCpi the new flg visibile cpi
   */
  public void setFlgVisibileCpi(StringFilter flgVisibileCpi) {
    this.flgVisibileCpi = flgVisibileCpi;
  }

  /**
   * Sets the gruppo operatore.
   *
   * @param gruppoOperatore the new gruppo operatore
   */
  public void setGruppoOperatore(StringFilter gruppoOperatore) {
    this.gruppoOperatore = gruppoOperatore;
  }

  /**
   * Sets the nome.
   *
   * @param nome the new nome
   */
  public void setNome(StringFilter nome) {
    this.nome = nome;
  }

  /**
   * Gets the flg bloccato.
   *
   * @return the flg bloccato
   */
  public StringFilter getFlgBloccato() {
    return flgBloccato;
  }

  /**
   * Sets the flg bloccato.
   *
   * @param flgBloccato the new flg bloccato
   */
  public void setFlgBloccato(StringFilter flgBloccato) {
    this.flgBloccato = flgBloccato;
  }

  /**
   * Gets the oggetto calendario.
   *
   * @return the oggetto calendario
   */
  public StringFilter getOggettoCalendario() {
    return oggettoCalendario;
  }

  /**
   * Sets the oggetto calendario.
   *
   * @param oggettoCalendario the new oggetto calendario
   */
  public void setOggettoCalendario(StringFilter oggettoCalendario) {
    this.oggettoCalendario = oggettoCalendario;
  }
  
  
} // fine classe
