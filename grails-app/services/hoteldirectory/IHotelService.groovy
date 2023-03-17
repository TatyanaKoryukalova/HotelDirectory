package hoteldirectory

interface IHotelService {

    Hotel get(Serializable id)

    List<Hotel> list(Map args)

    Long count()

    void delete(Serializable id)

    Hotel save(Hotel hotel)
}