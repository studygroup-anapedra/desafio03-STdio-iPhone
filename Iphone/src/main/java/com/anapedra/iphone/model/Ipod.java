package com.anapedra.iphone.model;

import com.anapedra.iphone.model.impl.IpodImpl;

import java.time.LocalTime;
import java.util.*;

public class Ipod implements IpodImpl {


    private Long id;
    private String description;


    private IPhone iPhone;


    private List<Music> musicas = new ArrayList<>();

    public Ipod() {
    }

    public Ipod(Long id, IPhone iPhone, String description) {
        this.id = id;
        this.iPhone = iPhone;
        this.description = description;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IPhone getiPhone() {
        return iPhone;
    }

    public void setiPhone(IPhone iPhone) {
        this.iPhone = iPhone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Music> getMusicas() {
        return musicas;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ipod ipod = (Ipod) o;
        return Objects.equals(id, ipod.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Ipod{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", iPhone=" + iPhone +
                ", musicas=" + musicas +
                '}';
    }

    @Override
    public void playMusic() {
        selectMusic();
        System.out.println("Tocando música...");

    }

    @Override
    public void stopMusic() {

        System.out.println("Pausando música...");

    }

    @Override
    public void selectMusic() {
        Scanner scanner = new Scanner(System.in);
        Ipod ipod = new Ipod(1L,iPhone,"Ipod");
        List<String> musicasTitulos = new ArrayList<>();
        List<Music> musicas = new ArrayList<>();
        Music ms1 = new Music(1L,ipod,"A Nossa Vida é Boa","Sarina Voelo", LocalTime.ofSecondOfDay(60));
        Music ms2 = new Music(2L,ipod,"O Fim é Sempre Depois","Sarina Voelo",LocalTime.ofSecondOfDay(30));
        Music ms3 = new Music(3L,ipod,"A próxima págiana é você" +
                "","Amaral Brito",LocalTime.ofSecondOfDay(60));
        Music ms4 = new Music(4L,ipod,"O Dia de Hoje Depois de Ontem","Sofia Barão",LocalTime.ofSecondOfDay(30));
        musicas.addAll(Arrays.asList(ms1,ms2,ms3,ms4));


        String titulo = "";
        int cont=0;
        String tituloMusica= "";

            musicasTitulos.add(tituloMusica);
            while (cont <= musicas.size()) {
                System.out.println();
                System.out.println("Digite o título da Musica ou digite S para sair");


                titulo = scanner.nextLine();
                if (titulo.equalsIgnoreCase("S")){
                    cont=musicas.size();

                }
                for (Music m : musicas) {
                    if (m.getTitulo().equals(titulo)) {
                        tituloMusica = m.getTitulo();
                    }
                }
                String tituloMusic = (tituloMusica.equalsIgnoreCase(titulo)) ? "A musica selecionada foi, " + titulo : "A musica, "+ titulo +", não existe no repertório";
                System.out.println(tituloMusic);


                if (titulo.equals(tituloMusica)) {
                    cont=musicas.size();

                }

                cont++;



            }
            System.out.println("Digite Y para tocar a música selecionada ou qualquer tecla para sair!");
            String op = scanner.nextLine();
            if (op.equalsIgnoreCase("Y")) {
                System.out.println("Tocando: "+ titulo);
            }
    }


    public void getAllMusicTitle() {
        Ipod ipod = new Ipod(1L,iPhone,"Ipod");
        List<Music> musicas = getMusicas();
        Music ms1 = new Music(1L,ipod,"A Nossa Vida é Boa","Sarina Voelo",LocalTime.ofSecondOfDay(60));
        Music ms2 = new Music(2L,ipod,"O Fim é Sempre Depois","Sarina Voelo",LocalTime.ofSecondOfDay(30));
        Music ms3 = new Music(3L,ipod,"O Dia de Ontem Depois de Hoje","Amaral Brito",LocalTime.ofSecondOfDay(60));
        Music ms4 = new Music(4L,ipod,"O Dia de Hoje Depois de Ontem","Sofia Barão",LocalTime.ofSecondOfDay(30));
        musicas.addAll(Arrays.asList(ms1,ms2,ms3,ms4));

        for (Music musica : musicas) {
            String titulo = musica.getTitulo();
            System.out.println(titulo);
        }
        System.out.println("\nRpertório formado por "+musicas.size() + " músicas;");
    }
}

