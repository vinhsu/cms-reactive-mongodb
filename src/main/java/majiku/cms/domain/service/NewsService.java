package majiku.cms.domain.service;

import org.springframework.stereotype.Service;
import majiku.cms.domain.repository.NewsRepository;

@Service
public class NewsService {

  private final NewsRepository newsRepository;

  public NewsService(NewsRepository newsRepository) {
    this.newsRepository = newsRepository;
  }

}
