package Limitservicemicroservice.Limitmicroservice.Controller;

import Limitservicemicroservice.Limitmicroservice.Configuration.Configuration;
import Limitservicemicroservice.Limitmicroservice.Entiry.Limit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {
    @Autowired
    private Configuration config;


    @GetMapping("/getLimits")
    public Limit getLimit(){
        return new Limit(config.getMinimum(),config.getMaximum());
    }
}
