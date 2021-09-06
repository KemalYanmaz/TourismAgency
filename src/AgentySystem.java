import java.util.ArrayList;
import java.util.List;

public class AgentySystem {

    private String name;
    private ArrayList<Hotel> hotels;
    public AgentySystem(){
        hotels = new ArrayList<Hotel>();
    }
    public void start(){
        new Anasayfa();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addHotel(Hotel hotel){
        hotels.add(hotel);
    }

    public List<Room> listRoom(){
        return null;
    }

    public void reserveRoom(Room room){
        //TODO
    }

    public String toString(){
        return this.name;
    }
}
