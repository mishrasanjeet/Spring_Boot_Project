package CurrencyExchangeService.CurrencyExchangeServiceProject.Repository;

import CurrencyExchangeService.CurrencyExchangeServiceProject.Entity.CurrencyExchange;
import org.bouncycastle.crypto.examples.JPAKEExample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeRepo extends JpaRepository<CurrencyExchange,Long> {
    CurrencyExchange findByFromAndTo(String from,String to);
}
