package webServer.tongueTwister.Repository;

import webServer.tongueTwister.TongueTwisters;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TongueTwisterRepository  extends JpaRepository<TongueTwisters,Integer> {
}
