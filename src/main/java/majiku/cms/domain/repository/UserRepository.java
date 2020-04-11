package majiku.cms.domain.repository;

import majiku.cms.domain.models.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface UserRepository extends ReactiveMongoRepository<User,String> {}
