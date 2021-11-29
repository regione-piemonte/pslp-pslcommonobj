/* **************************************************** */
/* Copyright Regione Piemonte - 2021					*/
/* SPDX-License-Identifier: EUPL-1.2-or-later			*/
/* **************************************************** */

package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.SistemaChiamanteDTO;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class SistemaChiamanteDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_D_SISTEMA_CHIAMANTE")
public abstract class SistemaChiamanteDBDef extends SistemaChiamanteDTO {

  /**
   * Gets the codice.
   *
   * @return the codice
   */
  @Override
  @Column(name = "COD_SISTEMA_CHIAMANTE", pk = true)
  public abstract String getCodice();

  /**
   * Gets the descrizione.
   *
   * @return the descrizione
   */
  @Override
  @Column(name = "DESCR_SISTEMA_CHIAMANTE")
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

  /**
   * Gets the mail riferimento.
   *
   * @return the mail riferimento
   */
  @Override
  @Column(name = "DS_MAIL_RIFERIMENTO")
  public abstract String getMailRiferimento();

}
