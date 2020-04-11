package majiku.cms.domain.vo;

import lombok.Data;
import majiku.cms.domain.models.Role;

@Data
public class UserRequest {

  String identity;

  String name;

  Role role;

}
