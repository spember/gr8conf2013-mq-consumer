package co.cantina.gr8conf

import grails.converters.JSON

class ConsumerService {
    static rabbitQueue = 'workQueue'

    void handleMessage(String textMessage) {
        println "handling message: "
        def data = JSON.parse textMessage
        // simulate work
        Thread.sleep(Math.round(Math.random()*1000))
        print data
        print data.msg
    }
}
