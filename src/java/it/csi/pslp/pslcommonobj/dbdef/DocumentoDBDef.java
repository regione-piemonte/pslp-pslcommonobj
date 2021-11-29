/******************************************************
 * Copyright Regione Piemonte - 2021
 * SPDX-License-Identifier: EUPL-1.2-or-later
 ******************************************************/

//classe generata automaticamente da generator.strategy.DBDefStrategy
package it.csi.pslp.pslcommonobj.dbdef;

import java.util.Date;

import it.csi.pslp.pslcommonobj.dto.DocumentoDTO;
import it.csi.silos.jedi.annotations.AutoUpdate;
import it.csi.silos.jedi.annotations.Column;
import it.csi.silos.jedi.annotations.RelationN1;
import it.csi.silos.jedi.annotations.Table;

/**
 * The Class DocumentoDBDef.
 */
@SuppressWarnings("serial")
@Table(name = "PSLP_T_DOCUMENTO")
public abstract class DocumentoDBDef extends DocumentoDTO {

    /**
     * Gets the tipo documento.
     *
     * @return the tipo documento
     */
    @Override
    @RelationN1(columnName = "COD_TIPO_DOCUMENTO")
    public abstract TipoDocumentoDBDef getTipoDocumento();

    /**
     * Gets the nome documento.
     *
     * @return the nome documento
     */
    @Override
    @Column(name = "NOME_DOCUMENTO")
    public abstract String getNomeDocumento();

    /**
     * Gets the cod ambito.
     *
     * @return the cod ambito
     */
    @Override
    @Column(name = "COD_AMBITO")
    public abstract String getCodAmbito();

    /**
     * Gets the data inserimento.
     *
     * @return the data inserimento
     */
    @Override
    @Column(name = "D_INSERIMENTO", autoUpdate = AutoUpdate.CURRENT_TIMESTAMP_INSERT)
    public abstract Date getDataInserimento();

    /**
     * Gets the cod operatore.
     *
     * @return the cod operatore
     */
    @Override
    @Column(name = "COD_OPERATORE")
    public abstract Long getCodOperatore();

    /**
     * Gets the cod user aggiorn.
     *
     * @return the cod user aggiorn
     */
    @Override
    @Column(name = "COD_USER_AGGIORN")
    public abstract String getCodUserAggiorn();

    /**
     * Gets the data aggiorn.
     *
     * @return the data aggiorn
     */
    @Override
    @Column(name = "D_AGGIORN", autoUpdate = AutoUpdate.CURRENT_TIMESTAMP)
    public abstract Date getDataAggiorn();

    /**
     * Gets the id documento.
     *
     * @return the id documento
     */
    @Override
    @Column(name = "ID_DOCUMENTO", pk = true, sequenceName = "SEQ_PSLP_T_DOCUMENTO")
    public abstract Long getIdDocumento();

    /**
     * Gets the subcodice.
     *
     * @return the subcodice
     */
    @Override
    @Column(name = "SUBCODICE")
    public abstract Long getSubcodice();

    /**
     * Gets the note operatore.
     *
     * @return the note operatore
     */
    @Override
    @Column(name = "NOTE_OPERATORE")
    public abstract String getNoteOperatore();

    /**
     * Gets the data invio.
     *
     * @return the data invio
     */
    @Override
    @Column(name = "D_INVIO")
    public abstract Date getDataInvio();

    /**
     * Gets the utente.
     *
     * @return the utente
     */
    @Override
    @RelationN1(columnName = "ID_UTENTE")
    public abstract UtenteDBDef getUtente();

    /**
     * Gets the note cittadino.
     *
     * @return the note cittadino
     */
    @Override
    @Column(name = "NOTE_CITTADINO")
    public abstract String getNoteCittadino();

    /**
     * Gets the data inserim.
     *
     * @return the data inserim
     */
    @Override
    @Column(name = "D_INSERIM", autoUpdate = AutoUpdate.CURRENT_TIMESTAMP_INSERT)
    public abstract Date getDataInserim();

    /**
     * Gets the cod user inserim.
     *
     * @return the cod user inserim
     */
    @Override
    @Column(name = "COD_USER_INSERIM")
    public abstract String getCodUserInserim();

    /**
     * Gets the stato documento.
     *
     * @return the stato documento
     */
    @Override
    @RelationN1(columnName = "COD_STATO_DOCUMENTO")
    public abstract StatoDocumentoDBDef getStatoDocumento();

    /**
     * Gets the gruppo operatore.
     *
     * @return the gruppo operatore
     */
    @Override
    @Column(name = "GRUPPO_OPERATORE")
    public abstract String getGruppoOperatore();

    /**
     * Gets the cf operatore.
     *
     * @return the cf operatore
     */
    @Override
    @Column(name = "CF_OPERATORE")
    public abstract String getCfOperatore();

    /**
     * Gets the cod estensione.
     *
     * @return the cod estensione
     */
    @Override
    @Column(name = "COD_ESTENSIONE_DOC")
    public abstract String getCodEstensione();

    /**
     * Gets the id sil lav sap did.
     *
     * @return the id sil lav sap did
     */
    @Override
    @Column(name = "ID_SIL_LAV_SAP_DID")
    public abstract Long getIdSilLavSapDid();

    @Override
    @Column(name = "ID_SILP_RICH_COLL_MIR")
    public abstract Long getIdSilpRichCollMir();

} // fine classe
