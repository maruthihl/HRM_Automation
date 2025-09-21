🔍 Where Does a Java Selenium Project Start Executing?

🧠 A Java Maven project with TestNG starts from the testng.xml file.

📌 So the execution flow is:
1️⃣ testng.xml
   ⬇️
2️⃣ Points to test classes (e.g., LoginTest)
   ⬇️
3️⃣ TestNG looks for @Test methods in LoginTest
   ⬇️
4️⃣ Before/After methods in BaseTest get executed
   ⬇️
5️⃣ LoginPage → Actions happen via Selenium

🔁 Execution Flow in Your OrangeHRM Project (Example)

Let’s say you want to test login. Here's how it flows:

✅ Step-by-Step:
Step	Class/File	Purpose
1	testng.xml	Entry point – tells TestNG where to go
2	LoginTest.java	Contains your actual test cases
3	BaseTest.java	Handles setup/teardown (WebDriver logic)
4	LoginPage.java	Contains locators + login actions
5	config/util	Optional: Properties reader, data, etc.