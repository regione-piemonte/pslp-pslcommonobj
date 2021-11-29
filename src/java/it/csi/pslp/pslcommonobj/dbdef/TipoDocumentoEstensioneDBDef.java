/* **************************************************** */
/* Copyright Regione Piemonte - 2021					*/
/* SPDX-License-Identifier: EUPL-1.2-or-later			*/
/* **************************************************** */

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.TipoDocumentoEstensioneDTO;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.RelationN1;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class TipoDocumentoEstensioneDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_R_TIPO_DOC_ESTENSIONE")
public abstract class TipoDocumentoEstensioneDBDef extends TipoDocumentoEstensioneDTO {

  /**
   * Gets the estensione.
   *
   * @return the estensione
   */
  @RelationN1(columnName = "COD_ESTENSIONE_DOC", pk = true)
  public abstract EstensioneDBDef getEstensione();

  /**
   * Gets the tipo documento.
   *
   * @return the tipo documento
   */
  @RelationN1(columnName = "COD_TIPO_DOCUMENTO", pk = true)
  public abstract TipoDocumentoDBDef getTipoDocumento();

  /**
   * Gets the d inizio.
   *
   * @return the d inizio
   */
  @Column(name = "D_INIZIO")
  public abstract Date getDInizio();

  /**
   * Gets the d fine.
   *
   * @return the d fine
   */
  @Column(name = "D_FINE")
  public abstract Date getDFine();

} // fine classe
