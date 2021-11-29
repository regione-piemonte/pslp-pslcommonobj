/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

//classe generata automaticamente da generator.strategy.DTOJediStrategy
package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * The Class MessaggioUtenteDTO.
 */
public class MessaggioUtenteDTO implements Serializable {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The id messaggio utente. */
    // campo chiave primaria
    private Long idMessaggioUtente = null;

    /** The id messaggio. */
    private Long idMessaggio = null;

    /** The d invio. */
    private Date dInvio = null;

    /** The oggetto. */
    private String oggetto = null;

    /** The evento. */
    // campo chiave esterna verso la colonna ID_EVENTO della tabella PSLP_T_EVENTO
    private EventoDTO evento = null;

    /** The testo. */
    private String testo = null;

    /** The flg letto. */
    private String flgLetto = null;

    /** The id sil rif ambito. */
    private Long idSilRifAmbito;

    /** The email mittente. */
    private String emailMittente;

    /** The email destinatario. */
    private String emailDestinatario;

    /**
     * Gets the id messaggio.
     *
     * @return the id messaggio
     */
    public Long getIdMessaggio() {
        return idMessaggio;
    }

    /**
     * Gets the d invio.
     *
     * @return the d invio
     */
    public Date getDInvio() {
        return dInvio;
    }

    /**
     * Gets the oggetto.
     *
     * @return the oggetto
     */
    public String getOggetto() {
        return oggetto;
    }

    /**
     * Gets the testo.
     *
     * @return the testo
     */
    public String getTesto() {
        return testo;
    }

    /**
     * Gets the flg letto.
     *
     * @return the flg letto
     */
    public String getFlgLetto() {
        return flgLetto;
    }

    /**
     * Sets the id messaggio.
     *
     * @param idMessaggio the new id messaggio
     */
    public void setIdMessaggio(Long idMessaggio) {
        this.idMessaggio = idMessaggio;
    }

    /**
     * Sets the d invio.
     *
     * @param dInvio the new d invio
     */
    public void setDInvio(Date dInvio) {
        this.dInvio = dInvio;
    }

    /**
     * Sets the oggetto.
     *
     * @param oggetto the new oggetto
     */
    public void setOggetto(String oggetto) {
        this.oggetto = oggetto;
    }

    /**
     * Sets the testo.
     *
     * @param testo the new testo
     */
    public void setTesto(String testo) {
        this.testo = testo;
    }

    /**
     * Sets the flg letto.
     *
     * @param flgLetto the new flg letto
     */
    public void setFlgLetto(String flgLetto) {
        this.flgLetto = flgLetto;
    }

    /**
     * Gets the id messaggio utente.
     *
     * @return the id messaggio utente
     */
    public Long getIdMessaggioUtente() {
        return idMessaggioUtente;
    }

    /**
     * Sets the id messaggio utente.
     *
     * @param idMessaggioUtente the new id messaggio utente
     */
    public void setIdMessaggioUtente(Long idMessaggioUtente) {
        this.idMessaggioUtente = idMessaggioUtente;
    }

    /**
     * Gets the id sil rif ambito.
     *
     * @return the id sil rif ambito
     */
    public Long getIdSilRifAmbito() {
        return idSilRifAmbito;
    }

    /**
     * Sets the id sil rif ambito.
     *
     * @param idSilRifAmbito the new id sil rif ambito
     */
    public void setIdSilRifAmbito(Long idSilRifAmbito) {
        this.idSilRifAmbito = idSilRifAmbito;
    }

    /**
     * Gets the email mittente.
     *
     * @return the email mittente
     */
    public String getEmailMittente() {
        return emailMittente;
    }

    /**
     * Sets the email mittente.
     *
     * @param emailMittente the new email mittente
     */
    public void setEmailMittente(String emailMittente) {
        this.emailMittente = emailMittente;
    }

    /**
     * Gets the email destinatario.
     *
     * @return the email destinatario
     */
    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    /**
     * Sets the email destinatario.
     *
     * @param emailDestinatario the new email destinatario
     */
    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }

    /**
     * Gets the evento.
     *
     * @return the evento
     */
    public EventoDTO getEvento() {
        return evento;
    }

    /**
     * Sets the evento.
     *
     * @param evento the new evento
     */
    public void setEvento(EventoDTO evento) {
        this.evento = evento;
    }

    /**
     * Gets the keys.
     *
     * @return the keys
     */
    public Object[] getKeys() {
        return new Object[] { idMessaggio };
    }

    /**
     * Gets the dto for test.
     *
     * @return the dto for test
     */
    public static MessaggioUtenteDTO getDtoForTest() {
        return new MessaggioUtenteDTO();
    }
} // fine classe
