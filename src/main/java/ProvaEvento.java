import java.time.LocalDate;
import java.util.Random;

public class ProvaEvento {
    public static void main(String[] args) {
        EventoDao dao = new EventoDao();
        Evento e1 = new Evento(new Random().nextInt(1,1000),"Concerto Eminem",
                LocalDate.of(2025,6,15), "the best artist", TipoEvento.PUBBLICO,
                100000);

        try {
            dao.save(e1);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(dao.getById(e1.getId()));
        dao.remove(674);
    }
}
