public class BoroHomepageTests {
    package travisTAF.tests.homepage;

    import org.testng.annotations.Test;
    import travisTAF.framework.core.BaseTest;
    import travisTAF.pageobjects.homepage.BoroHomepage;

    public class BoroHomepageTests extends BaseTest {

        @Test
        public void homepageTests() {
            BoroHomepage boroHomepage = new BoroHomepage(getDriver());
        }
    }
}
