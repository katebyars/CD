/**
 * Created by Guest on 8/8/17.
 */

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import static spark.Spark.*;

public class App {

    public static void main(String[] args) {
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            ArrayList<CD> allCDs = CD.getAllCDs();
            model.put("allCDs", allCDs);

            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        post("/cds/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();
            String cdArtist = request.queryParams("artist");
            System.out.println(cdArtist);
            String cdAlbum = request.queryParams("title");
            int cdYear = Integer.parseInt(request.queryParams("year"));
            CD cd = new CD(cdArtist, cdAlbum, cdYear);
            return new ModelAndView(model, "display.hbs");
        }, new HandlebarsTemplateEngine());
    }


}
