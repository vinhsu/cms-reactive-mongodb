package majiku.cms.domain.vo;

import java.util.Set;
import lombok.Data;
import majiku.cms.domain.models.Category;
import majiku.cms.domain.models.Tag;

@Data
public class NewsRequest {

  String title;

  String content;

  Set<Category> categories;

  Set<Tag> tags;

}
