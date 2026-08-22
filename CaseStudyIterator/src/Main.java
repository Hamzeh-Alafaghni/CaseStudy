public class Main {
    static void main(String[] args) {

        Playlist myPlaylist = new Playlist();
        myPlaylist.addSong("Song 1: Shape of You");
        myPlaylist.addSong("Song 2: Базовый минимум");
        myPlaylist.addSong("Song 3: Levitating");

        PlaylistIterator iterator = new PlaylistIterator(myPlaylist.getSongs());

        System.out.println("--- Playing My Playlist ---");

        while (iterator.hasNext()) {
            Song currentSong = iterator.next();
            System.out.println("Now Playing: " + currentSong.getTitle());
    }

}
