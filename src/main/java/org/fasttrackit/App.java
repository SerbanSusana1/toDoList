package org.fasttrackit;

import org.fasttrackit.persistence.ToDoItemRepository;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, IOException, ClassNotFoundException {

        ToDoItemRepository toDoItemRepository = new ToDoItemRepository();
        toDoItemRepository.createToDoItem("Learn Java",
                LocalDateTime.now().plusMonths(6));

        System.out.println( toDoItemRepository.getToDoItem());
    }
}
