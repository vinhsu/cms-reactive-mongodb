package majiku.cms.domain.resources;

import majiku.cms.domain.models.Category;
import majiku.cms.domain.service.CategoryService;
import majiku.cms.domain.vo.CategoryRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/category")
public class CategoryResource {

  private final CategoryService categoryService;

  public CategoryResource(CategoryService categoryService) {
    this.categoryService = categoryService;
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity<Mono<Category>> findOne(@PathVariable("id") String id){
    return ResponseEntity.ok(this.categoryService.findOne(id));
  }

  @GetMapping
  public ResponseEntity<Flux<Category>> findAll(){
    return ResponseEntity.ok(this.categoryService.findAll());
  }

  @PostMapping
  public ResponseEntity<Mono<Category>> newCategory(@RequestBody CategoryRequest category){
    return new ResponseEntity<>(this.categoryService.create(category), HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void removeCategory(@PathVariable("id") String id){
    this.categoryService.delete(id);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Mono<Category>> updateCategory(@PathVariable("id") String id,CategoryRequest category){
    return new ResponseEntity<>(this.categoryService.update(id,category), HttpStatus.OK);
  }

}
