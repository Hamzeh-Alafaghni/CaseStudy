class Playlist {
    private Song[] songs = new Song[3];
    private int index = 0;

    public void addSong(String title) {
        if (index < songs.length) {
            songs[index] = new Song(title);
            index++;
        }
    }

    public Song[] getSongs() {
        return songs;
    }
}
