# Trivago Automation Script

## Overview
This automation script uses Selenium WebDriver with Java to interact with the Trivago website. The script searches for hotels in Paris, selects check-in and check-out dates, updates the number of guests, applies filters, and extracts hotel details.

## Features
- Opens the Trivago website and maximizes the window
- Searches for hotels in Paris
- Selects check-in and check-out dates
- Updates the number of guests
- Applies a 4-star hotel filter
- Extracts and displays the hotel name
- Clicks on the champion deal

## Prerequisites
- Java Development Kit (JDK) installed
- Selenium WebDriver
- Chrome browser installed
- ChromeDriver matching the browser version

## Setup Instructions
1. Install Java and set up environment variables.
2. Download and set up Selenium WebDriver.
3. Download the appropriate ChromeDriver from [ChromeDriver](https://sites.google.com/chromium.org/driver/).
4. Place ChromeDriver in the system path or specify its location in your script.
5. Import Selenium dependencies in your Java project.
6. Clone this repository and open the project in an IDE (e.g., Eclipse, IntelliJ IDEA).

## How to Run the Script
1. Open the terminal or command prompt.
2. Navigate to the project directory.
3. Compile and run the Java file:
   ```sh
   javac trivago.java
   java ui.trivago
   ```
4. The script will execute and print the extracted hotel name in the console.

## Expected Output
- The hotel name will be displayed in the console.
- A champion deal will be clicked automatically.
- The browser session will close after execution.

## Notes
- Ensure Trivago’s website layout has not changed, as XPath locators might need updates.
- Update ChromeDriver whenever the Chrome browser is updated.
- Add appropriate exception handling to manage errors during execution.

## License
This project is for educational purposes only. Use it responsibly.

