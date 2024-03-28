package TODO.Management.Project.TODO.Management.Project.Repository;

import TODO.Management.Project.TODO.Management.Project.ENTITY.Todo;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepo extends JpaRepository<Todo, Integer> {
}