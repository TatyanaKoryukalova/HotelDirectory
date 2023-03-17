package hoteldirectory

import grails.gorm.services.Service

@Service(Hotel)
abstract class HotelService implements IHotelService {

    @Override
    List<Hotel> list(Map args) {
        args.max = args.max ?: 10
        List<Hotel> hotels = Hotel.createCriteria().list(args) {
            if (args?.colName && args?.colValue) {
                like(args.colName, "%" + args.colValue + "%")
            }
            if (!args.sort) {
                order("starRating", "desc")
            }
        }
        return hotels
    }
}
