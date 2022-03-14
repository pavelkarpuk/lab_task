package test;

import org.hamcrest.MatcherAssert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.TestListener;

//@Listeners({TestListener.class})
public class RandomTest {

    @Test(groups = {"main"})
    public void myFirstTest() {
        MatcherAssert.assertThat("Hi", false);
    }

    @Test(groups = {"main"})
    public void mySecondTest() {
        MatcherAssert.assertThat("Hi", true);
    }

    @Test(groups = {"main"})
    public void myThirdTest() {
        MatcherAssert.assertThat("Hi", false);
    }

    @Test(groups = {"main"})
    public void myFourthTest() {
        MatcherAssert.assertThat("Hi", true);
    }

    @Test(groups = {"main"})
    public void myFifthTest() {
        MatcherAssert.assertThat("Hi", false);
    }

    @Test(groups = {"main"})
    public void mySixthTest() {
        MatcherAssert.assertThat("Hi", true);
    }

    @Test(groups = {"main"})
    public void mySeventhTest() {
        MatcherAssert.assertThat("Hi", false);
    }

    @Test(groups = {"main"})
    public void myEighthTest() {
        MatcherAssert.assertThat("Hi", true);
    }

    @Test(groups = {"main"})
    public void myNinthTest() {
        MatcherAssert.assertThat("Hi", false);
    }

    @Test(groups = {"main"})
    public void myTenthTest() {
        MatcherAssert.assertThat("Hi", true);
    }

    @Test(groups = {"secondary"})
    public void firstTest() {
        MatcherAssert.assertThat("Hi", false);
    }

    @Test(groups = {"secondary"})
    public void secondTest() {
        MatcherAssert.assertThat("Hi", true);
    }

    @Test(groups = {"secondary"})
    public void thirdTest() {
        MatcherAssert.assertThat("Hi", false);
    }

    @Test(groups = {"secondary"})
    public void fourthTest() {
        MatcherAssert.assertThat("Hi", true);
    }

    @Test(groups = {"secondary"})
    public void fifthTest() {
        MatcherAssert.assertThat("Hi", false);
    }

    @Test(groups = {"secondary"})
    public void sixthTest() {
        MatcherAssert.assertThat("Hi", true);
    }

    @Test(groups = {"secondary"})
    public void seventhTest() {
        MatcherAssert.assertThat("Hi", false);
    }

    @Test(groups = {"secondary"})
    public void eighthTest() {
        MatcherAssert.assertThat("Hi", true);
    }

    @Test(groups = {"secondary"})
    public void ninthTest() {
        MatcherAssert.assertThat("Hi", false);
    }

    @Test(groups = {"secondary"})
    public void tenthTest() {
        MatcherAssert.assertThat("Hi", true);
    }
}
