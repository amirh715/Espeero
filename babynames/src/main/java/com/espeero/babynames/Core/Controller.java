package com.espeero.babynames.Core;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class Controller {

    private static int counter = 0;

    @GetMapping("/")
    public Set<String> getNames(@RequestParam(name = "namesCount") Integer countParam) throws Exception {
        counter++;
        System.out.println("Counter: " + counter + " ### babyNames 1 request ###");
        final int count = countParam != null ? countParam : 10;
        final Set<String> result = NamesList.getNames(count);
        Thread.sleep(1000);
        System.out.println("Counter: " + counter + " ### babyNames 1 response ###");
        return result;
    }

}
