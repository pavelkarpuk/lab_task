package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    private final Logger log = LogManager.getRootLogger();

    @Override
    public void onTestStart(ITestResult result) {
        if (result.getName().contains("my")) {
            log.info("Test [" + result.getName() + "] start");
        }
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        if (result.getName().contains("my")) {
            log.error("Test [" + result.getName() + "] failed");
            log.error(result.getThrowable());
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        log.info("If there is [my] in the name of the test, the name will be displayed.");
        log.info("If there is [my] in the name of the test and it is broken, [testName failed] will be displayed.");
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }
}
