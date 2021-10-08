package webServer.tongueTwister;


import webServer.tongueTwister.Repository.TongueTwisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/rest/tongueTwister")


public class TongueTwistersResourse {
   @Autowired
   TongueTwisterRepository tongueTwisterRepository;

   @GetMapping(value = "/countOfAllIds")
   public long getAll() {
      return tongueTwisterRepository.count();
   }

   @GetMapping(value = "/first")
   public TongueTwisters getFirst() {
      return tongueTwisterRepository.findAll().get(0);
   }

   @GetMapping(value = "/{tongueTwisterId}")
   public String getNthTongueTwister(@PathVariable Integer tongueTwisterId) {
      return tongueTwisterRepository.getOne(tongueTwisterId).getContent();
   }
}
