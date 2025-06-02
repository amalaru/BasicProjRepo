package Util;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class RestAssuredUtil {
    //Sets Base URI
    public static void setBaseURI() {
        baseURI = "http://generator.swagger.io/";
    }

    //Sets base path
    public static void setBasePath(String basePathTerm) {
        basePath = basePathTerm;
    }

    //Reset basepath after test
    public static void resetBasePath() {
        basePath = null;
    }

    //Reset BaseURI after test
    public static void resetBaseUri() {
        baseURI = null;
    }

    //set contentType
    public static void setContentTyp(ContentType type) {
        given().contentType(type);

    }

    // Returns response on given path
    public static Response getResponse(String path) {
        return given().get(path);
    }

    // Returns response
    public static Response getResponse() {
        return given().get();
    }
    // return Jsonpath object
    public static JsonPath getJsonpath(Response resp) {
        String js = resp.asString();
        return new JsonPath(js);
    }

}


