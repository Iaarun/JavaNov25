package testNgdemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailed implements IRetryAnalyzer {
    int count = 0;
    int retryLimit = 3;

    @Override
    public boolean retry(ITestResult result) {
        if (count < retryLimit) {
            count++;
            return true; // Retry the test
        }
        return false; // Do not retry the test
    }
}
