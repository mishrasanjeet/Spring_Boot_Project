package CurrencyConversionService.CurrencyConversionServiceProject;

import CurrencyConversionService.CurrencyConversionServiceProject.Entity.CurrencyConversion;
import CurrencyConversionService.CurrencyConversionServiceProject.Entity.CurrencyExchange;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="Currency-Exchange",url = "http://localhost:8000")
@FeignClient(name="Currency-Exchange")
public interface CurrencyExchangeProxy {

    @GetMapping("/Currency-Exchange/from/{from}/to/{to}")
    public CurrencyExchange getCurrencyExchange(@PathVariable String from, @PathVariable String to);
}
