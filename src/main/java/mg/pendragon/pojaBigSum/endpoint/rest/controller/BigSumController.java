package mg.pendragon.pojaBigSum.endpoint.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
public class BigSumController {

   @GetMapping("/big-sum")
   public BigInteger bigSum(@RequestParam BigInteger a, @RequestParam BigInteger b) {
       return a.add(b);
   }
}