public class Song {
    int year;
    String country;
    String artist;
    String title;

    public Song(int year, String country, String artist, String title){
        this.year= year;
        this.country=country;
        this.artist=artist;
        this.title=title;
    }

    public void show(){
        System.out.print(year+"년 "+country+"국적의 "+artist+"가 부른"+title);
    }

    public static void main(String args[]){
        Song song = new Song(1978, "스웨덴", "ABBA", "Dancing Queen");
        song.show();
    }
}
