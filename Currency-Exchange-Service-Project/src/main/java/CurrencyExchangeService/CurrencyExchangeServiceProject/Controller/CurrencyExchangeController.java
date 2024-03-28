package CurrencyExchangeService.CurrencyExchangeServiceProject.Controller;

import CurrencyExchangeService.CurrencyExchangeServiceProject.Entity.CurrencyExchange;
import CurrencyExchangeService.CurrencyExchangeServiceProject.Repository.ExchangeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private ExchangeRepo repo;
    @GetMapping("/Currency-Exchange/from/{from}/to/{to}")
    public  CurrencyExchange getCurrencyExchange(@PathVariable String from,@PathVariable String to){
        CurrencyExchange exchange=repo.findByFromAndTo(from,to);
     return exchange;
    }
}
