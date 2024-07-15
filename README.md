# sparkrock-tausif-assessment-QA

This project is an automated test suite for the login functionality of the [DemoBlaze](https://www.demoblaze.com/) web application using Selenium WebDriver and TestNG.

## Table of Contents
- [Installation](#installation)
- [Usage](#usage)
- [Tests](#tests)
- [Contributing](#contributing)
- [License](#license)

## Installation

1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/SparkRockAssessment.git
    cd SparkRockAssessment
    ```

2. **Install Maven**: 
   Ensure Maven is installed on your system. If not, download and install it from [Maven's official site](https://maven.apache.org/download.cgi).

3. **Install Dependencies**:
    ```bash
    mvn clean install
    ```

## Usage

1. **Run Tests**:
    To execute the test suite, run the following command:
    ```bash
    mvn test
    ```

2. **Test Reports**:
    After running the tests, reports will be generated in the `target/surefire-reports` directory.

## Tests

The test suite includes the following tests for the login functionality:

- **Successful Login Test**: Verifies that a user can log in with valid credentials.
- **Unsuccessful Login Test**: Verifies that a user cannot log in with invalid credentials and the appropriate error message is displayed.

### Test Files

- `src/main/java/com/sparkrock/tausif/pages/LoginPage.java`: Contains the page object model for the login page.
- `src/test/java/com/sparkrock/tausif/tests/LoginTest.java`: Contains the test cases for the login functionality.
- `src/test/java/com/sparkrock/tausif/tests/BaseTest.java`: Contains the setup and teardown methods for the tests.

## Contributing

1. **Fork the repository**.
2. **Create a new branch**:
    ```bash
    git checkout -b feature/your-feature-name
    ```
3. **Make your changes**.
4. **Commit your changes**:
    ```bash
    git commit -m "Add your commit message here"
    ```
5. **Push to the branch**:
    ```bash
    git push origin feature/your-feature-name
    ```
6. **Open a pull request**.
