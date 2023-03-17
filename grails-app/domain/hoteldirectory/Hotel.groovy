package hoteldirectory

import grails.rest.Resource

//@Resource(uri = '/hotels')
class Hotel {

    String name
    Integer starRating
    String website

    static belongsTo = [country: Country]

    static mapping = {
        table("hotels")
    }

    static constraints = {
        name blank: false, maxSize: 255, unique: 'country'
        starRating nullable: false, range: 1..5
        country nullable: false
        website nullable: true, url: true
    }
}
