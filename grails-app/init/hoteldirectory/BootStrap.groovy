package hoteldirectory

class BootStrap {

    def init = { servletContext ->
        def countries = [
                new Country(name: "Россия", capital: "Москва"),
                new Country(name: "Великобритания", capital: "Лондон"),
                new Country(name: "Германия", capital: "Берлин"),
                new Country(name: "США", capital: "Вшингтон"),
                new Country(name: "Мексика", capital: "Мехико"),
                new Country(name: "Беларусь", capital: "Минск"),
                new Country(name: "Япония", capital: "Токио"),
                new Country(name: "Южная Корея", capital: "Сеул"),
                new Country(name: "КНР", capital: "Пекин")
        ]
        Country.saveAll(countries)
        def hotels = [
                new Hotel(country: countries[0], name: "Marins Hotel park", starRating: 3, website: "https://marinsparkhotels.ru/"),
                new Hotel(country: countries[0], name: "Обычная гостиница", starRating: 3),
                new Hotel(country: countries[0], name: "Необычная гостиница", starRating: 5),
                new Hotel(country: countries[1], name: "First Hotel", starRating: 4),
                new Hotel(country: countries[1], name: "Second Hotel", starRating: 4),
                new Hotel(country: countries[1], name: "Amazing Hotel", starRating: 1)
        ]
        Hotel.saveAll(hotels)
    }
    def destroy = {
    }
}
