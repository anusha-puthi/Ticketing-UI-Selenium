# Ticketing-UI-Selenium

For Ticketing UI tests I have used seelnium java with Integrated POM Bdd cucumber framework.I have created following folders and files to achieve this
1.Features files - describes the scenarios in Gherkin sentences.
2.Stepdefs-->Stepdefinitions - describes each gherkin sentence with selenium java code
3.Utils Class- common methods.
4.Page classes - represents java class with Webelements locators and opertaional methods.
5.Properties file - for generic information like Base Url etc.
7.Base class -  code to invoke brower driver and create browser instance and tear down method(close browser).
6.Test Runner - for invoking feature files and step definitions.
