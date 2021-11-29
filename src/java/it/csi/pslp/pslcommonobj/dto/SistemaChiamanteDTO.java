/********************************************************
 * Copyright Regione Piemonte - 2021					*
 * SPDX-License-Identifier: EUPL-1.2-or-later			*
 ********************************************************/

package it.csi.pslp.pslcommonobj.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

/**
 * The Class SistemaChiamanteDTO.
 */
@JsonIgnoreProperties({"keys"})
public class SistemaChiamanteDTO implements Serializable {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;
  
  /** The codice. */
  private String codice;
  
  /** The descrizione. */
  private String descrizione;
  
  /** The data inizio. */
  private Date dataInizio;
  
  /** The data fine. */
  private Date dataFine;
  
  /** The mail riferimento. */
  private String mailRiferimento;

  /**
   * Gets the codice.
   *
   * @return the codice
   */
  public String getCodice() {
    return codice;
  }

  /**
   * Sets the codice.
   *
   * @param codice the new codice
   */
  public void setCodice(String codice) {
    this.codice = codice;
  }

  /**
   * Gets the descrizione.
   *
   * @return the descrizione
   */
  public String getDescrizione() {
    return descrizione;
  }

  /**
   * Sets the descrizione.
   *
   * @param descrizione the new descrizione
   */
  public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
  }

  /**
   * Gets the data inizio.
   *
   * @return the data inizio
   */
  public Date getDataInizio() {
    return dataInizio;
  }

  /**
   * Sets the data inizio.
   *
   * @param dataInizio the new data inizio
   */
  public void setDataInizio(Date dataInizio) {
    this.dataInizio = dataInizio;
  }

  /**
   * Gets the data fine.
   *
   * @return the data fine
   */
  public Date getDataFine() {
    return dataFine;
  }

  /**
   * Sets the data fine.
   *
   * @param dataFine the new data fine
   */
  public void setDataFine(Date dataFine) {
    this.dataFine = dataFine;
  }

  /**
   * Gets the mail riferimento.
   *
   * @return the mail riferimento
   */
  public String getMailRiferimento() {
    return mailRiferimento;
  }

  /**
   * Sets the mail riferimento.
   *
   * @param mailRiferimento the new mail riferimento
   */
  public void setMailRiferimento(String mailRiferimento) {
    this.mailRiferimento = mailRiferimento;
  }

  /**
   * To string.
   *
   * @return the string
   */
  @Override
  public String toString() {
    return "SistemaChiamanteDTO [codice=" + codice + ", descrizione=" + descrizione + ", dataInizio=" + dataInizio + ", dataFine=" + dataFine + ", mailRiferimento=" + mailRiferimento + "]";
  }


}
