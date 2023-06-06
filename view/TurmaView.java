package view;

import java.util.List;
import model.Turma;

public class TurmaView {
    public static void listarTurmas(List<Turma> turmas) {
        for( Turma t : turmas) {
            System.out.println(t.getId()+" - "+t.getApelido());
        }

    }
    
}
