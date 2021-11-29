/******************************************************
 * Copyright Regione Piemonte - 2021
 * SPDX-License-Identifier: EUPL-1.2-or-later
 ******************************************************/

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.EventoDTO;
import it.csi.silos.jedi.annotations.AutoUpdate;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class EventoDBDef.
 */
@SuppressWarnings("serial")
@Table(name="PSLP_T_EVENTO")  //Sostituire con @Query se il DBDef mappa il risultato di una query e non e' legato a una tabella
public abstract class EventoDBDef extends EventoDTO {

/**
 * Gets the cod esito.
 *
 * @return the cod esito
 */
@Column(name="COD_ESITO")
public abstract String getCodEsito();

/**
 * Gets the id tipo evento.
 *
 * @return the id tipo evento
 */
@Column(name="ID_TIPO_EVENTO")
public abstract Long getIdTipoEvento();

/**
 * Gets the id utente.
 *
 * @return the id utente
 */
@Column(name="ID_UTENTE")
public abstract Long getIdUtente();

/**
 * Gets the d inserim.
 *
 * @return the d inserim
 */
@Column(name="D_INSERIM", autoUpdate = AutoUpdate.CURRENT_TIMESTAMP_INSERT)
public abstract Date getDInserim();

/**
 * Gets the cod user inserim.
 *
 * @return the cod user inserim
 */
@Column(name="COD_USER_INSERIM")
public abstract String getCodUserInserim();

/**
 * Gets the note.
 *
 * @return the note
 */
@Column(name="NOTE")
public abstract String getNote();

/**
 * Gets the id evento.
 *
 * @return the id evento
 */
@Column(name="ID_EVENTO", pk=true, sequenceName="SEQ_PSLP_T_EVENTO")
public abstract Long getIdEvento();

/**
 * Gets the cod user aggiorn.
 *
 * @return the cod user aggiorn
 */
@Column(name="COD_USER_AGGIORN")
public abstract String getCodUserAggiorn();

/**
 * Gets the d evento.
 *
 * @return the d evento
 */
@Column(name="D_EVENTO")
public abstract Date getDEvento();

/**
 * Gets the d aggiorn.
 *
 * @return the d aggiorn
 */
@Column(name="D_AGGIORN", autoUpdate = AutoUpdate.CURRENT_TIMESTAMP)
public abstract Date getDAggiorn();

/**
 * Gets the ip chiamante.
 *
 * @return the ip chiamante
 */
@Column(name="IP_CHIAMANTE")
public abstract String getIpChiamante();

/**
 * Gets the codice ambito.
 *
 * @return the codice ambito
 */
@Column(name="COD_AMBITO")
public abstract String getCodiceAmbito();

} //fine classe


