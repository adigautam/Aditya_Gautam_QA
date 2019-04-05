Ormuco Tech Test Assignment

Task Description: Ormuco Invalid Login E2E Automation Test

Solution Description: The provided solution is a behavior driven test which logs in the Ormuco's UAT environment with invalid username and/or password. As per the expected system behavior, user should get an error message as "The user or password is incorrect."

Technology stack:

1. Java
2. Selenium Webdriver
3. TestNG Framework

To start testing:
1. Install TestNg from http://beust.com/eclipse/
2. Run command from Eclipse from projects home directory
3. Once test is complete report can be found under test-output folder

Reasons to select Selenium WebDriver:
(i)	Selenium is open source and does not require any licensing
(ii)	Selenium supports up to 5 major languages – Java, Python, C#, Ruby and JavaScript
(iii)	Selenium can operate and support across multiple Operating Systems (OS) like Windows, Mac, Linux, UNIX, etc.
(iv)	Support across browsers: Selenium provides support across multiple browsers, namely, Internet Explorer, Chrome, Firefox, Opera, Safari, etc.
(v)	Selenium integrates with programming languages and various frameworks. For instance, it can integrate with ANT or Maven type of framework for source code compilation. Further, it can integrate with TestNG testing framework for testing applications and reporting purposes. It can integrate with Jenkins or Hudson for Continuous Integration (CI) and can even integrate with other licensed or open source tools to supports other features.

Reasons for not selecting other automation tools like UFT:
(i)	QTP does not support web-based applications, though the latest version of UFT does support the web-based applications
(ii)	Cost is high due to licensing cost
(iii)	We can’t run multiple instances, like the Grid support available in Selenium, where we can run multiple instances of the application on different browsers concurrently
(iv)	Slow in execution when compared to open source tools like Selenium.
(v)	Extended support/maintenance is available only after license renewal
(vi)	Need to buy different add-ins for Java, Oracle, SAP, .Net, Seibel, Peoplesoft etc.

Framework Used:

The framework used is Behavior Driven Development and as part of the BDD framework, I have created –

(i)	Page Objects Model (POM) – Page objects have been created for login process which defines the class & methods and stores all the locator and respective methods to reuse them. This has helped in scripts readability, easy maintenance and 100% scripts reusability
(ii)	TestNG Framework – TestNG framework has been used to test the script, using annotations like @BeforeTest, @Test, @AfterTest
(iii)	Parameterization – Parameterization has been used for cross browser testing using TestNG and parameters have been passed through XML. Further enhancement can be done to pass values through XLS for login credentials, browser type, URLs (environments – Dev, QA, UAT, Staging, PROD)
(iv)	The script is open ended and provides the user an option to input test data, for example – login credentials, browser type, URLs (environments – Dev, QA, UAT, Staging, PROD)
(v)	The current automation script has feature to generate system generated test log using the TestNG. The test logs are stored in test-output folder. Further enhancements can be done to generate custom test logs using Log4j
(vi)	Waits – Implicit waits have been used in the script as the application bound information was not available. We can use explicit waits once we have the application bound details which will further reduce the execution time
(vii)	Cross Browser Test – Currently cross browser test script has been generated using @Parameters. If required, Selenium Grid can be used for multi browsing for E2E Automation Test, which will further help in developing automation framework using Cucumber and Gherkin
(viii)	Future Maintenance – Auto kick can be implemented to trigger automation testing once a new built is pushed to the respective environment (Dev, QA, UAT, Staging, PROD)



