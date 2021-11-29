/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.PeriodoDTO;
import it.csi.silos.jedi.annotations.AutoUpdate;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.RelationN1;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class PeriodoDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_T_PERIODO") // Sostituire con @Query se il DBDef mappa il
                                // risultato di una query e non e' legato a una
                                // tabella
public abstract class PeriodoDBDef extends PeriodoDTO {

  /**
   * Gets the dt fine.
   *
   * @return the dt fine
   */
  @Column(name = "DT_FINE")
  public abstract Date getDtFine();

  /**
   * Gets the dt inizio.
   *
   * @return the dt inizio
   */
  @Column(name = "DT_INIZIO")
  public abstract Date getDtInizio();

  /**
   * Gets the d inserim.
   *
   * @return the d inserim
   */
  @Column(name = "D_INSERIM", autoUpdate = AutoUpdate.CURRENT_TIMESTAMP_INSERT)
  public abstract Date getDInserim();

  /**
   * Gets the cod user inserim.
   *
   * @return the cod user inserim
   */
  @Column(name = "COD_USER_INSERIM")
  public abstract String getCodUserInserim();

  /**
   * Gets the cod user aggiorn.
   *
   * @return the cod user aggiorn
   */
  @Column(name = "COD_USER_AGGIORN")
  public abstract String getCodUserAggiorn();

  /**
   * Gets the calendario.
   *
   * @return the calendario
   */
  @RelationN1(columnName = "ID_CALENDARIO")
  public abstract CalendarioDBDef getCalendario();

  /**
   * Gets the d aggiorn.
   *
   * @return the d aggiorn
   */
  @Column(name = "D_AGGIORN", autoUpdate = AutoUpdate.CURRENT_TIMESTAMP)
  public abstract Date getDAggiorn();

  /**
   * Gets the id periodo.
   *
   * @return the id periodo
   */
  @Column(name = "ID_PERIODO", pk = true, sequenceName = "SEQ_PSLP_T_PERIODO")
  public abstract Long getIdPeriodo();

} // fine classe
