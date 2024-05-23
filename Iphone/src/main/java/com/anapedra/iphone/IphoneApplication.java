package com.anapedra.iphone;

import com.anapedra.iphone.model.IPhone;
import com.anapedra.iphone.model.Internet;
import com.anapedra.iphone.model.Ipod;
import com.anapedra.iphone.model.Phone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class IphoneApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SpringApplication.run(IphoneApplication.class, args);
        IPhone iPhone = new IPhone(1L, "Iphone2007", "modelo 1", null, null, null);
        Internet internet = new Internet(1L, iPhone, "Explore");
        Phone phone = new Phone(1L, iPhone, "phone");
        Ipod ipod = new Ipod(1L, iPhone, "Ipod");
        iPhone.setPhone(phone);
        iPhone.setIpod(ipod);
        iPhone.setInternet(internet);



        int opcao = 0;
        while (opcao != 4) {
            System.out.println("\nWelcome to " + iPhone.getDescription() +
                    "\nEscolha uma opção de 1 a 4. Onde 4 é para sair do sitema\n" +
                    "1 - Phone\n" +
                    "2 - Ipod\n" +
                    "3 - Internet\n" +
                    "4 - Sair\n");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    while (opcao != 4) {
                        System.out.println("\nEscolha uma opção de 1 a 4. Onde 5 é para sair\n" +
                                "1 - Atender ligação\n" +
                                "2 - Realozar ligação\n" +
                                "3 - Iniciar correio de voz\n" +
                                "4 - View all contacts\n" +
                                "5 - Sair\n");
                        opcao = scanner.nextInt();
                        switch (opcao) {
                            case 1:
                                iPhone.getPhone().answerPhoneCall();
                                break;

                            case 2:
                                iPhone.getPhone().makePhoneColl();
                                break;

                            case 3:
                                iPhone.getPhone().startVoiceMail();
                                break;

                            case 4:
                                iPhone.getPhone().getContacts();
                                break;

                            case 5:
                                System.out.println("Saíndo...");
                                System.exit(5);
                                break;
                            default:
                                System.out.println("Opção invalida!");

                        }
                    }
                    break;

                case 2:
                    while (opcao != 5) {
                        System.out.println("\nEscolha uma opção de 1 a 5. Onde 5 é para sair\n" +
                                "1 - Listar música\n" +
                                "2 - Selecionar musica\n" +
                                "3 - Tocar musica\n" +
                                "4 - Pausar musica\n" +
                                "5 - Sair\n");
                        opcao = scanner.nextInt();
                        switch (opcao) {
                            case 1:
                                iPhone.getIpod().getAllMusicTitle();
                                break;

                            case 2:
                                iPhone.getIpod().selectMusic();
                                break;

                            case 3:
                                iPhone.getIpod().playMusic();
                                break;

                            case 4:
                                iPhone.getIpod().stopMusic();
                                break;

                            case 5:
                                System.out.println("Saíndo...");
                                System.exit(5);
                                break;
                            default:
                                System.out.println("Opção invalida!");

                        }
                    }
                    break;
                case 3:
                    while (opcao != 4) {
                        System.out.println("\nEscolha uma opção de 1 a 4. Onde 4 é para sair\n" +
                                "1 - Acessar internet\n" +
                                "2 - Adcionar aba\n" +
                                "3 - Atuakizar aba\n" +
                                "4 - Sair\n");
                        opcao = scanner.nextInt();
                        switch (opcao) {
                            case 1:
                                iPhone.getInternet().displayWebPage();
                                break;

                            case 2:
                                iPhone.getInternet().addNewTab();
                                break;

                            case 3:
                                iPhone.getInternet().updatePage();
                                break;

                            case 4:
                                System.out.println("Saíndo...");
                                System.exit(4);
                                break;
                            default:
                                System.out.println("Opção invalida!");

                        }
                    }
                    break;

                default:
                    System.out.println("Opção invalida!");
            }


        }


    }
    /*
     modified:
        new file:
        new file:
        new file:
        new file:

        new file:   Iphone/src/main/java/com/anapedra/iphone/model/PhoneContact.java
        new file:   Iphone/src/main/java/com/anapedra/iphone/model/enums/PhoneType.java
        new file:
        new file:

        modified:   README.md


     */







}

