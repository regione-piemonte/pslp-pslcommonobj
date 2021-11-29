/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.MessaggioDTO;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class MessaggioDBDef.
 */
@SuppressWarnings("serial")
@Table(name="PSLP_D_MESSAGGIO")  //Sostituire con @Query se il DBDef mappa il risultato di una query e non e' legato a una tabella
public abstract class MessaggioDBDef extends MessaggioDTO {

/**
 * Gets the d fine.
 *
 * @return the d fine
 */
@Column(name="D_FINE")
public abstract Date getDFine();

/**
 * Gets the cod ambito.
 *
 * @return the cod ambito
 */
@Column(name="COD_AMBITO")
public abstract String getCodAmbito();

/**
 * Gets the id messaggio.
 *
 * @return the id messaggio
 */
@Column(name="ID_MESSAGGIO", pk=true, sequenceName="SEQ_PSLP_D_MESSAGGIO")
public abstract Long getIdMessaggio();

/**
 * Gets the cod messaggio.
 *
 * @return the cod messaggio
 */
@Column(name="COD_MESSAGGIO")
public abstract String getCodMessaggio();

/**
 * Gets the cod tipo messaggio.
 *
 * @return the cod tipo messaggio
 */
@Column(name="COD_TIPO_MESSAGGIO")
public abstract String getCodTipoMessaggio();

/**
 * Gets the d inizio.
 *
 * @return the d inizio
 */
@Column(name="D_INIZIO")
public abstract Date getDInizio();

/**
 * Gets the intestazione.
 *
 * @return the intestazione
 */
@Column(name="INTESTAZIONE")
public abstract String getIntestazione();

/**
 * Gets the testo.
 *
 * @return the testo
 */
@Column(name="TESTO")
public abstract String getTesto();

/**
 * Gets the descr messaggio.
 *
 * @return the descr messaggio
 */
@Column(name="DESCR_MESSAGGIO")
public abstract String getDescrMessaggio();

} //fine classe


