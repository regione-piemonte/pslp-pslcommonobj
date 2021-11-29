/******************************************************
 * Copyright Regione Piemonte - 2021
 * SPDX-License-Identifier: EUPL-1.2-or-later
 ******************************************************/

package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.EccezioneDTO;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class EccezioneDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_T_ECCEZIONE")
public abstract class EccezioneDBDef extends EccezioneDTO {

  /**
   * Gets the id eccezione.
   *
   * @return the id eccezione
   */
  @Override
  @Column(name = "ID_ECCEZIONE", pk = true, sequenceName="SEQ_PSLP_T_ECCEZIONE")
  public abstract Long getIdEccezione();

  /**
   * Gets the id periodo.
   *
   * @return the id periodo
   */
  @Override
  @Column(name = "ID_PERIODO")
  public abstract Long getIdPeriodo();

  /**
   * Gets the giorno.
   *
   * @return the giorno
   */
  @Override
  @Column(name = "GIORNO")
  public abstract Date getGiorno();

  /**
   * Gets the ora inizio.
   *
   * @return the ora inizio
   */
  @Override
  @Column(name = "ORA_INIZIO")
  public abstract Integer getOraInizio();

  /**
   * Gets the ora fine.
   *
   * @return the ora fine
   */
  @Override
  @Column(name = "ORA_FINE")
  public abstract Integer getOraFine();

  /**
   * Gets the num max prenotazioni.
   *
   * @return the num max prenotazioni
   */
  @Override
  @Column(name = "NUM_MAX_PRENOTAZIONI")
  public abstract Integer getNumMaxPrenotazioni();
  
  /**
   * Gets the flg elaborata.
   *
   * @return the flg elaborata
   */
  @Override
  @Column(name = "FLG_ELABORATA")
  public abstract String getFlgElaborata();

}
