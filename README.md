## SpringEmailApp using Spring Boot, Maven, MySQL, and smtp4dev

This is a simple guide to set up and run an email application using Spring Boot, Maven, MySQL, and the smtp4dev application for receiving emails sent by the Spring Boot application using RESTful API. smtp4dev is a fake SMTP server designed for testing and development purposes.

## Prerequisites

- Java JDK 8+
- Maven
- MySQL
- smtp4dev

## Setup

1. Clone or download the repository to your local machine.

2. Open the project in your favorite IDE { Spring Tool Suite }. 

3. Configure the MySQL Database:
   - Open `src/main/resources/application.properties`.
   - Modify the following properties to match your MySQL configuration:
     ```
     spring.datasource.url=jdbc:mysql://localhost:3306/email_app
     spring.datasource.username=your_mysql_username
     spring.datasource.password=your_mysql_password
     ```

### Database table Strucutre:
![db](https://github.com/nemadeshrikant/SpringEmailApp/assets/36012230/e25636df-8661-4769-a85a-0ae8aa97b47d)


4. Build and Run the Spring Boot Application.

5. Set up smtp4dev:
   - Download and install smtp4dev from [smtp4dev GitHub repository](https://github.com/rnwood/smtp4dev/releases).
   - Start smtp4dev and configure it to listen on a specific port (e.g., 3000).

### SMTP4Dev 
![smtp](https://github.com/nemadeshrikant/SpringEmailApp/assets/36012230/9c26bcf9-9e42-4310-b612-28ed63f26448)



6. Update Email Configuration:
   - Open `src/main/resources/application.properties`.
   - Configure the SMTP settings to point to the smtp4dev server:
     ```
     spring.mail.host=localhost
     spring.mail.port=25
     spring.mail.username=not required
     spring.mail.password=not required
     ```

## Sending and Receiving Emails

1. Send an Email:
   - Use the provided API endpoints to send emails via the Spring Boot application.
   - Update the recipient email address, sender email address , subject and email body in the request payload.
   - Example API endpoint: `POST http://localhost:8080/shrikant/sendEmail`

2. Receive Emails:
   - Open your browser and navigate to the smtp4dev UI (usually `http://localhost:3000`).
   - You will see all the emails that were sent by the Spring Boot application.

## API Endpoints

- `POST /shrikant/sendEmail`: Send an email.
  - Request Body Example:
    ```json
    {
      "recipient": "recipient@example.com",
      "from": "sender@example.com",
      "subject": "Test Email",
      "mailBody": "This is a test email sent from the Spring Boot application."
    }
    ```

### Postman api test
![pstman](https://github.com/nemadeshrikant/SpringEmailApp/assets/36012230/29a7ece1-8505-4fc5-aee1-2c8a2139ba59)
