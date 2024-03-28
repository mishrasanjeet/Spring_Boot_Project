package CurrencyConversionService.CurrencyConversionServiceProject.Controller;

import CurrencyConversionService.CurrencyConversionServiceProject.CurrencyExchangeProxy;
import CurrencyConversionService.CurrencyConversionServiceProject.Entity.CurrencyConversion;
import CurrencyConversionService.CurrencyConversionServiceProject.Entity.CurrencyExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class ConversionController {

    @Autowired
    private CurrencyExchangeProxy proxy;

    @GetMapping("/Currency-Conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion getConversion(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity){
         CurrencyExchange conversion=proxy.getCurrencyExchange(from,to);
        return new CurrencyConversion(10004,from,to,conversion.getMultipleConversion()!=null?conversion.getMultipleConversion():BigDecimal.ONE,quantity,quantity.multiply(conversion.getMultipleConversion()!=null?conversion.getMultipleConversion():BigDecimal.ONE));
    }
}
