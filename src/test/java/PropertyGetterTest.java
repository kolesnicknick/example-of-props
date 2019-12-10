import org.junit.jupiter.api.Test;

public class PropertyGetterTest {
    @Test
    public void testForProperties(){
        System.out.println(new FileProperties().getSafeVar("year", "2019"));
        System.out.println(new FileProperties().getSafeVar("admin_user", "adminkelle"));

        System.out.println(new EnvironmentVarGetter().getSafeVar("runOn", "local"));
        System.out.println(new EnvironmentVarGetter().getRunOn());
    }
}
