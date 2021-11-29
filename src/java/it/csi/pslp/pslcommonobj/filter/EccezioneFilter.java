/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.EccezioneDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.IntegerFilter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class EccezioneFilter.
 */
public class EccezioneFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The id eccezione. */
  private LongFilter idEccezione = new LongFilter();

  /** The id periodo. */
  private LongFilter idPeriodo = new LongFilter();

  /** The giorno. */
  private DateFilter giorno = new DateFilter();

  /** The ora inizio. */
  private IntegerFilter oraInizio = new IntegerFilter();

  /** The ora fine. */
  private IntegerFilter oraFine = new IntegerFilter();

  /** The num max prenotazioni. */
  private IntegerFilter numMaxPrenotazioni = new IntegerFilter();

  /** The flg elaborata. */
  private StringFilter flgElaborata = new StringFilter();

  /** The expr QBE. */
  EccezioneDTO exprQBE = new EccezioneDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public EccezioneDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(EccezioneDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  /**
   * Gets the id eccezione.
   *
   * @return the id eccezione
   */
  public LongFilter getIdEccezione() {
    return idEccezione;
  }

  /**
   * Sets the id eccezione.
   *
   * @param idEccezione the new id eccezione
   */
  public void setIdEccezione(LongFilter idEccezione) {
    this.idEccezione = idEccezione;
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
   * Sets the id periodo.
   *
   * @param idPeriodo the new id periodo
   */
  public void setIdPeriodo(LongFilter idPeriodo) {
    this.idPeriodo = idPeriodo;
  }

  /**
   * Gets the giorno.
   *
   * @return the giorno
   */
  public DateFilter getGiorno() {
    return giorno;
  }

  /**
   * Sets the giorno.
   *
   * @param giorno the new giorno
   */
  public void setGiorno(DateFilter giorno) {
    this.giorno = giorno;
  }

  /**
   * Gets the ora inizio.
   *
   * @return the ora inizio
   */
  public IntegerFilter getOraInizio() {
    return oraInizio;
  }

  /**
   * Sets the ora inizio.
   *
   * @param oraInizio the new ora inizio
   */
  public void setOraInizio(IntegerFilter oraInizio) {
    this.oraInizio = oraInizio;
  }

  /**
   * Gets the ora fine.
   *
   * @return the ora fine
   */
  public IntegerFilter getOraFine() {
    return oraFine;
  }

  /**
   * Sets the ora fine.
   *
   * @param oraFine the new ora fine
   */
  public void setOraFine(IntegerFilter oraFine) {
    this.oraFine = oraFine;
  }

  /**
   * Gets the num max prenotazioni.
   *
   * @return the num max prenotazioni
   */
  public IntegerFilter getNumMaxPrenotazioni() {
    return numMaxPrenotazioni;
  }

  /**
   * Sets the num max prenotazioni.
   *
   * @param numMaxPrenotazioni the new num max prenotazioni
   */
  public void setNumMaxPrenotazioni(IntegerFilter numMaxPrenotazioni) {
    this.numMaxPrenotazioni = numMaxPrenotazioni;
  }

  /**
   * Gets the flg elaborata.
   *
   * @return the flg elaborata
   */
  public StringFilter getFlgElaborata() {
    return flgElaborata;
  }

  /**
   * Sets the flg elaborata.
   *
   * @param flgElaborata the new flg elaborata
   */
  public void setFlgElaborata(StringFilter flgElaborata) {
    this.flgElaborata = flgElaborata;
  }

}
