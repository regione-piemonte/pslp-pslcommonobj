/* **************************************************** */
/* Copyright Regione Piemonte - 2021					*/
/* SPDX-License-Identifier: EUPL-1.2-or-later			*/
/* **************************************************** */

package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.ChiamataSMSDTO;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.RelationN1;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class ChiamataSMSDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_T_CHIAMATA_SMS")
public abstract class ChiamataSMSDBDef extends ChiamataSMSDTO {

  /**
   * Gets the id chiamata SMS.
   *
   * @return the id chiamata SMS
   */
  @Override
  @Column(name = "ID_CHIAMATA_SMS", pk=true, sequenceName="SEQ_PSLP_T_CHIAMATA_SMS")
  public abstract Long getIdChiamataSMS();

  /**
   * Gets the sms.
   *
   * @return the sms
   */
  @Override
  @RelationN1(columnName="ID_SMS")
  public abstract SMSDBDef getSms();

  /**
   * Gets the sistema chiamante.
   *
   * @return the sistema chiamante
   */
  @Override
  @RelationN1(columnName="COD_SISTEMA_CHIAMANTE")
  public abstract SistemaChiamanteDBDef getSistemaChiamante();

  /**
   * Gets the metodo chiamato.
   *
   * @return the metodo chiamato
   */
  @Override
  @Column(name = "METODO_CHIAMATO")
  public abstract String getMetodoChiamato();

  /**
   * Gets the ora inizio.
   *
   * @return the ora inizio
   */
  @Override
  @Column(name = "ORA_INIZIO")
  public abstract Date getOraInizio();

  /**
   * Gets the ora fine.
   *
   * @return the ora fine
   */
  @Override
  @Column(name = "ORA_FINE")
  public abstract Date getOraFine();

  /**
   * Gets the msg input.
   *
   * @return the msg input
   */
  @Override
  @Column(name = "MSG_INPUT")
  public abstract String getMsgInput();

  /**
   * Gets the codice esito.
   *
   * @return the codice esito
   */
  @Override
  @Column(name = "COD_ESITO")
  public abstract String getCodiceEsito();

  /**
   * Gets the descrizione esito.
   *
   * @return the descrizione esito
   */
  @Override
  @Column(name = "DESCR_ESITO")
  public abstract String getDescrizioneEsito();

  /**
   * Gets the note.
   *
   * @return the note
   */
  @Override
  @Column(name = "NOTE")
  public abstract String getNote();

}
