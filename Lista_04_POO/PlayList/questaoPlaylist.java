import java.util.Scanner;

public class questaoPlaylist{
    public static void main(String[] args){
        int op = 0;
        Scanner input = new Scanner(System.in);
        PlayList playlist = null; 
        while (op != 4){
            System.out.println("1 - Cadastrar playlist \n2 - Cadastrar musica \n3 - Listar \n4 - Fim");
            op = input.nextInt();
            input.nextLine();

            if (op == 1){
                System.out.println("Nome da playlist: ");
                String nomePlaylist = input.nextLine();
                System.out.println("Descricao da playlist: ");
                String descricaoPlaylist = input.nextLine();
                playlist = new PlayList(nomePlaylist, descricaoPlaylist);
            } else if (op == 2){
                if (playlist == null){
                    System.out.println("Sem playlist criada para cadastrar a musica.");
                } else {
                    System.out.println("Nome da musica: ");
                    String nomeMusica = input.nextLine();
                    System.out.println("Artista: ");
                    String artista = input.nextLine();
                    System.out.println("Album: ");
                    String album = input.nextLine();
                    Musica musica = new Musica(nomeMusica, artista, album);
                    playlist.inserir(musica);
                }
            } else if (op == 3){
                if (playlist == null) {
                    System.out.println("Sem playlist criada.");
                } else {
                    System.out.println(playlist);
                    for (Musica musica : playlist.listar()) {
                        System.out.println(musica);
                    }
                }
            } else {
                System.out.println("Programa finalizado.");
            }
        }
    }
}