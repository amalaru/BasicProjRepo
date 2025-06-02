import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;


//import Util.RestAssuredUtil.*;


public class BaseTest {

    public Response resp = null;
    public JsonPath js = null;
    @BeforeTest
    public void setup() {

        Util.RestAssuredUtil.setBaseURI();
        Util.RestAssuredUtil.setBasePath("api");
        Util.RestAssuredUtil.setContentTyp(ContentType.JSON);

    }
}
