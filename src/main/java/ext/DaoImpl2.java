package ext;
import dao.iDao;
import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl2 implements iDao {

    @Override
     public double getData() {
        System.out.println("Version Capteurs");
        double temp=6000;
        return temp;
    }


}
