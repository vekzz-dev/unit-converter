# Changelog

All notable changes to this project will be documented in this file.

## [1.0.0] - 2025-09-07

### feat(core)

- Implement the main `UnitConverterApplication` class (`a1828e5`).

### feat(web-ui)

- Add `theme.js` for web UI theme functionality (`f79319a`).
- Add `styles.css` for global web UI styling (`89a69e5`).

### feat(config)

- Add `application.properties` for Spring Boot configuration (`716c383`).

### feat(weight-conversion)

- Add `weight.html` template for the weight conversion user interface (`fac44d0`).
- Create `WeightController` to expose weight conversion API endpoints (`5a0f3ef`).
- Implement `WeightService` for performing weight conversions (`d5e74cf`).
- Define `WeightUnit` enumeration for supported weight types (`042a3df`).

### feat(temperature-conversion)

- Add `temperature.html` template for the temperature conversion user interface (`57f23d3`).
- Create `TemperatureController` to expose temperature conversion API endpoints (`88cd4b4`).
- Implement `TemperatureService` for performing temperature conversions (`254254c`).
- Define `TemperatureUnit` enumeration for supported temperature types (`1b5a8d2`).

### feat(distance-conversion)

- Add `distance.html` template for the distance conversion user interface (`ed70270`).
- Create `DistanceController` to expose distance conversion API endpoints (`1697d41`).
- Implement `DistanceService` for performing distance conversions (`cf141e2`).
- Define `DistanceUnit` enumeration for supported distance types (`3d0455c`).

### test(core)

- Add initial `UnitConverterApplicationTests` for core functionality (`ef64030`).

### docs(readme)

- Add initial `README.md` for Unit Converter (`a987cb7`).
- Add screenshots for weight, temperature, distance, and dark mode (`f799c20`).

### docs(changelog)

- Add `CHANGELOG.md` based on commit history (`550b9d0`).
- Update `CHANGELOG.md` to include all latest commits (`d7ed902`)

### chore(project-setup)

- Initialize project with essential configuration files and Maven wrapper (`a241c46`).
- Add MIT License (`3b56e1a`).
