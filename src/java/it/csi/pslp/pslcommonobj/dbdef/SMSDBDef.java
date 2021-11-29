/* **************************************************** */
/* Copyright Regione Piemonte - 2021					*/
/* SPDX-License-Identifier: EUPL-1.2-or-later			*/
/* **************************************************** */

package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.EnteServizioLavoroDTO;
import it.csi.pslp.pslcommonobj.dto.SMSDTO;
import it.csi.pslp.pslcommonobj.dto.StatoSMSDTO;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.RelationN1;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class SMSDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_T_SMS")
public abstract class SMSDBDef extends SMSDTO {

  /**
   * Gets the id SMS.
   *
   * @return the id SMS
   */
  @Override
  @Column(name = "ID_SMS", pk=true, sequenceName="SEQ_PSLP_T_SMS")
  public abstract Long getIdSMS();

  /**
   * Gets the codice prenotazione.
   *
   * @return the codice prenotazione
   */
  @Override
  @Column(name = "COD_PRENOTAZIONE")
  public abstract String getCodicePrenotazione();

  /**
   * Gets the sistema chiamante.
   *
   * @return the sistema chiamante
   */
  @Override
  @RelationN1(columnName="COD_SISTEMA_CHIAMANTE")
  public abstract SistemaChiamanteDBDef getSistemaChiamante();

  /**
   * Gets the ente.
   *
   * @return the ente
   */
  @Override
  @RelationN1(columnName="ID_ENTE")
  public abstract EnteServizioLavoroDBDef getEnte();

  /**
   * Gets the cellulare.
   *
   * @return the cellulare
   */
  @Override
  @Column(name = "NUM_CELL")
  public abstract String getCellulare();

  /**
   * Gets the messaggio.
   *
   * @return the messaggio
   */
  @Override
  @Column(name = "TESTO_MESSAGGIO")
  public abstract String getMessaggio();

  /**
   * Gets the stato.
   *
   * @return the stato
   */
  @Override
  @RelationN1(columnName="COD_TIPO_STATO")
  public abstract StatoSMSDBDef getStato();

  /**
   * Gets the data stato.
   *
   * @return the data stato
   */
  @Override
  @Column(name = "D_STATO")
  public abstract Date getDataStato();

  /**
   * Gets the codice errore.
   *
   * @return the codice errore
   */
  @Override
  @Column(name = "COD_ERRORE")
  public abstract String getCodiceErrore();

  /**
   * Gets the descrizione errore.
   *
   * @return the descrizione errore
   */
  @Override
  @Column(name = "DESCR_ERRORE")
  public abstract String getDescrizioneErrore();

  /**
   * Gets the data cancellazione.
   *
   * @return the data cancellazione
   */
  @Override
  @Column(name = "D_CANCELLAZIONE")
  public abstract Date getDataCancellazione();

  /**
   * Gets the data aggiornamento sistema chiamante.
   *
   * @return the data aggiornamento sistema chiamante
   */
  @Override
  @Column(name = "D_AGGIORN_SISTEMA_CHIAMANTE")
  public abstract Date getDataAggiornamentoSistemaChiamante();

  /**
   * Gets the id SMS reinoltro.
   *
   * @return the id SMS reinoltro
   */
  @Override
  @Column(name = "ID_SMS_REINOLTRO")
  public abstract Long getIdSMSReinoltro();

  /**
   * Gets the data ultimo aggiornamento.
   *
   * @return the data ultimo aggiornamento
   */
  @Override
  @Column(name = "D_ULTIMO_AGGIORNAMENTO")
  public abstract Date getDataUltimoAggiornamento();

  /**
   * Gets the data inserimento.
   *
   * @return the data inserimento
   */
  @Override
  @Column(name = "D_INSERIM")
  public abstract Date getDataInserimento();

  /**
   * Gets the data aggiornamento.
   *
   * @return the data aggiornamento
   */
  @Override
  @Column(name = "D_AGGIORN")
  public abstract Date getDataAggiornamento();

  /**
   * Gets the codice contratto.
   *
   * @return the codice contratto
   */
  @Override
  @Column(name = "COD_CONTRATTO_SMS")
  public abstract String getCodiceContratto();

}
