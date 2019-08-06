1. Install java(latest version would work "1.8.0_181") and setup path in environment variable. 
Windows - follow steps here - https://confluence.atlassian.com/conf59/setting-the-java_home-variable-in-windows-792499849.html 
    And Mac - https://www.java.com/en/download/
2. Install maven(latest would work 3.6.1) OR follow this url - https://www.toolsqa.com/java/maven/how-to-install-maven-eclipse-ide/ and setup environment variable in system(Windows - https://www.tutorialspoint.com/maven/maven_environment_setup.htm)
3. Download chromedriver - https://chromedriver.chromium.org/downloads. If you have chrome version 75 on your machine, then please download chrome driver 75 only.
4. Change chrome driver path in the `SampleTest.java`
4. Download and setup eclipse
5. Download git project and unzip in your drive
6. Open command prompt and go to project root directory, run command mvn eclipse:eclipse
7. Import project in your eclispe 
8. If you want to run as testng, download testng plugin in the IDE.
9. Run test:
   1. Right click on testng suite xml file > Run As > testng suite.
   2. Command line - mvn install, mvn test.
