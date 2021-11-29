/* **************************************************** */
/* Copyright Regione Piemonte - 2021					*/
/* SPDX-License-Identifier: EUPL-1.2-or-later			*/
/* **************************************************** */

package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.StatoSMSDTO;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class StatoSMSDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_D_STATO_SMS")
public abstract class StatoSMSDBDef extends StatoSMSDTO {

  /**
   * Gets the codice.
   *
   * @return the codice
   */
  @Override
  @Column(name = "COD_TIPO_STATO", pk=true)
  public abstract String getCodice();

  /**
   * Gets the descrizione.
   *
   * @return the descrizione
   */
  @Override
  @Column(name = "DESCR_TIPO_STATO")
  public abstract String getDescrizione();

  /**
   * Gets the data inizio.
   *
   * @return the data inizio
   */
  @Override
  @Column(name = "D_INIZIO")
  public abstract Date getDataInizio();

  /**
   * Gets the data fine.
   *
   * @return the data fine
   */
  @Override
  @Column(name = "D_FINE")
  public abstract Date getDataFine();

}
