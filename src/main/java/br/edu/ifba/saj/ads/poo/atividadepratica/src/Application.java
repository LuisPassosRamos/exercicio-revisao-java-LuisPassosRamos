import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
                        "1- Criar Projeto\n2- Criar Arquiteto\n3- Criar Engenheiro\n4- Criar trabalhador\n"
                                + "5- Atribuir Arquiteto(a) a um Projeto\n6- Atribuir Engenheiro(a)"
                                + "a um Projeto\n7- Gerenciar Projeto\n8- Ver Arquitetos\n9- Ver Engenheiros\n"
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
                        System.out.println("\nDigite o nome do arquiteto(a): ");
                        String nameArchitect = scanner.nextLine();
                        System.out.println("\nDigite o número do arquiteto(a): ");
                        String numberArchitectInput = scanner.nextLine();
                        long numberArchitect = 0;

                        try {
                            numberArchitect = Long.parseLong(numberArchitectInput);
                        } catch (NumberFormatException e) {
                            System.out.println("Número inválido. Certifique-se de inserir um valor numérico.");
                            break; // Adicionado para sair do switch case
                        }
                        service.createArchitect(nameArchitect, numberArchitect);
                        break;
                    case 3:
                        System.out.println("\nDigite o nome do engenheiro(a): ");
                        String nameEngineer = scanner.nextLine();
                        System.out.println("\nDigite o número do engenheiro(a): ");

                        try {
                            long numberEngineer = Long.parseLong(scanner.nextLine());
                            service.createEngineer(nameEngineer, numberEngineer);
                        } catch (NumberFormatException e) {
                            System.out.println("Número inválido. Certifique-se de inserir um valor numérico.");
                            break; // Adicionado para sair do switch case
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Numero digitado excede o numero de objetos criados.");
                            break; // Adicionado para sair do switch case
                        }

                        break;
                    case 4:
                        System.out.println("\nDigite o nome do trabalhador: ");
                        String nameWorker = scanner.nextLine();
                        System.out.println("\nDigite a funcao do trabalhador: ");
                        String roleWorker = scanner.nextLine();
                        System.out.println("\nDigite o número do trabalhador: ");

                        try {
                            long numberWorker = Long.parseLong(scanner.nextLine());
                            service.createWorker(nameWorker, numberWorker, roleWorker);
                        } catch (NumberFormatException e) {
                            System.out.println("Número inválido. Certifique-se de inserir um valor numérico.");
                            break; // Adicionado para sair do switch case
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Numero digitado excede o numero de objetos criados.");
                            break; // Adicionado para sair do switch case
                        }

                        break;

                    case 5:
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
                            System.out.println("Numero digitado excede o numero de objetos criados.");
                        } catch (NumberFormatException e) {
                            System.out.println("Número inválido. Certifique-se de inserir um valor numérico.");
                        }

                        break;
                    case 6:
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
                            System.out.println("Numero digitado excede o numero de objetos criados.");
                        } catch (NumberFormatException e) {
                            System.out.println("Número inválido. Certifique-se de inserir um valor numérico.");
                        }
                        break;
                    case 7:
                        System.out.println(service.getListProjects()
                                + "\nEscolha o projeto que voce quer gerenciar digitando seu ID");
                        try {
                            int idProject = Integer.valueOf(scanner.nextLine());
                            service.getEspecificProject(idProject - 1);
                            do {
                                System.out.println("Menu gerenciamento de projeto:");
                                System.out.println(
                                        "1- Ver etapa e progresso\n2- Ver arquiteto(a) responsavel\n3- Ver engenheiro(a) responsavel"
                                                + "\n4- Menu de tarefas\n5- Registros");
                                int optionMenuProject = Integer.valueOf(scanner.nextLine());
                                switch (optionMenuProject) {
                                    case 1:
                                        service.getListProjects().get(idProject).getStageProject();
                                        break;

                                    case 4:
                                        System.out.println("Menu de tarefas:");
                                        System.out.println(
                                                "1- Contratar trabalhadores\n2- Comprar itens\n3- Marcar inspecoes\n");
                                        int optionCase = Integer.valueOf(scanner.nextLine());
                                        switch (optionCase) {
                                            case 1:
                                                System.out.println(
                                                        "Escolha um trabalhador para contratar digitando seu ID:");
                                                System.out.println(service.getListWorkers());
                                                int idWorker = Integer.valueOf(scanner.nextLine());
                                                service.taskProjectHiring(idProject, idWorker);
                                                break;
                                            case 2:
                                                System.out.println("Escolha um item para comprar digitando seu ID:");
                                                System.out.println(service.getListItems());
                                                int idItem = Integer.valueOf(scanner.nextLine());
                                                service.taskProjectBuying(idProject, idItem);
                                                break;
                                            case 3:
                                                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                                                System.out.println("Digite a data de inspecao desejada:");
                                                LocalDate dateInspection = LocalDate.parse(scanner.nextLine(), formatter);
                                                service.requestInspection(idProject, dateInspection);
                                                break;

                                        }
                                        break;
                                }
                            } while (option > 1 || option < 0);
                        } catch (NumberFormatException e) {
                            System.out.println("Número inválido. Certifique-se de inserir um valor numérico.");
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Numero digitado excede o numero de projetos criados.");
                        }


                        break;

                    case 8:
                        System.out.println(service.getListArchitects());
                        try {
                            do {
                                System.out.println("Digite 0 para encerrar o programa ou 1 para voltar pro menu:");
                                option = Integer.valueOf(scanner.nextLine());
                            } while (option > 1 || option < 0);

                        } catch (NumberFormatException e) {
                            System.out.println("Número inválido. Certifique-se de inserir um valor numérico.");
                        }
                        break;
                    case 9:
                        System.out.println(service.getListEngineer());
                        try {
                            do {
                                System.out.println("Digite 0 para encerrar o programa ou 1 para voltar pro menu:");
                                option = Integer.valueOf(scanner.nextLine());
                            } while (option > 1 || option < 0);
                        } catch (NumberFormatException e) {
                            System.out.println("Número inválido. Certifique-se de inserir um valor numérico.");
                        }
                        break;
                    default:
                        if (option < 0 || option > 8) {
                            System.out.println("Numero digitado invalido.");
                            option = -1;
                        }
                        break;
                }

            } while (option != 0);
        }
    }

}
