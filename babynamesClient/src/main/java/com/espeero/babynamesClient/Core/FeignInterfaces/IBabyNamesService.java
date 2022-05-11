package com.espeero.babynamesClient.Core.FeignInterfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Set;

@FeignClient(name = "BabyNames")
public interface IBabyNamesService {

    @GetMapping("/")
    Set<String> getNames(@RequestParam(name = "namesCount") Integer count);

}
