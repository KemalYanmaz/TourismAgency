import java.util.ArrayList;

public class Hotel {

    private String name;
    private String adress;
    private String email;
    private String phone;
    private int star;
    private boolean carpark,wifi,pool,gym,concierge,spa,roomService;
    private ArrayList<Room> rooms;
    private Pansiyon pansiyon;

    public Hotel(String name, String adress, String email, String phone, int star,
                 boolean carpark, boolean wifi, boolean pool, boolean gym,
                 boolean concierge, boolean spa, boolean roomService,Pansiyon pansiyon) {
        this.name = name;
        this.adress = adress;
        this.email = email;
        this.phone = phone;
        this.star = star;
        this.carpark = carpark;
        this.wifi = wifi;
        this.pool = pool;
        this.gym = gym;
        this.concierge = concierge;
        this.spa = spa;
        this.roomService = roomService;
        this.rooms = new ArrayList<Room>();
        this.pansiyon = pansiyon;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }


    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public boolean isCarpark() {
        return carpark;
    }

    public void setCarpark(boolean carpark) {
        this.carpark = carpark;
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public boolean isPool() {
        return pool;
    }

    public void setPool(boolean pool) {
        this.pool = pool;
    }

    public boolean isGym() {
        return gym;
    }

    public void setGym(boolean gym) {
        this.gym = gym;
    }

    public Pansiyon getPansiyon() {
        return pansiyon;
    }

    public void setPansiyon(Pansiyon pansiyon) {
        this.pansiyon = pansiyon;
    }

    public boolean isConcierge() {
        return concierge;
    }

    public void setConcierge(boolean concierge) {
        this.concierge = concierge;
    }

    public boolean isSpa() {
        return spa;
    }

    public void setSpa(boolean spa) {
        this.spa = spa;
    }

    public boolean isRoomService() {
        return roomService;
    }

    public void setRoomService(boolean roomService) {
        this.roomService = roomService;
    }

    public void addRoom(Room room){
        rooms.add(room);
        System.out.println(room + " eklendi.");
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", star=" + star +
                ", carpark=" + carpark +
                ", wifi=" + wifi +
                ", pool=" + pool +
                ", gym=" + gym +
                ", concierge=" + concierge +
                ", spa=" + spa +
                ", roomService=" + roomService +
                '}';
    }
}