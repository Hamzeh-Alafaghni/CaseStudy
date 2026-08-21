class PlaylistIterator implements Iterator<Song> {
    private Song[] songs;
    private int position = 0;

    public PlaylistIterator(Song[] songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return position < songs.length && songs[position] != null;
    }

    @Override
    public Song next() {
        return songs[position++];
    }


}
