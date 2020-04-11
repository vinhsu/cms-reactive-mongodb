package majiku.cms.domain.repository;

import majiku.cms.domain.models.News;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface NewsRepository extends ReactiveMongoRepository<News,String> {
}