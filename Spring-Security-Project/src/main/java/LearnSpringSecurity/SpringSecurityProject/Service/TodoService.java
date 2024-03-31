package LearnSpringSecurity.SpringSecurityProject.Service;

import LearnSpringSecurity.SpringSecurityProject.ENTITY.Todo;
import LearnSpringSecurity.SpringSecurityProject.Repository.TodoRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {

    @Autowired
    private TodoRepo repo;
    public void createTodo(Todo todo)
    {
        repo.save(todo);
    }

    public void deleteBYID(int id){
        repo.deleteById(id);
    }

    public List<Todo> findALLTODO(){

        return repo.findAll();
    }

    public Todo findByID(int id)
    {

        return repo.findById(id).get();

    }

    public void updateBYID(int id,Todo todo){
        Todo todo1=repo.findById(id).get();
        todo1.setUserName(todo.getUserName());
        todo1.setDescription(todo.getDescription());
        todo1.setTargateDate(todo.getTargateDate());
        todo1.setDone(todo.isDone());
        repo.save(todo1);
    }

}
