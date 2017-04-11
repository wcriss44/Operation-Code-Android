# Android app for [Operation Code](https://operationcode.org/about)
Operation code is a non-profit that empowers the military community to learn software development, enter the tech industry, and code the future.

The main features of this app are:

- Slack integration that allows push notifications through slash commands in slack
- Nearby events and meetups
- Ability to talk to slack members and mentors through the app
- Current scholarship opportunities from operation code database

![ScreenShot](https://raw.githubusercontent.com/wcriss44/OpCodeAndroid/master/wireframe.png)

## Contribution
Currently, this project is being developed as part of a class assignment. As such, contribution is limited to members of the development team. After April 28th, the project will be turned over to Operation Code and open for public contribution.

## Project backlog
**User Interface**
- Hamburger menu that contains: Events, Meetups, Scholarships, and Nearby
- Proper display of content based on menu selection

**APIs**
- Slack API / commands
  - Needs to integrate with push notifications
- Slack API Integration for locations
  - Used in conjunction with meetups and nearby
- Slack API integration for messaging
  - Needed for communication with nearby Operation Code members as well as mentor
- Meetup API for nearby
- Operation Code API for scholarships

**Android**
- Push notification service through [Google Cloud Messaging](https://developers.google.com/cloud-messaging/)
- App deployment
- Security