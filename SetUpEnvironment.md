| Component              | Status      | Details                           |
| ---------------------- | ----------- | --------------------------------- |
| **Java**               | ✅ Installed | Java 17 (✓)                       |
| **Maven**              | ✅ Installed | 3.9.9 (✓)                         |
| **XAMPP**              | ✅ Running   | Apache + MySQL (✓)                |
| **OrangeHRM**          | ✅ Installed | Running on `http://localhost/...` |
| **IntelliJ / VS Code** | ✅           | You’re using VS Code (✓)          |
| **Browser**            | ✅           | Chrome installed                  |

✅ Why Not Hardcode the URL?

Hardcoding the URL in your Java classes (BaseTest) makes it:

Difficult to switch environments (dev, staging, prod)

Not reusable for parallel teams

Error-prone if URL changes

Against clean automation framework design

✅ Let’s Fix It with config.properties
🔹 Step 1: Create config.properties

📁 Path:
src/main/resources/config.properties

📝 Content:
base.url=http://localhost/orangehrm/web/index.php/auth/login
browser=chrome