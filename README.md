# Gr8conf 2013 - Message Oriented Decoupled Architecture with RabbitMQ

### Steve Pember

This repo contains a very small Consumer client that demonstrates how easy it is to connect to RabbitMQ and listen for
messages. It is a supplement to a talk I'll be giving at gr8conf US 2013.

The intent is to have attendees clone this repo and connect to a RabbitMQ broker instance running locally on my machine.
Each listening consumer will be able to pull messages off of the queue, which are then logged to the console.

When a message is handled, there is an added artificial delay in order to simulate processing time and thus the need
for more messages.

## REQUIREMENTS:

*   Grails 2.2.3


## TO USE:

*   clone this repo
*   open up Config.groovy
*   In the rabbitMQ -> connectionFactory block, update the hostname configuration to be the broker's ip address (TBD, naturally)
*   grails run-app

Your machine should then be setup to listen for messages on the workQueue.


## CONTRIBUTING MESSAGES

This may be dangerous, but you can interact with the publisher node as well. To send messages onto the queue, you may either:

#### Use your browser
Load up http://${ip TBD}:8080/ , enter a message, the number of times to repeat it, and submit.

#### Use curl
Fire off the following command:
curl http://${ip TBD}:8080/message/publish -d "message=This is a sample message&number=5" -H "X-Requested-With: XMLHttpRequest"

The -H is optional, but will send back a JSON status object instead of the full page.


