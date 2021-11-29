/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The Class EsitoDTO.
 */
public class EsitoDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;
  
  /** The e0000 codice esito positivo. */
  public static String E0000_CODICE_ESITO_POSITIVO = "E0000";
  
  /** The e0008 dati obbligatori non valorizzati. */
  public static String E0008_DATI_OBBLIGATORI_NON_VALORIZZATI = "E0008";
  
  /** The e0009 parametri non corretti. */
  public static String E0009_PARAMETRI_NON_CORRETTI = "E0009";
  
  /** The e0010 errore esecuzione. */
  public static String E0010_ERRORE_ESECUZIONE = "E0010";
  
  /** The e0100 disponibilita esaurita. */
  public static String E0100_DISPONIBILITA_ESAURITA = "E0100";
  
  /** The e0101 erogazione in data futura. */
  public static String E0101_EROGAZIONE_IN_DATA_FUTURA = "E0101";
  
  /** The e0102 modifica incontro in stato finale. */
  public static String E0102_MODIFICA_INCONTRO_IN_STATO_FINALE = "E0102";
  
  /** The e9000 errore di configurazione. */
  public static String E9000_ERRORE_DI_CONFIGURAZIONE = "E9000";
  
  /** The s0001 errore di sistema. */
  public static String S0001_ERRORE_DI_SISTEMA = "S0001";

  /** The map messaggi. */
  protected static Map<String, String> _mapMessaggi = null;
  
  static {
    _mapMessaggi = new HashMap<String, String>();
    _mapMessaggi.put(E0000_CODICE_ESITO_POSITIVO, "Operazione eseguita correttamente");
    _mapMessaggi.put(E0008_DATI_OBBLIGATORI_NON_VALORIZZATI, "Dati obbligatori non valorizzati");
    _mapMessaggi.put(E0009_PARAMETRI_NON_CORRETTI, "Parametri non corretti");
    _mapMessaggi.put(E0010_ERRORE_ESECUZIONE, "Errore nell'esecuzione del flusso dell'operazione");
    _mapMessaggi.put(E0100_DISPONIBILITA_ESAURITA, "Disponibilita' esaurita per lo slot");
    _mapMessaggi.put(E9000_ERRORE_DI_CONFIGURAZIONE,"Errore di configurazione sistema");
    _mapMessaggi.put(S0001_ERRORE_DI_SISTEMA, "Errore generico di sistema");
  }
  
  /** The esito positivo. */
  private boolean esitoPositivo = true;

  /** The codice esito. */
  private String codiceEsito = null;
  
  /** The descrizione esito. */
  private String descrizioneEsito = null;
  
  /** The dettagli esito. */
  private List<String> dettagliEsito = new ArrayList<String>();
  
  /**
   * Imposta esito di errore.
   *
   * @param codiceEsito the codice esito
   * @param message the message
   */
  public void impostaEsitoDiErrore(String codiceEsito, String message) {
    this.codiceEsito = codiceEsito;
    setDescrizioneEsito(message);
    addErrorMessage(message);
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("EsitoWS [esitoPositivo=");
    builder.append(esitoPositivo);
    builder.append(", ");
    if (codiceEsito != null) {
      builder.append("codiceEsito=");
      builder.append(codiceEsito);
      builder.append(", ");
    }
    if (descrizioneEsito != null) {
      builder.append("descrizioneEsito=");
      builder.append(descrizioneEsito);
      builder.append(", ");
    }
    if (dettagliEsito != null) {
      builder.append("dettagliEsito=");
      builder.append(dettagliEsito);
    }
    
    builder.append("]");
    return builder.toString();
  }

  /**
   * Checks if is esito positivo.
   *
   * @return true, if is esito positivo
   */
  public boolean isEsitoPositivo() {
    return esitoPositivo;
  }

  /**
   * Sets the esito positivo.
   *
   * @param esitoPositivo the new esito positivo
   */
  public void setEsitoPositivo(boolean esitoPositivo) {
    this.esitoPositivo = esitoPositivo;
  }

  /**
   * Gets the codice esito.
   *
   * @return the codice esito
   */
  public String getCodiceEsito() {
    return codiceEsito;
  }

  /**
   * Sets the codice esito.
   *
   * @param codiceEsito the new codice esito
   */
  public void setCodiceEsito(String codiceEsito) {
    this.codiceEsito = codiceEsito;
  }

  /**
   * Gets the descrizione esito.
   *
   * @return the descrizione esito
   */
  public String getDescrizioneEsito() {
    return descrizioneEsito;
  }

  /**
   * Sets the descrizione esito.
   *
   * @param descrizioneEsito the new descrizione esito
   */
  public void setDescrizioneEsito(String descrizioneEsito) {
    this.descrizioneEsito = descrizioneEsito;
  }

  /**
   * Gets the dettagli esito.
   *
   * @return the dettagli esito
   */
  public List<String> getDettagliEsito() {
    return dettagliEsito;
  }

  /**
   * Sets the dettagli esito.
   *
   * @param dettagliEsito the new dettagli esito
   */
  public void setDettagliEsito(List<String> dettagliEsito) {
    this.dettagliEsito = dettagliEsito;
  }
  
  //Aggiunge un messaggio all'elenco di errori.
  //Ricopia in un nuovo array i messaggi gia' presenti
  //Aggiunge in coda il messaggio in input al metodo
  /**
   * Adds the message.
   *
   * @param message the message
   */
  //Riassegna il nuovo elenco a quello dell'esito
  public void addMessage(String message) {
    dettagliEsito.add(message);
  }
  
  /**
   * Adds the error message.
   *
   * @param message the message
   */
  //Aggiunge un messaggio e imposta l'esito a negativo
  public void addErrorMessage(String message) {
    esitoPositivo = false;
    addMessage(message);
  }

}
