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
                try {
                    option = Integer.valueOf(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Número inválido. Certifique-se de inserir um valor numérico.");
                    option = -1;
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

                        try {
                            long numberEngineer = Long.parseLong(scanner.nextLine());
                            service.createEngineer(nameEngineer, numberEngineer);
                        } catch (NumberFormatException e) {
                            System.out.println("Número inválido. Certifique-se de inserir um valor numérico.");
                        }

                        break;

                    case 4:
                        try {
                            System.out.println("Escolha um arquiteto para atribuir digitando seu ID:");
                            System.out.println(service.getListArchitects());
                            int optionArchitect = Integer.valueOf(scanner.nextLine());

                            System.out
                                    .println("Escolha um projeto para o arquiteto(a) ser atribuido digitando seu ID:");
                            System.out.println(service.getListProjects());
                            int optionProject = Integer.valueOf(scanner.nextLine());

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
                            int optionEngineer = Integer.valueOf(scanner.nextLine());

                            System.out
                                    .println("Escolha um projeto para o engenheiro(a) ser atribuido digitando seu ID:");
                            System.out.println(service.getListProjects());
                            int optionProject = Integer.valueOf(scanner.nextLine());

                            service.assignEngineer(optionProject - 1, optionEngineer - 1);
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("error: " + e);
                        } catch (NumberFormatException e) {
                            System.out.println("Número inválido. Certifique-se de inserir um valor numérico.");
                        }
                        break;
                    case 6:
                        System.out.println(service.getListProjects()
                                + "\nEscolha o projeto que voce quer visualizar digitando seu ID");
                        try {
                            int idProject = Integer.valueOf(scanner.nextLine());
                            service.getEspecificProject(idProject);

                            System.out.println("Menu de tarefas:");
                            System.out.println("1- Contratar trabalhadores\n2- Comprar itens\n3- Marcar inspecoes\n");
                            int optionCase = Integer.valueOf(scanner.nextLine());
                            switch (optionCase){
                                case 1:
                                System.out.println("Escolha um trabalhador para contratar digitando seu ID:");
                                System.out.println(service.getListWorkers());
                                int idWorker = Integer.valueOf(scanner.nextLine());
                                service.taskProjectHiring(idProject, idWorker);
                                
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Número inválido. Certifique-se de inserir um valor numérico.");
                        }

                        System.out.println(service.getListProjects());
                        break;
                    case 7:
                        System.out.println(service.getListArchitects());
                        break;
                    case 8:
                        System.out.println(service.getListEngineer());
                        break;
                    default:
                        System.out.println("Numero digitado invalido.");
                        option = -1;
                }

            } while (option != 0);
        }
    }
}
