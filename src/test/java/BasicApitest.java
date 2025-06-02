import Util.RestAssuredUtil;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicApitest extends BaseTest
{
@Test
    public void TestOne() {

    resp = RestAssuredUtil.getResponse("/gen/clients/android");
    js = RestAssuredUtil.getJsonpath(resp);
    Assert.assertEquals(resp.getStatusCode(),200);
    System.out.println("Opt: " + js.get("sourceFolder.opt"));
    System.out.println("Description: " + js.get("sourceFolder.description"));
    System.out.println("Type: " + js.get("sourceFolder.type"));
}
}
