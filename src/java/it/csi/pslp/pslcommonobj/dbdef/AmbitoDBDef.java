/* **************************************************** */
/* Copyright Regione Piemonte - 2021					*/
/* SPDX-License-Identifier: EUPL-1.2-or-later			*/
/* **************************************************** */

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import it.csi.pslp.pslcommonobj.dto.AmbitoDTO;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class AmbitoDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_D_AMBITO") // Sostituire con @Query se il DBDef mappa il
                               // risultato di una query e non e' legato a una
                               // tabella
public abstract class AmbitoDBDef extends AmbitoDTO {

  /**
   * Gets the id sil T in servizio.
   *
   * @return the id sil T in servizio
   */
  @Column(name = "ID_SIL_T_IN_SERVIZIO")
  public abstract Long getIdSilTInServizio();

  /**
   * Gets the cod ambito.
   *
   * @return the cod ambito
   */
  @Column(name = "COD_AMBITO", pk = true, sequenceName = "SEQ_PSLP_D_AMBITO")
  public abstract String getCodAmbito();

  /**
   * Gets the descr ambito.
   *
   * @return the descr ambito
   */
  @Column(name = "DESCR_AMBITO")
  public abstract String getDescrAmbito();

} // fine classe
