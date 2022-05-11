package com.espeero.babynamesClient.Core;

import com.espeero.babynamesClient.Core.FeignInterfaces.IBabyNamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/baby")
public class Controller {

    @Autowired
    private IBabyNamesService babyNamesService;

    @GetMapping("/names")
    public Set<String> getNamesFromService(@RequestParam(value = "namesCount", required = false) Integer namesCount) {
        return babyNamesService.getNames(namesCount);
    }

}
