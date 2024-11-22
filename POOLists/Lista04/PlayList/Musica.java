public class Musica{
    private String titulo;
    private String artista;
    private String album;
        
    public Musica(String titulo, String artista, String album){
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
    }

    public String toString(){
        return String.format("Nome = %s, Artista = %s, Album = %s", titulo, artista, album);
    }

}
