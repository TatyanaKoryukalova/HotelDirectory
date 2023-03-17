package hoteldirectory

import grails.rest.Resource

//@Resource(uri = '/countries')
class Country {

    String name
    String capital

    static hasMany = [hotels : Hotel]

    static mapping = {
        table("countries")
    }

    static constraints = {
        name blank: false, unique: true, maxSize: 255
        capital blank: false, maxSize: 128
    }
}
