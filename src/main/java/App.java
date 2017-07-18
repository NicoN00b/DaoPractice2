import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import models.Task;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {
    public static void main(String[] args) { //type “psvm + tab” to autocreate this
        staticFileLocation("/public");

        //get: delete all tasks
//
//        get("/tasks/delete", (req, res) -> {
//            Map<String, Object> model = new HashMap<>();
//            Task.clearAllTasks();
//            return new ModelAndView(model, "success.hbs");
//        }, new HandlebarsTemplateEngine());
//
//
//        //get: show new task form
//        get("/tasks/new", (req, res) -> {
//            Map<String, Object> model = new HashMap<>();
//            return new ModelAndView(model, "task-form.hbs");
//        }, new HandlebarsTemplateEngine());
//
//        //task: process new task form
//        post("/tasks/new", (request, response) -> { //URL to make new task on POST route
//            Map<String, Object> model = new HashMap<>();
//
//            String description = request.queryParams("description");
//            Task newTask = new Task(description);
//            model.put("task", newTask);
//            return new ModelAndView(model, "success.hbs");
//        }, new HandlebarsTemplateEngine());
//
//        //get: show all tasks
//        get("/", (req, res) -> {
//            Map<String, Object> model = new HashMap<>();
//            ArrayList<Task> tasks = Task.getAll();
//            model.put("tasks", tasks);
//
//            return new ModelAndView(model, "index.hbs");
//        }, new HandlebarsTemplateEngine());
//
//        //get: show an individual task
//        get("/tasks/:id", (req, res) -> {
//            Map<String, Object> model = new HashMap<>();
//            int idOfTaskToFind = Integer.parseInt(req.params("id")); //pull id - must match route segment
//            Task foundTask = Task.findById(idOfTaskToFind); //use it to find task
//            model.put("task", foundTask); //add it to model for template to display
//            return new ModelAndView(model, "task-detail.hbs"); //individual task page.
//        }, new HandlebarsTemplateEngine());
//
//        //get: show a form to update a task
//        get("/tasks/:id/update", (req, res) -> {
//            Map<String, Object> model = new HashMap<>();
//            int idOfTaskToEdit = Integer.parseInt(req.params("id"));
//            Task editTask = Task.findById(idOfTaskToEdit);
//            model.put("editTask", editTask);
//            return new ModelAndView(model, "task-form.hbs");
//        }, new HandlebarsTemplateEngine());
//
//        //task: process a form to update a task
//        post("/tasks/:id/update", (req, res) -> { //URL to make new task on POST route
//            Map<String, Object> model = new HashMap<>();
//            String newContent = req.queryParams("description");
//            int idOfTaskToEdit = Integer.parseInt(req.params("id"));
//            Task editTask = Task.findById(idOfTaskToEdit);
//            editTask.update(newContent);
//            return new ModelAndView(model, "success.hbs");
//        }, new HandlebarsTemplateEngine());
//
//        //get: delete an individual task
//        get("/tasks/:id/delete", (req, res) -> {
//            Map<String, Object> model = new HashMap<>();
//            int idOfTaskToDelete = Integer.parseInt(req.params("id")); //pull id - must match route segment
//            Task deleteTask = Task.findById(idOfTaskToDelete); //use it to find task
//            deleteTask.deleteTask();
//            return new ModelAndView(model, "success.hbs");
//        }, new HandlebarsTemplateEngine());
//


    }
}
