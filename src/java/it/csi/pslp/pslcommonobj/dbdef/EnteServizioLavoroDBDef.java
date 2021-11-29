/******************************************************
 * Copyright Regione Piemonte - 2021
 * SPDX-License-Identifier: EUPL-1.2-or-later
 ******************************************************/

package it.csi.pslp.pslcommonobj.dbdef;

import it.csi.pslp.pslcommonobj.dto.EnteServizioLavoroDTO;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class EnteServizioLavoroDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_D_ENTE_SERVIZIO_LAVORO")
public abstract class EnteServizioLavoroDBDef extends EnteServizioLavoroDTO {

  /**
   * Gets the id ente servizio lavoro.
   *
   * @return the id ente servizio lavoro
   */
  @Override
  @Column(name = "ID_ENTE_SERVIZIO_LAVORO", pk = true)
  public abstract Long getIdEnteServizioLavoro();

  /**
   * Gets the descrizione.
   *
   * @return the descrizione
   */
  @Override
  @Column(name = "DESCR_ENTE_SERVIZIO_LAVORO")
  public abstract String getDescrizione();

  /**
   * Gets the codice tipo ente.
   *
   * @return the codice tipo ente
   */
  @Override
  @Column(name = "COD_TIPO_ENTE")
  public abstract String getCodiceTipoEnte();

  /**
   * Gets the codice ministeriale.
   *
   * @return the codice ministeriale
   */
  @Override
  @Column(name = "COD_MIN")
  public abstract String getCodiceMinisteriale();

  /**
   * Gets the indirizzo.
   *
   * @return the indirizzo
   */
  @Override
  @Column(name = "INDIRIZZO")
  public abstract String getIndirizzo();

  /**
   * Gets the id provincia.
   *
   * @return the id provincia
   */
  @Override
  @Column(name = "ID_PROVINCIA")
  public abstract String getIdProvincia();

  /**
   * Gets the telefono.
   *
   * @return the telefono
   */
  @Override
  @Column(name = "NUM_TEL")
  public abstract String getTelefono();

  /**
   * Gets the email.
   *
   * @return the email
   */
  @Override
  @Column(name = "EMAIL")
  public abstract String getEmail();

  /**
   * Gets the gruppo operatore.
   *
   * @return the gruppo operatore
   */
  @Override
  @Column(name = "GRUPPO_OPERATORE_SA")
  public abstract String getGruppoOperatore();

  /**
   * Gets the codice operatore.
   *
   * @return the codice operatore
   */
  @Override
  @Column(name = "COD_OPERATORE_SA")
  public abstract Integer getCodiceOperatore();

  /**
   * Gets the subcodice.
   *
   * @return the subcodice
   */
  @Override
  @Column(name = "SUBCODICE_SEDE")
  public abstract Integer getSubcodice();

  /**
   * Gets the id ente servizio lavoro padre.
   *
   * @return the id ente servizio lavoro padre
   */
  @Override
  @Column(name = "ID_ENTE_PADRE")
  public abstract Long getIdEnteServizioLavoroPadre();

  /**
   * Gets the latitudine.
   *
   * @return the latitudine
   */
  @Override
  @Column(name = "LATITUDINE")
  public abstract Float getLatitudine();

  /**
   * Gets the longitidine.
   *
   * @return the longitidine
   */
  @Override
  @Column(name = "LONGITUDINE")
  public abstract Float getLongitidine();

  /**
   * Gets the orario di apertura.
   *
   * @return the orario di apertura
   */
  @Override
  @Column(name = "ORARIO_DI_APERTURA")
  public abstract String getOrarioDiApertura();

  /**
   * Gets the note.
   *
   * @return the note
   */
  @Override
  @Column(name = "NOTE")
  public abstract String getNote();

}
