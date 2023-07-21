$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/flightsearch.feature");
formatter.feature({
  "name": "Flight Search",
  "description": " I want to search flights ",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search for One-Way Flights",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "error_message": "java.lang.IllegalStateException: The driver executable must exist: C:\\org.ticketing.uitests\\drivers\\geckodriver.exe\r\n\tat org.openqa.selenium.internal.Require$FileStateChecker.isFile(Require.java:315)\r\n\tat org.openqa.selenium.remote.service.DriverService.checkExecutable(DriverService.java:144)\r\n\tat org.openqa.selenium.remote.service.DriverService.findExecutable(DriverService.java:139)\r\n\tat org.openqa.selenium.firefox.GeckoDriverService.access$100(GeckoDriverService.java:44)\r\n\tat org.openqa.selenium.firefox.GeckoDriverService$Builder.findDefaultExecutable(GeckoDriverService.java:185)\r\n\tat org.openqa.selenium.remote.service.DriverService$Builder.build(DriverService.java:434)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.toExecutor(FirefoxDriver.java:232)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:186)\r\n\tat org.openqa.selenium.firefox.FirefoxDriver.\u003cinit\u003e(FirefoxDriver.java:164)\r\n\tat utilities.BaseClass.setUp(BaseClass.java:30)\r\n\tat stepdefs.StepDefinitions.invokeBrowser(StepDefinitions.java:41)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I am on the flight search page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.StepDefinitions.i_am_on_the_flight_search_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter \"London Heathrow\" as the departure city",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.StepDefinitions.i_enter_as_the_departure_city(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter \"Dubai\" as the destination city",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.StepDefinitions.i_enter_as_the_destination_city(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I select \"One-way\" as the trip type",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.StepDefinitions.i_select_as_the_trip_type(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on the Search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefs.StepDefinitions.i_click_on_the_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I should see a list of available one-way flights from London to New York",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.StepDefinitions.verifyAvailableFlights(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException: Cannot invoke \"org.openqa.selenium.WebDriver.quit()\" because \"utilities.BaseClass.driver\" is null\r\n\tat utilities.BaseClass.tearDown(BaseClass.java:36)\r\n\tat stepdefs.StepDefinitions.afterScenario(StepDefinitions.java:51)\r\n",
  "status": "failed"
});
});