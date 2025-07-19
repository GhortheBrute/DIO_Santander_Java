package Aulas.Excecoes.dao;

import Aulas.Excecoes.exception.UserNotFoundException;
import Aulas.Excecoes.model.UserModel;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {

    private final List<UserModel> models = new ArrayList<>();
    private long nextId = 1L;

    public UserModel save(final UserModel model) {
        model.setId(nextId++);
        models.add(model);
        return model;
    }

    public UserModel update(final UserModel model) {
        var toUpdate = findById(model.getId());
        models.remove(toUpdate);
        models.add(model);
        return model;
    }

    public void delete(final long id) {
        var toDelete = findById(id);
        models.remove(toDelete);
    }

    public UserModel findById(final long id) {
        var message = String.format("Não existe usuário com o id %s cadastrado", id);
        return models.stream()
                .filter(u -> u.getId() == id)
                .findFirst()
                .orElseThrow(() -> new UserNotFoundException(message));
    }

    public List<UserModel> findAll() {
        return List.copyOf(models);
    }
}
