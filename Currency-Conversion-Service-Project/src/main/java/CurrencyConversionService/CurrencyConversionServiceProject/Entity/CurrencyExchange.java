package CurrencyConversionService.CurrencyConversionServiceProject.Entity;

import java.math.BigDecimal;

public class CurrencyExchange {

    private  Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;

    public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }

    public CurrencyExchange(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public BigDecimal getMultipleConversion() {
        return conversionMultiple;
    }

    public void setMultipleConversion(BigDecimal multipleConversion) {
        this.conversionMultiple = multipleConversion;
    }
}
