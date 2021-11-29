/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.MessaggioUtenteDTO;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.ColumnLOB;
import it.csi.silos.jedi.annotations.RelationN1;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class MessaggioUtenteDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_T_MESSAGGIO_UTENTE") // Sostituire con @Query se il DBDef
                                         // mappa il risultato di una query e
                                         // non e' legato a una tabella
public abstract class MessaggioUtenteDBDef extends MessaggioUtenteDTO {

  /**
   * Gets the id messaggio utente.
   *
   * @return the id messaggio utente
   */
  @Override
  @Column(name = "ID_MESSAGGIO_UTENTE", pk = true, sequenceName = "SEQ_PSLP_T_MESSAGGIO_UTENTE")
  public abstract Long getIdMessaggioUtente();

  /**
   * Gets the id messaggio.
   *
   * @return the id messaggio
   */
  @Override
  @Column(name = "ID_MESSAGGIO")
  public abstract Long getIdMessaggio();

  /**
   * Gets the d invio.
   *
   * @return the d invio
   */
  @Override
  @Column(name = "D_INVIO")
  public abstract Date getDInvio();

  /**
   * Gets the oggetto.
   *
   * @return the oggetto
   */
  @Override
  @Column(name = "OGGETTO")
  public abstract String getOggetto();

  /**
   * Gets the testo.
   *
   * @return the testo
   */
  @Override
  @ColumnLOB(name = "TESTO")
  public abstract String getTesto();

  /**
   * Gets the flg letto.
   *
   * @return the flg letto
   */
  @Override
  @Column(name = "FLG_LETTO")
  public abstract String getFlgLetto();
  
  /**
   * Gets the id sil rif ambito.
   *
   * @return the id sil rif ambito
   */
  @Override
  @Column(name = "ID_SIL_RIF_AMBITO")
  public abstract Long getIdSilRifAmbito();
  
  /**
   * Gets the email mittente.
   *
   * @return the email mittente
   */
  @Override
  @Column(name = "EMAIL_MITTENTE")
  public abstract String getEmailMittente();
  
  /**
   * Gets the email destinatario.
   *
   * @return the email destinatario
   */
  @Override
  @Column(name = "EMAIL_DESTINATARIO")
  public abstract String getEmailDestinatario();

  /**
   * Gets the evento.
   *
   * @return the evento
   */
  @Override
  @RelationN1(columnName = "ID_EVENTO")
  public abstract EventoDBDef getEvento();

} // fine classe
