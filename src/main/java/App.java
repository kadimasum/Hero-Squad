import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class App {
    public static void main(String[] args){
        staticFileLocation("/public");
        get("/", (request, response) ->{
            return new ModelAndView(new HashMap(), "layout.hbs");
        }, new HandlebarsTemplateEngine());

        get("/home", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "home.hbs");
        }, new HandlebarsTemplateEngine());

        get("/hero", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "hero.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squad",(request, response) -> {
            return new ModelAndView(new HashMap<>(), "squad.hbs");
        }, new HandlebarsTemplateEngine());

        get("/allSquads",(request, response) -> {
            return new ModelAndView(new HashMap<>(), "allSquads.hbs");
        }, new HandlebarsTemplateEngine());

        get("/allHeroes",(request, response) -> {
            return new ModelAndView(new HashMap<>(), "allHeroes.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
