package bo.ucb.ingsoft.practica1;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "actor", path = "actor")
public interface ActorRestRepositort extends PagingAndSortingRepository<Actor, Integer> {
    List<Actor> findByfirstname(@Param("firstname") String firstname);
}
