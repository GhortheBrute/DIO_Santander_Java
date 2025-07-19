package Aulas.Excecoes;

import Aulas.Excecoes.dao.UserDAO;
import Aulas.Excecoes.exception.ValidatorException;
import Aulas.Excecoes.model.MenuOption;
import Aulas.Excecoes.model.UserModel;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static Aulas.Excecoes.validator.UserValidator.verifyModel;

public class Main {

    private final static UserDAO dao = new UserDAO();
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while(true){
            System.out.println("Bem vindo ao cadastro de usuários, selecione a operação desejada.");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Buscar por identificador");
            System.out.println("5 - Listar");
            System.out.println("6 - Sair");
            var userInput = scanner.nextInt();
            var selectedOption = MenuOption.values()[userInput -1];
            switch (selectedOption) {
                case SAVE -> {
                    var user = dao.save(requestToSave());
                    System.out.printf("Usuário %s salvo com sucesso!\n", user.getId());
                }
                case UPDATE -> {
                    var user = dao.update(requestToUpdate());
                    System.out.printf("Usuário %s atualizado com sucesso!\n", user.getId());
                }
                case DELETE -> {
                    dao.delete(requestId());
                    System.out.println("Usuário deletado com sucesso!");
                }
                case FIND_BY_ID -> {
                    var user = dao.findById(requestId());
                    System.out.println("Usuário:");
                    System.out.println(user);
                }
                case LIST_ALL -> {
                    var users = dao.findAll();
                    System.out.println("Usuários encontrados:");
                    System.out.println("=====");
                    users.forEach(System.out::println);
                }
                case EXIT -> System.exit(0);
            }
        }
    }

    private static long requestId() {
        System.out.println("Informe o id do usuário.");
        return scanner.nextLong();
    }

    private static UserModel requestToSave(){
        System.out.println("Informe o nome do usuário.");
        var name = scanner.next();
        System.out.println("Informe o email do usuário.");
        var email = scanner.next();
        System.out.println("Informe a data de nascimento do usuário. (dd/MM/yyyy)");
        var birthdayString = scanner.next();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthdayString, formatter);
        try{
            return validateInputs(0, name, email, birthday);
        } catch (ValidatorException e) {
            throw new RuntimeException(e);
        }

    }

    private UserModel validateInputs(final long id, final String name, final String email, final LocalDate birthday) throws ValidatorException {
        var user = new UserModel(0, name, email, birthday);
        verifyModel(user);
    }

    private static UserModel requestToUpdate(){
        System.out.println("Inform o id do usuário;");
        var id = scanner.nextLong();
        System.out.println("Informe o nome do usuário.");
        var name = scanner.next();
        System.out.println("Informe o email do usuário.");
        var email = scanner.next();
        System.out.println("Informe a data de nascimento do usuário. (dd/MM/yyyy)");
        var birthdayString = scanner.next();
        var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        var birthday = LocalDate.parse(birthdayString, formatter);
        return validateInputs(0, name, email, birthday);
    }

}
