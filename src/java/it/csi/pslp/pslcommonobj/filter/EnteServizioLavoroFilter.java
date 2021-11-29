/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.EnteServizioLavoroDTO;
import it.csi.silos.jeff.core.DoubleFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.FloatFilter;
import it.csi.silos.jeff.core.IntegerFilter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class EnteServizioLavoroFilter.
 */
public class EnteServizioLavoroFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;
  
  /** The id ente servizio lavoro. */
  private LongFilter idEnteServizioLavoro = new LongFilter();

  /** The descrizione. */
  private StringFilter descrizione = new StringFilter();

  /** The codice tipo ente. */
  private StringFilter codiceTipoEnte = new StringFilter();

  /** The codice ministeriale. */
  private StringFilter codiceMinisteriale = new StringFilter();

  /** The indirizzo. */
  private StringFilter indirizzo = new StringFilter();

  /** The id provincia. */
  private StringFilter idProvincia = new StringFilter();

  /** The telefono. */
  private StringFilter telefono = new StringFilter();

  /** The email. */
  private StringFilter email = new StringFilter();

  /** The gruppo operatore. */
  private StringFilter gruppoOperatore = new StringFilter();

  /** The codice operatore. */
  private IntegerFilter codiceOperatore = new IntegerFilter();

  /** The subcodice. */
  private IntegerFilter subcodice = new IntegerFilter();

  /** The id ente servizio lavoro padre. */
  private LongFilter idEnteServizioLavoroPadre = new LongFilter();

  /** The latitudine. */
  private FloatFilter latitudine = new FloatFilter();

  /** The longitidine. */
  private FloatFilter longitidine = new FloatFilter();

  /** The orario di apertura. */
  private StringFilter orarioDiApertura = new StringFilter();

  /** The note. */
  private StringFilter note = new StringFilter();

  /** The expr QBE. */
  EnteServizioLavoroDTO exprQBE = new EnteServizioLavoroDTO();

  /**
   * Gets the id ente servizio lavoro.
   *
   * @return the id ente servizio lavoro
   */
  public LongFilter getIdEnteServizioLavoro() {
    return idEnteServizioLavoro;
  }

  /**
   * Sets the id ente servizio lavoro.
   *
   * @param idEnteServizioLavoro the new id ente servizio lavoro
   */
  public void setIdEnteServizioLavoro(LongFilter idEnteServizioLavoro) {
    this.idEnteServizioLavoro = idEnteServizioLavoro;
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
   * Gets the codice tipo ente.
   *
   * @return the codice tipo ente
   */
  public StringFilter getCodiceTipoEnte() {
    return codiceTipoEnte;
  }

  /**
   * Sets the codice tipo ente.
   *
   * @param codiceTipoEnte the new codice tipo ente
   */
  public void setCodiceTipoEnte(StringFilter codiceTipoEnte) {
    this.codiceTipoEnte = codiceTipoEnte;
  }

  /**
   * Gets the codice ministeriale.
   *
   * @return the codice ministeriale
   */
  public StringFilter getCodiceMinisteriale() {
    return codiceMinisteriale;
  }

  /**
   * Sets the codice ministeriale.
   *
   * @param codiceMinisteriale the new codice ministeriale
   */
  public void setCodiceMinisteriale(StringFilter codiceMinisteriale) {
    this.codiceMinisteriale = codiceMinisteriale;
  }

  /**
   * Gets the indirizzo.
   *
   * @return the indirizzo
   */
  public StringFilter getIndirizzo() {
    return indirizzo;
  }

  /**
   * Sets the indirizzo.
   *
   * @param indirizzo the new indirizzo
   */
  public void setIndirizzo(StringFilter indirizzo) {
    this.indirizzo = indirizzo;
  }

  /**
   * Gets the id provincia.
   *
   * @return the id provincia
   */
  public StringFilter getIdProvincia() {
    return idProvincia;
  }

  /**
   * Sets the id provincia.
   *
   * @param idProvincia the new id provincia
   */
  public void setIdProvincia(StringFilter idProvincia) {
    this.idProvincia = idProvincia;
  }

  /**
   * Gets the telefono.
   *
   * @return the telefono
   */
  public StringFilter getTelefono() {
    return telefono;
  }

  /**
   * Sets the telefono.
   *
   * @param telefono the new telefono
   */
  public void setTelefono(StringFilter telefono) {
    this.telefono = telefono;
  }

  /**
   * Gets the email.
   *
   * @return the email
   */
  public StringFilter getEmail() {
    return email;
  }

  /**
   * Sets the email.
   *
   * @param email the new email
   */
  public void setEmail(StringFilter email) {
    this.email = email;
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
   * Sets the gruppo operatore.
   *
   * @param gruppoOperatore the new gruppo operatore
   */
  public void setGruppoOperatore(StringFilter gruppoOperatore) {
    this.gruppoOperatore = gruppoOperatore;
  }

  /**
   * Gets the codice operatore.
   *
   * @return the codice operatore
   */
  public IntegerFilter getCodiceOperatore() {
    return codiceOperatore;
  }

  /**
   * Sets the codice operatore.
   *
   * @param codiceOperatore the new codice operatore
   */
  public void setCodiceOperatore(IntegerFilter codiceOperatore) {
    this.codiceOperatore = codiceOperatore;
  }

  /**
   * Gets the subcodice.
   *
   * @return the subcodice
   */
  public IntegerFilter getSubcodice() {
    return subcodice;
  }

  /**
   * Sets the subcodice.
   *
   * @param subcodice the new subcodice
   */
  public void setSubcodice(IntegerFilter subcodice) {
    this.subcodice = subcodice;
  }

  /**
   * Gets the id ente servizio lavoro padre.
   *
   * @return the id ente servizio lavoro padre
   */
  public LongFilter getIdEnteServizioLavoroPadre() {
    return idEnteServizioLavoroPadre;
  }

  /**
   * Sets the id ente servizio lavoro padre.
   *
   * @param idEnteServizioLavoroPadre the new id ente servizio lavoro padre
   */
  public void setIdEnteServizioLavoroPadre(LongFilter idEnteServizioLavoroPadre) {
    this.idEnteServizioLavoroPadre = idEnteServizioLavoroPadre;
  }

  /**
   * Gets the latitudine.
   *
   * @return the latitudine
   */
  public FloatFilter getLatitudine() {
    return latitudine;
  }

  /**
   * Sets the latitudine.
   *
   * @param latitudine the new latitudine
   */
  public void setLatitudine(FloatFilter latitudine) {
    this.latitudine = latitudine;
  }

  /**
   * Gets the longitidine.
   *
   * @return the longitidine
   */
  public FloatFilter getLongitidine() {
    return longitidine;
  }

  /**
   * Sets the longitidine.
   *
   * @param longitidine the new longitidine
   */
  public void setLongitidine(FloatFilter longitidine) {
    this.longitidine = longitidine;
  }

  /**
   * Gets the orario di apertura.
   *
   * @return the orario di apertura
   */
  public StringFilter getOrarioDiApertura() {
    return orarioDiApertura;
  }

  /**
   * Sets the orario di apertura.
   *
   * @param orarioDiApertura the new orario di apertura
   */
  public void setOrarioDiApertura(StringFilter orarioDiApertura) {
    this.orarioDiApertura = orarioDiApertura;
  }

  /**
   * Gets the note.
   *
   * @return the note
   */
  public StringFilter getNote() {
    return note;
  }

  /**
   * Sets the note.
   *
   * @param note the new note
   */
  public void setNote(StringFilter note) {
    this.note = note;
  }

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public EnteServizioLavoroDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(EnteServizioLavoroDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  
}
