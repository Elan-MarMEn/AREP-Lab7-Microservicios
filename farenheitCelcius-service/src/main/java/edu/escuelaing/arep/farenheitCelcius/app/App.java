package edu.escuelaing.arep.farenheitCelcius.app;
import static spark.Spark.*;

import edu.escuelaing.arep.farenheitCelcius.app.service.DegreeConvert;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DegreeConvert degreeConvert = new DegreeConvert();

        port(getPort());

        get("/covertFarenheit", (req,res) -> {
            Double resultDegrees = degreeConvert.farenheitToCelsius(Double.parseDouble(req.queryParams("degree")));
            return degreeConvert.defaultOut(resultDegrees);
        });
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 35000;
    }
}
