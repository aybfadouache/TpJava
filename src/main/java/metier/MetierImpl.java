package metier;
import dao.iDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{


    private iDao dao;

    public MetierImpl(iDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul(){

        double tmp=dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }

    public void setDao(iDao dao) {
        this.dao = dao;
    }
}
