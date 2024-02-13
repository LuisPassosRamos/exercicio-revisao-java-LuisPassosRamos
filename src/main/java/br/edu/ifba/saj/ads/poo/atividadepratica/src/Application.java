import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Service service = new Service();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bem-vindo.");
            int option = 0;
            do {

                System.out.println("Menu:");
                System.out.println(
                        "1- Criar Projeto\n2- Criar Arquiteto\n3- Criar Engenheiro\n"
                                + "4- Atribuir Arquiteto(a) a um Projeto\n5- Atribuir Engenheiro(a)"
                                + "a um Projeto\n6- Ver Projetos\n7- Ver Arquitetos\n8- Ver Engenheiros\n"
                                + "0- Sair do Menu");
                String optionString = scanner.nextLine();
                try {
                    option = Integer.valueOf(optionString);
                } catch (NumberFormatException e) {
                    System.out.println("Número inválido. Certifique-se de inserir um valor numérico.");
                }

                switch (option) {
                    case 1:
                        System.out.println("\n\nDigite o nome do projeto: ");
                        String nameProject = scanner.nextLine();
                        service.createProject(nameProject);
                        break;
                    case 2:
                        System.out.println("\nDigite o nome do arquiteto: ");
                        String nameArchitect = scanner.nextLine();
                        System.out.println("\nDigite o número do arquiteto: ");
                        String numberArchitectInput = scanner.nextLine();
                        long numberArchitect = 0;

                        try {
                            numberArchitect = Long.parseLong(numberArchitectInput);
                        } catch (NumberFormatException e) {
                            System.out.println("Número inválido. Certifique-se de inserir um valor numérico.");
                        }
                        service.createArchitect(nameArchitect, numberArchitect);
                        break;
                    case 3:
                        System.out.println("\nDigite o nome do arquiteto: ");
                        String nameEngineer = scanner.nextLine();
                        System.out.println("\nDigite o número do arquiteto: ");
                        String numberEngineerInput = scanner.nextLine();
                        long numberEngineer = 0;

                        try {
                            numberEngineer = Long.parseLong(numberEngineerInput);
                        } catch (NumberFormatException e) {
                            System.out.println("Número inválido. Certifique-se de inserir um valor numérico.");
                        }
                        service.createEngineer(nameEngineer, numberEngineer);
                        break;

                    case 4:
                        try {
                            System.out.println("Escolha um arquiteto para atribuir digitando seu ID:");
                            System.out.println(service.getListArchitects());
                            String optionArchitectString = scanner.nextLine();

                            System.out
                                    .println("Escolha um projeto para o arquiteto(a) ser atribuido digitando seu ID:");
                            System.out.println(service.getListProjects());
                            String optionProjectString = scanner.nextLine();

                            int optionArchitect = Integer.valueOf(optionArchitectString);
                            int optionProject = Integer.valueOf(optionProjectString);

                            service.assignArchitect(optionProject - 1, optionArchitect - 1);
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("error: " + e);
                        } catch (NumberFormatException e) {
                            System.out.println("Número inválido. Certifique-se de inserir um valor numérico.");
                        }

                        break;
                    case 5:
                        try {
                            System.out.println("Escolha um engenheiro(a) para atribuir digitando seu ID:");
                            System.out.println(service.getListEngineer());
                            String optionEngineerString = scanner.nextLine();

                            System.out
                                    .println("Escolha um projeto para o engenheiro(a) ser atribuido digitando seu ID:");
                            System.out.println(service.getListProjects());
                            String optionProjectString = scanner.nextLine();

                            int optionEngineer = Integer.valueOf(optionEngineerString);
                            int optionProject = Integer.valueOf(optionProjectString);

                            service.assignEngineer(optionProject - 1, optionEngineer - 1);
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("error: " + e);
                        } catch (NumberFormatException e) {
                            System.out.println("Número inválido. Certifique-se de inserir um valor numérico.");
                        }
                        break;
                    case 6:
                        System.out.println(service.getListProjects()); 
                        break;
                    case 7:
                        System.out.println(service.getListArchitects()); 
                        break;
                    case 8:
                        System.out.println(service.getListEngineer()); 
                        break;
                }
            } while (option != 0);
        }
    }
}
