public class Room {

    private int bedCount;
    private int squareMeter;
    private boolean safe,projection,television,miniBar,gameConsole;

    public Room(){

    }
    public Room(int bedCount, int squareMeter, boolean safe, boolean projection, boolean television, boolean miniBar, boolean gameConsole) {
        this.bedCount = bedCount;
        this.squareMeter = squareMeter;
        this.safe = safe;
        this.projection = projection;
        this.television = television;
        this.miniBar = miniBar;
        this.gameConsole = gameConsole;
    }

    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    public void setSquareMeter(int squareMeter) {
        this.squareMeter = squareMeter;
    }

    public boolean isSafe() {
        return safe;
    }

    public void setSafe(boolean safe) {
        this.safe = safe;
    }

    public boolean isProjection() {
        return projection;
    }

    public void setProjection(boolean projection) {
        this.projection = projection;
    }

    public boolean isTelevision() {
        return television;
    }

    public void setTelevision(boolean television) {
        this.television = television;
    }

    public boolean isMiniBar() {
        return miniBar;
    }

    public void setMiniBar(boolean miniBar) {
        this.miniBar = miniBar;
    }

    public boolean isGameConsole() {
        return gameConsole;
    }

    public void setGameConsole(boolean gameConsole) {
        this.gameConsole = gameConsole;
    }

    @Override
    public String toString() {
        return bedCount+" yataklı oda";
    }
}