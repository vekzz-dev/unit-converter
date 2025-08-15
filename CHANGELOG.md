## Changelog

### Features

*   **feat(core)**: Implement the main UnitConverterApplication class.
    *   This commit introduces the primary Spring Boot application class, serving as the entry point for the entire unit conversion service.
*   **feat(distance-conversion)**: Define DistanceUnit enumeration for supported distance types.
    *   This commit introduces the `DistanceUnit` enum, which standardizes the units available for distance conversions (e.g., METERS, KILOMETERS, MILES).
*   **feat(distance-conversion)**: Implement DistanceService for performing distance conversions.
    *   This commit adds the core business logic for converting values between different distance units, encapsulating the conversion formulas.
*   **feat(distance-conversion)**: Create DistanceController to expose distance conversion API endpoints.
    *   This commit provides the RESTful interface for clients to request distance conversions, mapping HTTP requests to the DistanceService.
*   **feat(distance-conversion)**: Add distance.html template for the distance conversion user interface.
    *   This commit introduces the front-end HTML page that allows users to interact with the distance conversion functionality.
*   **feat(temperature-conversion)**: Define TemperatureUnit enumeration for supported temperature types.
    *   This commit introduces the TemperatureUnit enum, which standardizes the units available for temperature conversions (e.g., CELSIUS, FAHRENHEIT, KELVIN).
*   **feat(temperature-conversion)**: Implement TemperatureService for performing temperature conversions.
    *   This commit adds the core business logic for converting values between different temperature units, encapsulating the conversion formulas.
*   **feat(temperature-conversion)**: Create TemperatureController to expose temperature conversion API endpoints.
    *   This commit provides the RESTful interface for clients to request temperature conversions, mapping HTTP requests to the TemperatureService.
*   **feat(temperature-conversion)**: Add temperature.html template for the temperature conversion user interface.
    *   This commit introduces the front-end HTML page that allows users to interact with the temperature conversion functionality.
*   **feat(weight-conversion)**: Define WeightUnit enumeration for supported weight types.
    *   This commit introduces the WeightUnit enum, which standardizes the units available for weight conversions (e.g., KILOGRAMS, POUNDS, OUNCES).
*   **feat(weight-conversion)**: Implement WeightService for performing weight conversions.
    *   This commit adds the core business logic for converting values between different weight units, encapsulating the conversion formulas.
*   **feat(weight-conversion)**: Create WeightController to expose weight conversion API endpoints.
    *   This commit provides the RESTful interface for clients to request weight conversions, mapping HTTP requests to the WeightService.
*   **feat(weight-conversion)**: Add weight.html template for the weight conversion user interface.
    *   This commit introduces the front-end HTML page that allows users to interact with the weight conversion functionality.
*   **feat(config)**: Add application.properties for Spring Boot configuration.
    *   This commit includes the main configuration file for the Spring Boot application, defining server ports, logging, and other essential settings.
*   **feat(web-ui)**: Add styles.css for global web UI styling.
    *   This commit introduces the main stylesheet, providing consistent visual presentation across all web pages of the application.
*   **feat(web-ui)**: Add theme.js for web UI theme functionality.
    *   This commit includes the JavaScript file responsible for client-side interactions related to the application's visual theme or dynamic UI elements.

### Chore

*   **chore(project-setup)**: Initialize project with essential configuration files and Maven wrapper.
    *   This commit sets up the basic project structure, including Git-related configurations and the Maven build system, enabling consistent development and dependency management.

### Tests

*   **test(core)**: Add initial UnitConverterApplicationTests for core functionality.
    *   This commit provides basic test coverage for the main application context, ensuring the application starts correctly.
