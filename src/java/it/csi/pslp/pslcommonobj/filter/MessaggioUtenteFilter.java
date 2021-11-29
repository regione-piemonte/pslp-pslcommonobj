/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.FilterJediStrategy
package it.csi.pslp.pslcommonobj.filter;

import it.csi.pslp.pslcommonobj.dto.MessaggioUtenteDTO;
import it.csi.silos.jeff.core.DateFilter;
import it.csi.silos.jeff.core.Filter;
import it.csi.silos.jeff.core.LongFilter;
import it.csi.silos.jeff.core.StringFilter;

/**
 * The Class MessaggioUtenteFilter.
 */
public class MessaggioUtenteFilter extends Filter {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /** The id messaggio utente. */
  // campo chiave primaria
  private LongFilter idMessaggioUtente = new LongFilter();
  
  /** The id messaggio. */
  private LongFilter idMessaggio = new LongFilter();

  /** The d invio. */
  private DateFilter dInvio = new DateFilter();

  /** The oggetto. */
  private StringFilter oggetto = new StringFilter();

  /** The testo. */
  private StringFilter testo = new StringFilter();

  /** The flg letto. */
  private StringFilter flgLetto = new StringFilter();
  
  /** The id sil rif ambito. */
  private LongFilter idSilRifAmbito = new LongFilter();
  
  /** The email mittente. */
  private StringFilter emailMittente = new StringFilter();
  
  /** The email destinatario. */
  private StringFilter emailDestinatario = new StringFilter();
  
  /** The evento. */
  private EventoFilter evento = new EventoFilter();
  
  /** The expr QBE. */
  MessaggioUtenteDTO exprQBE = new MessaggioUtenteDTO();

  /**
   * Gets the expr QBE.
   *
   * @return the expr QBE
   */
  public MessaggioUtenteDTO getExprQBE() {
    return exprQBE;
  }

  /**
   * Sets the expr QBE.
   *
   * @param exprQBE the new expr QBE
   */
  public void setExprQBE(MessaggioUtenteDTO exprQBE) {
    this.exprQBE = exprQBE;
  }

  
  /**
   * Gets the id messaggio utente.
   *
   * @return the id messaggio utente
   */
  public LongFilter getIdMessaggioUtente() {
    return idMessaggioUtente;
  }

  /**
   * Sets the id messaggio utente.
   *
   * @param idMessaggioUtente the new id messaggio utente
   */
  public void setIdMessaggioUtente(LongFilter idMessaggioUtente) {
    this.idMessaggioUtente = idMessaggioUtente;
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
   * Gets the d invio.
   *
   * @return the d invio
   */
  public DateFilter getDInvio() {
    return dInvio;
  }

  /**
   * Gets the oggetto.
   *
   * @return the oggetto
   */
  public StringFilter getOggetto() {
    return oggetto;
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
   * Gets the flg letto.
   *
   * @return the flg letto
   */
  public StringFilter getFlgLetto() {
    return flgLetto;
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
   * Sets the d invio.
   *
   * @param dInvio the new d invio
   */
  public void setDInvio(DateFilter dInvio) {
    this.dInvio = dInvio;
  }

  /**
   * Sets the oggetto.
   *
   * @param oggetto the new oggetto
   */
  public void setOggetto(StringFilter oggetto) {
    this.oggetto = oggetto;
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
   * Sets the flg letto.
   *
   * @param flgLetto the new flg letto
   */
  public void setFlgLetto(StringFilter flgLetto) {
    this.flgLetto = flgLetto;
  }

  /**
   * Gets the id sil rif ambito.
   *
   * @return the id sil rif ambito
   */
  public LongFilter getIdSilRifAmbito() {
    return idSilRifAmbito;
  }

  /**
   * Sets the id sil rif ambito.
   *
   * @param idSilRifAmbito the new id sil rif ambito
   */
  public void setIdSilRifAmbito(LongFilter idSilRifAmbito) {
    this.idSilRifAmbito = idSilRifAmbito;
  }

  /**
   * Gets the email mittente.
   *
   * @return the email mittente
   */
  public StringFilter getEmailMittente() {
    return emailMittente;
  }

  /**
   * Sets the email mittente.
   *
   * @param emailMittente the new email mittente
   */
  public void setEmailMittente(StringFilter emailMittente) {
    this.emailMittente = emailMittente;
  }

  /**
   * Gets the email destinatario.
   *
   * @return the email destinatario
   */
  public StringFilter getEmailDestinatario() {
    return emailDestinatario;
  }

  /**
   * Sets the email destinatario.
   *
   * @param emailDestinatario the new email destinatario
   */
  public void setEmailDestinatario(StringFilter emailDestinatario) {
    this.emailDestinatario = emailDestinatario;
  }

  /**
   * Gets the evento.
   *
   * @return the evento
   */
  public EventoFilter getEvento() {
    return evento;
  }

  /**
   * Sets the evento.
   *
   * @param evento the new evento
   */
  public void setEvento(EventoFilter evento) {
    this.evento = evento;
  }
  

} // fine classe
