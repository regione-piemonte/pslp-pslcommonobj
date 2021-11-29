/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.ParametroDTO;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.ColumnLOB;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class ParametroDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_D_PARAMETRO") // Sostituire con @Query se il DBDef mappa il
                                  // risultato di una query e non e' legato a
                                  // una tabella
public abstract class ParametroDBDef extends ParametroDTO {

  /**
   * Gets the cod parametro.
   *
   * @return the cod parametro
   */
  @Column(name = "COD_PARAMETRO")
  public abstract String getCodParametro();

  /**
   * Gets the dt fine.
   *
   * @return the dt fine
   */
  @Column(name = "DT_FINE")
  public abstract Date getDtFine();

  /**
   * Gets the valore parametro ext.
   *
   * @return the valore parametro ext
   */
  @ColumnLOB(name = "VALORE_PARAMETRO_EXT")
  public abstract String getValoreParametroExt();

  /**
   * Gets the dt inizio.
   *
   * @return the dt inizio
   */
  @Column(name = "DT_INIZIO")
  public abstract Date getDtInizio();

  /**
   * Gets the descr parametro.
   *
   * @return the descr parametro
   */
  @Column(name = "DESCR_PARAMETRO")
  public abstract String getDescrParametro();

  /**
   * Gets the id parametro.
   *
   * @return the id parametro
   */
  @Column(name = "ID_PARAMETRO", pk = true, sequenceName = "SEQ_PSLP_D_PARAMETRO")
  public abstract Long getIdParametro();

  /**
   * Gets the valore parametro.
   *
   * @return the valore parametro
   */
  @ColumnLOB(name = "VALORE_PARAMETRO")
  public abstract String getValoreParametro();

} // fine classe
