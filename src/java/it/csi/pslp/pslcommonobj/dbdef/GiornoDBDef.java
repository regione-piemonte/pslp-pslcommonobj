/******************************************************
 * Copyright Regione Piemonte - 2021
 * SPDX-License-Identifier: EUPL-1.2-or-later
 ******************************************************/
 
//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.GiornoDTO;
import it.csi.silos.jedi.annotations.AutoUpdate;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.RelationN1;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class GiornoDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_T_GIORNO") // Sostituire con @Query se il DBDef mappa il
                               // risultato di una query e non e' legato a una
                               // tabella
public abstract class GiornoDBDef extends GiornoDTO {

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
   * Gets the giorno.
   *
   * @return the giorno
   */
  @Column(name = "GIORNO")
  public abstract Date getGiorno();

  /**
   * Gets the cod user aggiorn.
   *
   * @return the cod user aggiorn
   */
  @Column(name = "COD_USER_AGGIORN")
  public abstract String getCodUserAggiorn();

  /**
   * Gets the d aggiorn.
   *
   * @return the d aggiorn
   */
  @Column(name = "D_AGGIORN", autoUpdate = AutoUpdate.CURRENT_TIMESTAMP)
  public abstract Date getDAggiorn();

  /**
   * Gets the id giorno.
   *
   * @return the id giorno
   */
  @Column(name = "ID_GIORNO", pk = true, sequenceName = "SEQ_PSLP_T_GIORNO")
  public abstract Long getIdGiorno();

  /**
   * Gets the periodo.
   *
   * @return the periodo
   */
  @RelationN1(columnName = "ID_PERIODO")
  public abstract PeriodoDBDef getPeriodo();

} // fine classe
