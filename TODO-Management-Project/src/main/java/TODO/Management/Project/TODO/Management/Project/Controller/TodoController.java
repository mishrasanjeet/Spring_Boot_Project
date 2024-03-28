package TODO.Management.Project.TODO.Management.Project.Controller;

import TODO.Management.Project.TODO.Management.Project.ENTITY.Todo;
import TODO.Management.Project.TODO.Management.Project.Service.TodoService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TodoController {

    @Autowired
    private TodoService service;

    @PostMapping("todo/created")
    public ResponseEntity<String> createTodo(@RequestBody Todo todo){
        service.createTodo(todo);
        return ResponseEntity.status(HttpStatus.CREATED).body("todo created sucessfull");
    }
    @GetMapping("/Todo/{id}")
    public Todo findBYID(@PathVariable int id){
        return service.findByID(id);
    }
   @GetMapping("/getTodos")
    public List<Todo> findALLTODO(){

        return service.findALLTODO();
    }
    @PutMapping("/deleteTodo/{id}")
    public void deleteTodo(@PathVariable int id){
        service.deleteBYID(id);
    }

    @PatchMapping("/update/{id}")
    public void updateTodo(@RequestBody Todo todo,@PathVariable int id){
        service.updateBYID(id,todo);
    }
}
