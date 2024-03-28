package CurrencyConversionService.CurrencyConversionServiceProject.Entity;

import java.math.BigDecimal;


public class CurrencyConversion {

    private int id;
    private String from;
    private String to;

    private BigDecimal convenrsionMultiple;
    private BigDecimal quantity;

    private BigDecimal totalCalculatedQty;

    public CurrencyConversion(int id, String from, String to, BigDecimal convenrsionMultiple, BigDecimal quantity, BigDecimal totalCalculatedQty) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.convenrsionMultiple = convenrsionMultiple;
        this.quantity = quantity;
        this.totalCalculatedQty = totalCalculatedQty;
    }
    public CurrencyConversion(){}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConvenrsionMultiple() {
        return convenrsionMultiple;
    }

    public void setConvenrsionMultiple(BigDecimal convenrsionMultiple) {
        this.convenrsionMultiple = convenrsionMultiple;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalCalculatedQty() {
        return totalCalculatedQty;
    }

    public void setTotalCalculatedQty(BigDecimal totalCalculatedQty) {
        this.totalCalculatedQty = totalCalculatedQty;
    }
}
