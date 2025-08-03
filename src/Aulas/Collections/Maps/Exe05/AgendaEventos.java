package Aulas.Collections.Maps.Exe05;

import java.time.LocalDate;
import java.util.Map;

public class AgendaEventos {
    Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        eventos = new java.util.HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventos.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        eventos.forEach((data, evento) -> {
            System.out.println(data + ": " + evento.getNome() + " - " + evento.getAtracao());
        });
    }

    public void obterProximoEvento(){
        LocalDate hoje = LocalDate.now();
        var proximoEvento = eventos.entrySet().stream().filter(entry -> !entry.getKey().isBefore(hoje)).min(Map.Entry.comparingByKey()).orElse(null);

        System.out.println("Próximo evento em: " + proximoEvento.getKey() + " - " + proximoEvento.getValue().getNome() + " - " + proximoEvento.getValue().getAtracao());
    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();

        agenda.adicionarEvento(LocalDate.of(2025, 9, 10), "Festa", "Cinema");
        agenda.adicionarEvento(LocalDate.of(2025, 8, 11), "Festa", "Cinema");
        agenda.adicionarEvento(LocalDate.of(2021, 9, 13), "Festa", "Cinema");
        agenda.adicionarEvento(LocalDate.of(2021, 10, 14), "Festa", "Cinema");
        agenda.adicionarEvento(LocalDate.of(2021, 10, 15), "Festa", "Cinema");
        agenda.adicionarEvento(LocalDate.of(2021, 10, 16), "Festa", "Cinema");
        agenda.adicionarEvento(LocalDate.of(2021, 10, 17), "Festa", "Cinema");
        agenda.adicionarEvento(LocalDate.of(2025, 10, 12), "Festa", "Cinema");

        agenda.exibirAgenda();

        System.out.println("=====");

        agenda.obterProximoEvento();
        System.out.println("=====");

        agenda.exibirAgenda();
    }
}
