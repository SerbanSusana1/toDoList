package org.fasttrackit.service;

import org.fasttrackit.domain.ToDoItem;
import org.fasttrackit.persistence.ToDoItemRepository;
import org.fasttrackit.transfer.SaveToDoItemRequest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class ToDoItemService {

    private ToDoItemRepository  toDoItemRepository =new ToDoItemRepository();

    public  void createToDoItem(SaveToDoItemRequest request) throws SQLException, IOException, ClassNotFoundException {
        System.out.println("Creating toDoItem: "+ request);

        // delegating db interaction to repositpry (single - responsability principle)
        toDoItemRepository.createToDoItem(request.getDescription(),request.getDeadline());
    }

    public List<ToDoItem> getToDoItems() throws  SQLException,IOException, ClassNotFoundException {

        System.out.println("Retrieving toDoItemm...");
        return toDoItemRepository.getToDoItems();
    }
    public  void deleteToDoItem(long id) throws SQLException, IOException, ClassNotFoundException{

        System.out.println("Deleting toDoItem ; "+ id);
    }
}
