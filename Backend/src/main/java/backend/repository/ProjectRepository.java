package backend.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import backend.entity.ProjectEntity;

@RepositoryRestResource(collectionResourceRel = "projects", path = "projects")
public interface ProjectRepository extends MongoRepository<ProjectEntity, String> {
	List<ProjectEntity> findByName(@Param("name") String name);
}
