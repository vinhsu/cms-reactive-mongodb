package majiku.cms.domain.repository;

import majiku.cms.domain.models.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CategoryRepository extends ReactiveMongoRepository<Category,String> {
}
