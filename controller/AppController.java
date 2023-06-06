package controller;

import java.util.List;

import DAO.TurmaDAO;
import model.Turma;
import view.AppView;
import view.TurmaView;

public class AppController {
    private List<Turma> turmas;

    public AppController() {
        turmas = TurmaDAO.getTurmas();
    }
    public void iniciar() {
        int op = -1;
        do{
            op = AppView.menuInicial();
            switch (op) {
                case 1: TurmaView.listarTurmas(turmas); break;
                case 2: criarTurmaEIncluir(); break;
            }
        } while (op > 0);
        
    }
    public void criarTurmaEIncluir() {
        Turma t = new Turma(0, "nova", 30, 1);
        TurmaDAO.salvarTurma(t);
    }
    
}
